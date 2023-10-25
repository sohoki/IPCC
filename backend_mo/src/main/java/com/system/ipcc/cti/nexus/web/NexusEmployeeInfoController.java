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
import com.system.ipcc.cti.nexus.models.NexusAgentInfo;
import com.system.ipcc.cti.nexus.models.dto.NexusAgentRequestInfoDto;
import com.system.ipcc.cti.nexus.service.NexusEmployeeManageService;
import egovframework.com.cmm.EgovMessageSource;
import egovframework.com.cmm.service.Globals;
import egovframework.com.cmm.service.ResultVO;
import egovframework.com.jwt.config.JwtVerification;

@RestController
@RequestMapping("/api/interface/int/nex/emp")
@SuppressWarnings("unchecked")
public class NexusEmployeeInfoController {

	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(NexusEmployeeInfoController.class);
	
	
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
	
	
	
	
	@PostMapping("employList.do")
	public ModelAndView selectSkillList (@RequestBody Map<String, Object> searchMap
										, HttpServletRequest request
										, BindingResult bindingResult
										) throws Exception {
    	
		
    	ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
    	try
    	{
    		// 기존 세션 체크 인증에서 토큰 방식으로 변경
        	/*
    		if (!jwtVerification.isVerificationAdmin(request)) {
        		ResultVO resultVO = new ResultVO();
    			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
        	}
        	*/
        	
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
    	    
    	    List<Map<String, Object>> skillList = employeeService.selectEmployeesInfoPageList(searchMap);
    	    int totCnt = skillList.size() > 0 ?  Integer.valueOf( skillList.get(0).get("totalRecordCount").toString()) :0;
            
    	    List<Map<String, Object>> centerList = employeeService.selectCenterInfoCombo();

    		paginationInfo.setTotalRecordCount(totCnt);
    		
    		model.addObject(Globals.STATUS_REGINFO, searchMap);
    		model.addObject(Globals.NEXUS_CENTER_COMBO, centerList);
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
	@GetMapping("tenantCombo/{centerId}.do")
	public ModelAndView selectCmmnDetailCodeDetail (@PathVariable String centerId, 
												  HttpServletRequest request)	throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
		// 기존 세션 체크 인증에서 토큰 방식으로 변경
			/*
			if (!jwtVerification.isVerificationAdmin(request)) {
			ResultVO resultVO = new ResultVO();
			return jwtVerification.handleAuthError(resultVO); // 토큰 확
			}
			*/
			model.addObject(Globals.JSON_RETURN_RESULT, employeeService.selectTenantInfoCombo(centerId));
			model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
		}catch(Exception e){
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, e.toString());
		}
		return model;
	}
	@GetMapping("centerIdCombo.do")
	public ModelAndView selectCmmnDetailCodeDetail (HttpServletRequest request)	throws Exception {
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
			System.out.println("ret: ============" + ret);
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
			
			System.out.println(searchMap.get("centerId"));
			System.out.println(searchMap.get("tenantId"));
			
			
			model.addObject(Globals.JSON_RETURN_RESULT, employeeService.selectGroupInfoCombo(searchMap));
			model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
		}catch(Exception e){
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, e.toString());
		}
		return model;
	}
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
  	    	System.out.println("error:"+ e.toString()  );
  	    	model.addObject("status", Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.common.insert"));		
  	    }
  	    finally{
  	    	return model;
  	    }
    	
    }
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
  	    }
  	    finally{
  	    	return model;
  	    }
    	
    }
	@GetMapping("{employeeId}.do")
 	public ModelAndView selectEmployeeDetail (@PathVariable String employeeId, 
 												HttpServletRequest request)	throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
			// 기존 세션 체크 인증에서 토큰 방식으로 변경
			
        	if (!jwtVerification.isVerificationAdmin(request)) {
        		ResultVO resultVO = new ResultVO();
    			return jwtVerification.handleAuthError(resultVO); // 토큰 확
        	}
        	
        	model.addObject(Globals.JSON_RETURN_RESULT, employeeService.selectEmployeesExistInfoDetail(employeeId));
    		model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
		}catch(Exception e){
    		model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
    		model.addObject(Globals.STATUS_MESSAGE, e.toString());
    	}
    	return model;
	}
}
