package com.system.backoffice.bas.menu.web;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.egovframe.rte.fdl.property.EgovPropertyService;
import org.egovframe.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

import com.system.backoffice.bas.menu.models.MenuInfo;
import com.system.backoffice.bas.menu.models.dto.MenuInfoRequestDto;
import com.system.backoffice.bas.menu.service.MenuCreateManageService;
import com.system.backoffice.bas.menu.service.MenuInfoManageService;
import com.system.backoffice.sym.log.annotation.NoLogging;
import com.system.backoffice.uat.uia.service.UniUtilManageService;
import com.system.backoffice.util.service.UtilInfoService;

import egovframework.com.cmm.EgovMessageSource;
import egovframework.com.cmm.service.Globals;
import egovframework.com.cmm.service.ResultVO;
import egovframework.com.jwt.config.JwtVerification;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import java.util.Iterator;
import java.util.Map.Entry;

@Slf4j
@RestController
@RequestMapping("/api/backoffice/sys/menu")
public class MenuInfoManageController {

	/** EgovPropertyService */
	@Resource(name = "propertiesService")
	protected EgovPropertyService propertiesService;
	
	@Autowired
	private MenuInfoManageService menuService;
	
	@Autowired
	private MenuCreateManageService menuCreateService;
	
    @Autowired
    private UniUtilManageService uniMangeServiec;

	@Resource(name = "egovMessageSource")
	EgovMessageSource egovMessageSource;
	
	/** JwtVerification */
	@Autowired
	private JwtVerification jwtVerification;
	
	/**
	 * 메뉴 목록 조회
	 * @param searchVO
	 * @return
	 * @throws Exception
	 */
	@PostMapping("menuListAjax.do")
	public ModelAndView selectMenuInfoListAjax(@RequestBody Map<String, Object> searchVO,
			 									HttpServletRequest request) throws Exception {
		
		ModelAndView model = new ModelAndView (Globals.JSON_VIEW);
		try {
			
			// 기존 세션 체크 인증에서 토큰 방식으로 변경
        	if (!jwtVerification.isVerificationAdmin(request)) {

        		ResultVO resultVO = new ResultVO();
    			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
        	}
        	
        	
			int pageUnit = searchVO.get("pageUnit") == null ?  propertiesService.getInt("pageUnit")
					: Integer.valueOf((String) searchVO.get("pageUnit"));
		  
	   	    PaginationInfo paginationInfo = new PaginationInfo();
		    paginationInfo.setCurrentPageNo( Integer.parseInt(UtilInfoService.NVL(searchVO.get("pageIndex"),"1")));
		    paginationInfo.setRecordCountPerPage(pageUnit);
		    paginationInfo.setPageSize(propertiesService.getInt("pageSize"));

		    searchVO.put("firstIndex", paginationInfo.getFirstRecordIndex());
		    searchVO.put("lastRecordIndex", paginationInfo.getLastRecordIndex());
		    searchVO.put("recordCountPerPage", paginationInfo.getRecordCountPerPage());
		    List<Map<String, Object>> menuList = menuService.selectMenuManageList(searchVO);
		    int totCnt =  menuList.size() > 0 ? Integer.valueOf(menuList.get(0).get("total_record_count").toString()) : 0;
			paginationInfo.setTotalRecordCount(totCnt);

			model.addObject(Globals.STATUS_REGINFO, searchVO);
			model.addObject(Globals.JSON_RETURN_RESULT_LIST, menuList);
		    model.addObject(Globals.PAGE_TOTAL_COUNT, totCnt);
		    model.addObject(Globals.JSON_PAGEINFO, paginationInfo);
		    model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
		}catch(Exception e){
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, e.toString());
		}
		
	    
		return model;
	}
	
	/**
	 * 메뉴 상세 조회
	 * @param menuNo
	 * @return
	 * @throws Exception
	 */
	@GetMapping("{menuNo}.do")
	public ModelAndView selectMenuDetailInfo(@PathVariable String  menuNo,
											 HttpServletRequest request) throws Exception {
		
		// 기존 세션 체크 인증에서 토큰 방식으로 변경
    	if (!jwtVerification.isVerificationAdmin(request)) {

    		ResultVO resultVO = new ResultVO();
			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
    	}
    	
    	
		ModelAndView model = new ModelAndView (Globals.JSON_VIEW);
		
		model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
		model.addObject(Globals.JSON_RETURN_RESULT, menuService.selectMenuManage(menuNo));
		
		return model;
	}
	@NoLogging
	@GetMapping("menuNoLeft.do")
	public ModelAndView selectMenuLeftInfo( HttpServletRequest request) throws Exception {
		
		// 기존 세션 체크 인증에서 토큰 방식으로 변경
    	if (!jwtVerification.isVerificationAdmin(request)) {
    		System.out.println("jwtVerification  isVerificationAdmin");
    		ResultVO resultVO = new ResultVO();
			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
    	}else {
    		
    		
    		
    		ModelAndView model = new ModelAndView (Globals.JSON_VIEW);
    		model.addObject(Globals.ADMIN_INFO, jwtVerification.getTokenUserName(request));
    		model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
    		model.addObject(Globals.JSON_RETURN_RESULT, menuService.selectMainMenuLeft(jwtVerification.getTokenUserName(request)));
    		
    		return model;
    	}
    	
	}
	
	/**
	 * 메뉴 저장
	 * @param menuInfo
	 * @return
	 * @throws Exception
	 */
	@PostMapping("menuUpdate.do")
	public ModelAndView updateMenuInfoManage(@Valid @RequestBody MenuInfoRequestDto info,
											HttpServletRequest request) throws Exception {
		ModelAndView model = new ModelAndView (Globals.JSON_VIEW);
		
		
		if (!jwtVerification.isVerificationAdmin(request)) {
    		ResultVO resultVO = new ResultVO();
			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
    	}else {
    		info.setUserId(jwtVerification.getTokenUserName(request));
    	}
		int ret = menuService.updateMenuManage(info);

		String messageKey = "";
		if (ret > 0) {
			model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
			messageKey = StringUtils.equals(info.getMode(), Globals.SAVE_MODE_INSERT) 
					? "sucess.common.insert" : "sucess.common.update";
		}
		else {
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			messageKey = StringUtils.equals(info.getMode(), Globals.SAVE_MODE_INSERT) 
					? "fail.common.insert" : "fail.common.update";
		}
		model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage(messageKey));
		
		return model;
	}

	/**
	 * 메뉴 삭제
	 * @param menuInfo
	 * @return
	 * @throws Exception
	 */
	
	@DeleteMapping("{menuNo}.do")
	public ModelAndView deleteMenInfoManage(@PathVariable String  menuNo,
											HttpServletRequest request) throws Exception {
		ModelAndView model = new ModelAndView (Globals.JSON_VIEW);
		
		// 화면에서 자식메뉴 체크 하므로 불필요
//		if (menuService.selectUpperMenuNoByPk(menuNo) != 0) {
//			model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.common.delete.upperMenuExist"));
//			model.addObject(Globals.STATUS,  Globals.STATUS_FAIL);
//			return model;
//		}
		if (!jwtVerification.isVerificationAdmin(request)) {

    		ResultVO resultVO = new ResultVO();
			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
    	}
    	
		int ret = menuService.deleteMenuManage(menuNo);
		if (ret > 0) {
			model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("success.common.delete"));
			model.addObject(Globals.STATUS,  Globals.STATUS_SUCCESS);
		}else {
			model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.common.delete"));
			model.addObject(Globals.STATUS,  Globals.STATUS_FAIL);
		}

		return model;
	}

	/**
	 * 메뉴 아이디 중복 체크
	 * @param menuNo
	 * @return
	 * @throws Exception
	 */
	@NoLogging
	@GetMapping("menuCheck/{menuNo}.do")
	public ModelAndView menuNoCheck(@PathVariable String menuNo) throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		
		int ret = uniMangeServiec.selectIdDoubleCheckString("MENU_NO", "COMTNMENUINFO", "MENU_NO = [" + menuNo + "[");
		if (ret == 0) {
			model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
			model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("common.codeOk.msg"));
		}
		else {
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("common.codeFail.msg"));
		}

		return model;
	}

	/**
	 * 메뉴목록 멀티 삭제한다.
	 * @param checkedMenuNoForDel  String
	 * @return 출력페이지정보 "forward:/sym/mnu/mpm/EgovMenuManageSelect.do"
	 * @exception Exception
	 */
	@GetMapping("menuManageListDelete.do")
	public ModelAndView deleteMenuManageList(@RequestParam("checkedMenuNoForDel") String checkedMenuNoForDel, 
			                                 HttpServletRequest request)throws Exception {
		
		ModelAndView model = new ModelAndView (Globals.JSON_VIEW);
		// 0. Spring Security 사용자권한 처리
		
		
		
		try {
			
			if (!jwtVerification.isVerificationAdmin(request)) {

	    		ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확인
	    	}
	    	
			int ret = menuService.deleteMenuManageList(checkedMenuNoForDel);
			
			if (ret == -1) {
			model.addObject(Globals.STATUS_MESSAGE, "참조되는 메뉴가 있어 삭제가 실패하였습니다.");
			model.addObject(Globals.STATUS,  Globals.STATUS_FAIL);
			} else if (ret == 0 ) {
			model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.common.delete"));
			model.addObject(Globals.STATUS,  Globals.STATUS_FAIL);
		
			} else {
			menuService.deleteMenuManageList(checkedMenuNoForDel);
			model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("success.common.delete"));
			model.addObject(Globals.STATUS,  Globals.STATUS_SUCCESS);
			}
		}catch(Exception e) {
			log.info(e.toString());
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.common.delete"));	
		}
		return model;
	}

	/**
	 * 메뉴정보를 등록화면으로 이동 및 등록 한다.
	 * @param commandMap
	 * @param menuIno
	 * @param bindingResult
	 * @return
	 * @throws Exception
	 */
	@PostMapping("menuRegistUpdate.do")
	public ModelAndView insertMenuManage(@RequestParam Map<String, Object> commandMap, 
			                             @RequestBody MenuInfoRequestDto menuIno, 
			                             HttpServletRequest request) throws Exception {
		
		ModelAndView model = new ModelAndView (Globals.JSON_VIEW);
		
		// 0. Spring Security 사용자권한 처리
		if (!jwtVerification.isVerificationAdmin(request)) {
    		ResultVO resultVO = new ResultVO();
			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
    	}else {
    		menuIno.setUserId(jwtVerification.getTokenUserName(request));
    	}
			
		if (menuService.selectMenuNoByPk(menuIno.getMenuNo()) != 0 && menuIno.getMode().equals(Globals.SAVE_MODE_INSERT)) {
			model.addObject(Globals.STATUS,  Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("common.isExist.msg"));
			return model;
		}
	    int ret = menuService.updateMenuManage(menuIno);
	    String message = "";
	    String states = "";
	    
	    if (ret > 0) {
	    	message = menuIno.getMode().equals(Globals.SAVE_MODE_INSERT) ? egovMessageSource.getMessage("success.common.insert") : egovMessageSource.getMessage("success.common.update");
	    	states =  Globals.STATUS_SUCCESS;
	    }else {
	    	message = menuIno.getMode().equals(Globals.SAVE_MODE_INSERT) ? egovMessageSource.getMessage("fail.common.insert") : egovMessageSource.getMessage("fail.common.update");
	    	states =  Globals.STATUS_FAIL;
	    }
	    model.addObject(Globals.STATUS, states);
		model.addObject(Globals.STATUS_MESSAGE, message);
	    
		return model;
	}

	/*### 일괄처리 프로세스 ###*/

	/**
	 * 메뉴생성 일괄삭제프로세스
	 * @param menuInfo
	 * @param mmp
	 * @return
	 * @throws Exception
	 */
	@DeleteMapping("menuBndeAllDelete.do")
	public ModelAndView menuBndeAllDelete(HttpServletRequest request) throws Exception {
		
		ModelAndView model = new ModelAndView (Globals.JSON_VIEW);
		// 0. Spring Security 사용자권한 처리
		try {
			if (!jwtVerification.isVerificationAdmin(request)) {
	    		ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확인
	    	}
			
			
			menuService.menuBndeAllDelete();
			model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("success.common.delete"));
			model.addObject(Globals.STATUS,  Globals.STATUS_SUCCESS);
		}catch(Exception e) {
			model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.common.delete"));
			model.addObject(Globals.STATUS,  Globals.STATUS_FAIL);
		}
		return model;
	}

	/**
	 * 메뉴일괄등록화면 호출 및  메뉴일괄등록처리 프로세스
	 * @param commandMap
	 * @param request
	 * @param menuInfo
	 * @param mmp
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "menuBndeRegist.do")
	public ModelAndView menuBndeRegist(@RequestParam Map<String, Object> commandMap, 
			                     final HttpServletRequest request, 
			                     @ModelAttribute("MenuInfo") MenuInfo menuInfo,
			                     ModelMap mmp) throws Exception {
		
		
		
		ModelAndView model = new ModelAndView (Globals.JSON_VIEW);
		
//		String sLocationUrl = null;
//		String resultMsg = "";
		String sMessage = "";
		String status = "";
		
		// 0. Spring Security 사용자권한 처리
		
		
		final MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
		final Map<String, MultipartFile> files = multiRequest.getFileMap();
		Iterator<Entry<String, MultipartFile>> itr = files.entrySet().iterator();
		MultipartFile file = null;
		InputStream fis = null;
		while (itr.hasNext()) {
			Entry<String, MultipartFile> entry = itr.next();
			try {
				file = entry.getValue();
				fis = file.getInputStream();
				if (!"".equals(file.getOriginalFilename())) {
					// 2011.10.07 업로드 파일에 대한 확장자를 체크
					if (file.getOriginalFilename().toLowerCase().endsWith(".xls") || file.getOriginalFilename().toLowerCase().endsWith(".xlsx")) {
						if (menuService.menuBndeAllDelete()) {
							sMessage = menuService.menuBndeRegist(menuInfo, fis);
//							resultMsg = sMessage;
						} else {
							
							sMessage = "EgovMenuBndeRegist Error!!";
							status = Globals.STATUS_FAIL;
							
						}
					} else {
						
						sMessage = "xls, xlsx 파일 타입만 등록이 가능합니다.";
						status = Globals.STATUS_FAIL;
						
					}
					// *********** 끝 ***********

				} else {
					sMessage = egovMessageSource.getMessage("fail.common.msg");
				}

			} finally {
				try {
					if (fis != null) {
						fis.close();
					}
				} catch (IOException ee) {
					log.debug("{}", ee);
				}
			}

		}
		model.addObject(Globals.STATUS_MESSAGE, sMessage);
		model.addObject(Globals.STATUS,  status);
		return model;
	}
	
	
	@PostMapping("menuCreateListAjax.do")
	public ModelAndView selectAuthInfoListAjax(	@RequestBody Map<String, Object> searchVO, 
												HttpServletRequest request) throws Exception {
		
		ModelAndView model = new ModelAndView (Globals.JSON_VIEW);
		
		try {
			
			if (!jwtVerification.isVerificationAdmin(request)) {
	    		ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확인
	    	}
			
			
			
			int pageUnit = searchVO.get("pageUnit") == null ?  propertiesService.getInt("pageUnit") : Integer.valueOf((String) searchVO.get("pageUnit"));
			  
		    searchVO.put("pageSize", propertiesService.getInt("pageSize"));
		  
		    log.info("pageUnit:" + pageUnit);
		  
	   	    PaginationInfo paginationInfo = new PaginationInfo();
		    paginationInfo.setCurrentPageNo( Integer.parseInt(UtilInfoService.NVL(searchVO.get("pageIndex"),"1")));
		    paginationInfo.setRecordCountPerPage(pageUnit);
		    paginationInfo.setPageSize(propertiesService.getInt("pageSize"));

		    searchVO.put("firstIndex", paginationInfo.getFirstRecordIndex());
		    searchVO.put("lastRecordIndex", paginationInfo.getLastRecordIndex());
		    searchVO.put("recordCountPerPage", paginationInfo.getRecordCountPerPage());
		    			  
			List<Map<String, Object>> list = menuCreateService.selectMenuCreatManagList(searchVO);
	        int totCnt =  list.size() > 0 ? Integer.valueOf(list.get(0).get("totalRecordCount").toString()) : 0;
	   
			model.addObject(Globals.JSON_RETURN_RESULT_LIST, list);
		    model.addObject(Globals.PAGE_TOTAL_COUNT, totCnt);
		    paginationInfo.setTotalRecordCount(totCnt);
		    model.addObject(Globals.JSON_PAGEINFO, paginationInfo);
		    model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);	    
		  
		}catch(Exception e) {
			log.info(e.toString());
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.common.msg"));	
		}
		return model;
	}

	/**
	 * 권한 코드에 따른 매핑 메뉴 정보 저장
	 * @param params
	 * @return
	 * @throws Exception
	 */

	@PostMapping("menuCreateUpdateAjax.do")
	public ModelAndView updateMenuCreateAjax(@RequestBody Map<String, Object> params) throws Exception {
		ModelAndView model = new ModelAndView (Globals.JSON_VIEW);
		
		String roleId = String.valueOf(params.get("roleId"));
		String checkedMenuNo = String.valueOf(params.get("checkedMenuNo"));
		
		menuCreateService.insertMenuCreatList(roleId, checkedMenuNo);
		model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
		model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("success.common.update"));
		
		return model;
	}
	
	/**
	 * 권한 코드에 매핑된 메뉴 목록 조회 
	 * @param authorCode
	 * @return
	 * @throws Exception
	 */
	@GetMapping("roleMenu/{roleId}.do")
	public ModelAndView selectMenuCreateMenuListAjax(@PathVariable String roleId)throws Exception {
		ModelAndView model = new ModelAndView (Globals.JSON_VIEW);
		
		List<Map<String, Object>> list = menuCreateService.selectMenuCreatList_Author(roleId);
		model.addObject(Globals.JSON_RETURN_RESULT_LIST, list);
		model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
		
		return model;
	}
}
