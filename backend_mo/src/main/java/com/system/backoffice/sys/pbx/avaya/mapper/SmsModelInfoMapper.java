package com.system.backoffice.sys.pbx.avaya.mapper;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.ibatis.annotations.Param;
import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

import com.system.backoffice.sys.pbx.avaya.models.SmsModelInfo;
import com.system.backoffice.sys.pbx.avaya.models.dto.SmsModeReqlInfoDto;


@Mapper
public interface SmsModelInfoMapper {

	
	public List<Map<String, Object>> selectSmsInfoPageList(@Param("params") Map<String, Object> params);
	
	public Optional<SmsModelInfo> selectSmsInfoDetail(String notiSeq);
	
    public int insertSmsInfo(SmsModeReqlInfoDto vo);
	
    public int updateSmsInfo(SmsModeReqlInfoDto vo);
   
    public int deleteSmsInfo(String notiSeq);
}
