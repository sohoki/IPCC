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
public class QueueInfoReqDto {

	private String mode;
	private String queueNm;
	private String queueDuration;
	private String queueAutodelete;
	private String userId;
}
