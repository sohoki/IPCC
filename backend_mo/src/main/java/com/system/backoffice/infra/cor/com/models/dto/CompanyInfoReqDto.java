package com.system.backoffice.infra.cor.com.models.dto;


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
@Schema(title="CompanyInfoReqDto : 거래처 정보 DTO " )
public class CompanyInfoReqDto {

	@NotBlank(message="모드를 입력해 주세요.")
	@Schema(description="DB 처리 구분", example="Ins/Edt/Del")
	private String mode;
	private String comCode;
	private String comNumber;
	@NotBlank(message="거래처명를 입력해 주세요.")
	@Schema(description="거래처명")
	private String comName;
	private String comGubun;
	private String comBuscondition;
	private String comItem;
	private String comCeoName;
	private String comTel;
	private String comFax;
	private String comZipcode;
	private String comAddr1;
	private String comAddr2;
	private String comHomepage;
	private String comState;
	private String comLogo;
	private String frstRegister_id;
	private String frstRegist_pnttm;
	private String lastUpdusr_id;
	private String lastUpdt_pnttm;
	private String comMemo;
	private String comUseyn;
	private String userId;
}
