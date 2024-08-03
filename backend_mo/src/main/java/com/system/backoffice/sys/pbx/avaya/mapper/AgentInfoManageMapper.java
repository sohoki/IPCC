package com.system.backoffice.sys.pbx.avaya.mapper;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.ibatis.annotations.Param;
import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

import com.system.backoffice.sys.pbx.avaya.models.AgentInfo;
import com.system.backoffice.sys.pbx.avaya.models.AgentScenInfo;
import com.system.backoffice.sys.pbx.avaya.models.dto.AgentInfoReqDto;


@Mapper
public interface AgentInfoManageMapper {

	public List<Map<String, Object>> selectAgentInfoPageList(@Param("params") Map<String, Object> params);
	
	public Optional<AgentInfo> selectAgentInfoDetail(String loginId);
	
	public List<AgentScenInfo> selectAgentInfoScenList(String loginId);
	
	public int insertAgentInfoList(List<AgentInfo> list);
	
	public int insertAgentInfo(AgentInfoReqDto vo);
		
	public int updateAgentInfo(AgentInfoReqDto vo);
	
	//public int updateStationConsultInfo(AgentInfo vo);
	
	public int deleteAgentInfo(String loginId);
}
