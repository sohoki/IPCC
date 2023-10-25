package com.system.ipcc.cti.nexus.mapper;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.ibatis.annotations.Param;
import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

import com.system.ipcc.cti.nexus.models.NexusSkillEmployeeInfo;
import com.system.ipcc.cti.nexus.models.NexusSkillInfo;
import com.system.ipcc.cti.nexus.models.dto.NexusSkillEmployeeRequestInfoDto;
import com.system.ipcc.cti.nexus.models.dto.NexusSkillRequestInfo;


@Mapper
public interface NexusSkillManageMapper {

	public List<Map<String, Object>> selectNexusSkillInfoPageList(@Param("params") Map<String, Object> params);
	
	public List<Map<String, Object>> selectNexusSkillEmployeeInfoPageList(NexusSkillEmployeeInfo vo);
	
	public int selectNexusSkillExistInfo(NexusSkillRequestInfo vo);
	
	public int selectParentNexusSkillInfoDetail(NexusSkillRequestInfo vo);
	
	public Optional<NexusSkillInfo> selectNexusSkillInfoDetail(String skillId);
	
    public int insertNexusSkillInfo(NexusSkillRequestInfo vo);
	
    public int updateNexusSkillInfo(NexusSkillRequestInfo vo);

    public int deleteNexusSkillInfo(NexusSkillInfo vo);
    
    public int insertNexusSkillEmployeeInfo(NexusSkillEmployeeRequestInfoDto vo);
	
    public int updateNexusSkillEmployeeInfo(NexusSkillEmployeeRequestInfoDto vo);

    public int deleteNexusSkillEmployeeInfo(NexusSkillEmployeeInfo vo);
}
