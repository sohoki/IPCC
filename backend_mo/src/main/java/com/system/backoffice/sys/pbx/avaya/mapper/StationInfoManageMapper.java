package com.system.backoffice.sys.pbx.avaya.mapper;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.ibatis.annotations.Param;
import org.egovframe.rte.psl.dataaccess.mapper.Mapper;
import com.system.backoffice.sys.pbx.avaya.models.StationInfo;
import com.system.backoffice.sys.pbx.avaya.models.dto.StationInfoReqDto;

@Mapper
public interface StationInfoManageMapper {
	
	public List<Map<String, Object>> selectStationInfoPageList(@Param("params") Map<String, Object> params);
	
	public Optional<StationInfo> selectStationInfoDetail(String extension);
	
    public int insertStationInfo(StationInfoReqDto vo);
	
    public int updateStationInfo(StationInfoReqDto vo);
    
    public int updateStationConsultInfo(StationInfo vo);
    
    public int deleteStationInfo(String extension);
}
