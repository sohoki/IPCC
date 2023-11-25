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
public class PbxMemberInfo {

	private String extension;
	private String type;
	private String cor;
	private String cos;
	private String name;
	private String SecurityCode;
	private String status;
	private String mode;
	
	//신규 
	private String pbxButton01;
	private String pbxButton02;
	private String pbxButton03;
	private String pbxButton04;
	private String pbxButton05;
	private String pbxButton06;
	private String pbxButton07;
	private String pbxDisplayLangage;
	
	private List<pbxType> sn;
	private List<pbxType> sr;
	private String loginId;
}
