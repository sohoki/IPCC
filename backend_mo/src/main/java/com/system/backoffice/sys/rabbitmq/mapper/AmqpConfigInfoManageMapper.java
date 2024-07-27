package com.system.backoffice.sys.rabbitmq.mapper;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.ibatis.annotations.Param;
import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

import com.system.backoffice.sys.rabbitmq.models.AmqpConfigInfo;
import com.system.backoffice.sys.rabbitmq.models.MqQueseInfo;
import com.system.backoffice.sys.rabbitmq.models.dto.AmqpConfigInfoDto;
import com.system.backoffice.sys.rabbitmq.models.dto.MqQueseInfoDto;

@Mapper
public interface AmqpConfigInfoManageMapper {

	public List<Map<String, Object>> selectAmqpConfigInfoManageListByPagination(@Param("params") Map<String, Object> vo);
	
	public Optional<AmqpConfigInfo> selectAmqpConfigDetail(String systemCode, String messageType, String messageExchangeName);
	
	public Optional<MqQueseInfo> selectMqQueueDetail(String queueName);
	
	public int insertAmqpConfigInfo(AmqpConfigInfoDto info);
	
	public int updateAmqpConfigInfo(AmqpConfigInfoDto info);
	
	public int deleteAmqpConfigInfo(String systemCode, String messageType, String messageExchangeName);
	
	public int insertMqQueues(MqQueseInfoDto info);
	
	public int updateMqQueues(MqQueseInfoDto info);
	
	public int deleteMqQueues(String queueName);
}
