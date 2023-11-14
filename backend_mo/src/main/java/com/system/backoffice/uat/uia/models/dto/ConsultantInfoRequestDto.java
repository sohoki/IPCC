package com.system.backoffice.uat.uia.models.dto;

import java.util.List;

import javax.validation.constraints.NotBlank;

import com.system.backoffice.uat.uia.models.ConsultantAgentInfo;
import com.system.backoffice.uat.uia.models.ConsultantInfo;

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
public class ConsultantInfoRequestDto {

	@NotBlank(message="Mode를 입력해 주세요.")
	private String mode;
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
	
	
	private List<ConsultantAgentInfo> agentInfo;
}
