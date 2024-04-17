package com.system.backoffice.sys.rabbitmq.web;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.system.backoffice.sys.rabbitmq.models.dto.MessageDto;
import com.system.backoffice.sys.rabbitmq.models.dto.MessageInfoDto;
import com.system.backoffice.sys.rabbitmq.service.MessageService;
import com.system.backoffice.util.service.UtilInfoService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Api(tags = {"IPCC Message 연동 API"})
@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/message/service")
public class MessageController {

	private final MessageService messageService;
	
	/**
	 * Queue로 메시지를 발행
	 *
	 * @param messageDto 발행할 메시지의 DTO 객체
	 * @return ResponseEntity 객체로 응답을 반환
	 */
	@ApiOperation(value="Queue로 메시지를 발행", notes = "성공시 ResponseEntity 객체로 응답을 반환.")
	@PostMapping("sendMessage/{sendType}.do")
	public ResponseEntity<?> sendMessage(@PathVariable String sendType,
										 @RequestBody MessageInfoDto messageDto) {
		//메세지 정송 기본 
		// 추후 서비스 형태로 개발 필요 
		messageService.sendMessage(messageDto.getMessaegDto(), 
									sendType, 
									messageDto.getExchangeName(),
									messageDto.getRoutingKey());
		return ResponseEntity.ok("Message sent to RabbitMQ!");
	}
	
}
