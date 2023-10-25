package com.system.backoffice.uat.uia.service;


import com.system.backoffice.uat.uia.models.UniUtilInfo;


public interface UniUtilManageService {

    int selectIdDoubleCheck(UniUtilInfo vo)throws Exception;
    
    int selectIdDoubleCheckString(String _field, String _tableNm, String _condition)throws Exception;
	
	int deleteUniStatement(UniUtilInfo vo) throws Exception;
	
	String selectMaxValue(UniUtilInfo vo) throws Exception;
}

