package com.system.backoffice.sym.svr.mapper;

import org.apache.ibatis.annotations.Param;
import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

import com.system.backoffice.sym.svr.models.dto.ServerInfoRequestDto;
import com.system.backoffice.sym.svr.models.dto.ServerStatusDto;
import com.system.backoffice.sym.svr.models.ServerInfo;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Mapper
public interface ServerInfoManageMapper {

	
	public List<Map<String, Object>> selectServerInfoPageList(@Param("params") Map<String, Object> params);
	
	public List<Map<String, Object>> selectServerInfoComboList(@Param("params") Map<String, Object> params);
	
	public Optional<ServerInfo> selectServerInfoDetail(String serverCode);
	
	public int insertServerInfo(ServerInfoRequestDto vo);
		
	public int updateServerInfo(ServerInfoRequestDto vo);
	
	public int updateServerStatus(ServerStatusDto vo);
	
	public int deleteServerInfo(String serverCode);
}
