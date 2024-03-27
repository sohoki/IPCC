package com.system.backoffice.uat.uia.event;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;


@RequiredArgsConstructor
@Component
public class AdminInfoEventDispatcher {

	
	private final RabbitTemplate rabbitTemplate;
	
	private String AdminManagerExchange;
	
	private String AdminManagerSolvedRoutingKey;
	
	
	
	
	@Autowired
	AdminInfoEventDispatcher(final RabbitTemplate rabbitTemplate,
							@Value("${rabbitmq.topic.name}") final String AdminManagerExchange,
							@Value("${rabbitmq.topic.key}") final String AdminManagerSolvedRoutingKey )	{
		
		
		this.rabbitTemplate = rabbitTemplate;
		this.AdminManagerExchange = AdminManagerExchange;
		this.AdminManagerSolvedRoutingKey = AdminManagerSolvedRoutingKey;
	}
	public void send(final AdminInfoManageEvent event) {
		rabbitTemplate.convertAndSend(AdminManagerExchange,
									AdminManagerSolvedRoutingKey,
									event);
	}
}
