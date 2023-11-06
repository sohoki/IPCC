package com.system.backoffice.sym.voc.mapper;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.ibatis.annotations.Param;
import com.system.backoffice.sym.voc.models.dto.VocProcessInfoReqDto;
import com.system.backoffice.sym.voc.models.dto.VocProcessInfoResDto;

public interface VocProcessInfoManageMapper {

	public List<Map<String, Object>> selectVocProcessPageList(@Param("params") Map<String, Object> params);
	
	public Optional<VocProcessInfoResDto> selectVocProcessDetail(String VocProcessSeq);
	
    public int insertVocProcess(VocProcessInfoReqDto vo);
	
    public int updateVocProcess(VocProcessInfoReqDto vo);
    
    public int deleteVocProcess(String serverSeq);
}
