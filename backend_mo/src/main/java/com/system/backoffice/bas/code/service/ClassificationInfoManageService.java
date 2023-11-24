package com.system.backoffice.bas.code.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.system.backoffice.bas.code.mapper.ClassificationInfoManageMapper;
import com.system.backoffice.bas.code.models.ClassificationInfo;
import com.system.backoffice.bas.code.models.dto.ClassificationInfoReqDto;

import lombok.RequiredArgsConstructor;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class ClassificationInfoManageService {

	private final ClassificationInfoManageMapper classMapper;
	
	public List<Map<String, Object>> selectClassificationInfoListByPagination( Map<String, Object> vo){
		return classMapper.selectClassificationInfoListByPagination(vo);
	}
	
	public List<Map<String, Object>> selectClassificationInfoCombo(){
		return classMapper.selectClassificationInfoCombo();
	}
	
	public Optional<ClassificationInfo> selectClassificationInfoDetail(String cdId){
		return classMapper.selectClassificationInfoDetail(cdId);
	}
	
	public int updateClassificationInfo(ClassificationInfoReqDto vo) {
		return vo.getMode().equals("Ins") ? classMapper.insertClassificationInfo(vo): classMapper.updateClassificationInfo(vo);
	}
	
	public int deleteClassificationInfo(String cdId) {
		return classMapper.deleteClassificationInfo(cdId);
	}
}
