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
public class MessageDto {

	private String systemCode;
	private String processName;
	private String processGubun;
	private String url;
	private String urlMethod;
	private String id;
}