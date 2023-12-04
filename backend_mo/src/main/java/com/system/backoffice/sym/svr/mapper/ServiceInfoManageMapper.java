package com.system.backoffice.sym.svr.mapper;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.ibatis.annotations.Param;
import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

import com.system.backoffice.sym.svr.models.ServiceInfo;
import com.system.backoffice.sym.svr.models.dto.ServiceInfoReqDto;


@Mapper
public interface ServiceInfoManageMapper {

	public List<Map<String, Object>> selectServiceInfoPageList(@Param("params") Map<String, Object> params);
	
	public Optional<ServiceInfo> selectServiceInfoDetail(String serverCode);
	
    public int insertServiceInfo(ServiceInfoReqDto vo);
	
    public int updateServiceInfo(ServiceInfoReqDto vo);
    
    //public int updateServiceStatus(ServerStatusDto vo);
   
    public int deleteServiceInfo(String serverCode);
}
