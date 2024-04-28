package com.system.backoffice.bas.menu.models;

import javax.validation.constraints.NotBlank;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MenuInfo {
	
	@Schema(description="menuNo 메뉴 번호", example="0001")
	private String menuNo;
	
	@Schema(description="메뉴명", example="0001")
	private String menuNm; 
	
	private String systemCode;
	
	private String progrmFileNm ;
	
	private String progrmKoreannm; 
	
	private String upperMenuNo ;
	private String upperMenuNm ;
	private String menuOrdr ;
	private String menuDc;
	private String menuUseyn;
	private String relateImagePath; 
	private String relateImageNm;
	private String menuPageTarget;
	private String menuPopupnfo;
	private String menuPrivacy;
	private int cnt = 0;
}
