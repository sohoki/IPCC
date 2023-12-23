package com.system.backoffice.bas.icr.mapper;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.ibatis.annotations.Param;
import org.egovframe.rte.psl.dataaccess.mapper.Mapper;

import com.system.backoffice.bas.icr.models.InsttCodeInfo;
import com.system.backoffice.bas.icr.models.InsttCodeRecptn;
import com.system.backoffice.bas.icr.models.dto.InsttCodeInfoReqDto;
import com.system.backoffice.bas.icr.models.dto.InsttCodeRecptnReqDto;

@Mapper
public interface InsttCodeInfoManageMapper {

	/**
	 * 기관코드수신을 처리한다.
	 * @param insttCode
	 * @throws Exception
	 */
	
	public int insertInsttCodeRecptn(InsttCodeRecptn insttCodeRecptn);
	/**
	 * 기관코드를 등록한다.
	 * @param insttCode
	 * @throws Exception
	 */
	public int insertInsttCode(InsttCodeRecptnReqDto insttCodeRecptn) ; 

	/**
	 * 기관코드를 수정한다.
	 * @param insttCode
	 * @throws Exception
	 */
	public int updateInsttCode(InsttCodeRecptnReqDto insttCodeRecptn);

	/**
	 * 기관코드를 삭제한다.
	 * @param insttCode
	 * @throws Exception
	 */
	
	//public int updateInsttCodeRecptn()
	/*
	public void deleteInsttCode(InsttCodeRecptn insttCodeRecptn) throws Exception {
		int rtnValue = update("InsttCodeRecptnDAO.deleteInsttCode", insttCodeRecptn);
        if (rtnValue != 1) {
        	// 삭제 오류
        	insttCodeRecptn.setProcessSe("13");
        }
    	update("InsttCodeRecptnDAO.updateInsttCodeRecptn", insttCodeRecptn);
	}
	*/
	
	public int updateInsttCodeRecptn(InsttCodeRecptnReqDto insttCodeRecptn);
	
	
	/**
	 * 기관코드 상세내역을 조회한다.
	 * @param insttCode
	 * @return InsttCode(기관코드)
	 */
	public Optional<InsttCodeInfo> selectInsttCodeDetail(String  insttCode);


	
	public List<Map<String, Object>> selectInsttCodeComboList(@Param("params") Map<String, Object> searchVO);
    /**
	 * 기관코드수신 목록을 조회한다.
     * @param searchVO
     * @return List(기관코드 목록)
     * @throws Exception
     */
    public List<Map<String, Object>> selectInsttCodeRecptnList(Map<String, Object> searchVO);

   
    /**
	 * 기관코드 목록을 조회한다.
     * @param searchVO
     * @return List(기관코드 목록)
     * @throws Exception
     */
    public List<Map<String, Object>> selectInsttCodeList(Map<String, Object> searchVO) ;
    
    /**
   	 * 기관코드 목록을 삭제한다.
     * @param insttCode
	 * @return InsttCode(기관코드)
     * @throws Exception
     */
    public int deleteInsttCode(String  insttCode);
}
