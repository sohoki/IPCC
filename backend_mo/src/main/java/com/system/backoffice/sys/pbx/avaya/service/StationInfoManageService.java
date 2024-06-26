package com.system.backoffice.sys.pbx.avaya.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.system.backoffice.sys.pbx.avaya.mapper.StationInfoManageMapper;
import com.system.backoffice.sys.pbx.avaya.models.StationInfo;
import com.system.backoffice.sys.pbx.avaya.models.dto.StationInfoReqDto;

import lombok.RequiredArgsConstructor;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class StationInfoManageService {

	private final StationInfoManageMapper stationMapper;
	
	public List<Map<String, Object>> selectStationInfoPageList( Map<String, Object> params){
		return stationMapper.selectStationInfoPageList(params);
	}
	
	public Optional<StationInfo> selectStationInfoDetail(String extension){
		Optional<StationInfo> stationInfo = stationMapper.selectStationInfoDetail(extension);
		if (stationInfo.isPresent())
			stationInfo.get().setStationButton(stationMapper.selectStationButtonList(extension));
		return stationInfo;
	}
	@Transactional(readOnly = false)
	public int insertStationInfoList(List<StationInfo> extensionList) {
		return stationMapper.insertStationInfoList(extensionList);
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
