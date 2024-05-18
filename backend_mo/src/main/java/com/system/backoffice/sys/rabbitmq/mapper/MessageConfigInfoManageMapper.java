package com.system.backoffice.sys.rabbitmq.mapper;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.ibatis.annotations.Param;
import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

import com.system.backoffice.sys.rabbitmq.models.MessageConfigInfo;
import com.system.backoffice.sys.rabbitmq.models.MessageConfigInfoVO;
import com.system.backoffice.sys.rabbitmq.models.dto.MessageConfigInfoReqDto;


@Mapper
public interface MessageConfigInfoManageMapper {
	
    public List<MessageConfigInfoVO> selectMessageConfigInfoManageListByPagination(@Param("params") Map<String, Object> vo);
	
    public int updateMessageConfigInfoManage(MessageConfigInfoReqDto vo);
    
    public int insertMessageConfigInfoManage(MessageConfigInfoReqDto vo);
    
    public int deleteMessageConfigInfoManage(String comCode);
}
