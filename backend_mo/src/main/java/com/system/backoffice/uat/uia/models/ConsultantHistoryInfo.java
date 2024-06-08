package com.system.backoffice.uat.uia.models;

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
public class ConsultantHistoryInfo {

	private int	conHisSeq;
	private String	consultCode;
	private String	consChangeGubun;
	private String	pbxExtension;
	private String	pbxLoginId;
	private String	ctiEmployeeid;
	private String	consultChangeDate;
	private String	consultChangeMeno;
}