package com.system.backoffice.sys.pbx.avaya.models;


import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;
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
@Schema(title="StationInfo : pbx 내선번호 정보 " )
public class StationInfo {

	
	private String extension;
	private String type;
	private String cor;
	private String cos;
	private String tn;
	private String name;
	private String securityCode;
	private String displayLangage;
	private String consultUseyn;
	private String updateDate;
	private String ipSoftphone;
	
	private List<StationButtonInfo> stationButton;
}
