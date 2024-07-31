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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.system.backoffice.util.service.UtilInfoService;
import com.system.ipcc.cti.nexus.models.dto.NexusDnInfoReqestDto;
import com.system.ipcc.cti.nexus.models.dto.NexusLoginIdInfoRequestDto;
import com.system.ipcc.cti.nexus.service.NexusDnManageService;
import com.system.ipcc.cti.nexus.service.NexusLoginIdManageService;

import egovframework.com.cmm.EgovMessageSource;
import egovframework.com.cmm.service.Globals;
import egovframework.com.cmm.service.ResultVO;
import egovframework.com.jwt.config.JwtVerification;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

@Api(tags = {"CTI Nexus DN 관련 연동 API"})
@Slf4j
@RestController
@RequestMapping("/api/interface/int/nex/dn")
@SuppressWarnings("unchecked")
public class NexusDnInfoController {

	@Value("${page.pageUnit}")
	private int pageUnitSetting ;
	
	@Value("${page.pageSize}")
	private int pageSizeSetting ;
	
	/** JwtVerification */
	@Autowired
	private JwtVerification jwtVerification;
	
	
	@Resource(name="egovMessageSource")
	protected EgovMessageSource egovMessageSource;
	
	/** EgovPropertyService */
	@Resource(name = "propertiesService")
	protected EgovPropertyService propertiesService;
	
	@Autowired
	private NexusDnManageService dnService;
	
	@Autowired
	private NexusLoginIdManageService loginIdService;
	
	
	@ApiOperation(value=" CTI DN 리스트", notes = "성공시 CTI DN 상담사 리스트를 반환 합니다.")
	@PostMapping("dnList.do")
	public ModelAndView selectDnList (@RequestBody Map<String, Object> searchMap
														, HttpServletRequest request
														, BindingResult bindingResult
														) throws Exception {
		
		
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try
		{
			// 기존 세션 체크 인증에서 토큰 방식으로 변경
	
			if (!jwtVerification.isVerificationAdmin(request) &&  !jwtVerification.isVerificationSystem(request)) {
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확인
			}else {
				String[] userinfo = jwtVerification.getTokenUserInfo(request);
				searchMap.put(Globals.PAGE_LOGIN_SYSTEM_CODE, userinfo[1]);
				searchMap.put(Globals.PAGE_LOGIN_ROLEID, userinfo[2]);
				searchMap.put(Globals.PAGE_LOGIN_PARTID , userinfo[3]);
				searchMap.put(Globals.PAGE_LOGIN_INSTTCODE , userinfo[4]);
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
			
			List<Map<String, Object>> dnList = dnService.selectDnInfoPageList(searchMap);
			int totCnt = dnList.size() > 0 ?  Integer.valueOf( dnList.get(0).get(Globals.PAGE_TOTAL_RECORD_COUNT).toString()) :0;
			
			paginationInfo.setTotalRecordCount(totCnt);
			
			model.addObject(Globals.STATUS_REGINFO, searchMap);
			model.addObject(Globals.JSON_RETURN_RESULT_LIST, dnList);
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
	@ApiOperation(value=" CTI LoginId 리스트", notes = "성공시 CTI LoginId 리스트를 반환 합니다.")
	@PostMapping("loginIdList.do")
	public ModelAndView selectLoginIdList (@RequestBody Map<String, Object> searchMap
														, HttpServletRequest request
														, BindingResult bindingResult
														) throws Exception {
		
		
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try
		{
			// 기존 세션 체크 인증에서 토큰 방식으로 변경
	
			if (!jwtVerification.isVerificationAdmin(request) &&  !jwtVerification.isVerificationSystem(request)) {
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확인
			}else {
				String[] userinfo = jwtVerification.getTokenUserInfo(request);
				searchMap.put(Globals.PAGE_LOGIN_SYSTEM_CODE, userinfo[1]);
				searchMap.put(Globals.PAGE_LOGIN_ROLEID, userinfo[2]);
				searchMap.put(Globals.PAGE_LOGIN_PARTID , userinfo[3]);
				searchMap.put(Globals.PAGE_LOGIN_INSTTCODE , userinfo[4]);
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
			
			List<Map<String, Object>> dnList = loginIdService.selectLoginIdInfoPageList(searchMap);
			int totCnt = dnList.size() > 0 ?  Integer.valueOf( dnList.get(0).get(Globals.PAGE_TOTAL_RECORD_COUNT).toString()) :0;
			
			paginationInfo.setTotalRecordCount(totCnt);
			
			model.addObject(Globals.STATUS_REGINFO, searchMap);
			model.addObject(Globals.JSON_RETURN_RESULT_LIST, dnList);
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
	
	@ApiOperation(value=" CTI Dn 업데이트", notes = "성공시 CTI Dn 업데이트 합니다.")
	@PostMapping(value="dnUpdate.do")
	public ModelAndView updateNexusDnInfo ( @RequestBody NexusDnInfoReqestDto vo
												, HttpServletRequest request
												, BindingResult bindingResult ) throws Exception {
		
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try{
			
			// 기존 세션 체크 인증에서 토큰 방식으로 변경
		
			if (!jwtVerification.isVerificationAdmin(request)) {
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확인
			}
			int ret = dnService.updateDnManagerMapper(vo);
			String status = ret > 0 ?
		 		 Globals.STATUS_SUCCESS : Globals.STATUS_FAIL;
			
			String message  = "";
			switch (ret) {
				case -1 :
					message = "중복 있음";
					break;
				case -2 :
					message = "상위 자원  없음";
					break;
				case -3 :
					message = "하위 자원  없음";
					break;
				case -4 :
					message = "DN값 없음";
					break;
				default :
					message = "정상적으로 처리 되었습니다.";
					break;
			}
			
			model.addObject(Globals.STATUS, status);
			model.addObject(Globals.STATUS_MESSAGE, message);
			
		}catch (Exception e){
		
			model.addObject("status", Globals.STATUS_FAIL);
		model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.common.insert"));		
		}finally{
			return model;
		}
	}
	@ApiOperation(value=" CTI dn/LoginId 존재여부 확인", notes = "성공시 CTI dn/LoginId 존재여부 확인 합니다.")
	@PostMapping(value="constCheck.do")
	public ModelAndView selectNexusDnLoginIdCheckInfo ( @RequestBody NexusDnInfoReqestDto vo
																				, HttpServletRequest request
																				, BindingResult bindingResult ) throws Exception {
		
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try{
			
			// 기존 세션 체크 인증에서 토큰 방식으로 변경
			if (!jwtVerification.isVerificationAdmin(request)) {
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확인
			}
			int ret = dnService.selectDnExistslInfo(vo);
			String status = ret < 1 ?
		 		 Globals.STATUS_SUCCESS : Globals.STATUS_FAIL;
			
			String message  = "";
			switch (ret) {
				case 1 :
					message = "dn값 있음";
					break;
				default :
					message = "dn값 없음.";
					break;
			}
			model.addObject("DN", message);
			NexusLoginIdInfoRequestDto loginId = NexusLoginIdInfoRequestDto.builder()
																	.centerId(vo.getCenterId())
																	.loginId(vo.getLoginId())
																	.build();
			
			ret = loginIdService.selectLoginIdExites(loginId);
			status = ret < 1 ?
			 		 Globals.STATUS_SUCCESS : Globals.STATUS_FAIL;
				
			message  = "";
				switch (ret) {
					case 1 :
						message = "LoginId 있음";
						break;
					default :
						message = "LoginId 없음";
						break;
			}
			model.addObject("LoginId", message);

			
			model.addObject(Globals.STATUS, status);
			
		}catch (Exception e){
		
			model.addObject("status", Globals.STATUS_FAIL);
		model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.common.insert"));		
		}finally{
			return model;
		}
	}
	@ApiOperation(value=" CTI dn 존재여부 확인", notes = "성공시 CTI dn 존재여부 확인 합니다.")
	@PostMapping(value="dnCheck.do")
	public ModelAndView selectNexusDnCheckInfo ( @RequestBody NexusDnInfoReqestDto vo
												, HttpServletRequest request
												, BindingResult bindingResult ) throws Exception {
		
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try{
			
			// 기존 세션 체크 인증에서 토큰 방식으로 변경
		
			if (!jwtVerification.isVerificationAdmin(request)) {
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확인
			}
			int ret = dnService.selectDnExistslInfo(vo);
			String status = ret < 1 ?
		 		 Globals.STATUS_SUCCESS : Globals.STATUS_FAIL;
			
			String message  = "";
			switch (ret) {
				case 1 :
					message = "중복 있음";
					break;
				default :
					message = "중복 없음.";
					break;
			}
			model.addObject(Globals.STATUS, status);
			model.addObject(Globals.STATUS_MESSAGE, message);
			
		}catch (Exception e){
		
			model.addObject("status", Globals.STATUS_FAIL);
		model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.common.insert"));		
		}finally{
			return model;
		}
	}
	@ApiOperation(value=" CTI loginId 존재여부 확인", notes = "성공시 CTI loginId 존재여부 확인 합니다.")
	@PostMapping(value="loginIdCheck.do")
	public ModelAndView selectNexusLoginIdCheckInfo ( @RequestBody NexusLoginIdInfoRequestDto vo
												, HttpServletRequest request
												, BindingResult bindingResult ) throws Exception {
		
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try{
			
			// 기존 세션 체크 인증에서 토큰 방식으로 변경
		
			if (!jwtVerification.isVerificationAdmin(request)) {
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확인
			}
			int ret = loginIdService.selectLoginIdExites(vo);
			String status = ret < 1 ?
		 		 Globals.STATUS_SUCCESS : Globals.STATUS_FAIL;
			
			String message  = "";
			switch (ret) {
				case 1 :
					message = "중복 있음";
					break;
				default :
					message = "중복 없음.";
					break;
			}
			
			model.addObject(Globals.STATUS, status);
			model.addObject(Globals.STATUS_MESSAGE, message);
			
		}catch (Exception e){
		
			model.addObject("status", Globals.STATUS_FAIL);
		model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.common.insert"));		
		}finally{
			return model;
		}
	}
	@ApiOperation(value=" CTI LoginId 업데이트", notes = "성공시 CTI LoginId 업데이트 합니다.")
	@PostMapping(value="loginIdUpdate.do")
	public ModelAndView updateNexusLoginIdInfo ( @RequestBody NexusLoginIdInfoRequestDto vo
												, HttpServletRequest request
												, BindingResult bindingResult ) throws Exception {
		
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try{
			
			// 기존 세션 체크 인증에서 토큰 방식으로 변경
		
			if (!jwtVerification.isVerificationAdmin(request)) {
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확인
			}
			int ret = loginIdService.insertLoginIdInfo(vo); 
			String status = ret > 0 ?
		 		 Globals.STATUS_SUCCESS : Globals.STATUS_FAIL;
			
			String message  = "";
			switch (ret) {
				case -1 :
					message = "중복 있음";
					break;
				case -2 :
					message = "상위 자원  없음";
					break;
				default :
					message = "정상적으로 처리 되었습니다.";
					break;
			}
			
			model.addObject(Globals.STATUS, status);
			model.addObject(Globals.STATUS_MESSAGE, message);
			
		}catch (Exception e){
		
			model.addObject("status", Globals.STATUS_FAIL);
		model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.common.insert"));		
		}finally{
			return model;
		}
	}
	@ApiOperation(value=" CTI Dn 삭제", notes = "성공시 CTI Dn 삭제 합니다.")
	@PostMapping(value="dnDelete.do")
	public ModelAndView deleteNexusEmployeesInfo ( @RequestBody NexusDnInfoReqestDto vo
																			, HttpServletRequest request
																			, BindingResult bindingResult ) throws Exception {
		
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try{
			
			// 기존 세션 체크 인증에서 토큰 방식으로 변경
		
			if (!jwtVerification.isVerificationAdmin(request)) {
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확인
			}
			
			int ret = dnService.deleteDnManagerMapper(vo); 
			if (ret > 0) {
				model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
				model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("success.common.delete"));
			}
			else {
				String message  = "";
				switch (ret) {
					case -5 :
						message = "멀티계정 있음";
						break;
					case -4 :
						message = "DN값 없음";
						break;
					default :
						message = "처리 도중 문제가 발생 하였습니다.";
						break;
				}
				
				model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
				model.addObject(Globals.STATUS_MESSAGE, message);
			}
			
		}catch (Exception e){
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
		model.addObject(Globals.STATUS_MESSAGE, e.toString());	
		}finally{
			return model;
		}
		
	}
	@ApiOperation(value=" CTI loginId 삭제", notes = "성공시 CTI loginId 삭제 합니다.")
	@PostMapping(value="loginIdDelete.do")
	public ModelAndView deleteNexusLoginIdInfo ( @RequestBody NexusLoginIdInfoRequestDto vo
																			, HttpServletRequest request
																			, BindingResult bindingResult ) throws Exception {
		
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try{
			
			// 기존 세션 체크 인증에서 토큰 방식으로 변경
		
			if (!jwtVerification.isVerificationAdmin(request)) {
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확인
			}
			
			int ret = loginIdService.deleteLoginIdInfo(vo);
			if (ret > 0) {
				model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
				model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("success.common.delete"));
			}
			else {
				String message  = "";
				switch (ret) {
					case -1 :
						message = "LoginId 없음";
						break;
					default :
						message = "처리 도중 문제가 발생 하였습니다.";
						break;
				}
				
				model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
				model.addObject(Globals.STATUS_MESSAGE, message);
			}
			
		}catch (Exception e){
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
		model.addObject(Globals.STATUS_MESSAGE, e.toString());	
		}finally{
			return model;
		}
		
	}
	@ApiOperation(value=" CTI Dn 정보", notes = "성공시 CTI Dn 정보 조회 합니다.")
	@PostMapping("dnDetail.do")
	public ModelAndView selectDnDetail (@RequestBody NexusDnInfoReqestDto vo, 
												HttpServletRequest request)	throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
			// 기존 세션 체크 인증에서 토큰 방식으로 변경
			
			if (!jwtVerification.isVerificationAdmin(request)) {
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확
			}
			
			model.addObject(Globals.JSON_RETURN_RESULT, dnService.selectDnDetailInfo(vo)) ;
			model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
		}catch(Exception e){
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, e.toString());
		}
		return model;
	}
	
}
