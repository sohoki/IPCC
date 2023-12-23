package com.system.backoffice.bas.icr.service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.system.backoffice.bas.icr.mapper.InsttCodeInfoManageMapper;
import com.system.backoffice.bas.icr.models.InsttCodeInfo;
import com.system.backoffice.bas.icr.models.InsttCodeRecptn;
import com.system.backoffice.bas.icr.models.dto.InsttCodeInfoReqDto;
import com.system.backoffice.bas.icr.models.dto.InsttCodeRecptnReqDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class InsttCodeInfoManageService {

	private final InsttCodeInfoManageMapper insttManageMapper;
	
	
	
	public Optional<InsttCodeInfo> selectInsttCodeDetail(String  insttCode){
		return insttManageMapper.selectInsttCodeDetail(insttCode);
	}
	
	public List<Map<String, Object>> selectInsttCodeComboList(Map<String, Object> searchVO){
		return insttManageMapper.selectInsttCodeComboList(searchVO);
	}
	
	public int insertInsttCodeRecptn(InsttCodeRecptn insttCodeRecptn) {
		return insttManageMapper.insertInsttCodeRecptn(insttCodeRecptn);
	}
	public int updateInsttCode(InsttCodeRecptnReqDto insttCodeRecptn) {
		int ret = 0;
		
		switch (insttCodeRecptn.getMode()) {
			case "Ins" : 
				
				
				Optional<InsttCodeInfo> insttcode = insttManageMapper.selectInsttCodeDetail(insttCodeRecptn.getInsttCode());
				if (insttcode.isEmpty()) {
					ret = insttManageMapper.insertInsttCode(insttCodeRecptn);
					if (ret < 1) {
						insttCodeRecptn.setProcessSe("11");
					}
				}else {
					insttCodeRecptn.setProcessSe("10");
				}
				
				break;
			case "Edt" : 
				ret = insttManageMapper.updateInsttCode(insttCodeRecptn);
				if (ret < 1) {
					
					insttCodeRecptn.setProcessSe("12");
				}
				break;
			case "Del" : 
				ret = insttManageMapper.deleteInsttCode(insttCodeRecptn.getInsttCode());
				insttCodeRecptn.setProcessSe("13");
				break;
		}
		
		insttManageMapper.updateInsttCodeRecptn(insttCodeRecptn);	
		return ret;
	}
	public int deleteInsttCode(InsttCodeRecptnReqDto insttCodeRecptn) {
		
		int ret = insttManageMapper.deleteInsttCode(insttCodeRecptn.getInsttCode());
		insttCodeRecptn.setProcessSe("13");
		insttManageMapper.updateInsttCodeRecptn(insttCodeRecptn);
		return ret;
	}
	public List<Map<String, Object>> selectInsttCodeRecptnList(Map<String, Object> searchVO){
		return insttManageMapper.selectInsttCodeRecptnList(searchVO);
	}
	public List<Map<String, Object>> selectInsttCodeList(Map<String, Object> searchVO) {
		return insttManageMapper.selectInsttCodeList(searchVO);
	}
}
