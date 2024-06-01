package com.system.backoffice.sys.pbx.avaya.mapper;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.ibatis.annotations.Param;
import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

import com.system.backoffice.sys.pbx.avaya.models.StationButtonInfo;
import com.system.backoffice.sys.pbx.avaya.models.StationInfo;
import com.system.backoffice.sys.pbx.avaya.models.dto.StationInfoReqDto;

@Mapper
public interface StationInfoManageMapper {
	
	public List<Map<String, Object>> selectStationInfoPageList(@Param("params") Map<String, Object> params);
	
	public List<StationButtonInfo> selectStationButtonList(String extension);
	
	public Optional<StationInfo> selectStationInfoDetail(String extension);
	
	public int insertStationInfoList(List<StationInfo> list);
	
	public int insertStationInfo(StationInfoReqDto vo);
		
	public int updateStationInfo(StationInfoReqDto vo);
	
	public int updateStationConsultInfo(StationInfo vo);
	
	public int deleteStationInfo(String extension);
}
