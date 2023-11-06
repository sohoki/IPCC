package com.system.backoffice.sym.voc.models;

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
public class VocProcessInfo {

	private String vocSeq;
	private String vocProcessSeq;
	private String vocProcessUserid;
	private String vocProcessVisitedDay;
	private String vocProcessVisitedTime;
	private String vocProcessEndDate;
	private String vocProcess;
	private String productCode;
	private String vocProcessDc;
	private String frstRegistPnttm;
	private String frstRegisterId;
	private String lastUpdtPnttm;
	private String lastUpdusrId;
}
