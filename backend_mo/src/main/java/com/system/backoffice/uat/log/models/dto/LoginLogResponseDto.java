package com.system.backoffice.uat.log.models.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginLogResponseDto {

	
	private String logId;
	private String connectId;
	private String connectIp;
	private String connectMthd;
	private String errorOccrrAt;
	private String errorCode;
	private String creatDt;	
	private String searchStartdday;
	private String searchEndday;
	private int pageIndex = 1;
	private int pageUnit = 10;
	private int pageSize = 10;
	private int firstIndex = 1;
	private int lastIndex = 1;
	private int recordCountPerPage = 10;
	private String searchCondition = "";
	private String searchKeyword = "";
}
