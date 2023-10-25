package com.system.backoffice.bas.program.web;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.commons.lang3.StringUtils;
import org.egovframe.rte.fdl.cmmn.exception.EgovBizException;
import org.egovframe.rte.fdl.property.EgovPropertyService;
import org.egovframe.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.system.backoffice.bas.program.models.dto.ProgrmInfoDto;
import com.system.backoffice.bas.program.service.ProgrameInfoManageService;
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
@RequestMapping("/api/backoffice/sys/prog")
public class ProgrmInfoManageController {

	@Autowired
	protected EgovMessageSource egovMessageSource;
	
	@Autowired
    protected EgovPropertyService propertiesService;
	
	@Autowired
	private ProgrameInfoManageService progrmService;
	
    @Autowired
    private UniUtilManageService uniMangeServiec;


	/** JwtVerification */
	@Autowired
	private JwtVerification jwtVerification;
    

	/**
	 * 프로그램 목록 조회
	 * @param searchVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("programList.do")
	public ModelAndView selectProgrmInfoListAjax(@RequestBody Map<String, Object> searchVO,
			HttpServletRequest request) throws Exception {
		
		ModelAndView model = new ModelAndView (Globals.JSON_VIEW);
		
		if (!jwtVerification.isVerificationAdmin(request)) {
    		ResultVO resultVO = new ResultVO();
			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
    	}
		
		System.out.println("pageIndex:" + searchVO.get("pageIndex") + ":" + searchVO.get("pageSize"));
		
		int pageUnit = searchVO.get("pageUnit") == null ? propertiesService.getInt("pageUnit")
				: Integer.valueOf((String) searchVO.get("pageUnit"));
		  
   	    PaginationInfo paginationInfo = new PaginationInfo();
	    paginationInfo.setCurrentPageNo( Integer.parseInt(UtilInfoService.NVL(searchVO.get("pageIndex"),"1")));
	    paginationInfo.setRecordCountPerPage(pageUnit);
	    paginationInfo.setPageSize(propertiesService.getInt("pageSize"));
	    

	    searchVO.put("firstIndex", paginationInfo.getFirstRecordIndex());
	    searchVO.put("lastRecordIndex", paginationInfo.getLastRecordIndex());
	    searchVO.put("recordCountPerPage", paginationInfo.getRecordCountPerPage());
	    
	    System.out.println("firstIndex:" + paginationInfo.getFirstRecordIndex() + ":" +paginationInfo.getRecordCountPerPage() + ":" + searchVO.get("pageIndex"));
	    
	    
		List<ProgrmInfoDto> list = progrmService .selectProgrmInfoList(searchVO);
        int totCnt =  list.size() > 0 ? list.get(0).getTotalRecordCount() : 0;
		paginationInfo.setTotalRecordCount(totCnt);

		model.addObject(Globals.STATUS_REGINFO, searchVO);
		model.addObject(Globals.JSON_RETURN_RESULT_LIST, list);
	    model.addObject(Globals.PAGE_TOTAL_COUNT, totCnt);
	    model.addObject(Globals.JSON_PAGEINFO, paginationInfo);
	    model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
		
		return model;
	}
	
	/**
	 * 프로그램 저장
	 * @param progrmInfo
	 * @return
	 * @throws Exception
	 */
	@PostMapping ("programInfo.do")
	public ModelAndView updateProgrmInfo(@Valid @RequestBody ProgrmInfoDto progrmInfoDto,
										 HttpServletRequest request) throws Exception{
		ModelAndView model = new ModelAndView (Globals.JSON_VIEW);
		
		if (!jwtVerification.isVerificationAdmin(request)) {
    		ResultVO resultVO = new ResultVO();
			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
    	}else {
    		progrmInfoDto.setUserId(jwtVerification.getTokenUserName(request));
    	}
		
		int ret = 0;
		switch (progrmInfoDto.getMode()) {
			case Globals.SAVE_MODE_INSERT:
				ret = progrmService.insertProgrmInfo(progrmInfoDto);
				break;
			case Globals.SAVE_MODE_UPDATE:
				ret = progrmService.updateProgrmInfo(progrmInfoDto);
				break;
			default:
				throw new EgovBizException("잘못된 호출입니다.");
		}
		
		String messageKey = "";
		if (ret > 0) {
			model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
			messageKey = StringUtils.equals(progrmInfoDto.getMode(), Globals.SAVE_MODE_INSERT) 
					? "sucess.common.insert" : "sucess.common.update";
		}
		else {
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			messageKey = StringUtils.equals(progrmInfoDto.getMode(), Globals.SAVE_MODE_INSERT) 
					? "fail.common.insert" : "fail.common.update";
		}
		model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage(messageKey));
		
		return model;
	}
	
	/**
	 * 프로그램 삭제
	 * @param progrmInfo
	 * @return
	 * @throws Exception
	 */
	@DeleteMapping ("{progrmFileNm}.do")
	public ModelAndView deleteProgrmInfoManage(@PathVariable String progrmFileNm, 
												HttpServletRequest request) throws Exception {
		ModelAndView model = new ModelAndView (Globals.JSON_VIEW);
		
		int ret = progrmService.deleteProgrmInfo(progrmFileNm);
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
    @GetMapping ("programIDCheck/{progrmFileNm}.do")
    public ModelAndView programIDCheck(@PathVariable String progrmFileNm, 
    								  HttpServletRequest request) throws Exception {
		ModelAndView model = new ModelAndView (Globals.JSON_VIEW);
    	
    	int ret = uniMangeServiec.selectIdDoubleCheckString("PROGRM_FILE_NM", "COMTNPROGRMLIST", "PROGRM_FILE_NM = ["+ progrmFileNm + "[");
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
