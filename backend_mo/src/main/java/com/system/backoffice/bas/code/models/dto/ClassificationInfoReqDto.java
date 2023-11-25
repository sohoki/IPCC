package com.system.backoffice.bas.code.models.dto;

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
public class ClassificationInfoReqDto {

	private String userId;
	private String cdId;
	private String cdNm;
	private String cdExpi;
	private String useYn;
	private String systCd;
	private String inttCd;
	private String hgrnCdId;
	private String cdLvl;
	private String frstRegistPnttm;
	private String frstRegisterId;
	private String last_updtPnttm;
	private String last_updusrId;
	private String code;
	private String cdIdOrder;
	private String mode;
	
}
