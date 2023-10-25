package com.system.backoffice.sys.svr.models.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ServerInfoRequestDto {

	private String mode;
	private String serverSeq;
	@NotBlank(message="서버 이름을 입력해 주세요.")
	private String serverName;
	@NotBlank(message="서버 IP을 입력해 주세요.")
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
	
	private String userId;
}
