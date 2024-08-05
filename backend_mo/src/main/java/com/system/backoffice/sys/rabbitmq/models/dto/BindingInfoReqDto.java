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
public class BindingInfoReqDto {

	private String mode;
	private String queueNm;
	private String exchangeName;
	private String exchangeRoutingKey;
	private String bindingExample;
	private String userId;
	private String lastUpdtPnttm;
}
