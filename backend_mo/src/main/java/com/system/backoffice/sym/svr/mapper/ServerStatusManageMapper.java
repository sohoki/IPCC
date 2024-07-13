package com.system.backoffice.sym.svr.mapper;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

import com.system.backoffice.sym.svr.models.ServerStatusInfo;
import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

@Mapper
public interface ServerStatusManageMapper {

	public List<Map<String, Object>> selectServiceStatusInfoPageList(@Param("params") Map<String, Object> params);
	
	public int insertServiceInfo(ServerStatusInfo vo);
	
	public int deleteServiceStatusInfo(@Param("params") Map<String, Object> params);
}
