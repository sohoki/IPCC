package com.system.backoffice.sym.voc.web;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

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

import com.system.backoffice.sym.voc.models.VocInfo;
import com.system.backoffice.sym.voc.models.dto.VocInfoRequestDto;
import com.system.backoffice.sym.voc.service.VocInfoManageService;

import egovframework.com.cmm.EgovMessageSource;
import egovframework.com.cmm.service.Globals;
import egovframework.com.cmm.service.ResultVO;
import egovframework.com.jwt.config.JwtVerification;

@RestController
@RequestMapping("/api/backoffice/sym/voc/")
public class VocInfoManageController {

	/** EgovPropertyService */
	@Resource(name = "propertiesService")
	protected EgovPropertyService propertyService;
	
    @Autowired
    private VocInfoManageService vocMangeServiec;
    
    /** EgovMessageSource */
	@Resource(name = "egovMessageSource")
	EgovMessageSource egovMessageSource;
	
	/** JwtVerification */
	@Autowired
	private JwtVerification jwtVerification;
    
    @GetMapping("{vocSeq}")
    public ModelAndView selectServerDetailInfo(@PathVariable String vocSeq,
    											HttpServletRequest request)throws Exception {
    	ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
    	try {
    		
    		if (!jwtVerification.isVerificationAdmin(request)) {

        		ResultVO resultVO = new ResultVO();
    			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
        	}
    		
    		Optional<VocInfo> info = vocMangeServiec.selectVocInfoDetail(vocSeq);
    		
    		info.orElseThrow(() -> new IllegalArgumentException("해당하는 VOC 정보가가 없습니다. 잘못된 입력하셨스빈다."));
    		
    		model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
    		model.addObject(Globals.STATUS_REGINFO, info);
    		
    	}catch(Exception e) {
    		model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
	   		model.addObject(Globals.STATUS_MESSAGE, e.toString());
    	}
    	return model;
    }
    @DeleteMapping("{vocSeq}.do")
    public ModelAndView deleteServerDetailInfo(@PathVariable String vocSeq, 
    											HttpServletRequest request)throws Exception {
    	ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
    	try {
    		int ret = vocMangeServiec.deleteVocInfo(vocSeq);
    		String status = (ret > 0) ? Globals.STATUS_SUCCESS : Globals.STATUS_FAIL;
    		String message = (ret > 0) ? egovMessageSource.getMessage("success.common.delete") : egovMessageSource.getMessage("fail.request.msg");
    		model.addObject(Globals.STATUS, status);
	   		model.addObject(Globals.STATUS_MESSAGE, message);
	   		 
    	}catch(Exception e) {
    		model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
	   		model.addObject(Globals.STATUS_MESSAGE, e.toString());
    	}
    	return model;
    }
    @PostMapping("reqVoc.do")
    public ModelAndView resServerInfo(@Valid @RequestBody VocInfoRequestDto info,
										 HttpServletRequest request)throws Exception {
    	ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
    	try {
    		if (!jwtVerification.isVerificationAdmin(request)) {
        		ResultVO resultVO = new ResultVO();
    			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
        	}else {
        		info.setUserId(jwtVerification.getTokenUserName(request));
        	}
    		System.out.println("=============2");
    		int ret = vocMangeServiec.insertVocInfo(info);
    		System.out.println("=============3");
    		String status = (ret > 0) ? Globals.STATUS_SUCCESS : Globals.STATUS_FAIL;
    		String message = (ret > 0) ? egovMessageSource.getMessage("success.common.delete") : egovMessageSource.getMessage("fail.request.msg");
    		model.addObject(Globals.STATUS, status);
	   		model.addObject(Globals.STATUS_MESSAGE, message);
    	}catch(Exception e) {
    		model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
	   		model.addObject(Globals.STATUS_MESSAGE, e.toString());
    	}
    	return model;
    }
    @PostMapping("reqUpdateVoc.do")
    public ModelAndView updateVocReqInfo(@Valid @RequestBody VocInfoRequestDto info,
										 HttpServletRequest request)throws Exception {
    	ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
    	try {
    		if (!jwtVerification.isVerificationAdmin(request)) {
        		ResultVO resultVO = new ResultVO();
    			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
        	}else {
        		info.setUserId(jwtVerification.getTokenUserName(request));
        	}
    		
    		int ret = vocMangeServiec.updateServerResponse(info);
    		
    		String status = (ret > 0) ? Globals.STATUS_SUCCESS : Globals.STATUS_FAIL;
    		String message = (ret > 0) ? egovMessageSource.getMessage("success.common.delete") : egovMessageSource.getMessage("fail.request.msg");
    		model.addObject(Globals.STATUS, status);
	   		model.addObject(Globals.STATUS_MESSAGE, message);
    	}catch(Exception e) {
    		model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
	   		model.addObject(Globals.STATUS_MESSAGE, e.toString());
    	}
    	return model;
    }
    @PostMapping("resVoc.do")
    public ModelAndView updateVocResInfo(@Valid @RequestBody VocInfoRequestDto info,
										 HttpServletRequest request)throws Exception {
    	ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
    	try {
    		if (!jwtVerification.isVerificationAdmin(request)) {
        		ResultVO resultVO = new ResultVO();
    			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
        	}else {
        		info.setUserId(jwtVerification.getTokenUserName(request));
        	}
    		int ret = vocMangeServiec.updateServerResponse(info);
    		
    		String status = (ret > 0) ? Globals.STATUS_SUCCESS : Globals.STATUS_FAIL;
    		String message = (ret > 0) ? egovMessageSource.getMessage("success.common.delete") : egovMessageSource.getMessage("fail.request.msg");
    		model.addObject(Globals.STATUS, status);
	   		model.addObject(Globals.STATUS_MESSAGE, message);
    	}catch(Exception e) {
    		model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
	   		model.addObject(Globals.STATUS_MESSAGE, e.toString());
    	}
    	return model;
    }
    @PostMapping("voclist.do")
    public ModelAndView  selectVocInfoPageList(@RequestBody Map<String, Object> searchMap 
												 , HttpServletRequest request
												 , BindingResult bindingResult) throws Exception {
    	ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
    	try {
    		
    		// 기존 세션 체크 인증에서 토큰 방식으로 변경
        	if (!jwtVerification.isVerificationAdmin(request)) {

        		ResultVO resultVO = new ResultVO();
    			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
        	}
        	
        	
            int pageUnit = searchMap.get("pageUnit") == null ?   propertyService.getInt("pageUnit") : Integer.valueOf((String) searchMap.get("pageUnit"));
    		int pageSize = searchMap.get("pageSize") == null ?   propertyService.getInt("pageSize") : Integer.valueOf((String) searchMap.get("pageSize"));  
    	   
    	    
        	/** pageing */
        	PaginationInfo paginationInfo = new PaginationInfo();
    		paginationInfo.setCurrentPageNo( Integer.valueOf( searchMap.get("pageIndex").toString() ));
    		paginationInfo.setRecordCountPerPage(pageUnit);
    		paginationInfo.setPageSize(pageSize);

    		searchMap.put("firstIndex", paginationInfo.getFirstRecordIndex());
    		searchMap.put("lastRecordIndex", paginationInfo.getLastRecordIndex());
    		searchMap.put("recordCountPerPage", paginationInfo.getRecordCountPerPage());
    	    
    	    List<Map<String, Object>> codeList = (List<Map<String, Object>>) vocMangeServiec.selectVocInfoPageList(searchMap);
    	    int totCnt = codeList.size() > 0 ?  Integer.valueOf( codeList.get(0).get("totalRecordCount").toString().replace("-", "") ) :0;
            

    		paginationInfo.setTotalRecordCount(totCnt);
    		model.addObject("resultList", codeList);
    		model.addObject("paginationInfo", paginationInfo);
    	}catch(Exception e) {
	   		 model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
	   		 model.addObject(Globals.STATUS_MESSAGE, e.toString());
    	}
    	return model;
    }
}
