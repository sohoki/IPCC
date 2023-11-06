package com.system.backoffice.bas.system.models;

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
public class SystemInfo {

	private String systemCode;
	private String systemName;
	private String systemDc;
	private String domainInfo;
	private String systemCreatedc;
	
}
