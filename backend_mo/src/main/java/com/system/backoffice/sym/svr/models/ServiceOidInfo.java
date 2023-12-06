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
public class ServiceOidInfo {

	private String oidSeq;
	private String serviceSeq;
	private String oidNumber;
	private String oidName;
	private String oidResultType;
	private String lastOidConnTime;
	private String lastUpdtPnttm;
	private String lastUpdusrId;
}
