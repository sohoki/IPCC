package com.system.backoffice.uat.uia.models.dto;


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
@Schema(title="PartInfraInfoRequestDto : 부서별 내선 자원 정보 요청" )
public class PartInfraInfoRequestDto {

	private String mode;
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
	private String userId;
}
