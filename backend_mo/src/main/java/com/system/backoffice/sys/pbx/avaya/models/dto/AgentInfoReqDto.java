package com.system.backoffice.sys.pbx.avaya.models.dto;


import java.util.List;

import com.system.backoffice.sys.pbx.avaya.models.AgentScenInfo;

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
public class AgentInfoReqDto {

	private String mode;
	private String loginId;
	private String name;
	
	private String sn;
	private String sr;
	private String snIndex;
	private String srIndex;
	
	private String extension;
	private String agentUpdate;
	
	private List<AgentScenInfo> scenInfos;
}
