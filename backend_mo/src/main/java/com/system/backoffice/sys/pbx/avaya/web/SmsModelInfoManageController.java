package com.system.backoffice.sys.pbx.avaya.web;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.egovframe.rte.fdl.property.EgovPropertyService;
import org.egovframe.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.system.backoffice.infra.bld.cnt.web.CenterInfoManageController;
import com.system.backoffice.sys.pbx.avaya.models.SmsModelInfo;
import com.system.backoffice.sys.pbx.avaya.models.dto.SmsModeReqlInfoDto;
import com.system.backoffice.sys.pbx.avaya.service.SmsModelInfoManageService;
import com.system.backoffice.util.service.UtilInfoService;

import egovframework.com.cmm.EgovMessageSource;
import egovframework.com.cmm.service.Globals;
import egovframework.com.cmm.service.ResultVO;
import egovframework.com.jwt.config.JwtVerification;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;


@Api(tags = {"SMS 연동 정보 API"})
@Slf4j
@RestController
@RequestMapping("/api/backoffice/sys/pbx/avaya")
public class SmsModelInfoManageController {

	
	@Value("${page.pageUnit}")
	private int pageUnitSetting ;
	
	@Value("${page.pageSize}")
	private int pageSizeSetting ;
	
	/** JwtVerification */
	@Autowired
	private JwtVerification jwtVerification;
	
	
	/** EgovPropertyService */
	@Resource(name = "propertiesService")
	protected EgovPropertyService propertyService;
	
	@Autowired
	private SmsModelInfoManageService smsInfoMangeServiec;
	
	/** EgovMessageSource */
	@Resource(name = "egovMessageSource")
	EgovMessageSource egovMessageSource;

	@ApiOperation(value="SMS 연동 모델 상세", notes = "성공시 SMS 연동 모델 상세를 조회 합니다.")
	@ApiImplicitParam(name = "notiSeq", value = "notiSeq")
	@GetMapping("/{notiSeq}.do")
	public ModelAndView selectServerDetailInfo(@PathVariable String notiSeq)throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
			Optional<SmsModelInfo> info = smsInfoMangeServiec.selectSmsInfoDetail(notiSeq);
			
			info.orElseThrow(() -> new IllegalArgumentException("해당하는 서버 정보가가 없습니다. 잘못된 입력"));
			
			model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
			model.addObject(Globals.JSON_RETURN_RESULT, info);
			
		}catch(Exception e) {
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, e.toString());
		}
		return model;
	}
	@ApiOperation(value="SMS 연동 모델 삭제", notes = "성공시SMS 연동 모델 삭제 합니다.")
	@ApiImplicitParam(name = "notiSeq", value = "notiSeq")
	@DeleteMapping("/{notiSeq}.do")
	public ModelAndView deleteServerDetailInfo(@PathVariable String notiSeq,
																	HttpServletRequest request)throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
			// 기존 세션 체크 인증에서 토큰 방식으로 변경
			if (!jwtVerification.isVerificationAdmin(request)) {
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확인
			}
			
			int ret = smsInfoMangeServiec.deleteSmsInfo(notiSeq);
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
	@ApiOperation(value="SMS 연동 모델 업데이트", notes = "성공시SMS 연동 모델 업데이트 합니다.")
	@PostMapping("/updateSmsInfo.do")
	public ModelAndView updateServerInfo(@Valid @RequestBody SmsModeReqlInfoDto info,
															HttpServletRequest request)throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
			// 기존 세션 체크 인증에서 토큰 방식으로 변경
			if (!jwtVerification.isVerificationAdmin(request)) {
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확인
			}
			
			int ret = smsInfoMangeServiec.updateSmsInfo(info);
			
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
	@ApiOperation(value="SMS 연동 모델 조회", notes = "성공시 SMS 연동 모델 조회 합니다.")
	@PostMapping("/list.do")
	public ModelAndView  selectServerInfoPageList(@RequestBody Map<String, Object> searchMap,
																		HttpServletRequest request) throws Exception {
		
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
			
			// 기존 세션 체크 인증에서 토큰 방식으로 변경
			if (!jwtVerification.isVerificationAdmin(request)) {
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확인
			}
			
			int pageUnit = UtilInfoService.NVLObj(searchMap.get(Globals.PAGE_UNIT), propertyService.getInt(Globals.PAGE_UNIT));
			int pageSize = UtilInfoService.NVLObj(searchMap.get(Globals.PAGE_SIZE), propertyService.getInt(Globals.PAGE_SIZE));  
		
				/** pageing */
			PaginationInfo paginationInfo = new PaginationInfo();
			paginationInfo.setCurrentPageNo( Integer.valueOf(Integer.valueOf( searchMap.get(Globals.PAGE_INDEX) == null  ?
																					"1" : searchMap.get(Globals.PAGE_INDEX).toString() ) ));
			paginationInfo.setRecordCountPerPage(pageUnit);
			paginationInfo.setPageSize(pageSize);
			
			searchMap.put(Globals.PAGE_FIRST_INDEX, paginationInfo.getFirstRecordIndex());
			searchMap.put(Globals.PAGE_LAST_INDEX, paginationInfo.getLastRecordIndex());
			searchMap.put(Globals.PAGE_RECORD_PER_PAGE, paginationInfo.getRecordCountPerPage());
			
			List<Map<String, Object>> codeList = (List<Map<String, Object>>) smsInfoMangeServiec.selectSmsInfoPageList(searchMap);
			int totCnt = codeList.size() > 0 ?  Integer.valueOf( codeList.get(0).get(Globals.PAGE_TOTAL_RECORD_COUNT).toString().replace("-", "") ) :0;
			
			paginationInfo.setTotalRecordCount(totCnt);
			model.addObject(Globals.JSON_RETURN_RESULT_LIST, codeList);
			model.addObject(Globals.JSON_PAGEINFO, paginationInfo);
		}catch(Exception e) {
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, e.toString());
		}
		return model;
	}
}
