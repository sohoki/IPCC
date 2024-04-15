package com.system.backoffice.sys.rabbitmq.models.dto;

import java.util.List;

import com.system.backoffice.sys.rabbitmq.models.AmqpConfigInfo;

import io.swagger.v3.oas.annotations.media.Schema;
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
@Schema(title="SystemQueueInfos : 메세지 구성 요청 DTO " )
public class SystemQueueInfos {

	private List<AmqpConfigInfo> systemQueueInfos;
}
