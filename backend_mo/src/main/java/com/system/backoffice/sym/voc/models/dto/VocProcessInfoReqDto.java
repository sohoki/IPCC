package com.system.backoffice.sym.voc.models.dto;

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
public class VocProcessInfoReqDto {

	private String mode;
	private String vocSeq;
	private String vocProcessSeq;
	private String vocProcessUserid;
	private String vocProcessVisitedDay;
	private String vocProcessVisitedTime;

	private String vocProcessReservationDay;
	private String vocProcessReservationTime;
	
	private String vocProcessEndDate;
	private String vocProcess;
	private String productCode;
	private String vocProcessDc;
	private String userId;
	
}
