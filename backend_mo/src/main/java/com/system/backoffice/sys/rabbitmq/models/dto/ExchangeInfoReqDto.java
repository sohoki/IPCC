package com.system.backoffice.sys.rabbitmq.models.dto;


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
public class ExchangeInfoReqDto {

	private String mode;
	private String exchangeName;
	private String queueNm;
	private String exchangeRoutingKey;
	private String exchangeType;
	private String userId;
}
