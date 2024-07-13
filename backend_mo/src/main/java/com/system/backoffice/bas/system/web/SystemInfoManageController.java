package com.system.backoffice.bas.system.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.commons.lang3.StringUtils;
import org.egovframe.rte.fdl.property.EgovPropertyService;
import org.egovframe.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartRequest;
import org.springframework.web.servlet.ModelAndView;

import com.system.backoffice.bas.menu.models.dto.MenuInfoRequestDto;
import com.system.backoffice.bas.system.models.SystemInfo;
import com.system.backoffice.bas.system.models.dto.SystemInfoRequestDto;
import com.system.backoffice.bas.system.models.dto.SystemInfoResDto;
import com.system.backoffice.bas.system.models.dto.SystemLoginDto;
import com.system.backoffice.bas.system.service.SystemInfoManageService;
import com.system.backoffice.sym.log.annotation.NoLogging;
import com.system.backoffice.uat.uia.service.UniUtilManageService;
import com.system.backoffice.util.service.UtilInfoService;
import com.system.backoffice.util.service.fileService;

import egovframework.com.cmm.AdminLoginVO;
import egovframework.com.cmm.EgovMessageSource;
import egovframework.com.cmm.service.Globals;
import egovframework.com.cmm.service.ResultVO;
import egovframework.com.jwt.config.EgovJwtTokenUtil;
import egovframework.com.jwt.config.JwtVerification;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

@Api(tags = {"통합 시스템 정보 API"})
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
	
	//파일 업로드
    @Autowired
	private fileService uploadFile;
    
	/** JwtVerification */
	@Autowired
	private JwtVerification jwtVerification;
	
    @Autowired
    private UniUtilManageService uniMangeServiec;
    
    /** JWT */
	@Autowired
    private EgovJwtTokenUtil jwtTokenUtil;
	/**
	 * 시스템 목록 조회
	 * @param searchVO
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value="시스템 리스트 ", notes="통합 시스템 리스트")
	@PostMapping("systemList.do")
	public ModelAndView selectSystemInfoListAjax(@RequestBody Map<String, Object> searchVO,
			HttpServletRequest request) throws Exception {
		
		ModelAndView model = new ModelAndView (Globals.JSON_VIEW);
		
		if (!jwtVerification.isVerificationAdmin(request)) {
    			ResultVO resultVO = new ResultVO();
			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
		}
		
		
		int pageUnit = searchVO.get(Globals.PAGE_UNIT) == null ? propertiesService.getInt(Globals.PAGE_UNIT)
				: Integer.valueOf((String) searchVO.get(Globals.PAGE_UNIT));
		
   	    PaginationInfo paginationInfo = new PaginationInfo();
	    paginationInfo.setCurrentPageNo( Integer.parseInt(UtilInfoService.NVL(searchVO.get(Globals.PAGE_INDEX),"1")));
	    paginationInfo.setRecordCountPerPage(pageUnit);
	    paginationInfo.setPageSize(propertiesService.getInt(Globals.PAGE_SIZE));
	    

	    searchVO.put(Globals.PAGE_FIRST_INDEX, paginationInfo.getFirstRecordIndex());
	    searchVO.put(Globals.PAGE_LAST_INDEX, paginationInfo.getLastRecordIndex());
	    searchVO.put(Globals.PAGE_RECORD_PER_PAGE, paginationInfo.getRecordCountPerPage());
	    
	    
	    
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
	@ApiOperation(value="시스템 combo ", notes="통합 시스템 combo box")
	@GetMapping("systemCombo.do")
	public ModelAndView systemCombo(@RequestParam Map<String, Object> paramMap,
									HttpServletRequest request) throws Exception {
		ModelAndView model = new ModelAndView (Globals.JSON_VIEW);
		try {
			if (!jwtVerification.isVerificationAdmin(request)) {
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확인
			}
			
			model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
			model.addObject(Globals.JSON_RETURN_RESULT, systemService.selectSystemCombo(paramMap));
			
		}catch(Exception e){
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.common.msg") + e.toString());
		}
		return model;
	}
	/**
	 * 프로그램 저장
	 * @param SystemInfo
	 * @return
	 * @throws Exception
	 */
	@NoLogging
	@ApiOperation(value="시스템 정보 저장 ", notes="시스템 정보 저장 :SYS LOG에 외 안되는지 확인 필요")
	@PostMapping ("systemInfo.do")
	public ModelAndView updateSystemInfo(MultipartRequest mRequest,
										SystemInfoRequestDto SystemInfoDto,
										HttpServletRequest request) throws Exception {
		
		ModelAndView model = new ModelAndView (Globals.JSON_VIEW);
		
		// 0. Spring Security 사용자권한 처리
		if (!jwtVerification.isVerificationAdmin(request)) {
			ResultVO resultVO = new ResultVO();
			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
		}else {
			SystemInfoDto.setUserId(jwtVerification.getTokenUserName(request));
		}
		
		//	
		if (SystemInfoDto.getMode().equals(Globals.SAVE_MODE_INSERT) && systemService.selectMenuNoByPk(SystemInfoDto.getSystemCode()) == false ) {
			model.addObject(Globals.STATUS,  Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("common.isExist.msg"));
			return model;
		}
		
		String fileNm = uploadFile.uploadFileNm(mRequest.getFiles("relateImage"), propertiesService.getString("Globals.filePath"));
		
		
		
		String message = "";
		String states = "";
		SystemInfoDto.setSystemIcon(fileNm); 
	
		int ret = systemService.updateSystemInfo(SystemInfoDto);
	
		if (ret > 0) {
			message = SystemInfoDto.getMode().equals(Globals.SAVE_MODE_INSERT) ? egovMessageSource.getMessage("success.common.insert") : egovMessageSource.getMessage("success.common.update");
			states =  Globals.STATUS_SUCCESS;
		}else {
			message = SystemInfoDto.getMode().equals(Globals.SAVE_MODE_INSERT) ? egovMessageSource.getMessage("fail.common.insert") : egovMessageSource.getMessage("fail.common.update");
			states =  Globals.STATUS_FAIL;
		}
		
		model.addObject(Globals.STATUS, states);
		model.addObject(Globals.STATUS_MESSAGE, message);
		
		return model;
	}
	/**
	 * 프로그램 삭제
	 * @param SystemInfo
	 * @return
	 * @throws Exception
	 */
    @ApiOperation(value="시스템 정보 삭제", notes="시스템 정보 삭제")
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
	
	@ApiOperation(value="시스템 정보 상세", notes="시스템 정보 상세")
	@GetMapping ("{systemCode}.do")
	public ModelAndView selectSystemInfoManage(@PathVariable String systemCode, 
												HttpServletRequest request) throws Exception {
		
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
			// 기존 세션 체크 인증에서 토큰 방식으로 변경
			if (!jwtVerification.isVerificationAdmin(request)) {
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확
			}
			model.addObject(Globals.JSON_RETURN_RESULT, systemService.selectSystemInfoDetail(systemCode));
			model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
		}catch(Exception e){
			log.error("selectCmmnDetailCodeDetail error:" + e.toString());
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, e.toString());
		}
		return model;
		
	}
	
	/**
	 * 프로그램 중복 체크
	 * @param progrmFileNm
	 * @return
	 * @throws Exception
	 */
	@ApiOperation(value="시스템 정보 중복 체크", notes="시스템 정보 중복 체크")
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
    @ApiOperation(value="system JWT 로그인", notes = "system  JWT 로그인을 처리한다")
	@ApiImplicitParam(name = "SystemLoginDto", value = "로그인 정보(아이디, 토큰 정보)")
	@PostMapping(value = "systemLoginJWT.do")
	public HashMap<String, Object> actionLoginJWT(@RequestBody SystemLoginDto loginVO, 
													HttpServletRequest request, 
													ModelMap model) throws Exception {
		
		HashMap<String, Object> resultMap = new HashMap<String, Object>();

		
		
		//loginVO.setUserIp(request.getRemoteAddr());
		// 1. 일반 로그인 처리
		Optional<SystemInfo> loginResultVO = systemService.SystemLoginDto(loginVO);
		
		if (loginResultVO.isPresent() && loginResultVO.get().getSystemCode() != null && !loginResultVO.get().getSystemCode().equals("")) {
			
			String jwtToken = jwtTokenUtil.generateSystemToken(loginResultVO.get());
			resultMap.put(Globals.RESULTVO, loginResultVO);
			resultMap.put(Globals.TOKEN, jwtToken);
			resultMap.put(Globals.STATUS, Globals.STATUS_SUCCESS);
			resultMap.put(Globals.STATUS_MESSAGE ,  egovMessageSource.getMessage("success.common.login"));
			
		} else {
			resultMap.put(Globals.STATUS, Globals.STATUS_FAIL);
			resultMap.put(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.common.login"));
		}
		
		return resultMap;
	}
}
