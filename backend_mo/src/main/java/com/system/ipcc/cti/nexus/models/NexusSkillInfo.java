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
public class NexusSkillInfo {

	private String centerId;
	private String tenantId;
	private String skillId;
	private String skillName;
	private String skillDesc;
}

