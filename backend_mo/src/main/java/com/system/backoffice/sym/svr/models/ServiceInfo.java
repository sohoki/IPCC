package com.system.backoffice.sym.svr.models;

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
public class ServiceInfo {

	private String serviceSeq;
	private String serverCode;
	private String serviceName;
	private String servicePort;
	private String licenseKey;
	private String licenseStartday;
	private String licenseEndday;
	private String licenseType;
	private String licenseCount;
	private String licenseDc;
	private String comCodeNumber;
	private String serviceOidUseyn;
	private String serviceSnmpVersion;
	private String serviceSnmpCommunityName;
	private String serviceSnmpId;
	private String serviceSnmpPassword;
	private String serviceSnmpAuthentication;
	private String serviceSnmpPrivacy;
	private String serviceHealthGubun;
	private String serviceUseyn;
	private String frstRegistPnttm;
	private String frstRegisterId;
	private String lastUpdtPnttm;
	private String lastUpdusrId;
}
