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
public class NexusTeamInfo {

	private String centerId;
	private String tenantId;
	private String employeegrpId;
	private String employeepartId;
	private String employeepartName;
	private String monitorFlag;
}
