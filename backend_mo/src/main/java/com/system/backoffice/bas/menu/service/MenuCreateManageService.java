package com.system.backoffice.bas.menu.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.system.backoffice.bas.menu.mapper.MenuCreateManageMapper;
import com.system.backoffice.bas.menu.models.MenuCreatInfo;
import com.system.backoffice.bas.menu.web.MenuInfoManageController;
import com.system.backoffice.util.service.RedisUtil;
import com.system.backoffice.util.service.UtilInfoService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Slf4j
@Service
public class MenuCreateManageService {

	private final MenuCreateManageMapper createMapper;

	//private final RedisTemplate<String, String> redisTemplate;
	
	private final RedisUtil redis;
	
	
	public List<Map<String, Object>> selectMenuCreatList(final String authorCode) throws Exception {
		return createMapper.selectMenuCreatList_D(authorCode);
	}

	
	public List<Map<String, Object>> selectMenuCreatList_Author(String roleId, String systemCode, String hidMenuGubun) throws Exception {
		return createMapper.selectMenuCreatList_Author(roleId, systemCode, hidMenuGubun);
	}
	
	
	public int selectMenuCreatManagTotCnt(MenuCreatInfo searchKeyword) throws Exception {
		return createMapper.selectMenuCreatCnt_S(searchKeyword);
	}

	
	public int selectUsrByPk(final String empNo) throws Exception {
		return createMapper.selectUsrByPk(empNo);
	}

	
	public MenuCreatInfo selectAuthorByUsr(String empNo) throws Exception {
		return createMapper.selectAuthorByUsr(empNo);
	}

	
	public List<Map<String, Object>> selectMenuCreatManagList(Map<String, Object> searchVO) throws Exception {
		return createMapper.selectMenuCreatManageList_D(searchVO);
	}

	@Transactional(readOnly = false)
	public int insertMenuCreatList(String authorCode, String systemCode, String userId, 
									String checkedMenuNoForInsert, String hid_menuGubun, List<Map<String, Object>> menuList) throws Exception {
		try {
			int AuthorCnt = 0;
			
			MenuCreatInfo menuCreatVO = new MenuCreatInfo();
			menuCreatVO.setRoleId(authorCode);
			menuCreatVO.setSystemCode(systemCode);
			
			AuthorCnt = createMapper.selectMenuCreatCnt_S(menuCreatVO);
			if (AuthorCnt > 0) {
				createMapper.deleteMenuCreat_S(menuCreatVO);
			}
			if (hid_menuGubun.equals("MENU_GUBUN_1")) {
				
				checkedMenuNoForInsert = checkedMenuNoForInsert.contains(",0") == false ? checkedMenuNoForInsert = checkedMenuNoForInsert.concat(",0") : checkedMenuNoForInsert;
				List<String> insertMenuNo =  UtilInfoService.dotToList(checkedMenuNoForInsert).stream().distinct().collect(Collectors.toList());			
				
				for (String menu : insertMenuNo) {
					menuCreatVO.setRoleId(authorCode);
					menuCreatVO.setMenuNo(menu);
					menuCreatVO.setSystemCode(systemCode);
					menuCreatVO.setUserId(userId);
					createMapper.insertMenuCreat_S(menuCreatVO);
				}
			}else {
				for (Map<String, Object> menuBasic: menuList) {
					menuCreatVO.setRoleId(authorCode);
					menuCreatVO.setMenuNo(menuBasic.get("id").toString());
					menuCreatVO.setMenuBasicInfo(menuBasic.get("basicMenu").toString());
					menuCreatVO.setSystemCode(systemCode);
					menuCreatVO.setUserId(userId);
					createMapper.insertMenuCreat_S(menuCreatVO);
				}
			}
			//메뉴가 변경 되었을시 Redis Cache 데이터 삭제 
			Map<String, Object> searchCmd = new HashMap<String, Object>();
			searchCmd.put("roleId", authorCode);
			searchCmd.put("systemCode", systemCode);
			
			for (Map<String, Object> cache: createMapper.selectMenuCacheList(searchCmd)) {
				String key = "findLeftMenu::"+cache.get("adminId")+","+cache.get("url")+"";
				log.debug("key:" +key);
				if (redis.isKeyNullCheck(key)== true)
					redis.keyDelete(key);
			}
			
			//
			return 1;
		}catch(Exception e) {
			log.error("insertMenuCreatList error:" + e.toString());
			return -1;
		}
		
		
		
	}
	
	@Transactional(readOnly = false)
	public int deleteMenuCreat_S(String authorCode) throws Exception {
		try {
			MenuCreatInfo menuCreatVO = new MenuCreatInfo();
			menuCreatVO.setRoleId(authorCode);
			int ret = createMapper.deleteMenuCreat_S(menuCreatVO);
			
			if (ret > 0) {
				//메뉴가 삭제 되었을시 Redis Cache 데이터 삭제 
				Map<String, Object> searchCmd = new HashMap<String, Object>();
				searchCmd.put("roleId", authorCode);
				//여기 부분 수정 필요함 추후 전체 system 부분 정리 필요 
				searchCmd.put("systemCode", "IPCC");
				for (Map<String, Object> cache: createMapper.selectMenuCacheList(searchCmd)) {
					String key = "findLeftMenu::"+cache.get("adminId")+","+cache.get("url")+"";
					log.debug("key:" +key);
					if (redis.isKeyNullCheck(key)== true)
						redis.keyDelete(key);
				}
				//
			}
			return 1;
		}catch (Exception e) {
			log.error("insertMenuCreatList error:" + e.toString());
			return -1;
		}
	}
}
