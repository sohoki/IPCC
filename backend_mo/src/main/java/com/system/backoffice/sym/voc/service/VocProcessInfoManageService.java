package com.system.backoffice.sym.voc.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.system.backoffice.sym.voc.mapper.VocProcessFileInfoManageMapper;
import com.system.backoffice.sym.voc.mapper.VocProcessInfoManageMapper;
import com.system.backoffice.sym.voc.models.VocProcessInfo;
import com.system.backoffice.sym.voc.models.dto.VocProcessInfoReqDto;
import com.system.backoffice.sym.voc.models.dto.VocProcessInfoResDto;

import lombok.RequiredArgsConstructor;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class VocProcessInfoManageService {

	private final VocProcessInfoManageMapper vocMapper;
	
	private final VocProcessFileInfoManageMapper fileMapper;
	
	public List<Map<String, Object>> selectVocProcessPageList(Map<String, Object> params){
		return vocMapper.selectVocProcessPageList(params);
	}
	
	public Optional<VocProcessInfoResDto> selectVocProcessDetail(String VocProcessSeq){
		
		Optional<VocProcessInfoResDto>  vocprocess = vocMapper.selectVocProcessDetail(VocProcessSeq);
		List<Map<String, Object>> files = fileMapper.selectVocProcessFilePageList(VocProcessSeq);
		vocprocess.get().setVocFIles(files);
		return vocprocess;
	}
	public List<Map<String, Object>> selectVocProcessTotalList(String vocSeq){
		return vocMapper.selectVocProcessTotalList(vocSeq);
	}
	
	@Transactional(readOnly = false)
    public int updateVocProcess(VocProcessInfoReqDto vo) {
		//파일 업로드 
    	return vo.getMode().equals("Ins") ? vocMapper.insertVocProcess(vo) : vocMapper.updateVocProcess(vo);
    }
	@Transactional(readOnly = false)
    public int deleteVocProcess(String VocProcessSeq) {
		//파일 삭제 먼저 하고 난 이후 하기 
		List<Map<String, Object>> files = fileMapper.selectVocProcessFilePageList(VocProcessSeq);
		if (files.size() > 0) {
			
		}
		
    	return vocMapper.deleteVocProcess(VocProcessSeq);
    }
	 
}
