package com.system.backoffice.uat.uia.web;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import com.system.backoffice.bas.code.web.ClassificationInfoManageController;
import com.system.backoffice.uat.uia.models.AdminInfo;
import com.system.backoffice.uat.uia.service.AdminInfoManageService;
import com.system.backoffice.uat.uia.models.AdminInfoVO;
import com.system.backoffice.uat.uia.models.PartInfoVO;
import com.system.backoffice.uat.uia.service.PartInfoManageService;
import org.egovframe.rte.fdl.property.EgovPropertyService;
import org.egovframe.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
import egovframework.com.cmm.EgovMessageSource;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
import egovframework.com.jwt.config.JwtVerification;
import egovframework.let.utl.fcc.service.EgovStringUtil;
import egovframework.let.utl.sim.service.EgovFileScrty;
import io.swagger.annotations.Api;
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
	
	@Autowired
	private PartInfoManageService partService;
	
	/** JwtVerification */
	@Autowired
	private JwtVerification jwtVerification;
	
	
	
	//@PreAuthorize("hasAnyRole('ROLE_B2C','ROLE_B2B')")
	@PostMapping("empList.do")
	public ModelAndView selectUserManagerList(@RequestBody Map<String, Object> searchVO,
											 HttpServletRequest request) throws Exception {  
		
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
	    try{
		   
			// 기존 세션 체크 인증에서 토큰 방식으로 변경
	    	if (!jwtVerification.isVerificationAdmin(request)) {
	    		ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확인
	    	}

	    	
	    	searchVO.put(Globals.PAGE_UNIT, propertiesService.getInt(Globals.PAGE_UNIT));
	    	searchVO.put(Globals.PAGE_SIZE, propertiesService.getInt(Globals.PAGE_SIZE));
	       
	      
	   	   PaginationInfo paginationInfo = new PaginationInfo();
		   paginationInfo.setCurrentPageNo(Integer.parseInt(searchVO.get(Globals.PAGE_INDEX).toString()));
		   
		   paginationInfo.setRecordCountPerPage(propertiesService.getInt(Globals.PAGE_UNIT));
		   paginationInfo.setPageSize(propertiesService.getInt(Globals.PAGE_UNIT));
		   
		   searchVO.put(Globals.PAGE_FIRST_INDEX, paginationInfo.getFirstRecordIndex());
		   searchVO.put(Globals.PAGE_LAST_INDEX, paginationInfo.getLastRecordIndex());
		   searchVO.put(Globals.PAGE_RECORD_PER_PAGE, paginationInfo.getRecordCountPerPage());
		   
		   model.addObject(Globals.STATUS_REGINFO, searchVO);
		   
		   List<AdminInfoVO> adminList =  (List<AdminInfoVO>) userManagerService.selectAdminUserManageListByPagination(searchVO);
	       model.addObject(Globals.JSON_RETURN_RESULT_LIST,  adminList);      	       
	       int totCnt = adminList.size() > 0 ? adminList.get(0).getTotalRecordCount() : 0;  
	       paginationInfo.setTotalRecordCount(totCnt);
	       model.addObject(Globals.PAGE_INFO, paginationInfo);	       
		   
	   }catch (Exception e){
			log.debug("selectUserManagerList error:" + e.toString());
			model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.common.msg")+ e.toString());	
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
	   }
	   return model;
	}
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

	
	@PostMapping("passChange.do")
    public ModelAndView updatePasswordChange(@RequestBody AdminInfoVO vo, 
										    HttpServletResponse response,
										    HttpServletRequest request) throws Exception {
			
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
    	try{
    		int ret =  userManagerService.updatePassChange(vo);
        	if (ret > 0){
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
	@GetMapping("{adminId}.do")
	public ModelAndView userView( @PathVariable String adminId, HttpServletRequest request) throws Exception{
		
		// 기존 세션 체크 인증에서 토큰 방식으로 변경
    	if (!jwtVerification.isVerificationAdmin(request)) {
    		ResultVO resultVO = new ResultVO();
			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
    	}
    	
		//공용 확인 하기 
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
	    //신규 수정
		
		String jwtToken = EgovStringUtil.isNullToString(request.getHeader("authorization"));
		
		System.out.println(jwtToken);
        Optional<AdminInfoVO> adminVO = userManagerService.selectAdminUserManageDetail(adminId);  
        if ( adminVO.isPresent()) {
        	model.addObject("userInfo", adminVO); 
            model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
        }else {
        	model.addObject(Globals.STATUS_MESSAGE, "사용자가 없습니다."); 
            model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
        }
		return model;
	}
	//추후 .do 파일 확인 하기 
	@ApiOperation(value="사용자 업데이트", notes="관리자 업데이트")
	@PostMapping("managerUpdate.do")
	public ModelAndView updatemanger (@RequestBody  AdminInfoVO vo,
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
	@ApiOperation(value="사용자 업데이트", notes="관리자 업데이트")
	@PostMapping("managerUpdateLogin.do")
	public ModelAndView mangerUpdateLogin (@RequestBody  AdminInfoVO vo,
									  HttpServletRequest request, 
									  BindingResult bindingResult) throws Exception{
		
    	vo.setUserId("Admin");
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
	public ModelAndView deleteMber(@PathVariable String adminId, 
									HttpServletRequest request) throws Exception {
		
    	if (!jwtVerification.isVerificationAdmin(request)) {
    		ResultVO resultVO = new ResultVO();
			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
    	}
    	
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
        try{
			
		    
		    int ret =  userManagerService.deleteAdminUserManage(adminId);
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
		/*
		if (!jwtVerification.isVerificationAdmin(request)) {
    		ResultVO resultVO = new ResultVO();
			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
    	}
    	*/
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		
    	
    	
		try {
			
			int IDCheck = userManagerService.selectAdminUserMangerIDCheck(adminId);		
			
			String status = IDCheck < 1 ? Globals.STATUS_SUCCESS : Globals.STATUS_FAIL;
		    String message = IDCheck < 1 ? "member.idcheck.success" : "member.idcheck.fail";
			model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage(message));	
			System.out.println("IDCheck:" + IDCheck + ":" +  status + ":" + message); 
			model.addObject(Globals.STATUS, status); 
		}catch(Exception e){
			model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.request.msg"));	
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
		}
		return model;
	}
	
}
