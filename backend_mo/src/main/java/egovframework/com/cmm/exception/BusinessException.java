package egovframework.com.cmm.exception;

import lombok.Getter;

@Getter
public class BusinessException extends RuntimeException {
	private static final long serialVersionUID = -355605268753802582L;

    private String status;
    
	public BusinessException(String message) {
		super(message);
	}
	
	public BusinessException(String message, String status) {
		super(message);
		this.status = status;
	}
}
