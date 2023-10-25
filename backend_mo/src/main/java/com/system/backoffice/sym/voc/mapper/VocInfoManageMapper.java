package com.system.backoffice.sym.voc.mapper;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.ibatis.annotations.Param;
import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

import com.system.backoffice.sym.voc.models.VocInfo;
import com.system.backoffice.sym.voc.models.dto.VocInfoRequestDto;

@Mapper
public interface VocInfoManageMapper {

	public List<Map<String, Object>> selectVocInfoPageList(@Param("params") Map<String, Object> params);
	
	public Optional<VocInfo> selectVocInfoDetail(String VocSeq);
	
    public int insertVocInfo(VocInfoRequestDto vo);
	
    public int updateVocInfo(VocInfoRequestDto vo);
    
    public int updateServerResponse(VocInfoRequestDto vo);
    
    public int updateServerReq(VocInfoRequestDto vo);
    
    public int deleteVocInfo(String serverSeq);
}
