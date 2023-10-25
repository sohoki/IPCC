package com.system.ipcc.cti.nexus.models.dto;


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
public class NexusSubEmployeeInfo {

	private String centerId;
	private String tenantId;
	private String skillId;
	private String skillName;
	private String skillDesc;
}
