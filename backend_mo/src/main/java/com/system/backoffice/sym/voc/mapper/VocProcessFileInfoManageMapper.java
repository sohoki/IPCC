package com.system.backoffice.sym.voc.mapper;

import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import org.egovframe.rte.psl.dataaccess.mapper.Mapper;
import com.system.backoffice.sym.voc.models.VocProcessFileInfo;


@Mapper
public interface VocProcessFileInfoManageMapper {

	public List<Map<String, Object>> selectVocProcessFilePageList(String VocProcessSeq);
	
    public int insertVocProcessFile(List<VocProcessFileInfo> list);
	
    public int deleteVocProcessFile(String serverSeq);
}
