package com.system.backoffice.sys.pbx.avaya.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.system.backoffice.sys.pbx.avaya.mapper.AgentInfoManageMapper;
import com.system.backoffice.sys.pbx.avaya.models.AgentInfo;
import com.system.backoffice.sys.pbx.avaya.models.dto.AgentInfoReqDto;

import lombok.RequiredArgsConstructor;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class AgentInfoManageService {

	private final AgentInfoManageMapper agentMapper;
	
	public List<Map<String, Object>> selectAgentInfoPageList(Map<String, Object> params){
		return agentMapper.selectAgentInfoPageList(params);
	}
	
	public Optional<AgentInfo> selectAgentInfoDetail(String loginId){
		Optional<AgentInfo> agent = agentMapper.selectAgentInfoDetail(loginId);
		if (agent.isPresent())
			agent.get().setScenInfos(agentMapper.selectAgentInfoScenList(loginId));
		return agent;
	}
	@Transactional(readOnly = false)
	public int insertAgentInfoList(List<AgentInfo> list) {
		return agentMapper.insertAgentInfoList(list);
	}
	@Transactional(readOnly = false)
	public int updateAgentInfo(AgentInfoReqDto vo) {
		return vo.getMode().equals("Ins") ? agentMapper.insertAgentInfo(vo) : agentMapper.updateAgentInfo(vo);
	}
	
	//public int updateStationConsultInfo(AgentInfo vo);
	@Transactional(readOnly = false)
	public int deleteAgentInfo(String loginId) {
		return agentMapper.deleteAgentInfo(loginId);
	}
	
}
