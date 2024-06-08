package com.system.backoffice.uat.uia.models.dto;

import java.util.List;

import javax.validation.constraints.NotBlank;

import com.system.backoffice.sys.pbx.avaya.models.AgentScenInfo;
import com.system.backoffice.sys.pbx.avaya.models.StationButtonInfo;
import com.system.backoffice.uat.uia.models.ConsultantAgentInfo;

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
@Schema(title="ConsultantInfo : 상담사정보 요청 정보 " )
public class ConsultantInfoRequestDto {

	@NotBlank(message="Mode를 입력해 주세요.")
	private String mode;
	private String userId;
	private String pbxExtension;
	private String pbxType;
	private String pbxCor;
	private String pbxCos;
	
	private String pbxDisplayLangage;
	private String pbxSecurityCode;	
	
	private String pbxLoginId;
	private String pbxName; //agent Name
	private String pbxTn;
	private String pbxStatus;
	private String pbxRegDate;
	private String pbxUpdateDate;
	
	private String ctiLoginid;
	private String ctiCenterId;
	private String ctiTenantId;
	private String ctiEmployeegrpid;
	private String ctiEmployeepartid;
	private String ctiEmployeeid;
	private String ctiName;
	private String ctiPassword;
	private String ctiBlendKind;
	private String ctiPermitId;
	private String ctiMoniterFlag;
	private String ctiDefaultQueue;
	private String ctiRegDate;
	private String ctiUpdateDate;
	private String counStatus;
	private String frstRegistPnttm;
	private String frstRegisterId;
	private String lastUpdtPnttm;
	private String lastUpdusrId;
	private String counRemark;
	
	private String ctiCenterName;
	private String ctiEmployeegrpName;
	private String ctiEmployeepartName;
	private String ctiTenantName;
	private String counUseyn;
	//신규 내용 
	
	
	//신규
	private String partId;
	private String insttCode;
	private String agentStatus;
	private String consultCode;
	private String ipSoftphone;
	
	private String pbxExists;
	private String agentExists;
	private String ctiExists;
	
	private List<StationButtonInfo> stationButton;
	private List<AgentScenInfo> scenInfos;
}
