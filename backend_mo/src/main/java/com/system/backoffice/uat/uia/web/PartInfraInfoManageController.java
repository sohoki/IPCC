package com.system.backoffice.uat.uia.web;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.egovframe.rte.fdl.property.EgovPropertyService;
import org.egovframe.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.system.backoffice.uat.uia.models.PartInfraInfo;
import com.system.backoffice.uat.uia.models.UniUtilInfo;
import com.system.backoffice.uat.uia.models.dto.PartInfraInfoRequestDto;
import com.system.backoffice.uat.uia.service.PartInfraInfoManageService;
import com.system.backoffice.util.service.UtilInfoService;
import egovframework.com.cmm.EgovMessageSource;
import egovframework.com.cmm.service.Globals;
import egovframework.com.cmm.service.ResultVO;
import egovframework.com.jwt.config.JwtVerification;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;



@Api(tags = {"기관별 부서 인프라 기초 정보 API"})
@Slf4j
@RestController
@RequestMapping("/api/backoffice/uat/uia/partinfra")
public class PartInfraInfoManageController {

	

	@Resource(name="egovMessageSource")
	protected EgovMessageSource egovMessageSource;

	@Autowired
	protected EgovPropertyService propertiesService;
	

	@Autowired
	private PartInfraInfoManageService partInfraService;
	
	 
	/** JwtVerification */
	@Autowired
	private JwtVerification jwtVerification;
	
	
	@ApiOperation(value="기관별 부서 코드 조회", notes = "성공시 기관별 부서 코드 조회 합니다.")
	@PostMapping("partInfraList.do")
	public ModelAndView selectPartManagerList( @RequestBody Map<String, Object> searchVO 
												 , HttpServletRequest request
												 , BindingResult bindingResult) throws Exception {  
		 
			ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
			try{		   
	    		// 기존 세션 체크 인증에서 토큰 방식으로 변경
			   
				if (!jwtVerification.isVerificationAdmin(request) && !jwtVerification.isVerificationSystem(request)) {
					ResultVO resultVO = new ResultVO();
					return jwtVerification.handleAuthError(resultVO); // 토큰 확인
				}else {
					String[] userinfo = jwtVerification.getTokenUserInfo(request);
					searchVO.put(Globals.USER_ROLE_ID, userinfo[2]);
					searchVO.put(Globals.USER_PART_ID, userinfo[3]);
					searchVO.put(Globals.USER_INSTT_CODE, userinfo[4]);
				}
				
				
				if (!searchVO.get(Globals.USER_PART_ID).equals("SYSTEM"))
					searchVO.put(Globals.PAGE_UNIT, UtilInfoService.NVLObj(searchVO.get(Globals.PAGE_UNIT), propertiesService.getInt(Globals.PAGE_UNIT)));
				else 
					searchVO.put(Globals.PAGE_UNIT, 1000);
				searchVO.put(Globals.PAGE_SIZE, UtilInfoService.NVLObj(searchVO.get(Globals.PAGE_SIZE), propertiesService.getInt(Globals.PAGE_SIZE)));
				model.addObject(Globals.STATUS_REGINFO, searchVO);
				
				
				PaginationInfo paginationInfo = new PaginationInfo();
				paginationInfo.setCurrentPageNo(UtilInfoService.NVLObj(searchVO.get(Globals.PAGE_INDEX), 1));
				paginationInfo.setRecordCountPerPage(UtilInfoService.NVLObj(searchVO.get(Globals.PAGE_UNIT), propertiesService.getInt(Globals.PAGE_UNIT)));
				paginationInfo.setPageSize(UtilInfoService.NVLObj(searchVO.get(Globals.PAGE_SIZE), propertiesService.getInt(Globals.PAGE_SIZE)) );
				
				searchVO.put(Globals.PAGE_FIRST_INDEX, paginationInfo.getFirstRecordIndex());
				searchVO.put(Globals.PAGE_LAST_INDEX, paginationInfo.getLastRecordIndex());
				searchVO.put(Globals.PAGE_RECORD_PER_PAGE, paginationInfo.getRecordCountPerPage());
				List<Map<String, Object>> partList = partInfraService.selectPartInfraInfoPageInfoManageListByPagination(searchVO) ;
				int totCnt = partList.size() > 0 ? Integer.parseInt( partList.get(0).get(Globals.PAGE_TOTAL_RECORD_COUNT).toString()) : 0;  
				model.addObject(Globals.JSON_RETURN_RESULT_LIST ,  partList );
				paginationInfo.setTotalRecordCount(totCnt);
				model.addObject(Globals.PAGE_INFO, paginationInfo);
				model.addObject(Globals.PAGE_TOTAL_COUNT, totCnt);
				model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
				//model.addObject("selectGroupCombo", partService.selectPartInfoCombo(searchVO));
			}catch (Exception e){
				log.error("error number:"+ e.getStackTrace()[0].getLineNumber());
				model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
				model.addObject(Globals.STATUS_MESSAGE,  e.toString());
			}
			return model;
	}
	@ApiOperation(value="기관별 부서  infra 상세 정보 조회", notes = "성공시 기관별 부서  infra 상세 정보 조회 합니다.")
	@ApiImplicitParam(name = "partId", value = "부서 코드 ")
	@GetMapping("{partInfraCode}.do")
	public ModelAndView partInfoDetail ( @PathVariable String partInfraCode
														, HttpServletRequest request) throws Exception {  
		
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW); 
		
		// 기존 세션 체크 인증에서 토큰 방식으로 변경
		if (!jwtVerification.isVerificationAdmin(request) && !jwtVerification.isVerificationSystem(request)) {
			ResultVO resultVO = new ResultVO();
			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
		}
		
		
		try{ 
			Optional<PartInfraInfo> info = partInfraService.selectPartfraInfoDetail(partInfraCode);
			model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
			model.addObject(Globals.JSON_RETURN_RESULT, info);
		 }catch(Exception e){
			log.error("partInfoDetail : error" + e.toString());
			model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.request.msg"));	
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
		 }
		 return model;
	}
	@ApiOperation(value="부서  infra 정보 업데이트", notes = "성공시 부서  infra 정보 업데이트 합니다.")
	@PostMapping("update.do")
	public ModelAndView partInfoUpdate ( @RequestBody PartInfraInfoRequestDto partInfo
										, HttpServletRequest request
										, BindingResult bindingResult) throws Exception {  
		
		
		// 기존 세션 체크 인증에서 토큰 방식으로 변경
		if (!jwtVerification.isVerificationAdmin(request)) {
			ResultVO resultVO = new ResultVO();
			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
		}else {
			partInfo.setUserId(jwtVerification.getTokenUserName(request));
		}
		
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		String meesage = "";
		String status  = "";
		try{
				
			int ret = partInfraService.updatePartfraInfoManage(partInfo);
			
			status = ret >0 ? Globals.STATUS_SUCCESS : Globals.STATUS_FAIL;
			meesage = partInfo.getMode().equals("Ins") ? "sucess.common.insert" : "sucess.common.update";
			
			
			model.addObject(Globals.STATUS, status);
			model.addObject(Globals.STATUS_MESSAGE , egovMessageSource.getMessage(meesage));
		}catch(Exception e){
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.request.msg") + e.toString());	
		}
		return model;
	}
	@ApiOperation(value="기관별 부서 infra정보 삭제", notes = "성공시 기관별 부서 정보 삭제 합니다.")
	@ApiImplicitParam(name = "partId", value = "부서 코드 ")
	@DeleteMapping("{partId}.do")
	public ModelAndView partDelete(@PathVariable String partId ) throws Exception {
		
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);

		try{
			
			int ret = partInfraService.deletePartfraInfoManage(partId);
			
			String status = ret >0 ? Globals.STATUS_SUCCESS : Globals.STATUS_FAIL;
			
			model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("success.request.msg"));	
			model.addObject(Globals.STATUS, status); 
		}catch (Exception e){
			//result = "F";
			model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.request.msg"));	
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
		}
		return model;
	}
}
