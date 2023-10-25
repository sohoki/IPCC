package com.system.ipcc.cti.nexus.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.system.ipcc.cti.nexus.mapper.NexusSkillManageMapper;
import com.system.ipcc.cti.nexus.models.NexusSkillEmployeeInfo;
import com.system.ipcc.cti.nexus.models.NexusSkillInfo;
import com.system.ipcc.cti.nexus.models.dto.NexusSkillEmployeeRequestInfoDto;
import com.system.ipcc.cti.nexus.models.dto.NexusSkillRequestInfo;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class NexusSkillManageService {

	private final NexusSkillManageMapper skillMapper;
	
	public List<Map<String, Object>> selectNexusSkillInfoPageList(Map<String, Object> params){
		return skillMapper.selectNexusSkillInfoPageList(params);
	}
	public List<Map<String, Object>> selectNexusSkillEmployeeInfoPageList(NexusSkillEmployeeInfo params){
		return skillMapper.selectNexusSkillEmployeeInfoPageList(params);
	}
	//skill sub 등록 하기 
	
	public Optional<NexusSkillInfo> selectNexusSkillInfoDetail(String skillId){
		return skillMapper.selectNexusSkillInfoDetail(skillId);
	}
	public int selectNexusSkillExistInfo(NexusSkillRequestInfo vo) {
		return skillMapper.selectNexusSkillExistInfo(vo);
	}
	
	
	
	@Transactional(readOnly = false)
    public int updateNexusSkillInfo(NexusSkillRequestInfo vo) {
		int ret = 0;
		if (vo.getMode().equals("Ins")) {
			ret = skillMapper.selectNexusSkillExistInfo(vo);
			if (ret > 0) 
				return  -1;
			ret = skillMapper.selectParentNexusSkillInfoDetail(vo);
			if (ret < 1) 
				return  -2;
			ret = skillMapper.insertNexusSkillInfo(vo);
		}else {
			ret =skillMapper.updateNexusSkillInfo(vo);
		}
		return ret;
	}
	@Transactional(readOnly = false)
    public int updateNexusSkillEmployeeInfo(NexusSkillEmployeeRequestInfoDto vo) {
		int ret = 0;
		if (vo.getMode().equals("Ins")) {
			
			ret = skillMapper.insertNexusSkillEmployeeInfo(vo);
		}else {
			ret =skillMapper.updateNexusSkillEmployeeInfo(vo);
		}
		return ret;
	}
	@Transactional(readOnly = false)
    public int deleteNexusSkillInfo(NexusSkillInfo vo) {
		return skillMapper.deleteNexusSkillInfo(vo);
	}
	@Transactional(readOnly = false)
    public int deleteNexusSkillEmployeeInfo(NexusSkillEmployeeInfo vo) {
		return skillMapper.deleteNexusSkillEmployeeInfo(vo);
	}
}
