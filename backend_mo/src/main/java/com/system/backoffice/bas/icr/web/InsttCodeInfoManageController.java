package com.system.backoffice.bas.icr.web;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.egovframe.rte.fdl.property.EgovPropertyService;
import org.egovframe.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.system.backoffice.bas.icr.models.dto.InsttCodeRecptnReqDto;
import com.system.backoffice.bas.icr.service.InsttCodeInfoManageService;

import egovframework.com.cmm.EgovMessageSource;
import egovframework.com.cmm.service.Globals;
import egovframework.com.cmm.service.ResultVO;
import egovframework.com.jwt.config.JwtVerification;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

@Api(tags = {"기관 코드 정보 및 기관코드수신 연계 API"})
@Slf4j
@RestController
@RequestMapping("/api/backoffice/sys/cmm/icr")
public class InsttCodeInfoManageController {

	
	
	
	@Value("${page.pageUnit}")
    private int pageUnitSetting ;
    
    @Value("${page.pageSize}")
    private int pageSizeSetting ;
    
	/** JwtVerification */
	@Autowired
	private JwtVerification jwtVerification;
	
	@Autowired
	private InsttCodeInfoManageService insttService;
	
	@Resource(name="egovMessageSource")
	protected EgovMessageSource egovMessageSource;
	
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;
    
    
    @ApiOperation(value="기관 코드 삭제", notes = "성공시 기관 코드를 삭제 합니다.")
	@ApiImplicitParam(name = "insttCode", value = "기관 코드 insttCode")
    @DeleteMapping("{insttCode}.do")
	public ModelAndView deleteInsttCode (@PathVariable String insttCode, 
			                                  ModelMap modelMe,
			                                  HttpServletRequest request) throws Exception {
    	ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
    	try{
    		// 기존 세션 체크 인증에서 토큰 방식으로 변경
        	if (!jwtVerification.isVerificationAdmin(request)) {

        		ResultVO resultVO = new ResultVO();
    			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
        	}
        	
        	
        	InsttCodeRecptnReqDto insttInfo = new InsttCodeRecptnReqDto();
        	
        	insttInfo.setInsttCode(insttCode);
        	insttInfo.setOccrrDe("");
        	insttInfo.setOpertSn(0);
        	
    		int ret = insttService.deleteInsttCode(insttInfo) ;
        	if (ret > 0) {
        		model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
        		model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("success.common.delete"));
        	}
        	else {
        		model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
    	    	model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.common.delete"));
        	}
        	
    		
    	}catch(Exception e){
    		log.error("deleteInsttCodeCode error:" + e.toString());
    		model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
    		model.addObject(Globals.STATUS_MESSAGE, e.toString());
    	}
    	return model;
	}
    @ApiOperation(value="기관 코드 조회", notes = "성공시 기관 코드를 조회 합니다.")
	@ApiImplicitParam(name = "insttCode", value = "기관 코드 insttCode")
	@GetMapping("{insttCode}.do")
 	public ModelAndView selectInsttCodeDetail (@PathVariable String insttCode, 
 												HttpServletRequest request)	throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
			// 기존 세션 체크 인증에서 토큰 방식으로 변경
        	if (!jwtVerification.isVerificationAdmin(request)) {
        		ResultVO resultVO = new ResultVO();
    			return jwtVerification.handleAuthError(resultVO); // 토큰 확
        	}
        	model.addObject(Globals.JSON_RETURN_RESULT, insttService.selectInsttCodeDetail(insttCode));
    		model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
		}catch(Exception e){
			log.error("selectCmmnDetailCodeDetail error:" + e.toString());
    		model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
    		model.addObject(Globals.STATUS_MESSAGE, e.toString());
    	}
    	return model;
	}
    @ApiOperation(value="기관 코드 combobox 조회", notes = "성공시 기관 코드를 combobox  조회 합니다.")
	@PostMapping("insttComboboxCode.do")
 	public ModelAndView selectInsttCodeCombobox (@RequestBody Map<String, Object> searchMap, 
 												HttpServletRequest request)	throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
			// 기존 세션 체크 인증에서 토큰 방식으로 변경
        	if (!jwtVerification.isVerificationAdmin(request)) {
        		ResultVO resultVO = new ResultVO();
    			return jwtVerification.handleAuthError(resultVO); // 토큰 확
        	}
        	model.addObject(Globals.JSON_RETURN_RESULT, insttService.selectInsttCodeComboList(searchMap));
    		model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
		}catch(Exception e){
			log.error("selectCmmnDetailCodeDetail error:" + e.toString());
    		model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
    		model.addObject(Globals.STATUS_MESSAGE, e.toString());
    	}
    	return model;
	}
    
    @ApiOperation(value="기관 코드 조회", notes = "성공시 기관 코드 조회 합니다.")
    @PostMapping(value="List.do")
    public ModelAndView selectInsttCodeList (@RequestBody Map<String, Object> searchMap, 
		                                     HttpServletRequest request)  {
    	//나중에 권한 설정 값 넣기 
    	
    	
    	ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
    	try{
    		// 기존 세션 체크 인증에서 토큰 방식으로 변경
        	if (!jwtVerification.isVerificationAdmin(request)) {
        		ResultVO resultVO = new ResultVO();
    			return jwtVerification.handleAuthError(resultVO); // 토큰 확
        	}
        	
        	int pageUnit = searchMap.get(Globals.PAGE_UNIT) == null ?   pageUnitSetting : Integer.valueOf((String) searchMap.get(Globals.PAGE_UNIT));
    		int pageSize = searchMap.get(Globals.PAGE_SIZE) == null ?   pageSizeSetting : Integer.valueOf((String) searchMap.get(Globals.PAGE_SIZE));  
    	   
    		
    	    
        	/** pageing */
    		PaginationInfo paginationInfo = new PaginationInfo();
    		paginationInfo.setCurrentPageNo( Integer.valueOf( searchMap.get(Globals.PAGE_INDEX) == null  ?
    														  "1" : searchMap.get(Globals.PAGE_INDEX).toString() ));
    		paginationInfo.setRecordCountPerPage(pageUnit);
    		paginationInfo.setPageSize(pageSize);

    		searchMap.put(Globals.PAGE_FIRST_INDEX, paginationInfo.getFirstRecordIndex());
    		searchMap.put(Globals.PAGE_LAST_INDEX, paginationInfo.getLastRecordIndex());
    		searchMap.put(Globals.PAGE_RECORD_PER_PAGE, paginationInfo.getRecordCountPerPage());
    		
    		
            List<Map<String, Object>> codeInsttList = insttService.selectInsttCodeList(searchMap);
            int totCnt = codeInsttList.size() > 0 ? codeInsttList.size()  : 0;

    		
    		model.addObject(Globals.JSON_RETURN_RESULT_LIST, codeInsttList);
            model.addObject(Globals.PAGE_TOTAL_COUNT, totCnt);
            
    	}catch(Exception e){
    		log.error("selectCmmnDetailCodeList error:" + e.toString());
    		model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
    		model.addObject(Globals.STATUS_MESSAGE, e.toString());
    		
    	}   
    	return model;
	}
    @ApiOperation(value="기관코드수신 조회", notes = "성공시 기관코드수신 조회 합니다.")
    @PostMapping(value="recList.do")
    public ModelAndView selectInsttRecCodeList (@RequestBody Map<String, Object> searchMap, 
		                                     HttpServletRequest request)  {
    	//나중에 권한 설정 값 넣기 
    	
    	
    	ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
    	try{
    		// 기존 세션 체크 인증에서 토큰 방식으로 변경
        	if (!jwtVerification.isVerificationAdmin(request)) {
        		ResultVO resultVO = new ResultVO();
    			return jwtVerification.handleAuthError(resultVO); // 토큰 확
        	}
        	
        	int pageUnit = searchMap.get(Globals.PAGE_UNIT) == null ?   pageUnitSetting : Integer.valueOf((String) searchMap.get(Globals.PAGE_UNIT));
    		int pageSize = searchMap.get(Globals.PAGE_SIZE) == null ?   pageSizeSetting : Integer.valueOf((String) searchMap.get(Globals.PAGE_SIZE));  
    	   
    		
    	    
        	/** pageing */
    		PaginationInfo paginationInfo = new PaginationInfo();
    		paginationInfo.setCurrentPageNo( Integer.valueOf( searchMap.get(Globals.PAGE_INDEX) == null  ?
    														  "1" : searchMap.get(Globals.PAGE_INDEX).toString() ));
    		paginationInfo.setRecordCountPerPage(pageUnit);
    		paginationInfo.setPageSize(pageSize);

    		searchMap.put(Globals.PAGE_FIRST_INDEX, paginationInfo.getFirstRecordIndex());
    		searchMap.put(Globals.PAGE_LAST_INDEX, paginationInfo.getLastRecordIndex());
    		searchMap.put(Globals.PAGE_RECORD_PER_PAGE, paginationInfo.getRecordCountPerPage());
    		
    		
            List<Map<String, Object>> codeInsttList = insttService.selectInsttCodeRecptnList(searchMap);
            int totCnt = codeInsttList.size() > 0 ? codeInsttList.size()  : 0;

    		
    		model.addObject(Globals.JSON_RETURN_RESULT_LIST, codeInsttList);
            model.addObject(Globals.PAGE_TOTAL_COUNT, totCnt);
            
    	}catch(Exception e){
    		log.error("selectCmmnDetailCodeList error:" + e.toString());
    		model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
    		model.addObject(Globals.STATUS_MESSAGE, e.toString());
    		
    	}   
    	return model;
	}
}
