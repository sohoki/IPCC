package com.system.backoffice.bas.system.models.dto;

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
public class SystemInfoRequestDto {

	@NotBlank(message="모드를 입력해 주세요.")
	private String mode;
	@NotBlank(message="시스템코드를 입력해 주세요.")
	private String systemCode;
	@NotBlank(message="시스템명를 입력해 주세요.")
	private String systemName;
	@NotBlank(message="시스템 구분를 선택해 주세요.")
	private String systemGubun;
	private String domainInfo;
	private String systemDc;
	private String systemUseyn;
	private String systemCreatedc;
	private String userId;
}
