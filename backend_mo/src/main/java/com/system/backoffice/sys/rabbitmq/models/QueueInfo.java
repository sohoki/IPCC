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
public class QueueInfo {

	private String queueNm;
	private String queueDuration;
	private String queueAutodelete;
	private String lastUpdusrId;
	private String lastUpdtPnttm;
}
