package com.system.backoffice.sym.svr.mapper;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.ibatis.annotations.Param;
import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

import com.system.backoffice.sym.svr.models.dto.ServiceOidInfoReqDto;
import com.system.backoffice.sym.svr.models.dto.ServiceOidInfoResDto;

@Mapper
public interface ServiceOidInfoManageMapper {

	public List<Map<String, Object>> selectServiceOidInfoPageList(@Param("params") Map<String, Object> params);
	
	public Optional<ServiceOidInfoResDto> selectServiceOidInfoDetail(String oidSeq);
	
	public int insertServiceOidInfo(ServiceOidInfoReqDto vo);
		
	public int updateServiceOidInfo(ServiceOidInfoReqDto vo);
	
	//public int updateServerStatus(ServerStatusDto vo);
	
	public int deleteServiceOidInfo(String oidSeq);
}
