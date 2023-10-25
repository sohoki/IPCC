package com.system.backoffice.bas.code.web;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.egovframe.rte.fdl.property.EgovPropertyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.springmodules.validation.commons.DefaultBeanValidator;

import com.system.backoffice.bas.code.models.CmmnDetailCode;
import com.system.backoffice.bas.code.models.dto.CmmnDetailCodeDto;
import com.system.backoffice.bas.code.service.EgovCcmCmmnClCodeManageService;
import com.system.backoffice.bas.code.service.EgovCcmCmmnCodeManageService;
import com.system.backoffice.bas.code.service.EgovCcmCmmnDetailCodeManageService;

import egovframework.com.cmm.AdminLoginVO;
import egovframework.com.cmm.EgovMessageSource;
import egovframework.com.cmm.service.Globals;
import egovframework.com.cmm.service.ResultVO;
import egovframework.com.jwt.config.JwtVerification;



@RestController
@RequestMapping("/api/backoffice/sys/cmm/cde")
public class EgovCcmCmmnDetailCodeManageController {

	private static final Logger LOGGER = LoggerFactory.getLogger(EgovCcmCmmnDetailCodeManageController.class);
	
	
    @Value("${page.pageUnit}")
    private int pageUnitSetting ;
    
    @Value("${page.pageSize}")
    private int pageSizeSetting ;
    
	/** JwtVerification */
	@Autowired
	private JwtVerification jwtVerification;
	
    @Autowired
    private EgovCcmCmmnDetailCodeManageService cmmnDetailCodeManageService;

    @Autowired
    private EgovCcmCmmnClCodeManageService cmmnClCodeManageService;

    @Autowired
    private EgovCcmCmmnCodeManageService cmmnCodeManageService;

	@Resource(name="egovMessageSource")
	protected EgovMessageSource egovMessageSource;
	
    /** EgovPropertyService */
    @Resource(name = "propertiesService")
    protected EgovPropertyService propertiesService;

	@Autowired
	private DefaultBeanValidator beanValidator;

	/*
	private List<?> rightList(String codeId)throws Exception{
		List<CmmnDetailCode> codeDetail = (List<CmmnDetailCode>) cmmnDetailCodeManageService.selectCmmnDetailCodeList(codeId);
		return codeDetail;
	}
    */
    @DeleteMapping("{code}.do")
	public ModelAndView deleteCmmnDetailCode (@PathVariable String code, 
			                                  ModelMap modelMe,
			                                  HttpServletRequest request) throws Exception {
    	ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
    	try{
    		// 기존 세션 체크 인증에서 토큰 방식으로 변경
        	if (!jwtVerification.isVerificationAdmin(request)) {

        		ResultVO resultVO = new ResultVO();
    			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
        	}
    		int ret = cmmnDetailCodeManageService.deleteCmmnDetailCode(code);
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

	/**
	* 공통상세코드 상세항목을 조회한다.
	* @param loginVO
	 * @param cmmnDetailCode
	 * @param model
	 * @return "cmm/sym/ccm/EgovCcmCmmnDetailCodeDetail"
	 * @throws Exception
	 */
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
        	model.addObject(Globals.JSON_RETURN_RESULT, cmmnDetailCodeManageService.selectCmmnDetailCodeDetail(code));
    		model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
		}catch(Exception e){
    		model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
    		model.addObject(Globals.STATUS_MESSAGE, e.toString());
    	}
    	return model;
	}
	@GetMapping("combo/{code}.do")
 	public ModelAndView selectCmmnDetailComboDetail (@PathVariable String code, 
 												HttpServletRequest request)	throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
			// 기존 세션 체크 인증에서 토큰 방식으로 변경
        	if (!jwtVerification.isVerificationAdmin(request)) {
        		ResultVO resultVO = new ResultVO();
    			return jwtVerification.handleAuthError(resultVO); // 토큰 확
        	}
        	model.addObject(Globals.JSON_RETURN_RESULT, cmmnDetailCodeManageService.selectCmmnDetailComboLamp(code));
    		model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
		}catch(Exception e){
    		model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
    		model.addObject(Globals.STATUS_MESSAGE, e.toString());
    	}
    	return model;
	}
    /**
	 * 공통상세코드 목록을 조회한다.
     * @param loginVO
     * @param searchVO
     * @param model 
     * @throws Exception
     */
    @PostMapping(value="detailList.do")
    public ModelAndView selectCmmnDetailCodeList ( @RequestBody Map<String, Object> searchMap, 
    		                                       HttpServletRequest request)  {
    	//나중에 권한 설정 값 넣기 
    	
    	
    	ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
    	try{
    		// 기존 세션 체크 인증에서 토큰 방식으로 변경
        	if (!jwtVerification.isVerificationAdmin(request)) {
        		ResultVO resultVO = new ResultVO();
    			return jwtVerification.handleAuthError(resultVO); // 토큰 확
        	}
        	
            List<CmmnDetailCodeDto> codeDetailList = cmmnDetailCodeManageService.selectCmmnDetailCodeList(searchMap.get("codeId").toString());
            int totCnt = codeDetailList.size() > 0 ? codeDetailList.size()  : 0;

    		model.addObject( Globals.STATUS_REGINFO, searchMap.get("codeId"));
    		model.addObject(Globals.JSON_RETURN_RESULT_LIST, codeDetailList);
            model.addObject(Globals.PAGE_TOTAL_COUNT, totCnt);
            
    	}catch(Exception e){
    		model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
    		model.addObject(Globals.STATUS_MESSAGE, e.toString());
    		
    	}   
    	return model;
	}
    
    @PostMapping(value="CodeDetailUpdate.do")
	public ModelAndView updateCmmnDetailCode ( @RequestBody CmmnDetailCode vo
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
  	    	
    		String status = cmmnDetailCodeManageService.updateCmmnDetailCode(vo) > 0 ?
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
}
