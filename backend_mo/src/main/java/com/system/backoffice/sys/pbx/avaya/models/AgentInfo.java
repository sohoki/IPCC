package com.system.backoffice.sys.pbx.avaya.models;

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
public class AgentInfo {

	private String loginId;
	private String name;
	private String extension;
	private String sn;
	private String snIndex;
	private String sr;
	private String srIndex;
	private String agentUpdate;
}
