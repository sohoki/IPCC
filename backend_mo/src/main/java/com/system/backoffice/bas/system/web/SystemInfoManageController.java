package com.system.backoffice.bas.system.web;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.commons.lang3.StringUtils;
import org.egovframe.rte.fdl.property.EgovPropertyService;
import org.egovframe.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.system.backoffice.bas.system.models.dto.SystemInfoRequestDto;
import com.system.backoffice.bas.system.models.dto.SystemInfoResDto;
import com.system.backoffice.bas.system.service.SystemInfoManageService;
import com.system.backoffice.sym.log.annotation.NoLogging;
import com.system.backoffice.uat.uia.service.UniUtilManageService;
import com.system.backoffice.util.service.UtilInfoService;

import egovframework.com.cmm.EgovMessageSource;
import egovframework.com.cmm.service.Globals;
import egovframework.com.cmm.service.ResultVO;
import egovframework.com.jwt.config.JwtVerification;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/backoffice/sys/system")
public class SystemInfoManageController {

	@Autowired
	protected EgovMessageSource egovMessageSource;
	
	@Autowired
    protected EgovPropertyService propertiesService;
	
	@Autowired
    protected SystemInfoManageService systemService;
	
	
	/** JwtVerification */
	@Autowired
	private JwtVerification jwtVerification;
	
    @Autowired
    private UniUtilManageService uniMangeServiec;
	/**
	 * 시스템 목록 조회
	 * @param searchVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("systemList.do")
	public ModelAndView selectSystemInfoListAjax(@RequestBody Map<String, Object> searchVO,
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
	    
	    
	    
		List<SystemInfoResDto> list = systemService.selectSystemInfoList(searchVO);
        int totCnt =  list.size() > 0 ? list.get(0).getTotalRecordCount() : 0;
		paginationInfo.setTotalRecordCount(totCnt);

		model.addObject(Globals.STATUS_REGINFO, searchVO);
		model.addObject(Globals.JSON_RETURN_RESULT_LIST, list);
	    model.addObject(Globals.PAGE_TOTAL_COUNT, totCnt);
	    model.addObject(Globals.JSON_PAGEINFO, paginationInfo);
	    model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
		
		return model;
	}
	@GetMapping("systemCombo.do")
	public ModelAndView systemCombo(@PathVariable String searchUseyn,
			HttpServletRequest request) throws Exception {
		ModelAndView model = new ModelAndView (Globals.JSON_VIEW);
		try {
			if (!jwtVerification.isVerificationAdmin(request)) {
	    		ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확인
	    	}
			
			model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
    		model.addObject(Globals.JSON_RETURN_RESULT, systemService.selectSystemCombo(searchUseyn));
			
		}catch(Exception e){
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.common.delete"));
		}
		return model;
	}
	/**
	 * 프로그램 저장
	 * @param SystemInfo
	 * @return
	 * @throws Exception
	 */
	@PostMapping ("systemInfo.do")
	public ModelAndView updateSystemInfo(@Valid @RequestBody SystemInfoRequestDto SystemInfoDto,
										 HttpServletRequest request) throws Exception{
		ModelAndView model = new ModelAndView (Globals.JSON_VIEW);
		
		if (!jwtVerification.isVerificationAdmin(request)) {
    		ResultVO resultVO = new ResultVO();
			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
    	}else {
    		SystemInfoDto.setUserId(jwtVerification.getTokenUserName(request));
    	}
		
		
		
		int ret = systemService.updateSystemInfo(SystemInfoDto);
		
		String messageKey = "";
		if (ret > 0) {
			model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
			messageKey = StringUtils.equals(SystemInfoDto.getMode(), Globals.SAVE_MODE_INSERT) 
					? "sucess.common.insert" : "sucess.common.update";
		}
		else {
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			messageKey = StringUtils.equals(SystemInfoDto.getMode(), Globals.SAVE_MODE_INSERT) 
					? "fail.common.insert" : "fail.common.update";
		}
		model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage(messageKey));
		
		return model;
	}
	
	/**
	 * 프로그램 삭제
	 * @param SystemInfo
	 * @return
	 * @throws Exception
	 */
	@DeleteMapping ("{systemCode}.do")
	public ModelAndView deleteSystemInfoManage(@PathVariable String systemCode, 
												HttpServletRequest request) throws Exception {
		ModelAndView model = new ModelAndView (Globals.JSON_VIEW);
		
		int ret = systemService.deleteSystemInfo(systemCode);
		if (ret > 0) {
			model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
			model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("success.common.delete"));
		}
		else {
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.common.delete"));
		}
		
		return model;
	}
	
	/**
	 * 프로그램 중복 체크
	 * @param progrmFileNm
	 * @return
	 * @throws Exception
	 */
	@NoLogging
    @GetMapping ("systemIDCheck/{systemCode}.do")
    public ModelAndView programIDCheck(@PathVariable String systemCode, 
    								  HttpServletRequest request) throws Exception {
		ModelAndView model = new ModelAndView (Globals.JSON_VIEW);
    	
    	int ret = uniMangeServiec.selectIdDoubleCheckString("SYSTEM_CODE", "TB_SYSTEMINFO", "SYSTEM_CODE = ["+ systemCode + "[");
    	if (ret == 0) {
    		model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
			model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("common.codeOk.msg"));
    	}
    	else {
    		model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("common.codeFail.msg"));
    	}
		
    	return model;
    }
}
