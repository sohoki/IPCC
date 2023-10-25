package com.system.ipcc.cti.nexus.web;

import java.util.List;
import java.util.Map;

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
import com.system.ipcc.cti.nexus.models.NexusSkillEmployeeInfo;
import com.system.ipcc.cti.nexus.models.NexusSkillInfo;
import com.system.ipcc.cti.nexus.models.dto.NexusSkillEmployeeRequestInfoDto;
import com.system.ipcc.cti.nexus.models.dto.NexusSkillRequestInfo;
import com.system.ipcc.cti.nexus.service.NexusSkillManageService;
import egovframework.com.cmm.EgovMessageSource;
import egovframework.com.cmm.service.Globals;
import egovframework.com.cmm.service.ResultVO;
import egovframework.com.jwt.config.JwtVerification;

@RestController
@RequestMapping("/api/interface/int/nex")
@SuppressWarnings("unchecked")
public class NexusSkillInfoController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(NexusSkillInfoController.class);
	
	
	@Value("${page.pageUnit}")
    private int pageUnitSetting ;
    
    @Value("${page.pageSize}")
    private int pageSizeSetting ;
    
    /** JwtVerification */
	@Autowired
	private JwtVerification jwtVerification;
    
    @Autowired
    private NexusSkillManageService skillService;
    
	@Resource(name="egovMessageSource")
	protected EgovMessageSource egovMessageSource;

	@PostMapping("skillList.do")
	public ModelAndView selectSkillList (@RequestBody Map<String, Object> searchMap
										, HttpServletRequest request
										, BindingResult bindingResult
										) throws Exception {
    	
		
    	ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
    	try
    	{
    		// 기존 세션 체크 인증에서 토큰 방식으로 변경
    		LOGGER.debug(" error 0");
    		if (!jwtVerification.isVerificationAdmin(request)) {
        		ResultVO resultVO = new ResultVO();
    			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
        	}
    		LOGGER.debug(" error 1");
            int pageUnit = searchMap.get("pageUnit") == null ?   pageUnitSetting : Integer.valueOf((String) searchMap.get("pageUnit"));
    		int pageSize = searchMap.get("pageSize") == null ?   pageSizeSetting : Integer.valueOf((String) searchMap.get("pageSize"));  
    		LOGGER.debug(" error 2");
    	    
        	/** pageing */
        	PaginationInfo paginationInfo = new PaginationInfo();
    		paginationInfo.setCurrentPageNo( Integer.valueOf( searchMap.get("pageIndex").toString() ));
    		paginationInfo.setRecordCountPerPage(pageUnit);
    		paginationInfo.setPageSize(pageSize);
    		LOGGER.debug(" error 3");
    		searchMap.put("firstIndex", paginationInfo.getFirstRecordIndex());
    		searchMap.put("lastRecordIndex", paginationInfo.getLastRecordIndex());
    		searchMap.put("recordCountPerPage", paginationInfo.getRecordCountPerPage());
    		
    	    List<Map<String, Object>> skillList = skillService.selectNexusSkillInfoPageList(searchMap);
    	    int totCnt = skillList.size() > 0 ?  Integer.valueOf( skillList.get(0).get("totalRecordCount").toString()) :0;
            

    		paginationInfo.setTotalRecordCount(totCnt);
    		
    		model.addObject(Globals.STATUS_REGINFO, searchMap);
    		model.addObject(Globals.JSON_RETURN_RESULT_LIST, skillList);
    		model.addObject(Globals.PAGE_TOTAL_COUNT, totCnt);
    		model.addObject(Globals.JSON_PAGEINFO, paginationInfo);
    		model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
    		
    		
    		
    	}catch (Exception e){
			LOGGER.debug("selectCmmnCodeList error:" + e.toString());
			model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.common.msg")+ e.toString());	
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
	    }
	    
        return model;
        
        
	}
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
        	
    		
        	System.out.println("================1");
    		String status = skillService.updateNexusSkillEmployeeInfo(vo) > 0 ?
			 		 Globals.STATUS_SUCCESS : Globals.STATUS_FAIL;
			String message = status.equals( Globals.STATUS_SUCCESS) ?
					 	 egovMessageSource.getMessage("success.request.msg") :
						 egovMessageSource.getMessage("fail.request.msg") ;

			System.out.println("================2");
			model.addObject(Globals.STATUS, status);
			System.out.println("================3");
	   		model.addObject(Globals.STATUS_MESSAGE, message);
	   		System.out.println("================4");
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
