package com.system.ipcc.cti.nexus.models;

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
public class NexusDnInfo {

	private String centerId;
	private String tenantId;
	private String dnmajorId;
	private String dnsubId;
	private String dn;
	private String mediaId;
	private String submediaId;
	private String dnModelname;
	private String dnServicedesc;
	private String dnKind;
	private String dnType;
	private String dnIp;
	private String observerFlag;
	private String monitorFlag;
	private String tag;
}
