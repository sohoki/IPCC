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
public class NexusCenterInfo {

	private String centerId;
	private String centerRid;
	private String centerName;
	private String centerType;
	private String centerIp;
	private String centerIp2;
	private String centerAlias;
	private String trunkAccesscode;
	private String trunkGroupcode;
	private String minuteCloseing;
	private String duplexingFlag;
	private String uiupdateAddress;
	private String monitorFlag;
	private String dbKind;
}
