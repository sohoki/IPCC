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
public class NexusLoginIdInfoRequestDto {

	private String mode;
	private String centerId;
	private String mediaId;
	private String loginId;
	private String createDate;
	private String monitorFlag;
}
