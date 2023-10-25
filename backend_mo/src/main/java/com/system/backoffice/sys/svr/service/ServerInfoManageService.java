package com.system.backoffice.sys.svr.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.system.backoffice.sys.svr.mapper.ServerInfoManageMapper;
import com.system.backoffice.sys.svr.models.dto.ServerInfoRequestDto;
import com.system.backoffice.sys.svr.models.dto.ServerStatusDto;
import com.system.backoffice.sys.svr.models.ServerInfo;

import lombok.RequiredArgsConstructor;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class ServerInfoManageService {
	
	private final ServerInfoManageMapper serviceMapper;

	public List<Map<String, Object>> selectServerInfoPageList(Map<String, Object> params){
		return serviceMapper.selectServerInfoPageList(params);
	}
	
	public Optional<ServerInfo> selectServerInfoDetail(String serverSeq) {
		return serviceMapper.selectServerInfoDetail(serverSeq);
	}
	
    public int updateServerInfo(ServerInfoRequestDto vo) {
    	return vo.getMode().equals("Ins") ? serviceMapper.insertServerInfo(vo) : serviceMapper.updateServerInfo(vo);
    }
    public int updateServerStatus(ServerStatusDto status) {
    	return serviceMapper.updateServerStatus(status);
    }
    
    public int deleteServerInfo(String serverSeq) {
    	return serviceMapper.deleteServerInfo(serverSeq);
    }
}
