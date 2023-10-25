package egovframework.com.cmm.exception;

import org.springframework.http.HttpStatus;

public class ApiException  extends RuntimeException {

	private static final long serialVersionUID = 5043833245394283085L;
	
	private final HttpStatus httpStatus;
	
    public ApiException(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public ApiException(HttpStatus httpStatus, String message) {
        super(message);
        this.httpStatus = httpStatus;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
