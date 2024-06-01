package com.system.backoffice.uat.uia.mapper;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.ibatis.annotations.Param;
import com.system.backoffice.uat.uia.models.PartInfraInfo;
import com.system.backoffice.uat.uia.models.dto.PartInfraInfoRequestDto;

public interface PartInfraInfoManageMapper {

    public List<Map<String, Object>> selectPartInfraInfoPageInfoManageListByPagination(@Param("params") Map<String, Object> params)throws Exception;
	
	
	public Optional<PartInfraInfo> selectPartfraInfoDetail(String partInfraCode);
	
	public int insertPartfraInfoManage(PartInfraInfoRequestDto vo);
	
	public int updatePartfraInfoManage(PartInfraInfoRequestDto vo);
	
	public int deletePartfraInfoManage(String partInfraCode);
}
