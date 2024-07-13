package com.system.ipcc.cti.nexus.mapper;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.ibatis.annotations.Param;
import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

import com.system.ipcc.cti.nexus.models.NexusDnInfo;
import com.system.ipcc.cti.nexus.models.dto.NexusDnInfoReqestDto;

@Mapper
public interface NexusDnManageMapper {

	public List<Map<String, Object>>  selectDnInfoPageList(@Param("params") Map<String, Object> params);
	
	public Optional<NexusDnInfo> selectDnDetailInfo(NexusDnInfoReqestDto info);
	
	public int selectDnExistslInfo(NexusDnInfoReqestDto info);
	
	public int selectDnParentIdExistslInfo(NexusDnInfoReqestDto info);
	
	public int selectSubMediaExistslInfo(NexusDnInfoReqestDto info);
	
	public int selectMultiDnExistslInfo(NexusDnInfoReqestDto info);
	
	public int selectMediaExistslInfo(NexusDnInfoReqestDto info);
	
	public int insertDnManagerMapper(NexusDnInfoReqestDto info);
	
	public int updateDnManagerMapper(NexusDnInfoReqestDto info );
	
	public int deleteDnManagerMapper(NexusDnInfoReqestDto info );
	
}
