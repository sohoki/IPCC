package com.system.backoffice.uat.uia.models;

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
public class ConsultantAgentInfo {

	private String pbxAgentSeq;
	private String pbxLoginId;
	private String pbxSnType;
	private String pbxSnIndex;
	private String pbxSrType;
	private String pbxSrIndex;
}
