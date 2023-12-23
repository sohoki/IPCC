package com.system.backoffice.bas.menu.service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.system.backoffice.bas.menu.mapper.MenuCreateManageMapper;
import com.system.backoffice.bas.menu.models.MenuCreatInfo;
import com.system.backoffice.util.service.UtilInfoService;

import lombok.RequiredArgsConstructor;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class MenuCreateManageService {

	@Autowired
	private MenuCreateManageMapper createMapper;

	
	
	public List<Map<String, Object>> selectMenuCreatList(String authorCode) throws Exception {
		return createMapper.selectMenuCreatList_D(authorCode);
	}

	
	public List<Map<String, Object>> selectMenuCreatList_Author(String roleId, String systemCode) throws Exception {
		return createMapper.selectMenuCreatList_Author(roleId, systemCode);
	}
	
	
	public int selectMenuCreatManagTotCnt(MenuCreatInfo searchKeyword) throws Exception {
		return createMapper.selectMenuCreatCnt_S(searchKeyword);
	}

	
	public int selectUsrByPk(String empNo) throws Exception {
		return createMapper.selectUsrByPk(empNo);
	}

	
	public MenuCreatInfo selectAuthorByUsr(String empNo) throws Exception {
		return createMapper.selectAuthorByUsr(empNo);
	}

	
	public List<Map<String, Object>> selectMenuCreatManagList(Map<String, Object> searchVO) throws Exception {
		return createMapper.selectMenuCreatManageList_D(searchVO);
	}

	@Transactional(readOnly = false)
	public void insertMenuCreatList(String authorCode, String systemCode, String checkedMenuNoForInsert) throws Exception {
		int AuthorCnt = 0;
		checkedMenuNoForInsert = checkedMenuNoForInsert.contains(",0") == false ? checkedMenuNoForInsert = checkedMenuNoForInsert.concat(",0") : checkedMenuNoForInsert;
        List<String> insertMenuNo =  UtilInfoService.dotToList(checkedMenuNoForInsert).stream().distinct().collect(Collectors.toList());

		MenuCreatInfo menuCreatVO = new MenuCreatInfo();
		menuCreatVO.setRoleId(authorCode);
		menuCreatVO.setSystemCode(systemCode);
		AuthorCnt = createMapper.selectMenuCreatCnt_S(menuCreatVO);

		// 이전에 존재하는 권한코드에 대한 메뉴설정내역 삭제
		if (AuthorCnt > 0) {
			createMapper.deleteMenuCreat_S(menuCreatVO);
		}
		for (String menu : insertMenuNo) {
			menuCreatVO.setRoleId(authorCode);
			menuCreatVO.setMenuNo(menu);
			menuCreatVO.setSystemCode(systemCode);
			createMapper.insertMenuCreat_S(menuCreatVO);
		}
	}
	
	@Transactional(readOnly = false)
	public int deleteMenuCreat_S(String authorCode) throws Exception {
		MenuCreatInfo menuCreatVO = new MenuCreatInfo();
		menuCreatVO.setRoleId(authorCode);
		return createMapper.deleteMenuCreat_S(menuCreatVO);
	}
}
