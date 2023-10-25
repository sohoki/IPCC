package com.system.backoffice.uat.uia.models.dto;

import java.util.List;

import com.system.backoffice.uat.uia.models.ConsultantAgentInfo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ConsultantInfoResponseDto {

	private String userId;
	private String pbxExtension;
	private String pbxType;
	private String pbxCor;
	private String pbxCos;
	private String pbxName;
	private String pbxSecurityCode;
	private String pbxLoginId;
	private String pbxStatus;
	private String pbxRegDate;
	private String pbxUpdateDate;
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
	private String centerName;
	private List<ConsultantAgentInfo> agentInfo;
}
