package com.system.backoffice.sym.svr.models.dto;


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
public class ServiceOidInfoResDto {


	private String oidSeq;
	private String serviceSeq;
	private String oidNumber;
	private String oidName;
	private String oidResultType;
	private String lastOidConnTime;
	private String lastUpdtPnttm;
	private String lastUpdusrId;
	private String serverIp;
	private String serviceSnmpVersion;
	private String serviceSnmpCommunityName;
	private String serviceSnmpId;
	private String serviceSnmpPassword;
	private String serviceSnmpAuthentication;
	private String serviceSnmpPrivacy;
}
