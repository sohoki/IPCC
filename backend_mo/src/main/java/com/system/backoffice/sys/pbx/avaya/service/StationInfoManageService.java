package com.system.ipcc.pbx.avaya.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.system.ipcc.pbx.avaya.mapper.StationInfoManageMapper;
import com.system.ipcc.pbx.avaya.models.StationInfo;
import com.system.ipcc.pbx.avaya.models.dto.StationInfoReqDto;

import lombok.RequiredArgsConstructor;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class StationInfoManageService {

	private StationInfoManageMapper stationMapper;
	
	public List<Map<String, Object>> selectStationInfoPageList( Map<String, Object> params){
		return stationMapper.selectStationInfoPageList(params);
	}
	
	public Optional<StationInfo> selectStationInfoDetail(String extension){
		return stationMapper.selectStationInfoDetail(extension);
	}
	
	@Transactional(readOnly = false)
    public int updateStationInfo(StationInfoReqDto vo) {
    	return vo.getMode().equals("Ins") ? stationMapper.insertStationInfo(vo) : stationMapper.updateStationInfo(vo);
    }
	@Transactional(readOnly = false)
    public int updateStationConsultInfo(StationInfo vo) {
    	return stationMapper.updateStationConsultInfo(vo);
    }
	@Transactional(readOnly = false)
    public int deleteStationInfo(String extension) {
    	return stationMapper.deleteStationInfo(extension);
    }
}
