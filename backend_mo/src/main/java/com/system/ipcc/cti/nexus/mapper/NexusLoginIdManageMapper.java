package com.system.ipcc.cti.nexus.mapper;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.ibatis.annotations.Param;
import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

import com.system.ipcc.cti.nexus.models.NexusLoginIdInfo;
import com.system.ipcc.cti.nexus.models.dto.NexusLoginIdInfoRequestDto;


@Mapper
public interface NexusLoginIdManageMapper {

	public List<Map<String, Object>>  selectLoginIdInfoPageList(@Param("params") Map<String, Object> params);
	
	public Optional<NexusLoginIdInfo> selectLoginIdDetailInfo(NexusLoginIdInfoRequestDto info);
	
	public int selectLoginIdExites(NexusLoginIdInfoRequestDto info);
	
	public int selectParentIdExites(NexusLoginIdInfoRequestDto info);
	
	public int selectTannentExites(NexusLoginIdInfoRequestDto info);
	
	public int selectEmIdExites(NexusLoginIdInfoRequestDto info);
	
	public int insertLoginIdInfo (NexusLoginIdInfoRequestDto info);
	
	public int updateLoginIdInfo(NexusLoginIdInfoRequestDto info);
	
	public int deleteLoginIdInfo(NexusLoginIdInfoRequestDto info);
}
