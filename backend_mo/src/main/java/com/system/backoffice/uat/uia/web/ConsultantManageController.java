package com.system.backoffice.uat.uia.web;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.egovframe.rte.fdl.property.EgovPropertyService;
import org.egovframe.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.system.backoffice.uat.uia.models.PartInfoVO;
import com.system.backoffice.uat.uia.service.ConsultantManageService;
import com.system.backoffice.uat.uia.service.PartInfoManageService;
import com.system.backoffice.uat.uia.service.UniUtilManageService;
import com.system.backoffice.util.service.UtilInfoService;
import com.system.ipcc.cti.nexus.service.NexusEmployeeManageService;

import egovframework.com.cmm.EgovMessageSource;
import egovframework.com.cmm.service.Globals;
import egovframework.com.cmm.service.ResultVO;
import egovframework.com.jwt.config.JwtVerification;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;


@Api(tags = {"상담원 관리 정보 API"})
@RequiredArgsConstructor // final이 선언된 모든 필드를 인자값으로 하는 생성자를 대신 생성하여, 빈을 생성자로 주입받게 한다.
@RestController
@RequestMapping("/api/backoffice/uat/uia/contant")
public class ConsultantManageController {

private static final Logger LOGGER = LoggerFactory.getLogger(AdminInfoManageController.class);
	
	@Autowired
	private ConsultantManageService consulService;
	
	/** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
    
    @Resource(name="egovMessageSource")
	protected EgovMessageSource egovMessageSource;
	/*
	@Autowired
	private UniUtilManageService utilService;
	
	
	@Autowired
	private NexusEmployeeManageService ctiService;
	*/
	
	@Autowired
	private PartInfoManageService partService;
	
	/** JwtVerification */
	@Autowired
	private JwtVerification jwtVerification;
	
	@ApiOperation( value = "상담원 정보 조회" , notes = "성공시 상담원 정보를 조회한다.")
	@ApiImplicitParams({
	    @ApiImplicitParam(
	        name = "id"
	        , value = "자격증 아이디"
	        , required = true
	        , dataType = "string"
	        , paramType = "path"
	        , defaultValue = "None"
	    ),
	    @ApiImplicitParam(
	        name = "fields"
	        , value = "응답 필드 종류"
	        , required = false
	        , dataType = "string"
	        , paramType = "query"
	        , defaultValue = ""
	    )
    })
	@PostMapping("consultantList.do")
	public ModelAndView selectUserManagerList(@RequestBody Map<String, Object> searchVO,
											  HttpServletRequest request) throws Exception{
		
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try{
			// 기존 세션 체크 인증에서 토큰 방식으로 변경
	    	if (!jwtVerification.isVerificationAdmin(request)) {
	    		ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확인
	    	}
			
	    	searchVO.put(Globals.PAGE_UNIT, propertiesService.getInt(Globals.PAGE_UNIT));
	    	searchVO.put(Globals.PAGE_SIZE, propertiesService.getInt(Globals.PAGE_SIZE));
	       
	      
	   	   PaginationInfo paginationInfo = new PaginationInfo();
		   paginationInfo.setCurrentPageNo(Integer.parseInt(searchVO.get(Globals.PAGE_INDEX).toString()));
		   paginationInfo.setRecordCountPerPage(propertiesService.getInt(Globals.PAGE_UNIT));
		   paginationInfo.setPageSize(propertiesService.getInt(Globals.PAGE_UNIT));
		   
		   
		   searchVO.put(Globals.PAGE_FIRST_INDEX, paginationInfo.getFirstRecordIndex());
		   searchVO.put(Globals.PAGE_LAST_INDEX, paginationInfo.getLastRecordIndex());
		   searchVO.put(Globals.PAGE_RECORD_PER_PAGE, paginationInfo.getRecordCountPerPage());
		   model.addObject(Globals.STATUS_REGINFO, searchVO);
		   
		   @SuppressWarnings("unchecked")
		   List<Map<String, Object>> adminList =  (List<Map<String, Object>>) consulService.selectConsultantrManageListByPagination(searchVO); 
		   
		   
	       model.addObject("resultList",  adminList);      	       
	       int totCnt = adminList.size() > 0 ? Integer.parseInt(adminList.get(0).get(Globals.PAGE_TOTAL_RECORD_COUNT).toString()) : 0;  
	       paginationInfo.setTotalRecordCount(totCnt);
	       model.addObject(Globals.JSON_PAGEINFO, paginationInfo);
	       model.addObject(Globals.PAGE_TOTAL_COUNT, totCnt);

	       List<PartInfoVO> partCombo = partService.selectPartInfoCombo(searchVO);
		   model.addObject("selectGroup", partCombo);
	       
		   
		}catch (Exception e){
			LOGGER.debug("selectUserManagerList error:" + e.toString());
			model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.common.msg")+ e.toString());	
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
		}
		return model;
	}
	@GetMapping("consultantCombo.do")
	public ModelAndView selectConsultantCombo (HttpServletRequest request)	throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
		// 기존 세션 체크 인증에서 토큰 방식으로 변경
			
			if (!jwtVerification.isVerificationAdmin(request)) {
			ResultVO resultVO = new ResultVO();
			return jwtVerification.handleAuthError(resultVO); // 토큰 확
			}
			
			model.addObject(Globals.JSON_RETURN_RESULT, consulService.selectConstantCombo());
			model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
		}catch(Exception e){
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, e.toString());
		}
		return model;
	}
	@GetMapping("conCombo.do")
	public ModelAndView selectConsultantAdminCombo (@RequestParam("extenNumber") String extenNumber,
													HttpServletRequest request)	throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
		// 기존 세션 체크 인증에서 토큰 방식으로 변경
			
			if (!jwtVerification.isVerificationAdmin(request)) {
			ResultVO resultVO = new ResultVO();
			return jwtVerification.handleAuthError(resultVO); // 토큰 확
			}
			
			
			model.addObject(Globals.JSON_RETURN_RESULT, consulService.selectConstantEmpCombo(UtilInfoService.NVL("extenNumber", "")));
			model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
		}catch(Exception e){
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, e.toString());
		}
		return model;
	}
}
