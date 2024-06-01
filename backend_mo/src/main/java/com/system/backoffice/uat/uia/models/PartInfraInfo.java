package com.system.backoffice.uat.uia.models;

import io.swagger.v3.oas.annotations.media.Schema;
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
@Schema(title="PartInfraInfo : 부서별 내선 자원 정보 " )
public class PartInfraInfo {

	private String partInfraCode;
	private String insttCode;
	private String partId;
	private String stationStartNumber;
	private String stationEndNumber;
	private String stationMeno;
	private String agentStartNumber;
	private String agentEndNumber;
	private String ctiStartNumber;
	private String ctiEndNumber;
	private String frstRegisterId;
	private String frstRegistPnttm;
	private String lastUpdusrId;
	private String lastUpdtPnttm;
}
