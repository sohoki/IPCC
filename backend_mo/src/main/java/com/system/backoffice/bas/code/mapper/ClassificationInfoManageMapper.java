package com.system.backoffice.bas.code.mapper;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.ibatis.annotations.Param;
import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

import com.system.backoffice.bas.code.models.ClassificationInfo;
import com.system.backoffice.bas.code.models.dto.ClassificationInfoReqDto;


@Mapper
public interface ClassificationInfoManageMapper {

    public List<Map<String, Object>> selectClassificationInfoListByPagination(@Param("params") Map<String, Object> vo);
	
	public List<Map<String, Object>> selectClassificationInfoCombo();
	
	public Optional<ClassificationInfo> selectClassificationInfoDetail(String cdId);
	
	public int insertClassificationInfo(ClassificationInfoReqDto vo);
	
	public int updateClassificationInfo(ClassificationInfoReqDto vo);
	
	public int deleteClassificationInfo(String cdId);
}
