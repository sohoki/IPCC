package com.system.backoffice.infra.cor.com.models;

import java.io.Serializable;
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
public class CompanyInfo  implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private String comCode;
	private String comNumber;
	private String comName;
	private String comGubun;
	private String comBuscondition;
	private String comItem;
	private String comCeoName;
	private String comTel;
	private String comFax;
	private String comZipcode;
	private String comAddr1;
	private String comAddr2;
	private String comHomepage;
	private String comState;
	private String comLogo;
	private String frstRegister_id;
	private String frstRegist_pnttm;
	private String lastUpdusr_id;
	private String lastUpdt_pnttm;
	private String comMemo;
	private String comUseyn;

}
