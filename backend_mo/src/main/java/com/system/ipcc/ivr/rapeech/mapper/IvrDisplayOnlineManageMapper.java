package com.system.ipcc.ivr.rapeech.mapper;

import java.util.List;
import java.util.Map;
import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

@Mapper
public interface IvrDisplayOnlineManageMapper {

	public List<Map<String, Object>> selectIvrOnlineDisplayInfo();
}
