package com.system.backoffice.bas.code.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.system.backoffice.bas.code.mapper.EgovCmmnCodeManageMapper;
import com.system.backoffice.bas.code.models.CmmnCode;
import com.system.backoffice.bas.code.models.dto.CmmnCodeDto;
import com.system.backoffice.bas.code.models.dto.CmmnCodeReqDto;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@RequiredArgsConstructor
@Service
public class EgovCcmCmmnCodeManageService {

	private final EgovCmmnCodeManageMapper cmmMapper;
	
	public List<CmmnCodeDto> selectCmmnCodeListByPagination(Map<String, Object> params){
		return cmmMapper.selectCmmnCodeListByPagination(params);
	}
	
	public List<CmmnCodeDto> selectCmmnCodeList(){
		return cmmMapper.selectCmmnCodeList();
	}
	
	public CmmnCodeDto selectCmmnCodeDetail(String codeId, String systemCode) {
		return cmmMapper.selectCmmnCodeDetail(codeId, systemCode);
	}
	
	@Transactional(readOnly = false)
	public int updateCmmnCode(CmmnCodeReqDto vo) {
		return vo.getMode().equals("Ins") ? cmmMapper.insertCmmnCode(vo) : cmmMapper.updateCmmnCode(vo);
	}
	@Transactional(readOnly = false)
	public int deleteCmmnCode(String codeId, String systemCode) {
		try {
			cmmMapper.deleteCmmnCode(codeId, systemCode);
			return 1;
		}catch(Exception e){
			log.error("deleteCmmnClCode service:" + e.toString());
			return 0;
		}
	}
}
