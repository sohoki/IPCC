package com.system.backoffice.sys.rabbitmq.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Service;

import com.system.backoffice.sys.rabbitmq.mapper.AmqpConfigInfoManageMapper;
import com.system.backoffice.sys.rabbitmq.models.AmqpConfigInfo;
import com.system.backoffice.sys.rabbitmq.models.MqQueseInfo;
import com.system.backoffice.sys.rabbitmq.models.dto.AmqpConfigInfoDto;
import com.system.backoffice.sys.rabbitmq.models.dto.MqQueseInfoDto;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Service
public class AmqpConfigInfoManageService {

	private final AmqpConfigInfoManageMapper messageConfiMapper;
	
	public List<Map<String, Object>> selectAmqpConfigInfoManageListByPagination( Map<String, Object> vo){
		return messageConfiMapper.selectAmqpConfigInfoManageListByPagination(vo);
	}
	
	public Optional<AmqpConfigInfo> selectAmqpConfigDetail(String systemCode, String messageType, String messageExchangeName){
		return messageConfiMapper.selectAmqpConfigDetail(systemCode, messageType, messageExchangeName);
	}
	
	
	public int updateAmqpConfigInfo(AmqpConfigInfoDto info) {
		return info.getMode().equals("Ins") ? messageConfiMapper.insertAmqpConfigInfo(info) : messageConfiMapper.updateAmqpConfigInfo(info);
	}
	
	public int deleteAmqpConfigInfo(String systemCode, String messageType, String messageExchangeName) {
		return messageConfiMapper.deleteAmqpConfigInfo(systemCode, messageType, messageExchangeName);
	}
	
	public Optional<MqQueseInfo> selectMqQueueDetail(String queueName){
		return messageConfiMapper.selectMqQueueDetail(queueName);
	}
	
	public int updateMqQueues(MqQueseInfoDto vo){
		return vo.getMode().equals("Ins") ? messageConfiMapper.insertMqQueues(vo) : messageConfiMapper.updateMqQueues(vo);}
	
	public int deleteMqQueues(String queueName){
		return messageConfiMapper.deleteMqQueues(queueName);
	}
}
