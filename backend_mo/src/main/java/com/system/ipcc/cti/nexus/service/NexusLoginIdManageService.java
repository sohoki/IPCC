package com.system.ipcc.cti.nexus.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import com.system.ipcc.cti.nexus.mapper.NexusLoginIdManageMapper;
import com.system.ipcc.cti.nexus.models.NexusLoginIdInfo;
import com.system.ipcc.cti.nexus.models.dto.NexusLoginIdInfoRequestDto;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Service
@Slf4j
public class NexusLoginIdManageService {

	
	private final NexusLoginIdManageMapper loginMapper;
	
	
	public List<Map<String, Object>>  selectLoginIdInfoPageList(@Param("params") Map<String, Object> params){
		return loginMapper.selectLoginIdInfoPageList(params);
	}
	
	public Optional<NexusLoginIdInfo> selectLoginIdDetailInfo(NexusLoginIdInfoRequestDto info){
		return loginMapper.selectLoginIdDetailInfo(info);
	}
	
	public int selectLoginIdExites(NexusLoginIdInfoRequestDto info) {
		return loginMapper.selectLoginIdExites(info);
	}
	public int insertLoginIdInfo (NexusLoginIdInfoRequestDto info) {
		if (info.getMode().equals("Ins")) {
			if (loginMapper.selectLoginIdExites(info) > 0) {
				return -1; //중복값 있음
			}else {
				if ( loginMapper.selectParentIdExites(info) > 0 ) {
					return loginMapper.insertLoginIdInfo(info);
				}else {
					return -2; //상위값 있음
				}
			}
		}else {
			return loginMapper.updateLoginIdInfo(info);
		}
		
	}
	public int updateLoginIdInfo(NexusLoginIdInfoRequestDto info) {
		return loginMapper.updateLoginIdInfo(info);
	}
	
	public int deleteLoginIdInfo(NexusLoginIdInfoRequestDto info) {
		Optional<NexusLoginIdInfo> loginInfo = loginMapper.selectLoginIdDetailInfo(info);
		if (loginInfo.isPresent()) {
			return loginMapper.deleteLoginIdInfo(info);
		}else {
			return -1; //값 없음
		}
				
	}
}
