package egovframework.com.cmm.filter;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.system.backoffice.bas.code.web.EgovCcmCmmnDetailCodeManageController;

import egovframework.com.cmm.service.EgovProperties;
import lombok.extern.slf4j.Slf4j;

/**
 * SimpleCORSFilter.java 클래스
 *
 * @author 신용호
 * @since 2019. 10. 18.
 * @version 1.0
 * @see
 *
 * <pre>
 * << 개정이력(Modification Information) >>
 *
 *  수정일                수정자               수정내용
 *  ----------   ----------   ----------------------
 *  2019.10.18   신용호                최초 생성
 * </pre>
 */
@Slf4j
@WebFilter(urlPatterns = "*.do")
public class SimpleCORSFilter implements Filter {

	private final List<String> allowedOrigins = Arrays.asList("http://localhost:8081,http://192.168.90.57, http://localhost".split("\\,"));

	public SimpleCORSFilter() {
		log.info("SimpleCORSFilter init");
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
		throws IOException, ServletException {
		
		HttpServletRequest request = (HttpServletRequest)req;
		HttpServletResponse response = (HttpServletResponse)res;

		String originHeader = EgovProperties.getProperty("Globals.Allow.Origin");

		log.debug("===>>> origin = " + originHeader);
		
		if (originHeader != null && !originHeader.equals("")) {
			originHeader = originHeader.replace("\r", "").replace("\n", "");// Security - Potential HTTP Response Splitting 분할응답 조치
		}
		
		response.setHeader("Access-Control-Allow-Origin", "*");
	    response.setHeader("Access-Control-Allow-Credentials", "true");
	    response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE, OPTIONS");
	    response.setHeader("Access-Control-Max-Age", "3600");
	    response.setHeader("Access-Control-Allow-Headers", "access-control-allow-methods,access-control-allow-origin,ajax,authorization,content-type");
	    //response.setHeader("Access-Control-Allow-Headers", "*");
	    if ("OPTIONS".equals(request.getMethod())) {
	    	log.debug("===>>> option = " + request.getMethod());
            response.setStatus(HttpServletResponse.SC_OK);
        } else { 
        	log.debug("===>>> doFilter = " );
        	chain.doFilter(req, res);
        }
	    
		
	}

	@Override
	public void init(FilterConfig filterConfig) {}

	@Override
	public void destroy() {}

}