package com.system.ipcc.ivr.rapeech.web;

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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.system.ipcc.cti.nexus.web.NexusSkillInfoController;
import com.system.ipcc.ivr.rapeech.service.IvrDisplayOnlineManageService;

import egovframework.com.cmm.EgovMessageSource;
import egovframework.com.cmm.service.Globals;
import egovframework.com.cmm.service.ResultVO;
import egovframework.com.jwt.config.JwtVerification;

@RestController
@RequestMapping("/api/interface/int/rapeech")
@SuppressWarnings("unchecked")
public class IvrInfoManageControllere {

	
	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(NexusSkillInfoController.class);
	
	
	@Value("${page.pageUnit}")
    private int pageUnitSetting ;
    
    @Value("${page.pageSize}")
    private int pageSizeSetting ;
    
    /** JwtVerification */
	@Autowired
	private JwtVerification jwtVerification;
    
	@Resource(name="egovMessageSource")
	protected EgovMessageSource egovMessageSource;
	
	@Autowired
	private IvrDisplayOnlineManageService ivrDisplayService;
	
	@GetMapping("onlineList.do")
	public ModelAndView selectIvrOnlineList ( HttpServletRequest request) throws Exception {
    	
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
    	    System.out.println("===================");
    	    List<Map<String, Object>> skillList = ivrDisplayService.selectIvrOnlineDisplayInfo();
    	    
    		model.addObject(Globals.JSON_RETURN_RESULT_LIST, skillList);
    		model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
    		
    	}catch (Exception e){
			LOGGER.debug("selectCmmnCodeList error:" + e.toString());
			model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.common.msg")+ e.toString());	
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
	    }
	    
        return model;
        
        
	}
}
