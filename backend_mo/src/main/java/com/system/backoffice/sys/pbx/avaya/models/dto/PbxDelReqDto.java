package com.system.backoffice.sys.pbx.avaya.models.dto;


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
@Schema(title="PbxDelReqDto : pbx 번호 삭제 정보 " )
public class PbxDelReqDto {

	@Schema(description="삭제 구분 ", example="Station/Agent")
	private String mode;
	@Schema(description="삭제 번호 ")
	
	@NotBlank(message="삭제값")
	private String numberInfo;
}
