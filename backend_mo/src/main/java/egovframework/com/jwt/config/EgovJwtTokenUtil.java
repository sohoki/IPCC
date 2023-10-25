package egovframework.com.jwt.config;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.system.backoffice.uat.uia.models.UserRoleInfo;

import egovframework.com.cmm.AdminLoginVO;
import egovframework.com.cmm.LoginVO;
import egovframework.com.cmm.service.Globals;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

//security 관련 제외한 jwt util 클래스

@Component
public class EgovJwtTokenUtil implements Serializable{

	private static final long serialVersionUID = -5180902194184255251L;
	//public static final long JWT_TOKEN_VALIDITY = 24 * 60 * 60; //하루
	public static final long JWT_TOKEN_VALIDITY = (long) ((1 * 60 * 60) / 60) * 60; //토큰의 유효시간 설정, 기본 60분
	
	public static final long  TOKEN_REFRESH_TIME = 24 * 60 * 60;
	
	@Value("egovframe")
    private String secret;
	
	//retrieve username from jwt token
    public String getUsernameFromToken(String token) {
        return getClaimFromToken(token, Claims::getSubject);
    }

    //retrieve expiration date from jwt token
    public Date getExpirationDateFromToken(String token) {
        return getClaimFromToken(token, Claims::getExpiration);
    }
    
    public <T> T getClaimFromToken(String token, Function<Claims, T> claimsResolver) {
        final Claims claims = getAllClaimsFromToken(token);
        return claimsResolver.apply(claims);
    }
	
    //for retrieveing any information from token we will need the secret key
    public Claims getAllClaimsFromToken(String token) {
    	System.out.println("===>>> secret = "+secret);
        return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
    }

    //check if the token has expired
    private Boolean isTokenExpired(String token) {
        final Date expiration = getExpirationDateFromToken(token);
        return expiration.before(new Date());
    }
    
    //generate token for admin
    public String generateAdminToken(AdminLoginVO loginVO) {
        Map<String, Object> claims = new HashMap<>();
        //권한 체크 
        for (UserRoleInfo info : loginVO.getRoleInfo()) {
        	//claims.put(Globals.TOKEN_CLAIM_NAME , info.getRoleId());
        	claims.put(secret , info.getRoleId());
        }
        return doGenerateToken(claims, loginVO.getAdminName()+"|"+loginVO.getAdminId());
    }
    //generate token for user
    public String generateToken(LoginVO loginVO) {
        Map<String, Object> claims = new HashMap<>();
        return doGenerateToken(claims, loginVO.getUserSe()+loginVO.getId());
    }

    public String generateAdminToken(AdminLoginVO loginVO, Map<String, Object> claims) {
        //return doGenerateToken(claims, loginVO.getUserSe()+loginVO.getId());
    	return doGenerateToken(claims, loginVO.getAdminName()+"|"+loginVO.getAdminId());
    }
    public String generateToken(LoginVO loginVO, Map<String, Object> claims) {
        return doGenerateToken(claims, loginVO.getUserSe()+loginVO.getId());
    }
    //refreshToken 생성 
    public String createRefreshToken() {
    	return Jwts.builder()
    			.setExpiration(new Date(System.currentTimeMillis() + JWT_TOKEN_VALIDITY * 1000))
    			.signWith(SignatureAlgorithm.HS512, secret )
    			.compact();
    }
	//while creating the token -
	//1. Define  claims of the token, like Issuer, Expiration, Subject, and the ID
	//2. Sign the JWT using the HS512 algorithm and secret key.
	//3. According to JWS Compact Serialization(https://tools.ietf.org/html/draft-ietf-jose-json-web-signature-41#section-3.1)
	//   compaction of the JWT to a URL-safe string
    private String doGenerateToken(Map<String, Object> claims, String subject) {
        return Jwts.builder().setClaims(claims).setSubject(subject).setIssuedAt(new Date(System.currentTimeMillis()))
            .setExpiration(new Date(System.currentTimeMillis() + JWT_TOKEN_VALIDITY * 1000))
            .signWith(SignatureAlgorithm.HS512, secret).compact();
    }
    
    //validate token
    public Boolean validateToken(String token, LoginVO loginVO) {
        final String username = getUsernameFromToken(token);
        return (username.equals(loginVO.getUserSe()+loginVO.getId()) && !isTokenExpired(token));
    }
  //validate Admin token
    public Boolean validateAdminToken(String token, AdminLoginVO loginVO) {
        final String username = getUsernameFromToken(token);
        //return (username.equals(loginVO.getAdminName()+"|"+loginVO.getAdminId()) && !isTokenExpired(token));
        return (!isTokenExpired(token));
    }

}
