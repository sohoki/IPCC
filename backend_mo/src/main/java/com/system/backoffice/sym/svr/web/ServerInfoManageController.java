package com.system.backoffice.sym.svr.web;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.Optional;
import org.egovframe.rte.fdl.property.EgovPropertyService;
import org.egovframe.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.system.backoffice.sym.svr.models.dto.ServerInfoRequestDto;
import com.system.backoffice.sym.svr.models.ServerInfo;
import com.system.backoffice.sym.svr.service.ServerInfoManageService;
import egovframework.com.cmm.EgovMessageSource;
import egovframework.com.cmm.service.Globals;
import egovframework.com.cmm.service.ResultVO;
import egovframework.com.jwt.config.JwtVerification;


@RestController
@RequestMapping("/api/backoffice/sym/svr/")
public class ServerInfoManageController {
	
	@Value("${page.pageUnit}")
    private int pageUnitSetting ;
    
    @Value("${page.pageSize}")
    private int pageSizeSetting ;

	
	/** EgovPropertyService */
	@Resource(name = "propertiesService")
	protected EgovPropertyService propertyService;
	
    @Autowired
    private ServerInfoManageService serverMangeServiec;
    
    /** EgovMessageSource */
	@Resource(name = "egovMessageSource")
	EgovMessageSource egovMessageSource;
	
	/** JwtVerification */
	@Autowired
	private JwtVerification jwtVerification;
    
    @GetMapping("{serverSeq}")
    public ModelAndView selectServerDetailInfo(@PathVariable String serverSeq
    										, HttpServletRequest request)throws Exception {
    	ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
    	try {
    		
    		if (!jwtVerification.isVerificationAdmin(request)) {

        		ResultVO resultVO = new ResultVO();
    			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
        	}
    		
    		Optional<ServerInfo> info = serverMangeServiec.selectServerInfoDetail(serverSeq);
    		
    		info.orElseThrow(() -> new IllegalArgumentException("해당하는 서버 정보가가 없습니다. 잘못된 입력"));
    		
    		model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
    		model.addObject(Globals.STATUS_REGINFO, info);
    		
    	}catch(Exception e) {
    		model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
	   		model.addObject(Globals.STATUS_MESSAGE, e.toString());
    	}
    	return model;
    }
    @DeleteMapping("{serverSeq}.do")
    public ModelAndView deleteServerDetailInfo(@PathVariable String serverSeq
    											, HttpServletRequest request)throws Exception {
    	ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
    	try {
    		
    		if (!jwtVerification.isVerificationAdmin(request)) {

        		ResultVO resultVO = new ResultVO();
    			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
        	}
    		
    		int ret = serverMangeServiec.deleteServerInfo(serverSeq);
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
    @PostMapping("updateServer.do")
    public ModelAndView updateServerInfo(@Valid @RequestBody ServerInfoRequestDto info
    									, HttpServletRequest request)throws Exception {
    	ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
    	try {
    		
    		// 기존 세션 체크 인증에서 토큰 방식으로 변경
        	if (!jwtVerification.isVerificationAdmin(request)) {
        		ResultVO resultVO = new ResultVO();
    			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
        	}else {
        		info.setUserId(jwtVerification.getTokenUserName(request));
        	}
        	
        	
    		int ret = serverMangeServiec.updateServerInfo(info);
    		
    		String status = (ret > 0) ? Globals.STATUS_SUCCESS : Globals.STATUS_FAIL;
    		String message = (ret > 0) ? egovMessageSource.getMessage("success.common.update") : egovMessageSource.getMessage("fail.request.msg");
    		model.addObject(Globals.STATUS, status);
	   		model.addObject(Globals.STATUS_MESSAGE, message);
    	}catch(Exception e) {
    		model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
	   		model.addObject(Globals.STATUS_MESSAGE, e.toString());
    	}
    	return model;
    }
    @PostMapping("list.do")
    public ModelAndView  selectServerInfoPageList(@RequestBody Map<String, Object> searchMap 
												 , HttpServletRequest request
												 , BindingResult bindingResult) throws Exception {
    	ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
    	try {
    		if (!jwtVerification.isVerificationAdmin(request)) {

        		ResultVO resultVO = new ResultVO();
    			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
        	}
    		   
    		int pageUnit = searchMap.get(Globals.PAGE_UNIT) == null ?   pageUnitSetting : Integer.valueOf((String) searchMap.get(Globals.PAGE_UNIT));
    		int pageSize = searchMap.get(Globals.PAGE_SIZE) == null ?   pageSizeSetting : Integer.valueOf((String) searchMap.get(Globals.PAGE_SIZE));  
    	   
    	    
        	/** pageing */
        	PaginationInfo paginationInfo = new PaginationInfo();
    		paginationInfo.setCurrentPageNo( Integer.valueOf( searchMap.get(Globals.PAGE_INDEX).toString() ));
    		paginationInfo.setRecordCountPerPage(pageUnit);
    		paginationInfo.setPageSize(pageSize);

    		searchMap.put("firstIndex", paginationInfo.getFirstRecordIndex());
    		searchMap.put("lastRecordIndex", paginationInfo.getLastRecordIndex());
    		searchMap.put("recordCountPerPage", paginationInfo.getRecordCountPerPage());
    	    
    	    List<Map<String, Object>> codeList = (List<Map<String, Object>>) serverMangeServiec.selectServerInfoPageList(searchMap);
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
