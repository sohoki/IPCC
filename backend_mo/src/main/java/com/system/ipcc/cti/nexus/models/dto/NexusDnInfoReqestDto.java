package com.system.ipcc.cti.nexus.models.dto;

import javax.validation.constraints.NotBlank;

import com.system.ipcc.cti.nexus.models.NexusDnInfo;

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
public class NexusDnInfoReqestDto {

	@NotBlank(message="모드를 입력해 주세요.")
	@Schema(description="DB 처리 구분", example="Ins/Edt/Del")
	private String mode;
	@NotBlank(message="centerId를 입력해 주세요.")
	private String centerId;
	@NotBlank(message="tenantId를 입력해 주세요.")
	private String tenantId;
	private String dnmajorId;
	private String dnsubId;
	private String dn;
	private String mediaId;
	private String submediaId;
	private String dnModelname;
	private String dnServicedesc;
	private String dnKind;
	private String dnType;
	private String dnIp;
	private String observerFlag;
	private String monitorFlag;
	private String tag;
	private String loginId;
	
}

