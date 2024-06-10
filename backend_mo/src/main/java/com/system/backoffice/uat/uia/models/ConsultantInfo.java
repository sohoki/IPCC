package com.system.backoffice.uat.uia.models;

import java.util.List;

import com.system.backoffice.sys.pbx.avaya.models.AgentInfo;
import com.system.backoffice.sys.pbx.avaya.models.StationInfo;

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
@Schema(title="ConsultantInfo : 상담사정보 " )
public class ConsultantInfo {

	private String consultCode;
	private String pbxExtension;
	private String pbxName;
	private String pbxLoginId;
	private String pbxStatus;
	private String pbxRegDate;
	private String pbxUpdateDate;
	private String ctiCenterId;
	private String ctiTenantId;
	private String ctiEmployeegrpid;
	private String ctiEmployeepartid;
	private String ctiEmployeeid;
	private String ctiLoginid;
	private String ctiName;
	private String ctiPassword;
	private String ctiBlendKind;
	
	private String ctiCenterName;
	private String ctiEmployeegrpName;
	private String ctiEmployeepartName;
	private String ctiTenantName;
	//강제 입력 
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
	private String counUseyn;
	//신규
	private String partId;
	private String insttCode;
	private String agentStatus;
	private String ctiFileSize;
	
	private String consultStatus;
	
	private StationInfo stationInfo;
	private AgentInfo agentInfo;
}
