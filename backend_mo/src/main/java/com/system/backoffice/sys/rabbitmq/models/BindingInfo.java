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
public class BindingInfo {

	private String queueNm;
	private String exchangeName;
	private String exchangeRoutingKey;
	private String bindingExample;
	private String lastUpdusrId;
	private String lastUpdtPnttm;
}
