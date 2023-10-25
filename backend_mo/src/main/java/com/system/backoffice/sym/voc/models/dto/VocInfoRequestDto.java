package com.system.backoffice.sym.voc.models.dto;

import com.system.backoffice.sym.voc.models.VocInfo;

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
public class VocInfoRequestDto {

	private String mode;
	private String vocSeq;
	private String vocSubject;
	private String vocGubun;
	private String vocLocation;
	private String vocStatus;
	private String vocReqRegdate;
	private String vocReqUserid;
	private String vocResRegdate;
	private String vocResUserid;
	private String vocResponse;
	private String vocReq;
	private String userId;
}
