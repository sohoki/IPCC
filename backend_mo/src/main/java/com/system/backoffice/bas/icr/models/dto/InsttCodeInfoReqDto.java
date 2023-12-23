package com.system.backoffice.bas.icr.models.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class InsttCodeInfoReqDto {

	private String mode;
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
