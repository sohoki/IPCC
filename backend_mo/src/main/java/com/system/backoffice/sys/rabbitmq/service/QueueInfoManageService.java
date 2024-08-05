package com.system.backoffice.sys.rabbitmq.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.system.backoffice.sys.rabbitmq.mapper.QueueInfoManageMapper;
import com.system.backoffice.sys.rabbitmq.models.ExchangeInfo;
import com.system.backoffice.sys.rabbitmq.models.QueueInfo;
import com.system.backoffice.sys.rabbitmq.models.dto.BindingInfoReqDto;
import com.system.backoffice.sys.rabbitmq.models.dto.ExchangeInfoReqDto;
import com.system.backoffice.sys.rabbitmq.models.dto.QueueInfoReqDto;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Transactional(readOnly = true)
@Slf4j
@RequiredArgsConstructor
@Service
public class QueueInfoManageService {

	private final QueueInfoManageMapper queueMpper;
	
	public List<Map<String, Object>> selectQueueManageListByPagination(Map<String, Object> vo){
		return queueMpper.selectQueueManageListByPagination(vo);
	}
	
	public List<Map<String, Object>> selectQueueCombobox(@Param("params") Map<String, Object> vo){
		return queueMpper.selectQueueCombobox(vo);
	}
	public List<Map<String, Object>> selectExchangeInfoManageListByPagination(Map<String, Object> vo){
		return queueMpper.selectExchangeInfoManageListByPagination(vo);
	}
	public List<Map<String, Object>> selectExchangeCombobox(@Param("params") Map<String, Object> vo){
		return queueMpper.selectExchangeCombobox(vo);
	}
	public Optional<QueueInfo> selectQueueDetail(String queueNm){
		return queueMpper.selectQueueDetail(queueNm);
	}
	public List<Map<String, Object>> selectBuindingInfoManageListByPagination(Map<String, Object> vo){
		return queueMpper.selectBuindingInfoManageListByPagination(vo);
	}
	public Optional<ExchangeInfo> selectExchangeInfoDetail(String exchangeName){
		return queueMpper.selectExchangeInfoDetail(exchangeName);
	}
	@Transactional(readOnly = false)
	public int insertExchangeInfo(ExchangeInfoReqDto info) {
		return queueMpper.insertExchangeInfo(info);
	}
	@Transactional(readOnly = false)
	public int insertQueueInfo(QueueInfoReqDto info) {
		return queueMpper.insertQueueInfo(info);
	}
	@Transactional(readOnly = false)
	public int insertBuindingInfo(BindingInfoReqDto info) {
		return queueMpper.insertBuindingInfo(info);
	}
	@Transactional(readOnly = false)
	public int deleteQueueInfo(String queueNm) {
		return queueMpper.deleteQueueInfo(queueNm);
	}
	@Transactional(readOnly = false)
	public int deleteExchangeInfo(String exchangeName) {
		return queueMpper.deleteExchangeInfo(exchangeName);
	}
	@Transactional(readOnly = false)
	public int deleteBuindingInfo(BindingInfoReqDto vo) {
		return queueMpper.deleteBuindingInfo(vo);
	}
}
