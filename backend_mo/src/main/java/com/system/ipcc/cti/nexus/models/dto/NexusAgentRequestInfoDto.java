package com.system.ipcc.cti.nexus.models.dto;

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
public class NexusAgentRequestInfoDto {

	private String mode;
	private String centerId;
	private String tenantId;
	private String employeegrpId; //group
	private String employeepartId; //team
	private String employeeId;
	private String loginId;
	private String employeeName;
	private String employeePawd;
	private String employeeClass; //위치
	private String blendKind;
	private String permitId;
	private String skillDepth1;
	private String skillDepth2;
	private String skillDepth3;
	private String skillDepth4;
	private String skillDepth5;
	private String skillDepth6;
	private String skillDepth7;
	private String skillDepth8;
	private String skillDepth9;
	private String skillDepth10;
	private String defaultQueue;
	private String sendFilesize;
	private String monitorFlag;
	private String workHours;
	private String tel_home;
	private String userDefine1;
	private String userDefine2;
	private String userDefine3;
	private String employeeDuty;
	private String joiningDate;
	private String endUpdatedate;
	private String updateUser;
	private String emailAddr;
	private String logoffReason;
	private String leavingDate;
	private String employeeAlias;
	private String telHome;
	private String duty;
	private String userId;
}
