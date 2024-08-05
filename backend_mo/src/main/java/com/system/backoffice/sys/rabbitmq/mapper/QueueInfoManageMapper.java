package com.system.backoffice.sys.rabbitmq.mapper;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.ibatis.annotations.Param;
import org.egovframe.rte.psl.dataaccess.mapper.Mapper;
import com.system.backoffice.sys.rabbitmq.models.ExchangeInfo;
import com.system.backoffice.sys.rabbitmq.models.QueueInfo;
import com.system.backoffice.sys.rabbitmq.models.dto.BindingInfoReqDto;
import com.system.backoffice.sys.rabbitmq.models.dto.ExchangeInfoReqDto;
import com.system.backoffice.sys.rabbitmq.models.dto.QueueInfoReqDto;

@Mapper
public interface QueueInfoManageMapper {

	public List<Map<String, Object>> selectQueueManageListByPagination(@Param("params") Map<String, Object> vo);
	
	public List<Map<String, Object>> selectQueueCombobox(@Param("params") Map<String, Object> vo);
	
	public List<Map<String, Object>> selectExchangeInfoManageListByPagination(@Param("params") Map<String, Object> vo);
	
	public List<Map<String, Object>> selectExchangeCombobox(@Param("params") Map<String, Object> vo);
	
	public List<Map<String, Object>> selectBuindingInfoManageListByPagination(@Param("params") Map<String, Object> vo);
	
	
	public Optional<QueueInfo> selectQueueDetail(String queueNm);
	
	public Optional<ExchangeInfo> selectExchangeInfoDetail(String exchangeName);
	
	public int insertExchangeInfo(ExchangeInfoReqDto info);
	
	public int insertQueueInfo(QueueInfoReqDto info);
	
	public int insertBuindingInfo(BindingInfoReqDto info);
	
	public int deleteQueueInfo(String queueNm);
	
	public int deleteExchangeInfo(String exchangeName);
	
	public int deleteBuindingInfo(BindingInfoReqDto vo);
}
