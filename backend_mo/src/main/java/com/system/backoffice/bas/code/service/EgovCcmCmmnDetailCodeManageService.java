package com.system.backoffice.bas.code.service;


import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.system.backoffice.bas.code.mapper.EgovCmmnDetailCodeManageMapper;
import com.system.backoffice.bas.code.models.CmmnDetailCode;
import com.system.backoffice.bas.code.models.dto.CmmnDetailCodeDto;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Service
public class EgovCcmCmmnDetailCodeManageService {

	private final EgovCmmnDetailCodeManageMapper detailMapper;
	
	public List<CmmnDetailCodeDto> selectCmmnDetailCodeListByPagination(String codeId, String systemCode){
		return detailMapper.selectCmmnDetailCodeListByPagination(codeId, systemCode );
	}
	
	public List<CmmnDetailCodeDto> selectCmmnDetailCodeList(String codeId, String systemCode){
		return detailMapper.selectCmmnDetailCodeListByPagination(codeId, systemCode);
	}
	
	
	public List<CmmnDetailCodeDto> selectCmmnDetailCombo (String code, String systemCode){
		return detailMapper.selectCmmnDetailCombo(code, systemCode);
	}
	
	public List<CmmnDetailCodeDto> selectCmmnDetailComboLamp (String code, String systemCode){
		return detailMapper.selectCmmnDetailComboLamp(code, systemCode);
	}
	
	public List<CmmnDetailCodeDto> selectCmmnDetailComboEtc( Map<String, Object> params){
		return detailMapper.selectCmmnDetailComboEtc(params);
	}
	
	public CmmnDetailCodeDto selectCmmnDetailCodeDetail(String code, String systemCode) {
		return  detailMapper.selectCmmnDetailCodeDetail(code, systemCode);
	}
	
	public CmmnDetailCodeDto selectCmmnDetail(String code, String systemCode){
		return detailMapper.selectCmmnDetail(code, systemCode);
	}
	@Transactional(readOnly = false)
	public int updateCmmnDetailCode(CmmnDetailCode vo) {
		return vo.getMode().equals("Ins") ? detailMapper.insertCmmnDetailCode(vo) : detailMapper.updateCmmnDetailCode(vo);
	}
	@Transactional(readOnly = false)
	public int deleteCmmnDetailCode(String code, String systemCode) {
		return detailMapper.deleteCmmnDetailCode(code, systemCode);
	}
	@Transactional(readOnly = false)
	public int deleteCmmnDetailCodeId(String value, String systemCode) {
		return detailMapper.deleteCmmnDetailCodeId(value, systemCode);
	}
	
	public List<CmmnDetailCodeDto> selectCmmnDetailResTypeCombo (Map<String, Object> vo){
		return detailMapper.selectCmmnDetailResTypeCombo(vo);
	}
}
