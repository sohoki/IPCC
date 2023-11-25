package com.system.ipcc.pbx.avaya.models;


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
public class StationInfo {

	private String extension;
	private String type;
	private String cor;
	private String cos;
	private String tn;
	private String name;
	private String security_code;
	private String button01;
	private String button02;
	private String button03;
	private String button04;
	private String button05;
	private String button06;
	private String button07;
	private String displayLangage;
	private String consultUseyn;
	private String updateDate;
}
