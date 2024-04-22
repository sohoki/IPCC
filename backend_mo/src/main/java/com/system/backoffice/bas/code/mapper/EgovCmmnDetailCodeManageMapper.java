package com.system.backoffice.bas.code.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

import com.system.backoffice.bas.code.models.CmmnDetailCode;
import com.system.backoffice.bas.code.models.dto.CmmnDetailCodeDto;

@Mapper
public interface EgovCmmnDetailCodeManageMapper {

    public List<CmmnDetailCodeDto> selectCmmnDetailCodeListByPagination(String codeId, String systemCode);
	
	public List<CmmnDetailCodeDto> selectCmmnDetailCombo (String code, String systemCode);
	
	public List<CmmnDetailCodeDto> selectCmmnDetailComboLamp (String code, String systemCode);
	
	public List<CmmnDetailCodeDto> selectCmmnDetailComboEtc(@Param("params") Map<String, Object> params);
	
	public CmmnDetailCodeDto selectCmmnDetailCodeDetail(String code, String systemCode);
	
	public CmmnDetailCodeDto selectCmmnDetail(String code, String systemCode);
	
	public List<CmmnDetailCodeDto> selectComboSwcCon();
		
	public int insertCmmnDetailCode(CmmnDetailCode vo);
	               
	public int updateCmmnDetailCode(CmmnDetailCode vo);
	
	public int deleteCmmnDetailCode(String code, String systemCode);
	
	public int deleteCmmnDetailCodeId(String value, String systemCode);
	
	public List<CmmnDetailCodeDto> selectCmmnDetailResTypeCombo (Map<String, Object> vo);
}
