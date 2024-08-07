package com.system.backoffice.sys.pbx.avaya.web;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.egovframe.rte.fdl.property.EgovPropertyService;
import org.egovframe.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.system.backoffice.sys.pbx.avaya.models.StationInfo;
import com.system.backoffice.sys.pbx.avaya.models.dto.PbxDelReqDto;
import com.system.backoffice.sys.pbx.avaya.models.dto.StationInfoReqDto;
import com.system.backoffice.sys.pbx.avaya.service.StationInfoManageService;
import com.system.backoffice.util.service.UtilInfoService;
import com.system.ipcc.pbx.avaya.service.smsxml.SMSReq;

import egovframework.com.cmm.EgovMessageSource;
import egovframework.com.cmm.exception.NotFoundException;
import egovframework.com.cmm.service.Globals;
import egovframework.com.cmm.service.ResultVO;
import egovframework.com.jwt.config.JwtVerification;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/backoffice/ipcc/avaya/pbx/station")
public class StationInfoManageController {

	
	@Value("${page.pageUnit}")
	private int pageUnitSetting ;
	
	@Value("${page.pageSize}")
	private int pageSizeSetting ;
	
	
	/** EgovPropertyService */
	@Resource(name = "propertiesService")
	protected EgovPropertyService propertyService;
	
	/** EgovMessageSource */
	@Resource(name = "egovMessageSource")
	EgovMessageSource egovMessageSource;
	
	/** JwtVerification */
	@Autowired
	private JwtVerification jwtVerification;
	
	@Autowired
	private StationInfoManageService stationService;
	
	@Autowired
	private SMSReq client;
	
	@ApiOperation(value="삭제", notes = "성공시 공통 분류 코드를 삭제 합니다.")
	@ApiImplicitParam(name = "extension", value = "내선번호")
	@DeleteMapping("{extension}.do")
	public ModelAndView deleteStationInfo (@PathVariable String extension, 
								  		  HttpServletRequest request) throws Exception {
		
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
			// 기존 세션 체크 인증에서 토큰 방식으로 변경
			if (!jwtVerification.isVerificationAdmin(request)) {
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확인
			}
			//station삭제 
			PbxDelReqDto delInfo = PbxDelReqDto.builder().mode("Station").numberInfo(extension) .build();

			
			
			ModelAndView modelResult = client.execRequestCmDelete(delInfo);
			
			if (modelResult.getModel().get(Globals.STATUS).equals(Globals.STATUS_SUCCESS)) {
				String status = stationService.deleteStationInfo(extension) > 0 ? Globals.STATUS_SUCCESS : Globals.STATUS_FAIL;
				String message = status.equals( Globals.STATUS_SUCCESS) ? egovMessageSource.getMessage("success.common.delete") :
																										egovMessageSource.getMessage("fail.common.delete") ;
				model.addObject(Globals.STATUS, status);
				model.addObject(Globals.STATUS_MESSAGE, message);
			}else {
				return modelResult;
			}
		}catch(Exception e) {
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, e.toString());
		}
		return model;
	}

	/**
	 * 내선번호 업데이트 한다.
	 */
	@ApiOperation(value="업데이트", notes = "성공시 내선번호 업데이트 합니다.")
	@PostMapping("update.do")
	public ModelAndView updateStationInfo(@RequestBody StationInfoReqDto vo, 
			  							 					HttpServletRequest request) throws Exception {
		
		
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
			
			// 기존 세션 체크 인증에서 토큰 방식으로 변경
			if (!jwtVerification.isVerificationAdmin(request)) {
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확인
			}
			
			ModelAndView modelResult = client.execRequestStationUpdate(vo);
			
			if (modelResult.getModel().get(Globals.STATUS).equals(Globals.STATUS_SUCCESS)) {
				String status = stationService.updateStationInfo(vo) > 0 ? Globals.STATUS_SUCCESS : Globals.STATUS_FAIL;
				String message = status.equals( Globals.STATUS_SUCCESS) ? egovMessageSource.getMessage("success.request.msg") :
																										egovMessageSource.getMessage("fail.request.msg") ;
				model.addObject(Globals.STATUS, status);
				model.addObject(Globals.STATUS_MESSAGE, message);
			}else {
				return modelResult;
			}
		}catch(Exception e) {
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, e.toString());
		}
		return model;
		
		
	}
	/**
	 * 내선번호 업데이트 한다.
	 */
	@ApiOperation(value="조회된 내선번호 업데이트", notes = "성공시 조회된 내선번호를 업데이트 합니다.")
	@PostMapping("updateExtesionList.do")
	public ModelAndView insertStationListInfo(@RequestBody Map<String, Object> searchMap, 
			  							 		 				HttpServletRequest request) throws Exception {
		
		
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
			
			// 기존 세션 체크 인증에서 토큰 방식으로 변경
			if (!jwtVerification.isVerificationAdmin(request)) {
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확인
			}
			//값 가지고 오기 
			List<String> list = Arrays.asList(searchMap.get("extensionlist").toString().split(","));
		
			List<StationInfo> stationLists = client.execRequestStationInfo(list);
			
			String status = stationService.insertStationInfoList(stationLists) > 0 ? Globals.STATUS_SUCCESS : Globals.STATUS_FAIL;
			String message = status.equals( Globals.STATUS_SUCCESS) ? egovMessageSource.getMessage("success.request.msg") :
																									egovMessageSource.getMessage("fail.request.msg") ;
			model.addObject(Globals.STATUS, status);
			model.addObject(Globals.STATUS_MESSAGE, message);
		}catch(Exception e) {
			 model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			 model.addObject(Globals.STATUS_MESSAGE, e.toString());
		 }
		 return model;
		
		
	}

	/**
	 * 내선번호 상세 조회한다.
	*/
	@ApiOperation(value="상세 조회", notes = "내선번호 상세조회 한다.")
	@GetMapping("{extension}.do")
	public ModelAndView selectStationInfoDetail(@PathVariable String extension, 
			  									HttpServletRequest request) throws Exception {
		
		//공용 확인 하기 
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
			if (!jwtVerification.isVerificationAdmin(request)) {
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확인
			}
			StationInfo detail = stationService.selectStationInfoDetail(extension).orElseThrow(() -> new NotFoundException("정보가 존재하지 않습니다."));
				
			model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
			model.addObject(Globals.JSON_RETURN_RESULT, detail);
		}catch (Exception e){
			log.debug("selectStationInfoDetail error:" + e.toString());
			model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.common.msg")+ e.toString());	
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
		}
		
		return model;
		// 기존 세션 체크 인증에서 토큰 방식으로 변경
	}
	@ApiOperation(value="상세 조회", notes = "내선번호 상세조회 한다.")
	@GetMapping("check/{extension}.do")
	public ModelAndView selectStationDuplicationCheck(@PathVariable String extension, 
			  									HttpServletRequest request) throws Exception {
		
		//공용 확인 하기 
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
			int ret =client.execRequestMemberCheck( extension  , "Station");
			String sStatus = (ret > 0) ? Globals.STATUS_SUCCESS : Globals.STATUS_FAIL;
			String sMessage = (ret > 0) ? "common.idcheck.success" : "common.idcheck.fail";
			model.addObject(Globals.STATUS,sStatus);
			model.addObject(Globals.STATUS_MESSAGE,egovMessageSource.getMessage(sMessage)  );
		}catch (Exception e){
			log.debug("selectAgentInfoDetail error:" + e.toString());
			model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.common.msg")+ e.toString());	
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
		}
		
		return model;
		// 기존 세션 체크 인증에서 토큰 방식으로 변경
	}

    /**
	 * 공통분류코드 목록을 조회한다.
    */
	@ApiOperation(value="목록 조회", notes = "내선번호 목록을 조회한다.")
	@PostMapping("list.do")
	public ModelAndView selectStationList(@RequestBody Map<String, Object> searchMap, 
											HttpServletRequest request) throws Exception {
		
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
			
			
			/** pageing */
			PaginationInfo paginationInfo = new PaginationInfo();
			paginationInfo.setCurrentPageNo( Integer.valueOf(UtilInfoService.NVLObj(searchMap.get(Globals.PAGE_INDEX).toString(),"1") ));
			paginationInfo.setRecordCountPerPage(UtilInfoService.NVLObj(searchMap.get(Globals.PAGE_UNIT), pageUnitSetting));
			paginationInfo.setPageSize(UtilInfoService.NVLObj(searchMap.get(Globals.PAGE_SIZE), pageUnitSetting));
			
			searchMap.put(Globals.PAGE_FIRST_INDEX, paginationInfo.getFirstRecordIndex());
			searchMap.put(Globals.PAGE_LAST_INDEX, paginationInfo.getLastRecordIndex());
			searchMap.put(Globals.PAGE_RECORD_PER_PAGE, paginationInfo.getRecordCountPerPage());
		
			List<Map<String, Object>> codeList = (List<Map<String, Object>>) stationService.selectStationInfoPageList(searchMap);
			
			log.info("===========  count:" + codeList.size());
			
			int totCnt = codeList.size() > 0 ?  Integer.valueOf( UtilInfoService.NVLObj(codeList.get(0).get(Globals.PAGE_TOTAL_RECORD_COUNT),"0")) :0;
			
			paginationInfo.setTotalRecordCount(totCnt);
			model.addObject(Globals.JSON_RETURN_RESULT_LIST, codeList);
			model.addObject(Globals.JSON_PAGEINFO, paginationInfo);
		}catch (Exception e){
			log.error("selectStationList error:" + e.toString());
			log.error("selectStationList error number:" +e.getStackTrace()[0].getLineNumber());
			model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.common.msg")+ e.toString());	
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
		}	
		return model;
	}
}
