package com.system.backoffice.sys.rabbitmq.models.dto;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Schema(title="AmqpConfigInfoDto : 메세지 구성 요청 DTO " )
public class AmqpConfigInfoDto {

	@NotBlank(message="모드를 입력해 주세요.")
	@Schema(description="DB 처리 구분", example="Ins/Edt/Del")
	private String mode;
	
	@NotBlank(message="systemcode를 입력해 주세요.")
	@Schema(description="연관 서비스")
	@Size(min=4, max=4)
	private String systemCode;
	
	@NotBlank(message="systemcode를 입력해 주세요.")
	private String messageType;
	
	@NotBlank(message="systemcode를 입력해 주세요.")
	private String messageExchangeName;
	
	@NotBlank(message="systemcode를 입력해 주세요.")
	private String messageRoutingKey;
	
	@NotBlank(message="사용 유무.")
	@Size(min=1, max=1)
	private String messageUseyn;
	
	@Schema(description="메세지 사용 범위")
	private String messageDc;
	
	@NotBlank(message="systemcode를 입력해 주세요.")
	@Schema(description="등록자 아이디")
	private String userId;
}
