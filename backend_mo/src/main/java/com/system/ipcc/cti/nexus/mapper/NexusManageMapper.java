package com.system.ipcc.cti.nexus.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

@Mapper
public interface NexusManageMapper {

	public List<Map<String, Object>> selectCenterInfoCombo();
	
	public List<Map<String, Object>> selectTenantInfoCombo(String centerId);
	
	public List<Map<String, Object>> selectGroupInfoCombo(@Param("params") Map<String, Object> params);
	
	public List<Map<String, Object>> selectTeamsInfoCombo(@Param("params") Map<String, Object> params);
	
	public List<Map<String, Object>> selectDnMajroInfoCombo(@Param("params") Map<String, Object> params);
	
	public List<Map<String, Object>> selectDnSubInfoCombo(@Param("params") Map<String, Object> params);
	
	public List<Map<String, Object>> selectDnInfoCombo(@Param("params") Map<String, Object> params);
	
	public List<Map<String, Object>> selectEmployeeCombo(@Param("params") Map<String, Object> params);
	
	public List<Map<String, Object>> selectEmployeeSkillCombo(@Param("params") Map<String, Object> params);
	
	public List<Map<String, Object>> selectPermitCombo(@Param("params") Map<String, Object> params);
	
}
