package com.system.backoffice.sys.pbx.avaya.models.dto;

import java.util.List;

import com.system.backoffice.sys.pbx.avaya.models.StationButtonInfo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StationInfoReqDto {

	private String mode;
	private String extension;
	private String type;
	private String tn;
	private String cor;
	private String cos;
	private String name;
	private String securityCode;
	private String displayLangage;
	private String consultUseyn;
	private String updateDate;
	private String ipSoftphone;
	private List<StationButtonInfo> stationButton;
}
