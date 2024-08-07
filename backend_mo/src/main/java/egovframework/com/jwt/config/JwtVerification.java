package egovframework.com.jwt.config;

import java.util.Map;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import com.system.backoffice.bas.code.web.EgovCcmCmmnClCodeManageController;
import com.system.backoffice.bas.system.models.SystemInfo;
import com.system.backoffice.bas.system.models.dto.SystemInfoResDto;
import com.system.backoffice.bas.system.service.SystemInfoManageService;

import egovframework.com.cmm.AdminLoginVO;
import egovframework.com.cmm.LoginVO;
import egovframework.com.cmm.ResponseCode;
import egovframework.com.cmm.service.Globals;
import egovframework.com.cmm.service.ResultVO;
import egovframework.com.cmm.util.EgovAdminDetailsHelper;
import egovframework.com.cmm.util.EgovUserDetailsHelper;
import egovframework.let.utl.fcc.service.EgovStringUtil;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.UnsupportedJwtException;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class JwtVerification {
	
	@Autowired
	private EgovJwtTokenUtil jwtTokenUtil;
	
	@Autowired
	private SystemInfoManageService systemService;
	
	
	public boolean isVerification(HttpServletRequest request) {
		
		boolean verificationFlag = true;
		
		// step 1. request header에서 토큰을 가져온다.
		String jwtToken = EgovStringUtil.isNullToString(request.getHeader("authorization"));
		
		// step 2.비교를 위해 loginVO를 가져옴
		LoginVO loginVO = (LoginVO) EgovUserDetailsHelper.getAuthenticatedUser();
		
		// step 3. 토큰에 내용이 있는지 확인 & 토큰 기간이 자났는지를 확인해서 username값을 가져옴
		// Exception 핸들링 추가처리
		String username = null;
		
		try {
	           username = jwtTokenUtil.getUsernameFromToken(jwtToken);
	    } catch (IllegalArgumentException e) {
	        	log.debug("Unable to get JWT Token");
	    } catch (ExpiredJwtException e) {
	        	log.debug("JWT Token has expired");
	    } catch (MalformedJwtException e) {
	        	log.debug("JWT strings must contain exactly 2 period characters");
	    } catch (UnsupportedJwtException e) {
	        	log.debug("not support JWT token.");
	    }
		
		
		// step 4. 가져온 username이랑 2에서 가져온 loginVO랑 비교해서 같은지 체크 & 이 과정에서 한번 더 기간 체크를 한다.
		if (username == null || !(jwtTokenUtil.validateToken(jwtToken, loginVO))) {
			log.debug("jwtToken not validate");
			verificationFlag =  false;
			return verificationFlag;
		}
		
		log.debug("jwtToken validated");
		
		return verificationFlag;
	}
	
	
	public boolean isVerificationAdmin(HttpServletRequest request) {
		
		boolean verificationFlag = true;
		
		// step 1. request header에서 토큰을 가져온다.
		if (request.getHeader("authorization") == null  ) {
			log.error("authorization error");
			return false;
		}
		
		String jwtToken = EgovStringUtil.isNullToString(request.getHeader("authorization").replace("Bearer", ""));
		
		if (jwtTokenUtil.isBlackListCheck(jwtToken) == true) {
			log.error("blacklist check user");
			return false;
		}
		
		// step 2.비교를 위해 loginVO를 가져옴
		AdminLoginVO loginVO = (AdminLoginVO) EgovAdminDetailsHelper.getAuthenticatedUser();
		
		// step 3. 토큰에 내용이 있는지 확인 & 토큰 기간이 자났는지를 확인해서 username값을 가져옴
		// Exception 핸들링 추가처리
		String username = null;
		
		try {
	           username = jwtTokenUtil.getUsernameFromToken(jwtToken);
		} catch (IllegalArgumentException e) {
			log.debug("Unable to get JWT Token");
		} catch (ExpiredJwtException e) {
			log.debug("JWT Token has expired");
		} catch (MalformedJwtException e) {
		    	log.debug("JWT strings must contain exactly 2 period characters");
		} catch (UnsupportedJwtException e) {
		    	log.debug("not support JWT token.");
		}
		
		//log.debug("===>>> username = " + username);
		
		// step 4. 가져온 username이랑 2에서 가져온 loginVO랑 비교해서 같은지 체크 & 이 과정에서 한번 더 기간 체크를 한다.
		if (username == null || !(jwtTokenUtil.validateAdminToken(jwtToken, loginVO))) {
			//log.debug("jwtToken not validate");
			verificationFlag =  false;
			return verificationFlag;
		}
		
		//log.debug("jwtToken validated");
		
		return verificationFlag;
	}
	
	public boolean isVerificationSystem(HttpServletRequest request) throws Exception {
		
		boolean verificationFlag = true;
		
		// step 1. request header에서 토큰을 가져온다.
		if (request.getHeader("authorization") == null  ) {
			log.error("authorization error");
			return false;
		}
		
		String jwtToken = EgovStringUtil.isNullToString(request.getHeader("authorization").replace("Bearer", ""));
		// step 2.비교를 위해 SystemCode를 가져옴
		
		//AdminLoginVO loginVO = (AdminLoginVO) EgovAdminDetailsHelper.getAuthenticatedUser();
		String systemCode = getTokenUserName(request);
		
		Optional<SystemInfoResDto> loginVo = systemService.selectSystemInfoDetail(systemCode);
		if (!loginVo.isPresent()) {
			log.error("authorization error");
			return false;
		}
		// step 3. 토큰에 내용이 있는지 확인 & 토큰 기간이 자났는지를 확인해서 username값을 가져옴
		// Exception 핸들링 추가처리
		String username = null;
		
		try {
			username = jwtTokenUtil.getUsernameFromToken(jwtToken);
		} catch (IllegalArgumentException e) {
			log.debug("Unable to get JWT Token");
		} catch (ExpiredJwtException e) {
			log.debug("JWT Token has expired");
		} catch (MalformedJwtException e) {
		    	log.debug("JWT strings must contain exactly 2 period characters");
		} catch (UnsupportedJwtException e) {
		    	log.debug("not support JWT token.");
		}
		log.info("username:" + username + ": ");
		
		// step 4. 가져온 username이랑 2에서 가져온 loginVO랑 비교해서 같은지 체크 & 이 과정에서 한번 더 기간 체크를 한다.
		if (username == null || !(jwtTokenUtil.validateSystemToken(jwtToken, loginVo.get()))) {
			//log.debug("jwtToken not validate");
			verificationFlag =  false;
			return verificationFlag;
		}
		
		log.debug("isVerificationSystem:" + verificationFlag);
		
		return verificationFlag;
	}
	
	public boolean isVerificationRefresh(HttpServletRequest request) {
		
		boolean verificationFlag = true;
		
		// step 1. request header에서 토큰을 가져온다.
		if (request.getHeader("refreshToken") == null  ) {
			log.error("refreshToken error");
			return false;
		}
		
		String refreshToken = EgovStringUtil.isNullToString(request.getHeader("refreshToken"));
		
		String id = jwtTokenUtil.getUsernameFromToken(refreshToken);
		
		// step 3. 토큰에 내용이 있는지 확인 & 토큰 기간이 자났는지를 확인해서 username값을 가져옴
		// Exception 핸들링 추가처리
		try {
			if (jwtTokenUtil.isRefreshToken(id) == false) {
				log.debug("redis check");
				verificationFlag =  false;
				return verificationFlag;
			}
			
		} catch (IllegalArgumentException e) {
			log.debug("Unable to get refresh Token");
		} catch (ExpiredJwtException e) {
			log.debug("refresh Token has expired");
		} catch (MalformedJwtException e) {
			log.debug("refresh strings must contain exactly 2 period characters");
		} catch (UnsupportedJwtException e) {
			log.debug("not support refresh token.");
		}
		log.debug("verificationFlag====== " + verificationFlag);
		return verificationFlag;
	}
	
	//사용자 아이디 가지고 오기 
	public String getTokenUserName(HttpServletRequest request) {
		// step 1. request header에서 토큰을 가져온다.
		String jwtToken = EgovStringUtil.isNullToString(request.getHeader("authorization").replace("Bearer", ""));
		String[] tokenS = jwtTokenUtil.getUsernameFromToken(jwtToken).split("\\|");
		return tokenS[1];
	}
	//사용자 정보 전체 가지고 오기
	public String[] getTokenUserInfo(HttpServletRequest request) {
		// step 1. request header에서 토큰을 가져온다.
		String jwtToken = EgovStringUtil.isNullToString(request.getHeader("authorization").replace("Bearer", ""));
		return jwtTokenUtil.getUsernameFromToken(jwtToken).split("\\|");
	}
	public ModelAndView handleAuthError(ResultVO resultVO) {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		resultVO.setResultCode(ResponseCode.AUTH_ERROR.getCode());
		resultVO.setResultMessage(ResponseCode.AUTH_ERROR.getMessage());
		model.addObject(Globals.STATUS, Globals.STATUS_LOGIN_FAIL);
		model.addObject(Globals.TOKEN_AUTHOR_ERROR, resultVO);
		return model;
	}
}
