package com.system.backoffice.infra.ble.wre.models.dto;


import javax.validation.constraints.NotBlank;

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
@Schema(title="StorageInfoReqDto : 재고물류창고 정보 DTO " )
public class StorageInfoReqDto {

	@NotBlank(message="모드를 입력해 주세요.")
	@Schema(description="DB 처리 구분", example="Ins/Edt/Del")
	private String mode;
	private String storageCode;
	private String centerId;
	@NotBlank(message="재고물류창고명를 입력해 주세요.")
	@Schema(description="재고물류창고명")
	private String storageName;
	private String storageDc;
	private String insttCode;
	private String storageUseyn;
	private String createDe;
	private String endDe;
	private String userId;
}
