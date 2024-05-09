package com.system.backoffice.infra.cor.com.web;

import com.system.backoffice.infra.cor.com.service.CompanyInfoService;
import com.system.backoffice.sym.log.annotation.NoLogging;
import com.system.backoffice.bas.code.service.EgovCcmCmmnDetailCodeManageService;
import com.system.backoffice.bas.menu.models.dto.MenuInfoRequestDto;
import com.system.backoffice.infra.cor.com.models.CompanyInfoVO;
import com.system.backoffice.infra.cor.com.models.dto.CompanyInfoReqDto;
import com.system.backoffice.uat.uia.service.PartInfoManageService;
import egovframework.com.cmm.EgovMessageSource;
import egovframework.com.cmm.service.Globals;
import egovframework.com.cmm.service.ResultVO;
import egovframework.com.jwt.config.JwtVerification;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.egovframe.rte.fdl.property.EgovPropertyService;
import org.egovframe.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.BindingResult;
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

import com.system.backoffice.util.service.UtilInfoService;
import com.system.backoffice.util.service.fileService;


@Api(tags = {"거래처 정보 API"})
@Slf4j
@RestController
@RequestMapping("/api/backoffice/infra/cor/com")
public class CompanyInfoManageController {
	

	@Value("${page.pageUnit}")
    private int pageUnitSetting ;
    
    @Value("${page.pageSize}")
    private int pageSizeSetting ;
    
    @Value("${Globals.filePath}")
    private String filePath ;
    

	@Autowired
	protected EgovMessageSource egovMessageSource;

	@Autowired
	protected EgovPropertyService propertiesService;

	

	@Autowired
	private CompanyInfoService companyService;

	/** JwtVerification */
	@Autowired
	private JwtVerification jwtVerification;
	/*
	@Autowired
	private RestInfoManageService restService;
	*/
	fileService uploadFile = new fileService();

	@ApiOperation(value="거래처 현황 조회", notes = "성공시 거래처 현황을 조회 합니다.")
	@PostMapping(value="companyList.do")
	public ModelAndView selectCompanyInfoManageListByPagination(@RequestBody Map<String, Object> searchMap, 
																HttpServletRequest request, 
																BindingResult bindingResult) throws Exception {
		
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
			
			if (!jwtVerification.isVerificationAdmin(request)) {
        		ResultVO resultVO = new ResultVO();
    			return jwtVerification.handleAuthError(resultVO); // 토큰 확
        	}else {
        		//여기 부분 수정 
        		String[] userInfo = jwtVerification.getTokenUserInfo(request);
        		searchMap.put("roleId", userInfo[2]);
        		searchMap.put("partId", userInfo[3]);
        	}
			
			int pageUnit = searchMap.get(Globals.PAGE_UNIT) == null ?   pageUnitSetting : Integer.valueOf((String) searchMap.get(Globals.PAGE_UNIT));
    		int pageSize = searchMap.get(Globals.PAGE_SIZE) == null ?   pageSizeSetting : Integer.valueOf((String) searchMap.get(Globals.PAGE_SIZE));  
    	   
    		
    	    
        	/** pageing */
    		PaginationInfo paginationInfo = new PaginationInfo();
    		paginationInfo.setCurrentPageNo( Integer.valueOf( searchMap.get(Globals.PAGE_INDEX) == null  ?
    														  "1" : searchMap.get(Globals.PAGE_INDEX).toString() ));
    		paginationInfo.setRecordCountPerPage(pageUnit);
    		paginationInfo.setPageSize(pageSize);

    		searchMap.put(Globals.PAGE_FIRST_INDEX, paginationInfo.getFirstRecordIndex());
    		searchMap.put(Globals.PAGE_LAST_INDEX, paginationInfo.getLastRecordIndex());
    		searchMap.put(Globals.PAGE_RECORD_PER_PAGE, paginationInfo.getRecordCountPerPage());
    	    
    	    List<CompanyInfoVO> codeList = companyService.selectCompanyInfoPageInfoManageListByPagination(searchMap);
    	    int totCnt = codeList.size() > 0 ?  Integer.valueOf( codeList.get(0).getTotalRecordCount().toString()) :0;
            

    		paginationInfo.setTotalRecordCount(totCnt);
    		
    		model.addObject(Globals.STATUS_REGINFO, searchMap);
    		model.addObject(Globals.JSON_RETURN_RESULT_LIST, codeList);
    		model.addObject(Globals.PAGE_TOTAL_COUNT, totCnt);
    		model.addObject(Globals.JSON_PAGEINFO, paginationInfo);
    		model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
    		
			
		}catch (NullPointerException e) {
			log.error("ERROR:" + e.toString());
		} catch (Exception e) {
			log.error("ERROR:" + e.toString());
		}
	    return model;
	}

	
	@ApiOperation(value="거래처 삭제", notes = "성공시 거래처 정보를 삭제 합니다.")
	@ApiImplicitParam(name = "comCode", value = "거래처 코드")
	@DeleteMapping(value="{comCode}.do")
	public ModelAndView deleteCompanyInfo(@PathVariable String comCode, 
										HttpServletRequest request) throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);

		try {
			if (!jwtVerification.isVerificationAdmin(request)) {
	    		ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확
	    	}
			int ret = companyService.deleteCompanyInfoManage(comCode);
			if (ret > 0) {
        		model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
        		model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("success.common.delete"));
        	}
        	else {
        		model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
    	    	model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.common.delete"));
        	}
		} catch (NullPointerException e) {
			model.addObject(Globals.STATUS_MESSAGE, this.egovMessageSource.getMessage("fail.request.msg"));
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
		}catch (Exception e) {
			model.addObject(Globals.STATUS_MESSAGE, this.egovMessageSource.getMessage("fail.request.msg"));
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
		}

		return model;
	}
	@NoLogging
	@ApiOperation(value="거래처 업데이트", notes = "성공시 거래처 업데이트 합니다.")
	@PostMapping(value="companyUpdate.do")
	public ModelAndView updateCompanyInfoManage(@Valid @RequestBody CompanyInfoReqDto info,
												HttpServletRequest request) throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		
		try {
			if (!jwtVerification.isVerificationAdmin(request)) {
	    		ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확
	    	}else {
	    		info.setUserId(jwtVerification.getTokenUserName(request));
	    	}
			
			
			String meesage = "";
			model.addObject(Globals.STATUS_REGINFO, info);
			
			 
			int ret = this.companyService.updateCompanyInfoManage(info);
			if (ret > 0) {
				model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
				meesage = info.getMode().equals("Ins") ? "success.common.insert": "success.common.update";
				model.addObject(Globals.STATUS_MESSAGE,	this.egovMessageSource.getMessage(meesage));
			} else {
				throw new Exception();
			}
		}catch (NullPointerException e) {
			log.debug("error:" + e.toString());
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, this.egovMessageSource.getMessage("fail.common.insert"));
		}catch (Exception e) {
			log.debug("error:" + e.toString());
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, this.egovMessageSource.getMessage("fail.common.insert"));
		} 
		
		
		return model;
	}
	
}
