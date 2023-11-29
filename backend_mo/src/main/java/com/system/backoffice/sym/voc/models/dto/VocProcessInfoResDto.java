package com.system.backoffice.sym.voc.models.dto;

import java.util.List;
import java.util.Map;

import com.system.backoffice.sym.voc.models.VocProcessFileInfo;

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
public class VocProcessInfoResDto {

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
	private String frstRegistPnttm;
	private String frstRegisterId;
	private String lastUpdtPnttm;
	private String lastUpdusrId;
	
	private List<Map<String, Object>> vocFIles;

}
