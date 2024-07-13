package com.system.ipcc.cti.nexus.web;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.egovframe.rte.fdl.property.EgovPropertyService;
import org.egovframe.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
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

import com.system.backoffice.bas.icr.service.InsttCodeInfoManageService;
import com.system.backoffice.util.service.UtilInfoService;
import com.system.ipcc.cti.nexus.models.NexusAgentInfo;
import com.system.ipcc.cti.nexus.models.dto.NexusAgentRequestInfoDto;
import com.system.ipcc.cti.nexus.service.NexusEmployeeManageService;
import egovframework.com.cmm.EgovMessageSource;
import egovframework.com.cmm.service.Globals;
import egovframework.com.cmm.service.ResultVO;
import egovframework.com.jwt.config.JwtVerification;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

@Api(tags = {"CTI Nexus 관련 연동 API"})
@Slf4j
@RestController
@RequestMapping("/api/interface/int/nex/emp")
@SuppressWarnings("unchecked")
public class NexusEmployeeInfoController {

	
	
	
	
	@Value("${page.pageUnit}")
	private int pageUnitSetting ;
	
	@Value("${page.pageSize}")
	private int pageSizeSetting ;
	
	/** JwtVerification */
	@Autowired
	private JwtVerification jwtVerification;
	
	@Autowired
	private NexusEmployeeManageService employeeService;
	
	@Resource(name="egovMessageSource")
	protected EgovMessageSource egovMessageSource;
	
	/** EgovPropertyService */
	@Resource(name = "propertiesService")
	protected EgovPropertyService propertiesService;
	
	
	
	@ApiOperation(value=" CTI 상담사 리스트", notes = "성공시 CTI 상담사 리스트를 반환 합니다.")
	@PostMapping("employList.do")
	public ModelAndView selectCtiList (@RequestBody Map<String, Object> searchMap
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
			}	
			
			
			int pageUnit = UtilInfoService.NVLObj(searchMap.get(Globals.PAGE_UNIT), propertiesService.getInt(Globals.PAGE_UNIT));
			int pageSize = UtilInfoService.NVLObj(searchMap.get(Globals.PAGE_SIZE), propertiesService.getInt(Globals.PAGE_SIZE));
			/** pageing */
			PaginationInfo paginationInfo = new PaginationInfo();
			paginationInfo.setCurrentPageNo( Integer.valueOf( searchMap.get(Globals.PAGE_INDEX).toString() ));
			paginationInfo.setRecordCountPerPage(pageUnit);
			paginationInfo.setPageSize(pageSize);
			
			
			searchMap.put(Globals.PAGE_FIRST_INDEX, paginationInfo.getFirstRecordIndex());
			searchMap.put(Globals.PAGE_LAST_INDEX, paginationInfo.getLastRecordIndex());
			searchMap.put(Globals.PAGE_RECORD_PER_PAGE, paginationInfo.getRecordCountPerPage());
			
			List<Map<String, Object>> skillList = employeeService.selectEmployeesInfoPageList(searchMap);
			int totCnt = skillList.size() > 0 ?  Integer.valueOf( skillList.get(0).get(Globals.PAGE_TOTAL_RECORD_COUNT).toString()) :0;
			List<Map<String, Object>> centerList = employeeService.selectCenterInfoCombo();
	
			paginationInfo.setTotalRecordCount(totCnt);
			
			model.addObject(Globals.STATUS_REGINFO, searchMap);
			model.addObject(Globals.NEXUS_CENTER_COMBO, centerList);
			model.addObject(Globals.JSON_RETURN_RESULT_LIST, skillList);
			model.addObject(Globals.PAGE_TOTAL_COUNT, totCnt);
			model.addObject(Globals.JSON_PAGEINFO, paginationInfo);
			model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
			
			
			
		}catch (Exception e){
			log.debug("selectCtiList error:" + e.toString());
			model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.common.msg")+ e.toString());	
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
		}
		return model;
	}
	@ApiOperation(value=" CTI 테넌트 콤보 리스트", notes = "성공시 CTI 테넌트 콤보 리스트를 반환 합니다.")
	@GetMapping("tenantCombo/{centerId}.do")
	public ModelAndView selectCtiTennant (@PathVariable String centerId, 
												  HttpServletRequest request)	throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
			// 기존 세션 체크 인증에서 토큰 방식으로 변경
			if (!jwtVerification.isVerificationAdmin(request)) {
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확
			}

			model.addObject(Globals.JSON_RETURN_RESULT, employeeService.selectTenantInfoCombo(centerId));
			model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
		}catch(Exception e){
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, e.toString());
		}
		return model;
	}
	@ApiOperation(value=" CTI 센터 콤보 리스트", notes = "성공시 CTI 센터  콤보 리스트를 반환 합니다.")
	@GetMapping("centerIdCombo.do")
	public ModelAndView selectCtiCenterList (HttpServletRequest request)	throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
		// 기존 세션 체크 인증에서 토큰 방식으로 변경
			
			if (!jwtVerification.isVerificationAdmin(request)) {
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확
			}
			
			model.addObject(Globals.JSON_RETURN_RESULT, employeeService.selectCenterInfoCombo());
			model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
		}catch(Exception e){
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, e.toString());
		}
		return model;
	}
	@ApiOperation(value=" CTI 센터 콤보 리스트", notes = "성공시 CTI 센터  콤보 리스트를 반환 합니다.")
	@PostMapping("ctiCheck.do")
	public ModelAndView selectUserCheck (@RequestBody NexusAgentRequestInfoDto vo,
										 HttpServletRequest request)	throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
			// 기존 세션 체크 인증에서 토큰 방식으로 변경
			
			if (!jwtVerification.isVerificationAdmin(request)) {
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확
			}
			
			
			int ret = employeeService.checkNexusEmployeesInfo(vo);
			String sStatus = (ret > -1) ? Globals.STATUS_SUCCESS : Globals.STATUS_FAIL;
			String sMessage = (ret > -1) ? "common.idcheck.success" : "common.idcheck.fail";
			model.addObject(Globals.STATUS,sStatus);
			model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage(sMessage) );
			
		}catch(Exception e){
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, e.toString());
		}
		return model;
	}
	@ApiOperation(value=" CTI Group 콤보 리스트", notes = "성공시 CTI Group  콤보 리스트를 반환 합니다.")
	@PostMapping("groupInfoCombo.do")
	public ModelAndView selectGroupInfoCombo (@RequestBody Map<String, Object> searchMap,
											  HttpServletRequest request)	throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
		// 기존 세션 체크 인증에서 토큰 방식으로 변경
				
			if (!jwtVerification.isVerificationAdmin(request)) {
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확
			}
			
			model.addObject(Globals.JSON_RETURN_RESULT, employeeService.selectGroupInfoCombo(searchMap));
			model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
		}catch(Exception e){
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, e.toString());
		}
		return model;
	}
	@ApiOperation(value=" CTI teams 콤보 리스트", notes = "성공시 CTI teams  콤보 리스트를 반환 합니다.")
	@PostMapping("teamsCombo.do")
	public ModelAndView selectTeamsInfoCombo (@RequestBody Map<String, Object> searchMap,
											  HttpServletRequest request)	throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
		// 기존 세션 체크 인증에서 토큰 방식으로 변경
			
			if (!jwtVerification.isVerificationAdmin(request)) {
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확
			}
			
			
			model.addObject(Globals.JSON_RETURN_RESULT, employeeService.selectTeamsInfoCombo(searchMap));
			model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
		}catch(Exception e){
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, e.toString());
		}
		return model;
	}
	@ApiOperation(value=" CTI teams 콤보 리스트", notes = "성공시 CTI teams  콤보 리스트를 반환 합니다.")
	@PostMapping("employeeCombo.do")
	public ModelAndView selectEmployeeInfoCombo (@RequestBody Map<String, Object> searchMap,
											  HttpServletRequest request)	throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
			// 기존 세션 체크 인증에서 토큰 방식으로 변경
			if (!jwtVerification.isVerificationAdmin(request)) {
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확
			}
			
			model.addObject(Globals.JSON_RETURN_RESULT, employeeService.selectEmployeeCombo(searchMap));
			model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
		}catch(Exception e){
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, e.toString());
		}
		return model;
	}
	@ApiOperation(value=" CTI teams 콤보 리스트", notes = "성공시 CTI teams  콤보 리스트를 반환 합니다.")
	@PostMapping("employeeSkillCombo.do")
	public ModelAndView selectEmployeeInfoSkillCombo (@RequestBody Map<String, Object> searchMap,
											  		  HttpServletRequest request)	throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
		// 기존 세션 체크 인증에서 토큰 방식으로 변경
			
			if (!jwtVerification.isVerificationAdmin(request)) {
			ResultVO resultVO = new ResultVO();
			return jwtVerification.handleAuthError(resultVO); // 토큰 확
			}
			
			
			model.addObject(Globals.JSON_RETURN_RESULT, employeeService.selectEmployeeSkillCombo(searchMap));
			model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
		}catch(Exception e){
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, e.toString());
		}
		return model;
	}
	@ApiOperation(value=" CTI DnMajro 콤보 리스트", notes = "성공시 CTI DnMajro  콤보 리스트를 반환 합니다.")
	@PostMapping("dnMajroCombo.do")
	public ModelAndView selectDnMajroInfoCombo (@RequestBody Map<String, Object> searchMap,
											  HttpServletRequest request)	throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
		// 기존 세션 체크 인증에서 토큰 방식으로 변경
			
			if (!jwtVerification.isVerificationAdmin(request)) {
			ResultVO resultVO = new ResultVO();
			return jwtVerification.handleAuthError(resultVO); // 토큰 확
			}
			
			
			model.addObject(Globals.JSON_RETURN_RESULT, employeeService.selectDnMajroInfoCombo(searchMap));
			model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
		}catch(Exception e){
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, e.toString());
		}
		return model;
	}
	@ApiOperation(value=" CTI DnKind 콤보 리스트", notes = "성공시 CTI DnKind  콤보 리스트를 반환 합니다.")
	@PostMapping("dnKindCombo.do")
	public ModelAndView selectDnKindInfoCombo (HttpServletRequest request)	throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
		// 기존 세션 체크 인증에서 토큰 방식으로 변경
			
			if (!jwtVerification.isVerificationAdmin(request)) {
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확
			}
			
			model.addObject(Globals.JSON_RETURN_RESULT, employeeService.selectDnKindInfoCombo());
			model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
		}catch(Exception e){
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, e.toString());
		}
		return model;
	}
	@ApiOperation(value=" CTI Media 콤보 리스트", notes = "성공시 CTI Media  콤보 리스트를 반환 합니다.")
	@GetMapping("MediaCombo/{centerId}.do")
	public ModelAndView selectMediaInfoCombo (@PathVariable String centerId, 
																	HttpServletRequest request)	throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
		// 기존 세션 체크 인증에서 토큰 방식으로 변경
			
			if (!jwtVerification.isVerificationAdmin(request)) {
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확
			}
			
			model.addObject(Globals.JSON_RETURN_RESULT, employeeService.selectMediaInfoCombo(centerId));
			model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
		}catch(Exception e){
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, e.toString());
		}
		return model;
	}
	@ApiOperation(value=" CTI dnSub 콤보 리스트", notes = "성공시 CTI dnSub  콤보 리스트를 반환 합니다.")
	@PostMapping("dnSubCombo.do")
	public ModelAndView selectDnSubInfoCombo (@RequestBody Map<String, Object> searchMap,
											  HttpServletRequest request)	throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
		// 기존 세션 체크 인증에서 토큰 방식으로 변경
			
			if (!jwtVerification.isVerificationAdmin(request)) {
			ResultVO resultVO = new ResultVO();
			return jwtVerification.handleAuthError(resultVO); // 토큰 확
			}
			
			
			model.addObject(Globals.JSON_RETURN_RESULT, employeeService.selectDnSubInfoCombo(searchMap));
			model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
		}catch(Exception e){
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, e.toString());
		}
		return model;
	}
	@ApiOperation(value=" CTI dn 콤보 리스트", notes = "성공시 CTI dn  콤보 리스트를 반환 합니다.")
	@PostMapping("dnCombo.do")
	public ModelAndView selectDnInfoCombo (@RequestBody Map<String, Object> searchMap,
										   HttpServletRequest request)	throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
		// 기존 세션 체크 인증에서 토큰 방식으로 변경
			
			if (!jwtVerification.isVerificationAdmin(request)) {
			ResultVO resultVO = new ResultVO();
			return jwtVerification.handleAuthError(resultVO); // 토큰 확
			}
			
			
			model.addObject(Globals.JSON_RETURN_RESULT, employeeService.selectDnInfoCombo(searchMap));
			model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
		}catch(Exception e){
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, e.toString());
		}
		return model;
	}
	@ApiOperation(value=" CTI 권한 콤보 리스트", notes = "성공시 CTI 권한   콤보 리스트를 반환 합니다.")
	@PostMapping("Permit.do")
	public ModelAndView selectPermitInfoCombo (@RequestBody Map<String, Object> searchMap,
										   HttpServletRequest request)	throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
		// 기존 세션 체크 인증에서 토큰 방식으로 변경
			
			if (!jwtVerification.isVerificationAdmin(request)) {
			ResultVO resultVO = new ResultVO();
			return jwtVerification.handleAuthError(resultVO); // 토큰 확
			}
			
			
			model.addObject(Globals.JSON_RETURN_RESULT, employeeService.selectPermitCombo(searchMap));
			model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
		}catch(Exception e){
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, e.toString());
		}
		return model;
	}
	@ApiOperation(value=" CTI 상담사 업데이트", notes = "성공시 CTI 상담사 업데이트 합니다.")
	@PostMapping(value="employeeUpdate.do")
	public ModelAndView updateNexusEmployeesInfo ( @RequestBody NexusAgentRequestInfoDto vo
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
			
			String status = employeeService.updateNexusEmployeesInfo(vo) > 0 ?
		 		 Globals.STATUS_SUCCESS : Globals.STATUS_FAIL;
			String message = status.equals( Globals.STATUS_SUCCESS) ?
				 	 egovMessageSource.getMessage("success.request.msg") :
					 egovMessageSource.getMessage("fail.request.msg") ;
			model.addObject(Globals.STATUS, status);
			model.addObject(Globals.STATUS_MESSAGE, message);
			
		}catch (Exception e){
		
			model.addObject("status", Globals.STATUS_FAIL);
		model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.common.insert"));		
		}finally{
			return model;
		}
	}
	@ApiOperation(value=" CTI 상담사 삭제", notes = "성공시 CTI 상담사 삭제 합니다.")
	@PostMapping(value="employeeDelete.do")
	public ModelAndView updateNexusEmployeesInfo ( @RequestBody NexusAgentInfo vo
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
			
			int ret = employeeService.deleteNexusEmployeesInfo(vo);
			if (ret > 0) {
				model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
				model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("success.common.delete"));
			}
			else {
				model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
				model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.common.delete"));
			}
			
		}catch (Exception e){
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
		model.addObject(Globals.STATUS_MESSAGE, e.toString());	
		}finally{
			return model;
		}
		
	}
	@ApiOperation(value=" CTI 상담사 정보", notes = "성공시 CTI 상담사 정보 조회 합니다.")
	@PostMapping("employeeDetail.do")
	public ModelAndView selectEmployeeDetail (@RequestBody NexusAgentInfo vo, 
												HttpServletRequest request)	throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
			// 기존 세션 체크 인증에서 토큰 방식으로 변경
			
			if (!jwtVerification.isVerificationAdmin(request)) {
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확
			}
			
			model.addObject(Globals.JSON_RETURN_RESULT, employeeService.selectEmployeesExistInfoDetail(vo));
			model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
		}catch(Exception e){
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, e.toString());
		}
		return model;
	}
	@ApiOperation(value=" CTI 상담사 정보 조회", notes = "성공시 CTI 상담사 정보 조회 합니다.")
	@PostMapping("employeeSearchList.do")
	public ModelAndView selectEmployeeSearch (@RequestBody NexusAgentInfo vo, 
												HttpServletRequest request)	throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
			// 기존 세션 체크 인증에서 토큰 방식으로 변경
			
			if (!jwtVerification.isVerificationAdmin(request)) {
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확
			}
			
			model.addObject(Globals.JSON_RETURN_RESULT_LIST, employeeService.selectEmployeesSearchList(vo));
			model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
		}catch(Exception e){
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, e.toString());
		}
		return model;
	}
}
