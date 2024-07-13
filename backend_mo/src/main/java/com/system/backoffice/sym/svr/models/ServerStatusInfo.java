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
public class ServerStatusInfo {

	private String serverSeq;
	private String serverCode;
	private String ping;
	private String cpu;
	private String memory;
	private String hddInfo;
	private String hddTotalInfo;
	private String lastUpdtPnttm;
}
