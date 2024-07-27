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
public class MqQueseInfo {

	private String queueName;
	private String queueType;
	private String queueDurabitity;
	private String queueRead;
	private String queueUnacked;
	private String queueTotal;
	private String lastUpdusrId;
	private String lastUpdtPnttm;
}
