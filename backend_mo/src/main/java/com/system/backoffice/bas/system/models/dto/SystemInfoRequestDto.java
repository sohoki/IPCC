package com.system.backoffice.bas.system.models.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
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
@Schema(title="SystemInfoRequestDto : 시스템 요청 DTO " )
public class SystemInfoRequestDto {

	@NotBlank(message="모드를 입력해 주세요.")
	@Schema(description="DB 처리 구분", example="Ins/Edt/Del")
	private String mode;
	@NotBlank(message="시스템코드를 입력해 주세요.")
	@Size(min=4, max=4)
	@Schema(description="SystemCode", example="Ins/Edt/Del")
	private String systemCode;
	@NotBlank(message="시스템명를 입력해 주세요.")
	private String systemName;
	@NotBlank(message="시스템 구분를 선택해 주세요.")
	@Schema(description="system 구분", example="SYSTEM_GUBUN_1")
	private String systemGubun;
	@Schema(description="system URL 접속 정보")
	private String domainInfo;
	@Schema(description="system 상세 설명")
	private String systemDc;
	@NotBlank(message="사용 유무를 선택해 주세요.")
	@Size(min=1, max=1)
	private String systemUseyn;
	@Schema(description="생성일")
	private String systemCreatedc;
	private String userId;
	@Schema(description="system 설명 ICON")
	private String systemIcon;
	@Schema(description="system 설명 메뉴 구분")
	private String systemMenugubun;
	@Schema(description="system 설명 메뉴 구분")
	private String systemHealthCheck;
	@Schema(description="system 설명 메뉴 구분")
	private String systemHealthCheckUrl;
	@Schema(description="시스템 연동 레벨")
	private String systemConnLevel;
	
	
}
