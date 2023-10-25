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
public class NexusSkillEmployeeRequestInfoDto {

	@NotBlank(message="등록구분을 입력해 주세요.")
	private String mode;
	@NotBlank(message="등록구분을 입력해 주세요.")
	private String centerId;
	@NotBlank(message="등록구분을 입력해 주세요.")
	private String tenantId;
	private String employeegrpId;
	private String employeepartId;
	@NotBlank(message="등록구분을 입력해 주세요.")
	private String employeeId;
	private String skillLevel;
	@NotBlank(message="등록구분을 입력해 주세요.")
	private String skillId;
}
