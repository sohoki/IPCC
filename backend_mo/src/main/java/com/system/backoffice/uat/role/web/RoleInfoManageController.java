package com.system.backoffice.uat.role.web;

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
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.system.backoffice.sys.rabbitmq.models.dto.MessageDto;
import com.system.backoffice.sys.rabbitmq.service.MessageService;
import com.system.backoffice.uat.role.models.RoleInfo;
import com.system.backoffice.uat.role.models.dto.RoleInfoRequestDto;
import com.system.backoffice.uat.role.service.RoleInfoManageService;
import com.system.backoffice.uat.uia.models.UniUtilInfo;
import com.system.backoffice.uat.uia.service.UniUtilManageService;
import com.system.backoffice.uat.uia.web.PartInfoManageController;
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
@RequestMapping("/api/backoffice/uat/role/")
public class RoleInfoManageController {

	/** EgovPropertyService */
	@Resource(name = "propertiesService")
	protected EgovPropertyService propertyService;
		
	@Autowired
	private RoleInfoManageService roleMangeServiec;
	
	@Autowired
	private UniUtilManageService uniMangeServiec;
	
	/** JwtVerification */
	@Autowired
	private JwtVerification jwtVerification;
	
	@Autowired
	private MessageService messageService;
	
	@Value("${rabbitmq.topic.name}")
	private String exchangeName;

	@Value("${rabbitmq.topic.key}")
	private String routingKey;
	
	@Autowired
	private UniUtilManageService uniService;
	
	/** EgovMessageSource */
	@Resource(name = "egovMessageSource")
	EgovMessageSource egovMessageSource;
	
	@ApiOperation(value="권한 정보 상세 조회", notes = "성공시 권한 정보 상세 조회 합니다.")
	@ApiImplicitParam(name = "roleId", value = "ROLE 코드 ")
	@GetMapping("{roleId}.do")
	public ModelAndView selectServerDetailInfo(@PathVariable String roleId,
											   HttpServletRequest request)throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
			
			// 기존 세션 체크 인증에서 토큰 방식으로 변경
			if (!jwtVerification.isVerificationAdmin(request) && !jwtVerification.isVerificationSystem(request)) {
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확인
			}
			Optional<RoleInfo> info = roleMangeServiec.selectRoleInfoDetail(roleId);
			
			info.orElseThrow(() -> new IllegalArgumentException("해당하는 서버 정보가가 없습니다. 잘못된 입력"));
			
			model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
			model.addObject(Globals.JSON_RETURN_RESULT, info);
			
		}catch(Exception e) {
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
	   		model.addObject(Globals.STATUS_MESSAGE, e.toString());
		}
		return model;
	}
	@ApiOperation(value="권한 정보 COMBOBOX", notes = "성공시 권한 정보 COMBOBOX 조회 합니다.")
	@GetMapping("roleCombo.do")
	public ModelAndView selectRoleComboInfo(HttpServletRequest request)throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
			
			// 기존 세션 체크 인증에서 토큰 방식으로 변경
			
			if (!jwtVerification.isVerificationAdmin(request)) {
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확인
			}
			model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS );
			model.addObject(Globals.JSON_RETURN_RESULT_LIST, roleMangeServiec.selectRoleInfoComboList());
			
		}catch(Exception e) {
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
	   		model.addObject(Globals.STATUS_MESSAGE, e.toString());
		}
		return model;
	}
	@ApiOperation(value="권한 정보 중복 체크", notes = "성공시 권한 정보 중복 체크 합니다.")
	@ApiImplicitParam(name = "roleId", value = "ROLE 코드 ")
	@GetMapping("idCheck/{roleId}.do")
	public ModelAndView selectServerIdCkeckInfo(@PathVariable String roleId,
			  									HttpServletRequest request)throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
			
			// 기존 세션 체크 인증에서 토큰 방식으로 변경
			if (!jwtVerification.isVerificationAdmin(request)) {
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확인
			}
			int ret = uniMangeServiec.selectIdDoubleCheckString("ROLE_ID", "TB_ROLEINFO", "ROLE_ID=["+ roleId + "[");
			
			String status = ret < 1 ? Globals.STATUS_SUCCESS : Globals.STATUS_FAIL;
			String message = ret < 1 ? "common.codeOk.msg" : "common.codeFail.msg";
			model.addObject(Globals.STATUS, status);
			model.addObject(Globals.STATUS_MESSAGE,egovMessageSource.getMessage(message));
			
		}catch(Exception e) {
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
	   		model.addObject(Globals.STATUS_MESSAGE, e.toString());
		}
		return model;
	}
	@ApiOperation(value="권한 정보 삭제", notes = "성공시 권한 정보 삭제 합니다.")
	@ApiImplicitParam(name = "roleId", value = "ROLE 코드 ")
	@DeleteMapping("{roleId}.do")
	public ModelAndView deleteServerDetailInfo(@PathVariable String roleId,
			   								HttpServletRequest request)throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
			
			// 기존 세션 체크 인증에서 토큰 방식으로 변경
			if (!jwtVerification.isVerificationAdmin(request)) {
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확인
			}
			int ret = roleMangeServiec.deleteRoleInfo(roleId);
			
			
			if (ret > 0) {
				
				MessageDto dto =  MessageDto.builder()
									.id(roleId)
									.processGubun("DELETE")
									.processName("ROLEINFO")
									.urlMethod("DELETE")
									.url("")
									.build();
							
				messageService.sendMessage(dto, 
						"Topic", 
						exchangeName,
						routingKey);
				log.info("=========== send message");
			}

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
	@ApiOperation(value="권한 정보 조회", notes = "성공시 권한 정보 조회 합니다.")
	@PostMapping("roleUpdate.do")
	public ModelAndView updateRoleInfo(@Valid @RequestBody RoleInfoRequestDto info,
			   								HttpServletRequest request)throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
			
			
	    	// 기존 세션 체크 인증에서 토큰 방식으로 변경
			if (!jwtVerification.isVerificationAdmin(request)) {
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확인
			}else {
				info.setUserId(jwtVerification.getTokenUserName(request));
			}
			if (info.getMode().equals("Ins")) {
				
				UniUtilInfo uniCheck = new UniUtilInfo(); 
				
				
				uniCheck.setInTable("TB_ROLEINFO");
				uniCheck.setInCheckName("ROLE_ID");
				uniCheck.setInCondition("ROLE_ID=["+ info.getRoleId() +"[");
				if (uniService.selectIdDoubleCheck(uniCheck) > 0) {
					model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
					model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("common.isExist.msg"));
					return model;
				}
			}
			
			int ret = roleMangeServiec.updateRoleInfo(info);
			
			
			if (ret > 0) {
				
				MessageDto dto =  MessageDto.builder()
									.id(info.getRoleId())
									.processGubun(info.getMode())
									.processName("ROLEINFO")
									.urlMethod("GET")
									.url("/api/backoffice/uat/role/"+info.getRoleId()+".do")
									.build();
							
				messageService.sendMessage(dto, 
						"Topic", 
						exchangeName,
						routingKey);
				log.info("=========== send message");
			}
			
			
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
    
	@PostMapping("roleList.do")
	public ModelAndView  selectServerInfoPageList(@RequestBody Map<String, Object> searchMap 
												 , HttpServletRequest request
												 , BindingResult bindingResult) throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
			
			
			// 기존 세션 체크 인증에서 토큰 방식으로 변경
			if (!jwtVerification.isVerificationAdmin(request) && !jwtVerification.isVerificationSystem(request)) {
	
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확인
			}else {
				String[] userinfo = jwtVerification.getTokenUserInfo(request);
				searchMap.put(Globals.USER_ROLE_ID, userinfo[2]);
				searchMap.put(Globals.USER_PART_ID, userinfo[3]);
				searchMap.put(Globals.USER_INSTT_CODE, userinfo[4]);
			}
			int pageSize = searchMap.get(Globals.PAGE_SIZE) == null ?   propertyService.getInt(Globals.PAGE_SIZE) : Integer.valueOf((String) searchMap.get(Globals.PAGE_SIZE));  
			/** pageing */
			PaginationInfo paginationInfo = new PaginationInfo();
			paginationInfo.setCurrentPageNo(UtilInfoService.NVLObj(searchMap.get(Globals.PAGE_INDEX), 1));
			
	
			if (!searchMap.get(Globals.USER_PART_ID).equals("SYSTEM"))
				paginationInfo.setRecordCountPerPage(UtilInfoService.NVLObj(searchMap.get(Globals.PAGE_UNIT), propertyService.getInt(Globals.PAGE_UNIT)));
			else 
				paginationInfo.setRecordCountPerPage( 1000);
			paginationInfo.setPageSize(pageSize);
			
			
			searchMap.put(Globals.PAGE_FIRST_INDEX, paginationInfo.getFirstRecordIndex());
			searchMap.put(Globals.PAGE_LAST_INDEX, paginationInfo.getLastRecordIndex());
			searchMap.put(Globals.PAGE_RECORD_PER_PAGE, paginationInfo.getRecordCountPerPage());    	    
			List<Map<String, Object>> codeList = (List<Map<String, Object>>) roleMangeServiec.selectRoleInfoPageList(searchMap);

			int totCnt = codeList.size() > 0 ?  Integer.valueOf( codeList.get(0).get("totalRecordCount").toString().replace("-", "") ) :0;
	
			paginationInfo.setTotalRecordCount(totCnt);
			model.addObject(Globals.JSON_RETURN_RESULT_LIST, codeList);
			model.addObject(Globals.PAGE_INFO, paginationInfo);
			model.addObject(Globals.PAGE_TOTAL_COUNT, totCnt);
			model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
		}catch(Exception e) {
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, e.toString());
		}
		return model;
	}
}
