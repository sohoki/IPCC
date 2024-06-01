package com.system.backoffice.sys.pbx.avaya.models;

import javax.validation.constraints.NotBlank;

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
@Schema(title="StationButtonInfo : pbx Button 정보 " )
public class StationButtonInfo {

	@NotBlank(message="내선번호 이력.")
	@Schema(description="내선번호 ", example="11339981")
	private int extension;
	
	@NotBlank(message="내선번호 값.")
	@Schema(description="내선번호 값")
	private String buttonData;
	
	@NotBlank(message="내선번호 명 값을 넣어 주세요.")
	@Schema(description="내선번호 명")
	private String buttonName;
	
	
	@NotBlank(message="내선번호 버튼 순서.")
	@Schema(description="내선번호 버튼 순서")
	private int buttonPosition;
}
