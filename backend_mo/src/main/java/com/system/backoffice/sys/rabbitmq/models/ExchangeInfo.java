package com.system.backoffice.sys.rabbitmq.models;

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
public class ExchangeInfo {

	private String exchangeName;
	private String queueNm;
	private String exchangeRoutingKey;
	private String exchangeType;
	private String lastUpdusrId;
	private String lastUpdtPnttm;
}
