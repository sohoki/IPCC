package com.system.backoffice.bas.uniCode.models;

import com.system.backoffice.bas.program.models.ProgrmInfo;

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
public class UniSystemInfo {
	private String uniSeq;
	private String uniGubun;
	private String uniId;
	private String uniValue;
}
