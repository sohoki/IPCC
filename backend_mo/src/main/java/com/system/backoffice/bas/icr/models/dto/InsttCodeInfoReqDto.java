package com.system.backoffice.bas.icr.models.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Schema(title="InsttCodeInfoReqDto : 기관 정보 요청 DTO " )
public class InsttCodeInfoReqDto {

	@NotBlank(message="모드를 입력해 주세요.")
	@Schema(description="DB 처리 구분", example="Ins/Edt/Del")
	private String mode;
	@NotBlank(message="기관 코드를 입력해 주세요.")
	@Size(min=7, max=7)
	@Schema(description="기관 코드", example="INS0003")
	private String insttCode;
	private String allInsttNm;
	private String lowestInsttNm;
	private String insttAbrvNm;
	private String odr;
	private String ord;
	private String insttOdr;
	private String upperInsttCode;
	private String bestInsttCode;
	private String reprsntInsttCode;
	private String insttTyLclas;
	private String insttTyMlsfc;
	private String insttTySclas;
	private String telno;
	private String fxnum;
	private String creatDe;
	private String ablDe;
	private String ablEnnc;
	private String changeDe;
	private String changeTime;
	private String bsisDe;
	private String sortOrdr;
	private String userId;
	private String processSe;
	private String frstRegistPnttm;
	private String lastUpdtPnttm;
}
