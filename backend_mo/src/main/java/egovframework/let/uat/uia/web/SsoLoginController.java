package egovframework.let.uat.uia.web;
import java.util.HashMap;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import egovframework.com.cmm.AdminLoginVO;
import egovframework.com.cmm.EgovMessageSource;
import egovframework.com.cmm.service.Globals;
import egovframework.com.jwt.config.EgovJwtTokenUtil;
import egovframework.let.uat.uia.service.EgovLoginService;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.ubintis.api.ApiUserService;
import com.ubintis.api.ApiPolicyService;
import com.ubintis.common.util.AddressUtil;
import com.ubintis.common.util.StrUtil;
import com.ubintis.framework.bean.AgentBean;
import com.ubintis.framework.config.AgentConfig;

@RestController
public class SsoLoginController {

	/** EgovMessageSource */
	@Resource(name = "egovMessageSource")
	EgovMessageSource egovMessageSource;
	
	
	/** EgovLoginService */
	@Resource(name = "loginService")
	private EgovLoginService loginService;
	
	
	/** JWT */
	@Autowired
    private EgovJwtTokenUtil jwtTokenUtil;
	
	@GetMapping("/sso")
	public HashMap<String, Object> ssoLogin(HttpServletRequest request)throws Exception{
		
		HashMap<String, Object> resultMap = new HashMap<String, Object>();
		try {
			
			String errorCode = "";
			String errorUrl = "";

			AgentBean agentBean = AgentConfig.getInstance().getAgentBean();
			
			if( agentBean != null ) {
				String contextPath = request.getContextPath();
				errorUrl = request.getContextPath() + "/" + StrUtil.NVL( agentBean.getAgent_error_url() );
			}

			// SSO 연동 시 파라미터에서 인증 토큰 획득
			String pni_token = StrUtil.NVL( request.getParameter("pni_token" ));
			/*
			if( "".equals( pni_token ) ) {
				// 통합 로그인 시 세션에서 인증 토큰 획득
				pni_token = StrUtil.NVL( session.getAttribute( "pni_token" ) );
			}
			*/
			if( !"".equals(pni_token) ) {
				// 사용자 IP 획득
				String local_ip = AddressUtil.getClientIp( request );
				System.out.println("local_ip:" + local_ip);
				// API를 이용하여 인증 토큰으로 사용자 정보 조회
				ApiUserService service = new ApiUserService();
				errorCode = service.executeUserData( pni_token, local_ip );
				
				if( "".equals( errorCode ) ) {
					String userData = service.getUserData();
					
					if( userData != null && !"".equals( userData ) ) {
						/*
						session.setAttribute( "user_data", userData );
						session.setAttribute( "pni_token", pni_token );
						*/
						
						// API를 이용하여 로그인 정책 정보 조회
						ApiPolicyService policyService = new ApiPolicyService();
						
						errorCode = policyService.executeLoginPolicy();
						if( "".equals( errorCode )  ) {
							String loginPolicy = policyService.getLoginPolicy();
							JSONParser parse = new JSONParser();
							JSONObject obj =  (JSONObject) parse.parse(userData);
							
							
							
							AdminLoginVO loginResultVO = loginService.actionLoginSso(obj.get("user_id").toString() );// .actionLogin(loginVO);
							
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
							
						}
						
					} else {
						resultMap.put(Globals.STATUS, Globals.STATUS_FAIL);
						resultMap.put("resultMessage", egovMessageSource.getMessage("fail.common.login") + "token null");
					}
					
				} else {
					
					resultMap.put(Globals.STATUS, Globals.STATUS_FAIL);
					resultMap.put("resultMessage", egovMessageSource.getMessage("fail.common.login") + "token remove");
				}
			}
			
		}catch(Exception e) {
			System.out.println("ssoLogin/" + e);
			resultMap.put(Globals.STATUS, Globals.STATUS_FAIL);
			resultMap.put("resultMessage", egovMessageSource.getMessage("fail.common.login"));
		}
		return resultMap;
	}
}
