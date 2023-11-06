package com.system.backoffice.sym.log.web;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.egovframe.rte.fdl.property.EgovPropertyService;
import org.egovframe.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.system.backoffice.bas.system.models.dto.SystemInfoResDto;
import com.system.backoffice.sym.log.annotation.NoLogging;
import com.system.backoffice.sym.log.service.EgovSysLogService;
import com.system.backoffice.uat.uia.service.UniUtilManageService;
import com.system.backoffice.util.service.UtilInfoService;

import egovframework.com.cmm.EgovMessageSource;
import egovframework.com.cmm.service.Globals;
import egovframework.com.cmm.service.ResultVO;
import egovframework.com.jwt.config.JwtVerification;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/backoffice/sym/log")
public class SysLogManageController {

	
	@Autowired
	protected EgovMessageSource egovMessageSource;
	
	@Autowired
    protected EgovPropertyService propertiesService;
	
	/** JwtVerification */
	@Autowired
	private JwtVerification jwtVerification;
	
    @Autowired
    private UniUtilManageService uniMangeServiec;
    
    @Autowired
    private EgovSysLogService logService;
    
	@NoLogging
    @PostMapping("logList.do")
	public ModelAndView SystemInfoListAjax(@RequestBody Map<String, Object> searchVO,
												 HttpServletRequest request) throws Exception {
		
		ModelAndView model = new ModelAndView (Globals.JSON_VIEW);
		
		if (!jwtVerification.isVerificationAdmin(request)) {
    		ResultVO resultVO = new ResultVO();
			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
    	}
		
		
		int pageUnit = searchVO.get("pageUnit") == null ? propertiesService.getInt("pageUnit")
				: Integer.valueOf((String) searchVO.get("pageUnit"));
		  
   	    PaginationInfo paginationInfo = new PaginationInfo();
	    paginationInfo.setCurrentPageNo( Integer.parseInt(UtilInfoService.NVL(searchVO.get("pageIndex"),"1")));
	    paginationInfo.setRecordCountPerPage(pageUnit);
	    paginationInfo.setPageSize(propertiesService.getInt("pageSize"));
	    

	    searchVO.put("firstIndex", paginationInfo.getFirstRecordIndex());
	    searchVO.put("lastRecordIndex", paginationInfo.getLastRecordIndex());
	    searchVO.put("recordCountPerPage", paginationInfo.getRecordCountPerPage());
	    
	    
	    
	    List<Map<String, Object>> list = logService.selectSysLogList(searchVO);
		int totCnt = list.size() > 0 ? Integer.parseInt( list.get(0).get("totalRecordCount").toString() ): 0;
		paginationInfo.setTotalRecordCount(totCnt);
		
		model.addObject(Globals.STATUS_REGINFO, searchVO);
		model.addObject(Globals.JSON_RETURN_RESULT_LIST, list);
	    model.addObject(Globals.PAGE_TOTAL_COUNT, totCnt);
	    model.addObject(Globals.JSON_PAGEINFO, paginationInfo);
	    model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
		
		return model;
	}
    
}
