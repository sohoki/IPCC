package egovframework.com.config;

import javax.annotation.Resource;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.egovframe.rte.fdl.cmmn.exception.FdlException;
import org.egovframe.rte.fdl.idgnr.EgovIdGnrService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.system.backoffice.uat.log.models.LoginLogInfo;
import com.system.backoffice.uat.log.service.LoginLogInfoManageService;

import egovframework.com.cmm.AdminLoginVO;
import egovframework.com.cmm.util.EgovUserDetailsHelper;
import lombok.extern.slf4j.Slf4j;

@Aspect
@Component
@Slf4j
public class ConfigAspect {

	
	@Autowired
	private LoginLogInfoManageService loginService;
	
	@Resource(name = "egovLoginLogIdGnrService")
    private EgovIdGnrService idgenService;
	/*
	 *  로그인 체크 기록 하기 
	 * 
	 */
	@Before("execution(public * egovframework.let.uat.uia.web.EgovLoginApiController.actionLoginJWT(..))")
	public void logBefore(JoinPoint joinPoint) throws FdlException {
		
		String uniqId = "";
        String ip = "";
	    log.debug("-------------------------------------------------------------------------------LOGGIN CHECK");
	      /* Authenticated  */
	    Boolean isAuthenticated = EgovUserDetailsHelper.isAuthenticated();
	    
	    if(isAuthenticated.booleanValue()) {
		      AdminLoginVO user = (AdminLoginVO)EgovUserDetailsHelper.getAuthenticatedUser();
		      uniqId = user.getAdminId();
		      ip = user.getUserIp() == null ? "": user.getUserIp();
	    }
	 	
	    LoginLogInfo loginLog = new LoginLogInfo();
	    loginLog.setLogId(idgenService.getNextStringId());
	    loginLog.setConnectId(uniqId);
        loginLog.setConnectIp(ip);
        loginLog.setConnectMthd("I"); // 로그인:I, 로그아웃:O
        loginLog.setErrorOccrrAt("N");
        loginLog.setErrorCode("");
        loginService.logInsertLoginLog(loginLog);
        
	        //log.info("Before: " + joinPoint.getSignature().getName());
	}
}
