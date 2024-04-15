package com.system.backoffice.bas.system.models.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import io.swagger.v3.oas.annotations.media.Schema;
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
@Schema(title="SystemLoginDto : 시스템 token 생성 DTO " )
public class SystemLoginDto {

	@NotBlank(message="시스템코드를 입력해 주세요.")
	@Size(min=4, max=4)
	@Schema(description="SystemCode", example="IPCC")
	private String systemCode;
	
	@NotBlank(message="시스템 패스워드를 입력해 주세요.")
	@Schema(description="시스템 패스워드")
	private String systemTokenKey;
}
