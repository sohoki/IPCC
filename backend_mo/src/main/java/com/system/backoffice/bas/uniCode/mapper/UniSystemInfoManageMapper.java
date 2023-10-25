package com.system.backoffice.bas.uniCode.mapper;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.ibatis.annotations.Param;
import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

import com.system.backoffice.bas.uniCode.models.UniSystemInfo;
import com.system.backoffice.bas.uniCode.models.dto.UniSystemInfoRequestDto;


@Mapper
public interface UniSystemInfoManageMapper {	
	
	public List<Map<String, Object>> selectUniInfoPageList(@Param("params") Map<String, Object> params);
	
    public int insertUniInfo(UniSystemInfoRequestDto vo);
	
    public int updateUniInfo(UniSystemInfoRequestDto vo);
    
    public int deleteUniInfo(String roleId);

	public Optional<UniSystemInfo> selectUniInfoDetail(String roleId);
}
