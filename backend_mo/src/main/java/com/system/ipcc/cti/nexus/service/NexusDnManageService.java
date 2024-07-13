package com.system.ipcc.cti.nexus.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.system.ipcc.cti.nexus.mapper.NexusDnManageMapper;
import com.system.ipcc.cti.nexus.models.NexusDnInfo;
import com.system.ipcc.cti.nexus.models.dto.NexusDnInfoReqestDto;

import egovframework.com.cmm.service.Globals;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RequiredArgsConstructor
@Service
@Slf4j
public class NexusDnManageService {

	private final NexusDnManageMapper dnManagerMapper;
	
	
	public List<Map<String, Object>>  selectDnInfoPageList(@Param("params") Map<String, Object> params){
		return dnManagerMapper.selectDnInfoPageList(params);
	}
	
	public Optional<NexusDnInfo> selectDnDetailInfo(NexusDnInfoReqestDto info){
		return dnManagerMapper.selectDnDetailInfo(info);
	}
	public int selectDnExistslInfo(NexusDnInfoReqestDto info){
		return dnManagerMapper.selectDnExistslInfo(info);
	}
	
	public int updateDnManagerMapper(NexusDnInfoReqestDto info) {
		if (info.getMode().equals(Globals.SAVE_MODE_INSERT)) {
			int ret =  dnManagerMapper.selectDnExistslInfo(info);
			if (ret > 0) {
				return -1 ; //중복 있음
			}else {
				if ( dnManagerMapper.selectDnParentIdExistslInfo(info) > 0) {
					/*
					if (dnManagerMapper.selectSubMediaExistslInfo(info) > 0) {
						return dnManagerMapper.insertDnManagerMapper(info);
					}else {
						return -3 ; //하위 자원 없음
					}
					*/
					return dnManagerMapper.insertDnManagerMapper(info);
				}else {
					return -2 ; //상위 자원 없음
				}
			}
		}else {
			Optional<NexusDnInfo> result = dnManagerMapper.selectDnDetailInfo(info);
			if (result.isPresent()) {
				if ( dnManagerMapper.selectDnParentIdExistslInfo(info) > 0) {
					/*
					if (dnManagerMapper.selectSubMediaExistslInfo(info) > 0) {
						return dnManagerMapper.updateDnManagerMapper(info);
					}else {
						return -3 ; //하위 자원 없음
					}
					*/
					return dnManagerMapper.updateDnManagerMapper(info);
				}else {
					return -2 ; //상위 자원 없음
				}
			}else {
				return -4; //dn값 없음
			}
		}
		
	}
	public int deleteDnManagerMapper(NexusDnInfoReqestDto info ) {
		Optional<NexusDnInfo> result = dnManagerMapper.selectDnDetailInfo(info);
		if (result.isPresent()) {
			if (dnManagerMapper.selectSubMediaExistslInfo(info)> 0) {
				return -5; //subDn값 없음
			}else {
				return dnManagerMapper.deleteDnManagerMapper(info);
			}
		}else {
			return -4; //dn값 없음
		}
	}
}
