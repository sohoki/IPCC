package com.system.ipcc.cti.nexus.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.system.ipcc.cti.nexus.mapper.NexusEmployeeManageMapper;
import com.system.ipcc.cti.nexus.mapper.NexusManageMapper;
import com.system.ipcc.cti.nexus.models.NexusAgentInfo;
import com.system.ipcc.cti.nexus.models.dto.NexusAgentComboInfo;
import com.system.ipcc.cti.nexus.models.dto.NexusAgentInfoResponseDto;
import com.system.ipcc.cti.nexus.models.dto.NexusAgentRequestInfoDto;
import com.system.ipcc.pbx.avaya.service.smsxml.SMSReq;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Service
@Slf4j
public class NexusEmployeeManageService {

	
	private final NexusEmployeeManageMapper employMapper;
	private final NexusManageMapper nexusMapper;
	
	
	public List<Map<String, Object>> selectEmployeesInfoPageList( Map<String, Object> params){
		return employMapper.selectEmployeesInfoPageList(params);
	}
	
	public List<Map<String, Object>> selectCenterInfoCombo(){
		return nexusMapper.selectCenterInfoCombo();
	}
	
	public List<Map<String, Object>> selectTenantInfoCombo(String centerId){
		return nexusMapper.selectTenantInfoCombo(centerId);
	}
	
	public List<Map<String, Object>> selectGroupInfoCombo(Map<String, Object> params){
		return nexusMapper.selectGroupInfoCombo(params);
	}
	
	public List<Map<String, Object>> selectTeamsInfoCombo(Map<String, Object> params){
		return nexusMapper.selectTeamsInfoCombo(params);
	}
	
	public List<Map<String, Object>> selectDnMajroInfoCombo(Map<String, Object> params){
		return nexusMapper.selectDnMajroInfoCombo(params);
	}
	
	public List<Map<String, Object>> selectDnSubInfoCombo(Map<String, Object> params){
		return nexusMapper.selectDnSubInfoCombo(params);
	}
	
	public List<Map<String, Object>> selectDnInfoCombo(Map<String, Object> params){
		return nexusMapper.selectDnInfoCombo(params);
	}
	public List<Map<String, Object>> selectEmployeeCombo( Map<String, Object> params){
		return nexusMapper.selectEmployeeCombo(params);
	}
	public List<Map<String, Object>> selectEmployeeSkillCombo( Map<String, Object> params){
		return nexusMapper.selectEmployeeSkillCombo(params);
	}
	public List<Map<String, Object>> selectPermitCombo( Map<String, Object> params){
		return nexusMapper.selectPermitCombo(params);
	}
	
	public Optional<NexusAgentInfoResponseDto> selectEmployeesExistInfoDetail(NexusAgentInfo vo){
		return employMapper.selectEmployeesExistInfoDetail(vo);
	}
	public int updateNexusEmployeesInfo(NexusAgentRequestInfoDto vo) {
			int ret = 0;
			if (vo.getMode().equals("Ins")) {
				if (employMapper.selectNexusEmployeesExistsInfo(vo) > 0) {
					log.error("존재 확인 끝");
					return -1;
				}
					
				if (employMapper.selectParentNexusEmployeesInfo(vo) < 1) {
					log.error("상위 확인 끝");
					return -1;
				}
					
				if (employMapper.selectPermitExistsInfo(vo) < 1) {
					log.error("권한 확인 끝");
					return -1;
				}
					
				ret = employMapper.insertNexusEmployeesInfo(vo);
			}else {
				ret = employMapper.updateNexusEmployeesInfo(vo);
			}
			return ret;
	}
	public int checkNexusEmployeesInfo(NexusAgentRequestInfoDto vo) {
		int ret = 0;   	
		
		if (employMapper.selectNexusEmployeesExistsInfo(vo) > 0) {
			return -1;
		}
		if (employMapper.selectParentNexusEmployeesInfo(vo) < 1) {
			return -2;
		}
		if (employMapper.selectPermitExistsInfo(vo) < 1) {
			return -3;
		}
		
		return ret;
	}
	public List<NexusAgentComboInfo> selectEmployeesInfoComboList(String centerId){
		return employMapper.selectEmployeesInfoComboList(centerId);
	}
	public int deleteNexusEmployeesInfo(NexusAgentInfo vo) {
		int ret = employMapper.selectEmployeesExistInfoDetailCnt(vo);
		return (ret > 0) ?  employMapper.deleteNexusEmployeesInfo(vo) : 1;
	}
	public List<NexusAgentInfoResponseDto> selectEmployeesSearchList(NexusAgentInfo vo){
		return employMapper.selectEmployeesSearchList(vo);
	}
	
}
