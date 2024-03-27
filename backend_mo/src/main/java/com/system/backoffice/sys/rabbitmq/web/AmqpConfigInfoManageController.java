package com.system.backoffice.sys.rabbitmq.web;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartRequest;
import org.springframework.web.servlet.ModelAndView;

import com.system.backoffice.infra.bld.cnt.models.CenterInfoVO;
import com.system.backoffice.infra.bld.cnt.models.dto.CenterInfoReqDto;
import com.system.backoffice.sym.log.annotation.NoLogging;
import com.system.backoffice.sys.rabbitmq.models.AmqpConfigInfo;
import com.system.backoffice.sys.rabbitmq.models.dto.AmqpConfigInfoDto;
import com.system.backoffice.sys.rabbitmq.service.AmqpConfigInfoManageService;
import com.system.backoffice.util.service.UtilInfoService;

import egovframework.com.cmm.EgovMessageSource;
import egovframework.com.cmm.service.Globals;
import egovframework.com.cmm.service.ResultVO;
import egovframework.com.jwt.config.JwtVerification;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/backoffice/sys/message/amqp")
public class AmqpConfigInfoManageController {

	@Value("${page.pageUnit}")
    private int pageUnitSetting ;
    
    @Value("${page.pageSize}")
    private int pageSizeSetting ;
    
    @Autowired
	private AmqpConfigInfoManageService messageAmqpService;
	
	@Autowired
	protected EgovMessageSource egovMessageSource;
	
	/** JwtVerification */
	@Autowired
	private JwtVerification jwtVerification;
	
	
	@ApiOperation(value="메세지 서비스 조회", notes = "성공시 메세지 서비스을 조회 합니다.")
	@PostMapping(value="systemAmqpList.do")
	public ModelAndView selectAmqpInfoManageListByPagination(@RequestBody Map<String, Object> searchMap, 
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
    	    
    	    List<Map<String, Object>> codeList = messageAmqpService.selectAmqpConfigInfoManageListByPagination(searchMap);
    	    int totCnt = codeList.size() > 0 ?  Integer.valueOf( codeList .get(0).get("totalRecordCount").toString()) :0;
            

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
	@ApiOperation(value="메세지 서비스 상세 조회", notes = "성공시 메세지 서비스를 상세 조회 합니다.")
	@GetMapping(value="detail.do")
	public ModelAndView selectCenterInfoManageDetail(@RequestParam Map<String, Object> amqp, 
													HttpServletRequest request) throws Exception {
		
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
			if (!jwtVerification.isVerificationAdmin(request)) {
	    		ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확
	    	}
			
			
			
			Optional<AmqpConfigInfo> info = messageAmqpService.selectAmqpConfigDetail(amqp.get("systemCode").toString(),
																					amqp.get("messageType").toString(),
																					amqp.get("messageExchangeName").toString());
			if (info.isPresent()){
				model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
				model.addObject(Globals.STATUS_REGINFO, info.get());
			}else {
				model.addObject(Globals.STATUS_MESSAGE, this.egovMessageSource.getMessage("fail.request.msg"));
				model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			}
		}catch(Exception e) {
			model.addObject(Globals.STATUS_MESSAGE, this.egovMessageSource.getMessage("fail.request.msg"));
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
		}
		
		return model;
	}
	
	
	@ApiOperation(value="메세지 서비스 삭제", notes = "성공시 메세지 서비스를 삭제 합니다.")
	@DeleteMapping(value="delete.do")
	public ModelAndView deleteCenterInfo(@RequestParam Map<String, Object> amqp,
										HttpServletRequest request, 
										BindingResult bindingResult) throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);

		try {
			if (!jwtVerification.isVerificationAdmin(request)) {
	    		ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확
	    	}
			int ret = messageAmqpService.deleteAmqpConfigInfo(amqp.get("systemCode").toString(),
																amqp.get("messageType").toString(),
																amqp.get("messageExchangeName").toString());
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
	@ApiOperation(value="메세지 서비스 업데이트", notes = "성공시 메세지 서비스 업데이트 합니다.")
	@PostMapping(value="centerUpdate.do")
	public ModelAndView updateCenterInfoManage(@Valid @RequestBody AmqpConfigInfoDto info,
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
		
			int ret = this.messageAmqpService.updateAmqpConfigInfo(info);
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
