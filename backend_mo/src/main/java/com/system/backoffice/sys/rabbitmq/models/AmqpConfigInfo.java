package com.system.backoffice.sys.rabbitmq.models;

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
public class AmqpConfigInfo {

	private String systemCode;
	private String messageType;
	private String messageExchangeName;
	private String messageRoutingKey;
	private String messageUseyn;
	private String messageDc;
	private String frstRegistPnttm;
	private String frstRegisterId;
	private String lastUpdtPnttm;
	private String lastUpdusrId;
}
