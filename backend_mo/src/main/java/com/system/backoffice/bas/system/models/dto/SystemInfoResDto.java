package com.system.backoffice.bas.system.models.dto;

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
public class SystemInfoResDto {

	private String systemCode;
	private String systemName;
	private String systemGubun;
	private String systemGubunTxt;
	private String systemDc;
	private String systemUseyn;
	
	private String domainInfo;
	private String systemCreatedc;
	private String userId;
	private Integer totalRecordCount;	 	// 리스트 총 갯수
	private Integer rnum;
}
