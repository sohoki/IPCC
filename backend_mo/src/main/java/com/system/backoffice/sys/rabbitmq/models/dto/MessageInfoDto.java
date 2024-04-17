package com.system.backoffice.sys.rabbitmq.models.dto;

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
public class MessageInfoDto {

	private String exchangeName;
	private String routingKey;
	private MessageDto messaegDto;
}
