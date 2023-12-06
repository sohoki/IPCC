package com.system.backoffice.sym.svr.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.system.backoffice.sym.svr.mapper.ServerInfoManageMapper;
import com.system.backoffice.sym.svr.models.dto.ServerInfoRequestDto;
import com.system.backoffice.sym.svr.models.dto.ServerStatusDto;
import com.system.backoffice.sym.svr.models.ServerInfo;

import lombok.RequiredArgsConstructor;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class ServerInfoManageService {
	
	private final ServerInfoManageMapper serviceMapper;

	public List<Map<String, Object>> selectServerInfoPageList(Map<String, Object> params){
		return serviceMapper.selectServerInfoPageList(params);
	}
	public List<Map<String, Object>> selectServerInfoComboList(Map<String, Object> params){
		return serviceMapper.selectServerInfoComboList(params);
	}
	
	public Optional<ServerInfo> selectServerInfoDetail(String serverSeq) {
		return serviceMapper.selectServerInfoDetail(serverSeq);
	}
	@Transactional(readOnly = false)
    public int updateServerInfo(ServerInfoRequestDto vo) {
    	return vo.getMode().equals("Ins") ? serviceMapper.insertServerInfo(vo) : serviceMapper.updateServerInfo(vo);
    }
	@Transactional(readOnly = false)
    public int updateServerStatus(ServerStatusDto status) {
    	return serviceMapper.updateServerStatus(status);
    }
	@Transactional(readOnly = false)
    public int deleteServerInfo(String serverSeq) {
    	return serviceMapper.deleteServerInfo(serverSeq);
    }
}
