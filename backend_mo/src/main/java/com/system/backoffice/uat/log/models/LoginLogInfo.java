package com.system.backoffice.uat.log.models;

import lombok.Data;

@Data
public class LoginLogInfo {

	
	
	private String logId;
	private String connectId;
	private String connectIp;
	private String connectMthd;
	private String errorOccrrAt;
	private String errorCode;
	private String creatDt;	
	private String searchStartdday;
	private String searchEndday;

	 
}
