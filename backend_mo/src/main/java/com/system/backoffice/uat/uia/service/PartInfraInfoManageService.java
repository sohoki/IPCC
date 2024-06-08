package com.system.backoffice.uat.uia.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.ibatis.annotations.Param;

import com.system.backoffice.uat.uia.models.PartInfraInfo;
import com.system.backoffice.uat.uia.models.dto.PartInfraInfoRequestDto;

public interface PartInfraInfoManageService {

	List<Map<String, Object>> selectPartInfraInfoPageInfoManageListByPagination(@Param("params") Map<String, Object> params)throws Exception;
	
	Optional<PartInfraInfo> selectPartfraInfoDetail(String partInfraCode);
		
	int updatePartfraInfoManage(PartInfraInfoRequestDto vo);
		
	int deletePartfraInfoManage(String partInfraCode);

	int selectAgentDoubleCheck(PartInfraInfoRequestDto vo) throws Exception;
}
