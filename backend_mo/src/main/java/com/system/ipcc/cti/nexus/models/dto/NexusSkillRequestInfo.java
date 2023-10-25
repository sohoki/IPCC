package com.system.ipcc.cti.nexus.models.dto;

import javax.validation.constraints.NotBlank;


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
public class NexusSkillRequestInfo {

	@NotBlank(message="등록구분을 입력해 주세요.")
	private String mode;
	
	@NotBlank(message="지점코드를 선택해 주세요.")
	private String centerId;
	
	@NotBlank(message="tennant을 선택해 주세요.")
	private String tenantId;
	
	@NotBlank(message="skill ID을 입력해 주세요.")
	private String skillId;
	
	@NotBlank(message="skill 이름을 입력해 주세요.")
	private String skillName;
	
	private String skillDesc;
	
	private String userId;
}

