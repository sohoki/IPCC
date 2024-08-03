package com.system.backoffice.bas.system.models;

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
public class SystemInfo {

	private String systemCode;
	private String systemGubun;
	private String systemName;
	private String systemDc;
	private String domainInfo;
	private String systemUseyn;
	private String systemCreatedc;
	private String systemIcon;
	private String systemMenugubun;
	private String systemHealthCheck;
	private String systemHealthCheckUrl;
	private String systemConnLevel;
	private String systemTokenKey;
	private String systemQueue;
}
