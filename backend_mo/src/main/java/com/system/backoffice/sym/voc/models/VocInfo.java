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
public class VocInfo {

	
	
	private String vocSeq;
	private String vocSubject;
	private String vocGubun;
	private String vocLocation;
	private String vocProcess;
	private String vocStatus;
	private String vocReqRegdate;
	private String vocReqUserid;
	private String vocResRegdate;
	private String vocResUserid;
	private String vocResponse;
	private String vocReq;
}
