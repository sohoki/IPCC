package com.system.ipcc.pbx.avaya.models;

import java.util.List;

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
public class PbxAgentInfo {

	
	private List<pbxType> sn;
	private List<pbxType> sr;
	private String loginId;

	
}
