package com.system.backoffice.sys.rabbitmq.models.dto;


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
@Schema(title="MessageConfigInfoReqDto : 메시지연동 정보 DTO " )
public class MessageConfigInfoReqDto {

	@NotBlank(message="모드를 입력해 주세요.")
	@Schema(description="DB 처리 구분", example="Ins/Edt/Del")
	private String mode;
	private String msgSeq;
	private String msgSection;
	private String msgExplatation;
	private String msgGubun;
	private String msgUrl;
	private String msgIdExistsGubun;
	private String msgReturnType;
	private String msgSendGubun;
	private String msgEtc1;
	private String msgEtc2;
	private String frstRegistPnttm;
	private String frstRegisterId;
	private String lastUpdtPnttm;
	private String lastUpdusrId;
	private String msgReturnExample;
	private String exchangeRoutingKey;
	private String exchangeName;
	private String userId;
}
