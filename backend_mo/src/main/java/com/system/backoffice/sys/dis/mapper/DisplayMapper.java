package com.system.backoffice.sys.dis.mapper;

import java.util.List;
import java.util.Map;

import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

@Mapper
public interface DisplayMapper {

	public List<Map<String, Object>> selectDisplayAs();
}
