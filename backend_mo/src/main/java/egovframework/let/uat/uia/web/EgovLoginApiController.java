package egovframework.let.uat.uia.web;

import java.util.HashMap;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.egovframe.rte.fdl.cmmn.trace.LeaveaTrace;
import org.egovframe.rte.fdl.property.EgovPropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.servlet.ModelAndView;

import egovframework.com.cmm.AdminLoginVO;
import egovframework.com.cmm.EgovMessageSource;
import egovframework.com.cmm.ResponseCode;
import egovframework.com.cmm.service.Globals;
import egovframework.com.cmm.service.ResultVO;
import egovframework.com.jwt.config.EgovJwtTokenUtil;
import egovframework.let.uat.uia.service.EgovLoginService;

/**
 * 일반 로그인을 처리하는 컨트롤러 클래스
 * @author 공통서비스 개발팀 박지욱
 * @since 2009.03.06
 * @version 1.0
 * @see
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 *  수정일      수정자      수정내용
 *  -------            --------        ---------------------------
 *  2009.03.06  박지욱     최초 생성
 *  2011.08.31  JJY            경량환경 템플릿 커스터마이징버전 생성
 *
 *  </pre>
 */
@RestController
public class EgovLoginApiController {
	
	private final Logger log = LogManager.getLogger(EgovLoginApiController.class);

	/** EgovLoginService */
	@Resource(name = "loginService")
	private EgovLoginService loginService;

	/** EgovMessageSource */
	@Resource(name = "egovMessageSource")
	EgovMessageSource egovMessageSource;

	/** EgovPropertyService */
	@Resource(name = "propertiesService")
	protected EgovPropertyService propertiesService;

	/** TRACE */
	@Resource(name = "leaveaTrace")
	LeaveaTrace leaveaTrace;
	
	/** JWT */
	@Autowired
    private EgovJwtTokenUtil jwtTokenUtil;

	/**
	 * 일반 로그인을 처리한다
	 * @param vo - 아이디, 비밀번호가 담긴 LoginVO
	 * @param request - 세션처리를 위한 HttpServletRequest
	 * @return result - 로그인결과(세션정보)
	 * @exception Exception
	 */
	@PostMapping(value = "/uat/uia/actionLoginAPI.do", consumes = {MediaType.APPLICATION_JSON_VALUE , MediaType.TEXT_HTML_VALUE})
	public HashMap<String, Object> actionLogin(@RequestBody AdminLoginVO loginVO, HttpServletRequest request) throws Exception {
		HashMap<String,Object> resultMap = new HashMap<String,Object>();

		// 1. 일반 로그인 처리
		AdminLoginVO loginResultVO = loginService.actionLogin(loginVO);

		if (loginResultVO != null && loginResultVO.getAdminId() != null && !loginResultVO.getAdminId().equals("")) {

			request.getSession().setAttribute("LoginVO", loginResultVO);
			resultMap.put("resultVO", loginResultVO);
			resultMap.put(Globals.STATUS, Globals.STATUS_SUCCESS);
			resultMap.put("resultMessage", "성공 !!!");
		} else {
			resultMap.put("resultVO", loginResultVO);
			resultMap.put(Globals.STATUS, Globals.STATUS_FAIL);
			resultMap.put("resultMessage", egovMessageSource.getMessage("fail.common.login"));
		}

		return resultMap;

	}
	@CrossOrigin(origins = "*")
	@PostMapping(value = "/uat/uia/actionLoginJWT.do")
	public HashMap<String, Object> actionLoginJWT(@RequestBody AdminLoginVO loginVO, HttpServletRequest request, ModelMap model) throws Exception {
		HashMap<String, Object> resultMap = new HashMap<String, Object>();

		
		System.out.println("===============   actionLoginJWT");
		
		loginVO.setUserIp(request.getRemoteAddr());
		// 1. 일반 로그인 처리
		AdminLoginVO loginResultVO = loginService.actionLogin(loginVO);
		
		if (loginResultVO != null && loginResultVO.getAdminId() != null && !loginResultVO.getAdminId().equals("")) {
			
			String jwtToken = jwtTokenUtil.generateAdminToken(loginResultVO);
			
			String username = jwtTokenUtil.getUsernameFromToken(jwtToken);
			 
	    	//서버사이드 권한 체크 통과를 위해 삽입
	    	//EgovUserDetailsHelper.isAuthenticated() 가 그 역할 수행. DB에 정보가 없으면 403을 돌려 줌. 로그인으로 튕기는 건 프론트 쪽에서 처리
	    	request.getSession().setAttribute("AdminLoginVO", loginResultVO);
	    	
			resultMap.put("resultVO", loginResultVO);
			resultMap.put("jToken", jwtToken);
			resultMap.put(Globals.STATUS, Globals.STATUS_SUCCESS);
			resultMap.put("resultMessage",  egovMessageSource.getMessage("success.common.login"));
			
		} else {
			resultMap.put(Globals.STATUS, Globals.STATUS_FAIL);
			resultMap.put("resultMessage", egovMessageSource.getMessage("fail.common.login"));
		}
		
		return resultMap;
	}

	/**
	 * 로그아웃한다.
	 * @return resultVO
	 * @exception Exception
	 */
	@GetMapping(value = "/uat/uia/actionLogoutAPI.do")
	public ResultVO actionLogoutJSON(HttpServletRequest request) throws Exception {
		ResultVO resultVO = new ResultVO();

		RequestContextHolder.currentRequestAttributes().removeAttribute("LoginVO", RequestAttributes.SCOPE_SESSION);

		resultVO.setResultCode(ResponseCode.SUCCESS.getCode());
		resultVO.setResultMessage(ResponseCode.SUCCESS.getMessage());

		return resultVO;
	}
	@PostMapping(value = "/uat/uia/idSearch.do")
	public ModelAndView idSearch(@RequestBody AdminLoginVO loginVO, HttpServletRequest request) throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);

		// 1. 일반 로그인 처리
		String id = loginService.searchId(loginVO);
		loginVO.setAdminId(id);
		if ( id != null && !id.equals("")) {			
			model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
			model.addObject("resultVO", loginVO);
		} else {
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject("resultMessage", egovMessageSource.getMessage("fail.common.idsearch"));
		}
		
		return model;
	}
	@PostMapping(value = "/uat/uia/passwordSearch.do")
	public ModelAndView passwordSearch(@RequestBody AdminLoginVO loginVO, HttpServletRequest request) throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);

		// 1. 일반 로그인 처리
		boolean pwdCheck  = loginService.searchPassword(loginVO);

		if (pwdCheck == true) {			
			model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
			model.addObject("resultVO", loginVO);
		} else {
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject("resultMessage", egovMessageSource.getMessage("fail.common.pwsearch"));
		}
		
		return model;
	}
}