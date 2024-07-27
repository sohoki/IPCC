package com.system.backoffice.sys.rabbitmq.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Service;

import com.system.backoffice.sys.rabbitmq.mapper.QueueInfoManageMapper;
import com.system.backoffice.sys.rabbitmq.models.ExchangeInfo;
import com.system.backoffice.sys.rabbitmq.models.QueueInfo;
import com.system.backoffice.sys.rabbitmq.models.dto.ExchangeInfoReqDto;
import com.system.backoffice.sys.rabbitmq.models.dto.QueueInfoReqDto;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Service
public class QueueInfoManageService {

	private final QueueInfoManageMapper queueMpper;
	
	public List<Map<String, Object>> selectQueueManageListByPagination(Map<String, Object> vo){
		return queueMpper.selectQueueManageListByPagination(vo);
	}
	
	public List<Map<String, Object>> selectExchangeInfoManageListByPagination(Map<String, Object> vo){
		return queueMpper.selectExchangeInfoManageListByPagination(vo);
	}
	
	public Optional<QueueInfo> selectQueueDetail(String queueNm){
		return queueMpper.selectQueueDetail(queueNm);
	}
	
	public Optional<ExchangeInfo> selectExchangeInfoDetail(String exchangeName){
		return queueMpper.selectExchangeInfoDetail(exchangeName);
	}
	
	public int insertExchangeInfo(ExchangeInfoReqDto info) {
		return queueMpper.insertExchangeInfo(info);
	}
	
	public int insertQueueInfo(QueueInfoReqDto info) {
		return queueMpper.insertQueueInfo(info);
	}
	
	public int deleteQueueInfo(String queueNm) {
		return queueMpper.deleteQueueInfo(queueNm);
	}
	
	public int deleteExchangeInfo(String exchangeName) {
		return queueMpper.deleteExchangeInfo(exchangeName);
	}
}
