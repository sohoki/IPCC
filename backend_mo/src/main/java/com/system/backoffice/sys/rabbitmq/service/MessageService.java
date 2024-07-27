package com.system.backoffice.sys.rabbitmq.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.system.backoffice.sys.rabbitmq.models.dto.MessageDto;

import egovframework.com.cmm.service.Globals;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Service
public class MessageService {

	@Value("${rabbitmq.topic.name}")
	private String exchangeName;

	@Value("${rabbitmq.topic.key}")
	private String routingKey;

	private final RabbitTemplate rabbitTemplate;

	/**
	 * MESSAGE 구부에 따른 메세지 보내기  Queue로 메시지를 발행
	 *
	 * @param messageDto 발행할 메시지의 DTO 객체
	 */
	public void sendMessage(MessageDto messageDto, 
							String sendGubun, 
							String exchangeName,
							String routingKey) {
		log.info("message sent: {}", messageDto.toString());
		log.info("sendGubun: {},{},{}", sendGubun,exchangeName , routingKey);
		//message 보내기 
		switch (sendGubun) {
		case Globals.MSG_TYPE_GUBUN_DIR : 
			rabbitTemplate.convertAndSend(exchangeName, routingKey, messageDto);
			break;
		case Globals.MSG_TYPE_GUBUN_TOP :
			rabbitTemplate.convertAndSend(exchangeName, routingKey, messageDto);
			break;
		default :
		rabbitTemplate.convertAndSend(exchangeName, "", messageDto);
		}
	}

	/**
	 * Queue에서 메시지를 구독
	 *
	 * @param messageDto 구독한 메시지를 담고 있는 MessageDto 객체
	 */
	@RabbitListener(queues = "${rabbitmq.queue.name}")
	public void reciveMessage(MessageDto messageDto) {
		log.info("backend Received message: {}", messageDto.toString());
	}
}
