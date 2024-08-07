package com.system.ipcc.cti.nexus.web;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.egovframe.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.system.backoffice.bas.icr.models.InsttCodeInfo;
import com.system.backoffice.bas.icr.service.InsttCodeInfoManageService;
import com.system.backoffice.util.service.UtilInfoService;
import com.system.ipcc.cti.nexus.models.NexusSkillEmployeeInfo;
import com.system.ipcc.cti.nexus.models.NexusSkillInfo;
import com.system.ipcc.cti.nexus.models.dto.NexusSkillEmployeeRequestInfoDto;
import com.system.ipcc.cti.nexus.models.dto.NexusSkillRequestInfo;
import com.system.ipcc.cti.nexus.service.NexusSkillManageService;
import egovframework.com.cmm.EgovMessageSource;
import egovframework.com.cmm.service.Globals;
import egovframework.com.cmm.service.ResultVO;
import egovframework.com.jwt.config.JwtVerification;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

@Api(tags = {"nexus skill API"})
@Slf4j
@RestController
@RequestMapping("/api/interface/int/nex")
@SuppressWarnings("unchecked")
public class NexusSkillInfoController {
	
	
	@Value("${page.pageUnit}")
	private int pageUnitSetting ;
	
	@Value("${page.pageSize}")
	private int pageSizeSetting ;
	
	/** JwtVerification */
	@Autowired
	private JwtVerification jwtVerification;
	
	@Autowired
	private NexusSkillManageService skillService;
	
	@Autowired
	private InsttCodeInfoManageService insttService;
	
	
	@Resource(name="egovMessageSource")
	protected EgovMessageSource egovMessageSource;

	@ApiOperation(value="cti skill 리스트 ", notes="cti skill 리스트")
	@PostMapping("skillList.do")
	public ModelAndView selectSkillList (@RequestBody Map<String, Object> searchMap
										, HttpServletRequest request
										, BindingResult bindingResult
										) throws Exception {
		
		
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try
		{
			// 기존 세션 체크 인증에서 토큰 방식으로 변경
		
			if (!jwtVerification.isVerificationAdmin(request)) {
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확인
			}else {
				String[] userinfo = jwtVerification.getTokenUserInfo(request);
				searchMap.put(Globals.PAGE_LOGIN_SYSTEM_CODE, userinfo[1]);
				searchMap.put(Globals.PAGE_LOGIN_ROLEID, userinfo[2]);
				searchMap.put(Globals.PAGE_LOGIN_PARTID , userinfo[3]);
				searchMap.put(Globals.PAGE_LOGIN_INSTTCODE ,userinfo[4]);
				
				Optional<InsttCodeInfo> info = insttService.selectInsttCodeDetail( userinfo[4]);
				
				if (info.isPresent())
					searchMap.put("tenantId", info.get().getTenantId());
			}
		
			
				/** pageing */
			PaginationInfo paginationInfo = new PaginationInfo();
			paginationInfo.setCurrentPageNo( Integer.valueOf(UtilInfoService.NVLObj(searchMap.get(Globals.PAGE_INDEX).toString(),"1")) );
			paginationInfo.setRecordCountPerPage(UtilInfoService.NVLObj(searchMap.get(Globals.PAGE_UNIT), pageUnitSetting));
			paginationInfo.setPageSize(UtilInfoService.NVLObj(searchMap.get(Globals.PAGE_SIZE), pageSizeSetting));
			searchMap.put(Globals.PAGE_FIRST_INDEX, paginationInfo.getFirstRecordIndex());
			searchMap.put(Globals.PAGE_LAST_INDEX, paginationInfo.getLastRecordIndex());
			searchMap.put(Globals.PAGE_RECORD_PER_PAGE, paginationInfo.getRecordCountPerPage());
			
			List<Map<String, Object>> skillList = skillService.selectNexusSkillInfoPageList(searchMap);
			int totCnt = skillList.size() > 0 ?  Integer.valueOf( skillList.get(0).get("totalRecordCount").toString()) :0;
			
			paginationInfo.setTotalRecordCount(totCnt);
			
			model.addObject(Globals.STATUS_REGINFO, searchMap);
			model.addObject(Globals.JSON_RETURN_RESULT_LIST, skillList);
			model.addObject(Globals.PAGE_TOTAL_COUNT, totCnt);
			model.addObject(Globals.JSON_PAGEINFO, paginationInfo);
			model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
			
			
			
		}catch (Exception e){
			log.error("selectCmmnCodeList error:" + e.toString());
			model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.common.msg")+ e.toString());	
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
		}
			
		return model;
			
			
	}
	@ApiOperation(value="cti skill 삭제 ", notes="cti skill 삭제")
	@PostMapping("skillDelete.do")
	public ModelAndView deleteSkillCode (@RequestBody NexusSkillInfo vo, 
														 HttpServletRequest request) throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try{
			// 기존 세션 체크 인증에서 토큰 방식으로 변경
			
			if (!jwtVerification.isVerificationAdmin(request)) {
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확인
			}
			
			int ret = skillService.deleteNexusSkillInfo(vo);;
			if (ret > 0) {
				model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
				model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("success.common.delete"));
			}
			else {
				model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
				model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.common.delete"));
			}
			
			
		}catch(Exception e){
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, e.toString());
		}
		return model;
	}
	@ApiOperation(value="cti skill 상세 정보 ", notes="cti skill 상세 정보")
	@GetMapping("{code}.do")
	public ModelAndView selectCmmnDetailCodeDetail (@PathVariable String code, 
												HttpServletRequest request)	throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
			// 기존 세션 체크 인증에서 토큰 방식으로 변경
			
			if (!jwtVerification.isVerificationAdmin(request)) {
				ResultVO resultVO = new ResultVO();
			return jwtVerification.handleAuthError(resultVO); // 토큰 확
			}
			
			model.addObject(Globals.JSON_RETURN_RESULT, skillService.selectNexusSkillInfoDetail(code));
			model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
		}catch(Exception e){
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, e.toString());
		}
		return model;
	}
	@ApiOperation(value="cti skill 중복 체크 ", notes="cti skill  중복 체크")
	@PostMapping("skillCheck.do")
 	public ModelAndView selectSkillIdCheck (@RequestBody NexusSkillRequestInfo vo, 
 											HttpServletRequest request)	throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
			// 기존 세션 체크 인증에서 토큰 방식으로 변경
			
			if (!jwtVerification.isVerificationAdmin(request)) {
				ResultVO resultVO = new ResultVO();
			return jwtVerification.handleAuthError(resultVO); // 토큰 확
			}
			int ret = skillService.selectNexusSkillExistInfo(vo);
			String status = ret < 1 ? Globals.STATUS_SUCCESS : Globals.STATUS_FAIL;
			String message = ret < 1 ? "common.codeOk.msg" :  "common.codeFail.msg";
			
			model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage(message));
			model.addObject(Globals.STATUS, status);
		}catch(Exception e){
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, e.toString());
		}
		return model;
	}
	@ApiOperation(value="cti skill 업데이트 ", notes="cti skill 업데이트")
	@PostMapping(value="skillUpdate.do")
	public ModelAndView updateCmmnDetailCode ( @RequestBody NexusSkillRequestInfo vo
												, HttpServletRequest request
												, BindingResult bindingResult ) throws Exception {
		
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try{
			
			// 기존 세션 체크 인증에서 토큰 방식으로 변경
		
			if (!jwtVerification.isVerificationAdmin(request)) {
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확인
			}else {
				vo.setUserId(jwtVerification.getTokenUserName(request));
				
				
			}
			
			String status = skillService.updateNexusSkillInfo(vo) > 0 ?
		 		 Globals.STATUS_SUCCESS : Globals.STATUS_FAIL;
			String message = status.equals( Globals.STATUS_SUCCESS) ?
				 	 egovMessageSource.getMessage("success.request.msg") :
					 egovMessageSource.getMessage("fail.request.msg") ;
			model.addObject(Globals.STATUS, status);
			model.addObject(Globals.STATUS_MESSAGE, message);
			
		}catch (Exception e){
			System.out.println("error:"+ e.toString()  );
			model.addObject("status", Globals.STATUS_FAIL);
		model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.common.insert"));		
		}
		finally{
			return model;
		}
		
	}
	@PostMapping("skillEmployeesList.do")
	public ModelAndView selectSkillEmployees (@RequestBody NexusSkillEmployeeInfo vo,
																HttpServletRequest request) throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try{
			// 기존 세션 체크 인증에서 토큰 방식으로 변경
			
			if (!jwtVerification.isVerificationAdmin(request)) {
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확인
			}
			
			List<Map<String, Object>> skillemployees = skillService.selectNexusSkillEmployeeInfoPageList(vo);
			 int totCnt = skillemployees.size() > 0 ?  Integer.valueOf( skillemployees.get(0).get("totalRecordCount").toString()) :0;
			model.addObject(Globals.JSON_RETURN_RESULT_LIST, skillemployees);
			model.addObject(Globals.PAGE_TOTAL_COUNT, totCnt);
			model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
			
			
		}catch(Exception e){
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, e.toString());
		}
		return model;
	}
	@PostMapping("skillEmployeesUpdate.do")
	public ModelAndView updateSkillEmployees (@RequestBody NexusSkillEmployeeRequestInfoDto vo, 
																	HttpServletRequest request) throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try{
			// 기존 세션 체크 인증에서 토큰 방식으로 변경
			
			if (!jwtVerification.isVerificationAdmin(request)) {
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확인
			}
			
			
		
			String status = skillService.updateNexusSkillEmployeeInfo(vo) > 0 ? Globals.STATUS_SUCCESS : Globals.STATUS_FAIL;
			String message = status.equals( Globals.STATUS_SUCCESS) ?
				 	 egovMessageSource.getMessage("success.request.msg") :
					 egovMessageSource.getMessage("fail.request.msg") ;
		
		
			model.addObject(Globals.STATUS, status);
			model.addObject(Globals.STATUS_MESSAGE, message);
		
		}catch(Exception e){
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, e.toString());
		}
		return model;
	}
	@PostMapping("skillEmployeesDelete.do")
	public ModelAndView deleteSkillEmployeesCode (@RequestBody NexusSkillEmployeeInfo vo,
												HttpServletRequest request, 
												BindingResult bindingResult) throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try{
			// 기존 세션 체크 인증에서 토큰 방식으로 변경
			
			if (!jwtVerification.isVerificationAdmin(request)) {
		
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확인
			}
			
			String status = skillService.deleteNexusSkillEmployeeInfo(vo) > 0 ?
		 		 Globals.STATUS_SUCCESS : Globals.STATUS_FAIL;
			String message = status.equals( Globals.STATUS_SUCCESS) ?
				 	 egovMessageSource.getMessage("success.request.msg") :
					 egovMessageSource.getMessage("fail.request.msg") ;
			model.addObject(Globals.STATUS, status);
			model.addObject(Globals.STATUS_MESSAGE, message);
			
		}catch(Exception e){
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, e.toString());
		}
		return model;
	}
}
