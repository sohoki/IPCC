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
public class ServiceInfoReqDto {

	private String mode;
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
	private String serviceOidUseYn;
	private String serviceSnmpCersion;
	private String serviceSnmpCommunityName;
	private String serviceSnmpId;
	private String serviceSnmpPassword;
	private String serviceSnmpAuthentication;
	private String serviceSnmpVersion;
	private String serviceSnmpPrivacy;
	private String serviceHealthGubun;
	private String serviceUseyn;
	private String frstRegistPnttm;
	private String lastUpdtPnttm;
	private String userId;
}
