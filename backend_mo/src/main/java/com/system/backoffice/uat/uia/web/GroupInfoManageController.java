package com.system.backoffice.uat.uia.web;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import egovframework.com.cmm.AdminLoginVO;
import egovframework.com.cmm.EgovMessageSource;
import egovframework.com.cmm.service.Globals;
import org.egovframe.rte.fdl.property.EgovPropertyService;
import org.egovframe.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
import com.system.backoffice.uat.uia.models.GroupInfo;
import com.system.backoffice.uat.uia.models.GroupInfoVO;
import com.system.backoffice.uat.uia.service.GroupInfoManageService;



@RestController
@RequestMapping("/backoffice/basicManage/")
public class GroupInfoManageController {

	
	 private static final Logger LOGGER = LoggerFactory.getLogger(GroupInfoManageController.class);
	 
	 @Resource(name="egovMessageSource")
	 protected EgovMessageSource egovMessageSource;
		
	 @Resource(name = "propertiesService")
	 protected EgovPropertyService propertiesService;
	 	
	 @Resource(name="GroupInfoManageService")
	 private GroupInfoManageService groupService;
	 
	 @RequestMapping(value="groupList.do")
	 public ModelAndView selectUserManagerList(@ModelAttribute("AdminLoginVO") AdminLoginVO loginVO
										 , @ModelAttribute("searchVO") GroupInfoVO searchVO
										 , HttpServletRequest request
										 , BindingResult bindingResult
										 , ModelMap model) throws Exception {  
		 
		   ModelAndView mav = new ModelAndView("/backoffice/basicManage/groupList");
		   try{
			   			   
			   searchVO.setPageUnit(propertiesService.getInt("pageUnit"));          
		       searchVO.setPageSize(propertiesService.getInt("pageSize"));   
		       
		       model.addAttribute("regist", searchVO);
		       //** pageing *//       
		   	   PaginationInfo paginationInfo = new PaginationInfo();
			   paginationInfo.setCurrentPageNo(searchVO.getPageIndex());
			   
			   paginationInfo.setRecordCountPerPage(searchVO.getPageUnit());
			   paginationInfo.setPageSize(searchVO.getPageSize());
			   searchVO.setFirstIndex(paginationInfo.getFirstRecordIndex());
			   searchVO.setLastIndex(paginationInfo.getLastRecordIndex());
			   searchVO.setRecordCountPerPage(paginationInfo.getRecordCountPerPage());
			   
			   if (searchVO.getUseYn() == null){ searchVO.setUseYn("");}
			   
		       model.addAttribute("resultList",   groupService.selectGroupInfoPageInfoManageListByPagination(searchVO) );      
		       int totCnt = groupService.selectGroupInfoPageInfoManageListToCnt_s(searchVO) ;       
			   paginationInfo.setTotalRecordCount(totCnt);
		       model.addAttribute("paginationInfo", paginationInfo);
		       model.addAttribute("totalCnt", totCnt);
		       model.addAttribute("selectGroupCombo", groupService.selectGroupCombo());
		       
		   }catch (Exception e){
			   System.out.println("e:" + e.toString());
		   }
		   return mav;
	}
	@RequestMapping(value="groupDetail.do")
	public GroupInfo groupInfoDetail (@ModelAttribute("AdminLoginVO") AdminLoginVO loginVO
									  , @RequestBody GroupInfoVO groupInfo
									  , HttpServletRequest request
									  , BindingResult bindingResult
									  , ModelMap model) throws Exception {  
		 GroupInfo info = new  GroupInfo();
		 try{ info = groupService.selectGroupInfoDetail(groupInfo.getGroupId());
		 }catch(Exception e){
			 LOGGER.error("groupInfoDetail : error" + e.toString());
		 }
		 return info;
	}
	@RequestMapping(value="groupUpdate.do", method=RequestMethod.POST)
	public int groupInfoUpdate (@ModelAttribute("AdminLoginVO") AdminLoginVO loginVO
										 , @RequestBody GroupInfo groupInfo
										 , HttpServletRequest request
										 , BindingResult bindingResult
										 , ModelMap model) throws Exception {  
		
		
		int ret  = 0;
		String meesage = "";
		LOGGER.debug("groupInfo.getMode():" );
		try{
			LOGGER.debug("groupInfo.getMode():" + groupInfo.getMode());
			
			if (groupInfo.getMode().equals("Ins")){
				meesage = "sucess.common.insert";
			}else {
				meesage = "sucess.common.update";
			}	
			ret = ret = groupService.updateGroupInfoManage(groupInfo);			
			if (ret >0){
				model.addAttribute("status", Globals.STATUS_SUCCESS);
			}else {
				throw new Exception();
			}
		}catch(Exception e){
		    LOGGER.error("groupInfoUpdate : error: " + e.toString());
		    model.addAttribute("status", Globals.STATUS_FAIL);
		}
		return ret;
	}
}
