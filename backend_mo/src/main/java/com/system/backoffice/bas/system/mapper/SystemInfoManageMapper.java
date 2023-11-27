package com.system.backoffice.bas.system.mapper;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.ibatis.annotations.Param;
import org.egovframe.rte.psl.dataaccess.mapper.Mapper;
import com.system.backoffice.bas.system.models.dto.SystemInfoRequestDto;
import com.system.backoffice.bas.system.models.dto.SystemInfoResDto;


@Mapper
public interface SystemInfoManageMapper {

	public List<SystemInfoResDto> selectSystemInfoList(@Param("params") Map<String, Object> params);
		
	public Optional<SystemInfoResDto> selectSystemInfoDetail(String systemCode);
	
	public List<Map<String, Object>> selectSystemCombo(String searchUseYn);
	
	public int insertSystemInfo(SystemInfoRequestDto vo);

	public int updateSystemInfo(SystemInfoRequestDto vo);
	
	public int deleteSystemInfo(String systemCode);
	    
}
