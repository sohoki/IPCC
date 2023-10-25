package com.system.backoffice.bas.uniCode.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.system.backoffice.bas.uniCode.mapper.UniSystemInfoManageMapper;
import com.system.backoffice.bas.uniCode.models.UniSystemInfo;
import com.system.backoffice.bas.uniCode.models.dto.UniSystemInfoRequestDto;

import lombok.RequiredArgsConstructor;



@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class UniSystemInfoMangeService {

	
	private UniSystemInfoManageMapper uniMapper;
	
	public List<Map<String, Object>> selectUniInfoPageList( Map<String, Object> params){
		return uniMapper.selectUniInfoPageList(params);
	}
	
	
    public int updateUniInfo(UniSystemInfoRequestDto vo) {
    	return vo.getMode().equals("Ins")  ? uniMapper.insertUniInfo(vo) : uniMapper.updateUniInfo(vo);
    }
    
    public int deleteUniInfo(String uniSeq) {
    	return uniMapper.deleteUniInfo(uniSeq);
    }

	public Optional<UniSystemInfo> selectUniInfoDetail(String uniSeq){
		return uniMapper.selectUniInfoDetail(uniSeq);
	}
}
