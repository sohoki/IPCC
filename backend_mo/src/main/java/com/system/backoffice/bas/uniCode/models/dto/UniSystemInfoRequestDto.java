package com.system.backoffice.bas.uniCode.models.dto;

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
public class UniSystemInfoRequestDto {

	private String mode;
	private String uniSeq;
	private String uniGubun;
	private String uniId;
	private String uniValue;
}
