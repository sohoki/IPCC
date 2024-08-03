package com.system.backoffice.bas.system.models.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SystemInfoResDto {

	private String systemCode;
	private String systemName;
	private String systemTokenKey;
	private String systemGubun;
	private String systemIcon;
	private String systemGubunTxt;
	
	private String systemMenugubun;
	private String systemMenugubunTxt;
	private String systemHealthCheck;
	private String systemHealthCheckTxt;
	private String systemHealthCheckUrl;
	
	private String systemConnLevelTxt;
	private String systemConnLevel;
	
	
	
	private String systemDc;
	private String systemUseyn;
	
	private String domainInfo;
	private String systemCreatedc;
	private String userId;
	private Integer totalRecordCount;	 	// 리스트 총 갯수
	private Integer rnum;
	
	
	@Schema(description="시스템 메세지Queue")
	private String systemQueue;
}
