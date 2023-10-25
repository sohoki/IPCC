package com.system.backoffice.bas.code.web;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.system.backoffice.bas.code.models.CmmnClCode;
import com.system.backoffice.bas.code.service.EgovCcmCmmnClCodeManageService;

import egovframework.com.cmm.EgovMessageSource;
import egovframework.com.cmm.exception.NotFoundException;
import egovframework.com.cmm.service.Globals;
import egovframework.com.cmm.service.ResultVO;
import egovframework.com.jwt.config.JwtVerification;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.egovframe.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.ModelMap;


@RestController
@RequestMapping("/api/backoffice/sys/cmm/clc")
public class EgovCcmCmmnClCodeManageController {

	private static final Logger LOGGER = LoggerFactory.getLogger(EgovCcmCmmnClCodeManageController.class);
	
	@Autowired
    private EgovCcmCmmnClCodeManageService cmmnClCodeManageService;
	
    @Value("${page.pageUnit}")
    private int pageUnitSetting ;
    
    @Value("${page.pageSize}")
    private int pageSizeSetting ;
    
	@Autowired
	EgovMessageSource egovMessageSource;
	
	/** JwtVerification */
	@Autowired
	private JwtVerification jwtVerification;
    
    /**
	 * 공통분류코드를 삭제한다.
	 * @param loginVO
	 * @param cmmnClCode
	 * @param model
	 * @return "forward:/sym/ccm/ccc/EgovCcmCmmnClCodeList.do"
	 * @throws Exception
	 */
    @DeleteMapping("{clCode}.do")
	public ModelAndView deleteCmmnClCode (@PathVariable String clCode, 
										  HttpServletRequest request) throws Exception {
    	 
    	ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
    	try {
    		// 기존 세션 체크 인증에서 토큰 방식으로 변경
        	if (!jwtVerification.isVerificationAdmin(request)) {

        		ResultVO resultVO = new ResultVO();
    			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
        	}
        	
    		cmmnClCodeManageService.deleteCmmnClCode(clCode);
	    	int ret = cmmnClCodeManageService.deleteCmmnClCode(clCode);
	    	String status = cmmnClCodeManageService.deleteCmmnClCode(clCode) > 0 ?
	    			 		 Globals.STATUS_SUCCESS : Globals.STATUS_FAIL;
	    	String message = status.equals( Globals.STATUS_SUCCESS) ?
	    			 	 egovMessageSource.getMessage("success.common.delete") :
	    				 egovMessageSource.getMessage("fail.common.delete") ;
	    	model.addObject(Globals.STATUS, status);
	    	model.addObject(Globals.STATUS_MESSAGE, Globals.STATUS_SUCCESS);
    	}catch(Exception e) {
    		model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
    		model.addObject(Globals.STATUS_MESSAGE, e.toString());
    	}
    	return model;
	}

	/**
	 * 공통분류코드를 등록한다.
	 * @param loginVO
	 * @param cmmnClCode
	 * @param bindingResult
	 * @return "/cmm/sym/ccm/EgovCcmCmmnClCodeRegist"
	 * @throws Exception
	 */
    @PostMapping("code/update.do")
	public ModelAndView updateCmmnClCode(@RequestBody CmmnClCode clCode, 
			  							 HttpServletRequest request) throws Exception {
    	
    	
    	ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
    	try {
    		
    		// 기존 세션 체크 인증에서 토큰 방식으로 변경
        	if (!jwtVerification.isVerificationAdmin(request)) {
        		ResultVO resultVO = new ResultVO();
    			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
        	}else {
        		clCode.setUserId(jwtVerification.getTokenUserName(request));
        	}
    		String status = cmmnClCodeManageService.updateCmmnClCode(clCode) > 0 ?
			 		 Globals.STATUS_SUCCESS : Globals.STATUS_FAIL;
			String message = status.equals( Globals.STATUS_SUCCESS) ?
					 	 egovMessageSource.getMessage("success.request.msg") :
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
	 * 공통분류코드 상세항목을 조회한다.
	 * @param loginVO
	 * @param cmmnClCode
	 * @param model
	 * @return "cmm/sym/ccm/EgovCcmCmmnClCodeDetail"
	 * @throws Exception
	 */
    @GetMapping("{clCode}.do")
	public ModelAndView selectCmmnClCodeDetail(@PathVariable String clCode, 
			  									HttpServletRequest request) throws Exception {
    	
		//공용 확인 하기 
    	ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
    	try {
    		LOGGER.debug("=======================");
    		if (!jwtVerification.isVerificationAdmin(request)) {
    			LOGGER.debug("=======================1");
        		ResultVO resultVO = new ResultVO();
    			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
        	}
        	CmmnClCode detail = cmmnClCodeManageService.selectCmmnClCodeDetail(clCode).orElseThrow(() 
        			-> new NotFoundException("클래스 정보가 존재하지 않습니다."));
    			
    		model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
    		model.addObject(Globals.JSON_RETURN_RESULT, detail);
    	}catch (Exception e){
			LOGGER.debug("selectCmmnClCodeDetail error:" + e.toString());
			model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.common.msg")+ e.toString());	
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
	    }
	    
        return model;
    	// 기존 세션 체크 인증에서 토큰 방식으로 변경
	}

    /**
	 * 공통분류코드 목록을 조회한다.
     * @param loginVO
     * @param searchVO
     * @param model
     * @return "/cmm/sym/ccm/EgovCcmCmmnClCodeList"
     * @throws Exception
     */
    @PostMapping("code/list.do")
	public ModelAndView selectCmmnClCodeList(@RequestBody Map<String, Object> searchMap, 
											HttpServletRequest request) throws Exception {
    	
    	ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
    	try
    	{
    		// 기존 세션 체크 인증에서 토큰 방식으로 변경
        	if (!jwtVerification.isVerificationAdmin(request)) {
        		ResultVO resultVO = new ResultVO();
    			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
        	}
        	
        	
            int pageUnit = searchMap.get("pageUnit") == null ?   pageUnitSetting : Integer.valueOf((String) searchMap.get("pageUnit"));
    		int pageSize = searchMap.get("pageSize") == null ?   pageSizeSetting : Integer.valueOf((String) searchMap.get("pageSize"));  
    	   
    	    
        	/** pageing */
        	PaginationInfo paginationInfo = new PaginationInfo();
    		paginationInfo.setCurrentPageNo( Integer.valueOf( searchMap.get("pageIndex").toString() ));
    		paginationInfo.setRecordCountPerPage(pageUnit);
    		paginationInfo.setPageSize(pageSize);

    		searchMap.put("firstIndex", paginationInfo.getFirstRecordIndex());
    		searchMap.put("lastRecordIndex", paginationInfo.getLastRecordIndex());
    		searchMap.put("recordCountPerPage", paginationInfo.getRecordCountPerPage());
    	    
    	    List<Map<String, Object>> codeList = (List<Map<String, Object>>) cmmnClCodeManageService.selectCmmnClCodeListByPagination(searchMap);
    	    int totCnt = codeList.size() > 0 ?  Integer.valueOf( codeList.get(0).get("totalRecordCount").toString().replace("-", "") ) :0;
            

    		paginationInfo.setTotalRecordCount(totCnt);
    		model.addObject("resultList", codeList);
    		model.addObject("paginationInfo", paginationInfo);
    	}catch (Exception e){
			LOGGER.debug("selectCmmnClCodeList error:" + e.toString());
			model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.common.msg")+ e.toString());	
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
	    }
	    
        return model;
	}

}
