package com.system.backoffice.sys.pbx.avaya.models;


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
@Schema(title="AgentScenInfo : 에이전트 시나리오 정보 " )
public class AgentScenInfo {

	private String loginId;
	private String scenGubun;
	private int scenPosition;
	private String scenValue;
}
