package com.system.backoffice.bas.system.mapper;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.ibatis.annotations.Param;
import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

import com.system.backoffice.bas.system.models.SystemInfo;
import com.system.backoffice.bas.system.models.dto.SystemInfoRequestDto;
import com.system.backoffice.bas.system.models.dto.SystemInfoResDto;
import com.system.backoffice.bas.system.models.dto.SystemLoginDto;


@Mapper
public interface SystemInfoManageMapper {

	public List<SystemInfoResDto> selectSystemInfoList(@Param("params") Map<String, Object> params);
		
	public Optional<SystemInfoResDto> selectSystemInfoDetail(String systemCode);
	
	public Optional<SystemInfo> actionLogin(SystemLoginDto loginInfo);
	
	public int selectSystemByPk(String systemCode);
	
	public List<Map<String, Object>> selectSystemCombo(@Param("params") Map<String, Object> params);
	
	public int insertSystemInfo(SystemInfoRequestDto vo);

	public int updateSystemInfo(SystemInfoRequestDto vo);
	
	public int deleteSystemInfo(String systemCode);
}
