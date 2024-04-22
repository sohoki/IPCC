package com.system.backoffice.bas.code.mapper;

import java.util.List;
import java.util.Map;

import org.egovframe.rte.psl.dataaccess.mapper.Mapper;
import org.apache.ibatis.annotations.Param;

import com.system.backoffice.bas.code.models.CmmnCode;
import com.system.backoffice.bas.code.models.dto.CmmnCodeDto;
import com.system.backoffice.bas.code.models.dto.CmmnCodeReqDto;

@Mapper
public interface EgovCmmnCodeManageMapper {

    public List<CmmnCodeDto> selectCmmnCodeListByPagination(@Param("params") Map<String, Object> params);
	
	public List<CmmnCodeDto> selectCmmnCodeList();
	
	public CmmnCodeDto selectCmmnCodeDetail(String codeId);
	
	public int insertCmmnCode(CmmnCodeReqDto vo);
	
	public int updateCmmnCode(CmmnCodeReqDto vo);
	
	public int deleteCmmnCode(String codeId, String systemCode);
}
