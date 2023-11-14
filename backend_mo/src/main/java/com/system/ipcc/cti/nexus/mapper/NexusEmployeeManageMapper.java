package com.system.ipcc.cti.nexus.mapper;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.apache.ibatis.annotations.Param;
import org.egovframe.rte.psl.dataaccess.mapper.Mapper;
import com.system.ipcc.cti.nexus.models.NexusAgentInfo;
import com.system.ipcc.cti.nexus.models.dto.NexusAgentComboInfo;
import com.system.ipcc.cti.nexus.models.dto.NexusAgentInfoResponseDto;
import com.system.ipcc.cti.nexus.models.dto.NexusAgentRequestInfoDto;


@Mapper
public interface NexusEmployeeManageMapper {
	
	public List<Map<String, Object>> selectEmployeesInfoPageList(@Param("params") Map<String, Object> params);
	
	public List<NexusAgentComboInfo> selectEmployeesInfoComboList(String centerId);
	
	public int selectNexusEmployeesExistsInfo(NexusAgentRequestInfoDto vo);
	
	public int selectParentNexusEmployeesInfo(NexusAgentRequestInfoDto vo);
	
	public int selectPermitExistsInfo(NexusAgentRequestInfoDto vo);
	
	public Optional<NexusAgentInfoResponseDto> selectEmployeesExistInfoDetail(NexusAgentInfo vo);
	
	public int selectEmployeesExistInfoDetailCnt(NexusAgentInfo vo);
	
    public int insertNexusEmployeesInfo(NexusAgentRequestInfoDto vo);
	
    public int updateNexusEmployeesInfo(NexusAgentRequestInfoDto vo);

    public int deleteNexusEmployeesInfo(NexusAgentInfo vo);
}
