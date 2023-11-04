package com.system.backoffice.sym.voc.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.system.backoffice.sym.voc.mapper.VocInfoManageMapper;
import com.system.backoffice.sym.voc.models.VocInfo;
import com.system.backoffice.sym.voc.models.dto.VocInfoRequestDto;
import lombok.RequiredArgsConstructor;


@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class VocInfoManageService {

	
	private final VocInfoManageMapper vocMapper;
	
	
	public List<Map<String, Object>> selectVocInfoPageList(Map<String, Object> params){
		return vocMapper.selectVocInfoPageList(params);
	}
	
	public Optional<VocInfo> selectVocInfoDetail(String VocSeq){
		return vocMapper.selectVocInfoDetail(VocSeq);
	}
	@Transactional(readOnly = false)
    public int insertVocInfo(VocInfoRequestDto vo) {
    	return vocMapper.insertVocInfo(vo);
    }
	@Transactional(readOnly = false)
    public int updateVocInfo(VocInfoRequestDto vo) {
    	return vocMapper.updateVocInfo(vo);
    }
	@Transactional(readOnly = false)
    public int updateServerResponse(VocInfoRequestDto vo) {
    	return vocMapper.updateServerResponse(vo);
    }
	@Transactional(readOnly = false)
    public int updateServerReq(VocInfoRequestDto vo) {
    	return vocMapper.updateServerReq(vo);
    }
	@Transactional(readOnly = false)
    public int deleteVocInfo(String serverSeq) {
    	return vocMapper.deleteVocInfo(serverSeq);
    }
}
