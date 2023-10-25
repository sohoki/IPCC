package com.system.backoffice.sys.svr.models;


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
public class ServerInfo {

	private String mode;
	private String serverSeq;
	private String serverName;
	private String serverIp;
	private String serverPort;
	private String serverMethod;
	private String serverEndTime;
	private String serverSystemInfo;
	private String frstRegistPnttm;
	private String frstRegisterId;
	private String lastUpdtPnttm;
	private String lastUpdusrId;
	private String serverDc;
	private String serverUseyn;
}
