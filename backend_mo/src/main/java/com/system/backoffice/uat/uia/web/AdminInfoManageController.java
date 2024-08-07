package com.system.backoffice.uat.uia.web;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.system.backoffice.sys.rabbitmq.models.dto.MessageDto;
import com.system.backoffice.sys.rabbitmq.service.MessageService;
import com.system.backoffice.uat.uia.models.AdminInfo;
import com.system.backoffice.uat.uia.service.AdminInfoManageService;
import com.system.backoffice.uat.uia.models.AdminInfoVO;
import com.system.backoffice.uat.uia.models.AdminStateChangeInfo;
//import com.system.backoffice.uat.uia.models.PartInfoVO;
import com.system.backoffice.uat.uia.models.dto.UserAuthInfoReqDto;
//import com.system.backoffice.uat.uia.service.PartInfoManageService;
import com.system.backoffice.util.service.UtilInfoService;

import org.egovframe.rte.fdl.property.EgovPropertyService;
import org.egovframe.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
import egovframework.com.cmm.EgovMessageSource;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
import org.springframework.web.servlet.ModelAndView;
import egovframework.com.cmm.service.Globals;
import egovframework.com.cmm.service.ResultVO;
import egovframework.com.jwt.config.EgovJwtTokenUtil;
import egovframework.com.jwt.config.JwtVerification;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


//import org.springframework.security.access.prepost.PreAuthorize;
@Api(tags = {"관리자 관련 연동 API"})
@Slf4j
@RequiredArgsConstructor // final이 선언된 모든 필드를 인자값으로 하는 생성자를 대신 생성하여, 빈을 생성자로 주입받게 한다.
@RestController
@RequestMapping("/api/backoffice/uat/uia/manager")
public class AdminInfoManageController {

	@Autowired
	private AdminInfoManageService userManagerService;
	
	/** EgovPropertyService */
	@Resource(name = "propertiesService")
	protected EgovPropertyService propertiesService;
	
	@Resource(name="egovMessageSource")
	protected EgovMessageSource egovMessageSource;
	
	/*
	@Autowired
	private PartInfoManageService partService;
	*/
	/** JwtVerification */
	@Autowired
	private JwtVerification jwtVerification;
	
	@Autowired
	private EgovJwtTokenUtil jwtUtil;
	
	
	@Value("${rabbitmq.topic.name}")
	private String exchangeName;

	@Value("${rabbitmq.topic.key}")
	private String routingKey;
	
	@Autowired
	private MessageService messageService;
	
	//@PreAuthorize("hasAnyRole('ROLE_B2C','ROLE_B2B')")
	@ApiOperation(value="관리자 리스트", notes = "성공시 관리자 리스트를 반환 합니다.")
	@PostMapping("empList.do")
	public ModelAndView selectUserManagerList(@RequestBody Map<String, Object> searchVO,
											 HttpServletRequest request) throws Exception {  
		
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try{
			
			// 기존 세션 체크 인증에서 토큰 방식으로 변경
			if (!jwtVerification.isVerificationAdmin(request) && !jwtVerification.isVerificationSystem(request)) {
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확인
			}else {
				String[] userinfo = jwtVerification.getTokenUserInfo(request);
				searchVO.put(Globals.PAGE_LOGIN_SYSTEM_CODE, userinfo[1]);
				searchVO.put(Globals.PAGE_LOGIN_ROLEID, userinfo[2]);
				searchVO.put(Globals.PAGE_LOGIN_PARTID , userinfo[3]);
				searchVO.put(Globals.PAGE_LOGIN_INSTTCODE , userinfo[4]);
			}
			log.info("======================1");
			if (!searchVO.get(Globals.USER_PART_ID).equals("SYSTEM"))
				searchVO.put(Globals.PAGE_UNIT, UtilInfoService.NVLObj(searchVO.get(Globals.PAGE_UNIT), propertiesService.getInt(Globals.PAGE_UNIT)));
			else 
				searchVO.put(Globals.PAGE_UNIT, 1000);
			searchVO.put(Globals.PAGE_SIZE, UtilInfoService.NVLObj(searchVO.get(Globals.PAGE_SIZE), propertiesService.getInt(Globals.PAGE_SIZE)));
			
			
			
			
			PaginationInfo paginationInfo = new PaginationInfo();
			paginationInfo.setCurrentPageNo(UtilInfoService.NVLObj(searchVO.get(Globals.PAGE_INDEX), 1));		
			paginationInfo.setRecordCountPerPage(UtilInfoService.NVLObj(searchVO.get(Globals.PAGE_UNIT), propertiesService.getInt(Globals.PAGE_UNIT)));
			paginationInfo.setPageSize(UtilInfoService.NVLObj(searchVO.get(Globals.PAGE_SIZE), propertiesService.getInt(Globals.PAGE_SIZE)) );
			
			searchVO.put(Globals.PAGE_FIRST_INDEX, paginationInfo.getFirstRecordIndex());
			searchVO.put(Globals.PAGE_LAST_INDEX, paginationInfo.getLastRecordIndex());
			searchVO.put(Globals.PAGE_RECORD_PER_PAGE, paginationInfo.getRecordCountPerPage());
			
			model.addObject(Globals.STATUS_REGINFO, searchVO);
			List<AdminInfoVO> adminList = searchVO.get(Globals.USER_PART_ID).equals("SYSTEM") ? 
														(List<AdminInfoVO>) userManagerService.selectAdminUserManageListBySystemInfo(searchVO) 
													:  (List<AdminInfoVO>) userManagerService.selectAdminUserManageListByPagination(searchVO);
					
			log.info("======================2");
			model.addObject(Globals.JSON_RETURN_RESULT_LIST,  adminList);
			int totCnt = adminList.size() > 0 ? adminList.get(0).getTotalRecordCount() : 0;  
			paginationInfo.setTotalRecordCount(totCnt);
			model.addObject(Globals.PAGE_INFO, paginationInfo);
			model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
			
		}catch (Exception e){
			log.debug("selectUserManagerList error:" + e.toString());
			model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.common.msg")+ e.toString());	
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
		}
		return model;
	}
	@ApiOperation(value="관리자 패스워드 체크", notes = "관리자 패스워드 체크 합니다.")
	@PostMapping("passChangeCheck.do")
	public ModelAndView updatePasswordCheck( @RequestBody Map<String, Object> searchVO, 
										    HttpServletResponse response,
										    HttpServletRequest request) throws Exception {
			
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try{
			
			if (!jwtVerification.isVerificationAdmin(request)) {
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확인
			}
			
			searchVO.put("adminId", jwtVerification.getTokenUserName(request));
			int ret =  userManagerService.selectAdminPasswordCheck(searchVO);
			
			String meesage = ret > 0 ? "비밀번호 확인 했습니다." : "현재 비밀번호가 아닙니다.";
			String status = ret > 0 ? Globals.STATUS_SUCCESS : Globals.STATUS_FAIL;
			model.addObject(Globals.STATUS, status);
			model.addObject(Globals.STATUS_MESSAGE, meesage);
			
		}catch (Exception e ){
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("page.emp.message10"));
		}
		return model;
	}
	
	@ApiOperation(value="관리자 패스워드 변경", notes = "관리자 패스워드 변경 합니다.")
	@PostMapping("passChange.do")
	public ModelAndView updatePasswordChange(@RequestBody AdminInfoVO vo, 
										    HttpServletResponse response,
										    HttpServletRequest request) throws Exception {
			
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try{
			int ret =  userManagerService.updatePassChange(vo);
			if (ret > 0){
				//패스워드 변경 
				
				model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
				model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("info.user.passwordChange.ok"));
			}else {
				
				throw new Exception();
			}
		}catch (Exception e ){
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.request.msg"));
		}
		return model;
	}
	@ApiOperation(value="사용자별 시스템 권한 리스트 ", notes="auth table")
	@PostMapping("auth/systemMemnu.do")
	public ModelAndView selectAuthList(@RequestBody UserAuthInfoReqDto req,
										HttpServletRequest request) throws Exception{
		
		// 기존 세션 체크 인증에서 토큰 방식으로 변경
		if (!jwtVerification.isVerificationAdmin(request)) {
			ResultVO resultVO = new ResultVO();
			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
		}
		
		//공용 확인 하기 
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		
		model.addObject(Globals.JSON_RETURN_RESULT_LIST, userManagerService.selectSystemMenuList(req)); 
		model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
		return model;
	}
	@ApiOperation(value="사용자 combobox ", notes="사용자 combobox")
	@GetMapping("adminCombo.do")
	public ModelAndView selectAdminCombo(@RequestParam  Map<String, Object> searchVO,
										 HttpServletRequest request) throws Exception{
		
		// 기존 세션 체크 인증에서 토큰 방식으로 변경
		if (!jwtVerification.isVerificationAdmin(request)) {
			ResultVO resultVO = new ResultVO();
			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
		}
		
		//공용 확인 하기 
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		model.addObject(Globals.JSON_RETURN_RESULT_LIST, userManagerService.selectAdminUserCombo(searchVO)); 
		model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
		return model;
	}
	@ApiOperation(value="사용자 상세 정보", notes="사용자 상세 정보")
	@ApiImplicitParam(name = "adminId", value = "adminId")
	@GetMapping("{adminId}.do")
	public ModelAndView userView(@PathVariable String adminId, 
								HttpServletRequest request) throws Exception{
		
		// 기존 세션 체크 인증에서 토큰 방식으로 변경
		String partId;
		String systemCode;
		if (!jwtVerification.isVerificationAdmin(request) && !jwtVerification.isVerificationSystem(request)) {
			ResultVO resultVO = new ResultVO();
			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
		}else {
			String[] userinfo = jwtVerification.getTokenUserInfo(request);
			partId = userinfo[3];
			systemCode = userinfo[1];
			
		}
		
		//공용 확인 하기 
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		//신규 수정
		
		Optional<AdminInfo> adminVO;
		if (!partId.equals("SYSTEM"))
			adminVO = userManagerService.selectAdminUserManageDetail(adminId); 
		else 
			adminVO = userManagerService.selectAdminUserManageSystem(adminId, systemCode); 
		if ( adminVO.isPresent()) {
			model.addObject(Globals.JSON_RETURN_RESULT, adminVO); 
			model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
		}else {
			model.addObject(Globals.STATUS_MESSAGE, "사용자가 없습니다."); 
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
		}
		return model;
	}
	@ApiOperation(value="관리자 상태 업데이트", notes="관리자 상태 업데이트")
	@ApiImplicitParam(name = "adminId", value = "adminId")
	@GetMapping("StateChange/{adminId}.do")
	public ModelAndView updateStateChangeMessage (@RequestParam Map<String, Object> commandMap,
											HttpServletRequest request, 
											@PathVariable String adminId) throws Exception{
		AdminStateChangeInfo vo = new AdminStateChangeInfo();
		// 기존 세션 체크 인증에서 토큰 방식으로 변경
		if (!jwtVerification.isVerificationAdmin(request)) {
			ResultVO resultVO = new ResultVO();
			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
		}else {
			vo.setUserId(adminId);
			vo.setAdminStatus( UtilInfoService.NVLObj(commandMap.get("adminState"),""));
			vo.setAdminPosition(UtilInfoService.NVLObj(commandMap.get("adminPosition"),""));
			vo.setUpdateId(jwtVerification.getTokenUserName(request));
		}
		
		
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		
		model.addObject(Globals.STATUS_REGINFO, vo);
		
		try{
			
			int ret = userManagerService.updateAdminStateChange(vo);
			
			if (ret >0){
				
				
				MessageDto dto =  MessageDto.builder()
						.id(adminId)
						.processGubun(Globals.SAVE_MODE_UPDATE)
						.processName("MANAGER")
						.urlMethod(Globals.URL_METHOD_GET)
						.url("/api/backoffice/uat/uia/manager/"+adminId+".do")
						.build();
				
				messageService.sendMessage(dto, 
						"Topic", 
						exchangeName,
						routingKey);
				log.info("=========== admin send message");
				
				
				model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
				model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("success.common.insert"));		
			}else {	
				
				throw new Exception();
			}
		}catch (Exception e){
			
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.common.insert") + e.toString());	
		}	
		return model;
	}
	//추후 .do 파일 확인 하기 
	@ApiOperation(value="사용자 업데이트", notes="관리자 업데이트")
	@PostMapping("managerUpdate.do")
	public ModelAndView updateMangerMessage  (@RequestBody  AdminInfoVO vo,
									  HttpServletRequest request, 
									  BindingResult bindingResult) throws Exception{
		
		// 기존 세션 체크 인증에서 토큰 방식으로 변경
		if (!jwtVerification.isVerificationAdmin(request)) {
			ResultVO resultVO = new ResultVO();
			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
		}else {
			vo.setUserId(jwtVerification.getTokenUserName(request));
		}
		
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		
		model.addObject("regist", vo);
		String meesage = "";
		
		try{
			if (vo.getMode().equals("Ins") && vo.getIdCheck().equals("N")) {
				model.addObject(Globals.STATUS,  Globals.STATUS_FAIL);
				model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.user.idcheck"));	
				return model;
			}
			
			int ret = userManagerService.updateAdminUserManage(vo);
			meesage =vo.getMode().equals("Ins") ?"success.common.insert" : "success.common.update";
			if (ret >0){
				/*
				MessageDto dto =  MessageDto.builder()
						.id(vo.getAdminId())
						.processGubun(vo.getMode())
						.processName("MANAGER")
						.urlMethod(Globals.URL_METHOD_GET)
						.url("/api/backoffice/uat/uia/manager/"+vo.getAdminId()+".do")
						.build();
				
				messageService.sendMessage(dto, 
						"Topic", 
						exchangeName,
						routingKey);
				log.info("=========== admin send message");
				*/
				model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
				model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage(meesage));		
			}else {	
				
				throw new Exception();
			}
		}catch (Exception e){
			
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.common.insert") + e.toString());	
		}	
		return model;
	}
	@ApiOperation(value="관리자 업데이트", notes="관리자 업데이트 로그인 필요 없음")
	@PostMapping("managerUpdateLogin.do")
	public ModelAndView mangerUpdateLogin (@RequestBody  AdminInfoVO vo,
									  HttpServletRequest request, 
									  BindingResult bindingResult) throws Exception{
		
		vo.setUserId("Admin");
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		
		model.addObject(Globals.STATUS_REGINFO, vo);
		String meesage = "";
		
		try{
			if (vo.getMode().equals(Globals.SAVE_MODE_INSERT) && vo.getIdCheck().equals("N")) {
				model.addObject(Globals.STATUS,  Globals.STATUS_FAIL);
				model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.user.idcheck"));	
				return model;
			}
			
			int ret = userManagerService.updateAdminUserManage(vo);
			meesage =vo.getMode().equals(Globals.SAVE_MODE_INSERT) ?"success.common.insert" : "success.common.update";
			if (ret >0){
				/*
				MessageDto dto =  MessageDto.builder()
						.id(vo.getAdminId())
						.processGubun(vo.getMode())
						.processName("MANAGER")
						.urlMethod(Globals.URL_METHOD_GET)
						.url("/api/backoffice/uat/uia/manager/"+vo.getAdminId()+".do")
						.build();
				
				messageService.sendMessage(dto, 
						"Topic", 
						exchangeName,
						routingKey);
				log.info("=========== admin send message");
				*/
				model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
				model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage(meesage));		
			}else {	
				
				throw new Exception();
			}
		}catch (Exception e){
			
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.common.insert") + e.toString());	
		}	
		return model;
	}
	@ApiOperation(value="사용자 삭제", notes="사용자 체크 후 삭제")
	@DeleteMapping("{adminId}.do")
	public ModelAndView deleteMberMessage(@PathVariable String adminId, 
									HttpServletRequest request) throws Exception {
		
		if (!jwtVerification.isVerificationAdmin(request)) {
			ResultVO resultVO = new ResultVO();
			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
		}
	
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try{
			
			int ret =  userManagerService.deleteAdminUserManage(adminId);
			/*
			if (ret>0) {
				MessageDto dto =  MessageDto.builder()
						.id(adminId)
						.processGubun("DEL")
						.processName("MANAGER")
						.urlMethod(Globals.URL_METHOD_DELETE)
						.url("")
						.build();
				
						messageService.sendMessage(dto, 
								"Topic", 
								exchangeName,
								routingKey);
						log.info("=========== send message");
			}
			*/
			String status = ret > 0 ? Globals.STATUS_SUCCESS : Globals.STATUS_FAIL;
			String message = ret > 0 ? "success.request.msg" : "fail.request.msg";
			model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage(message));	
			model.addObject(Globals.STATUS, status); 
			
		}catch (Exception e){
			//result = "F";
			model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.request.msg"));	
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
		}
		return model;
	}
	@ApiOperation(value="아이디 체크", notes="아이디 체크 후 값 확인")
	@GetMapping("idCheck/{adminId}.do")
	public ModelAndView selectUserMangerIDCheck(@PathVariable String adminId,
												HttpServletRequest request) throws Exception {
		
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		
		try {
			
			int IDCheck = userManagerService.selectAdminUserMangerIDCheck(adminId);		
			
			String status = IDCheck < 1 ? Globals.STATUS_SUCCESS : Globals.STATUS_FAIL;
			String message = IDCheck < 1 ? "member.idcheck.success" : "member.idcheck.fail";
			model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage(message));	
			model.addObject(Globals.STATUS, status); 
		}catch(Exception e){
			model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.request.msg"));	
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
		}
		return model;
	}
	
}
