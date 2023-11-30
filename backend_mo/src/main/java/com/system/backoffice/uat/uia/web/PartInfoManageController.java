package com.system.backoffice.uat.uia.web;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Properties;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import egovframework.com.cmm.EgovMessageSource;
import egovframework.com.cmm.service.Globals;
import egovframework.com.cmm.service.ResultVO;
import egovframework.com.jwt.config.JwtVerification;
import org.egovframe.rte.fdl.property.EgovPropertyService;
import org.egovframe.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
import com.system.backoffice.sym.log.service.EgovSysLogService;
import com.system.backoffice.uat.uia.models.PartInfo;
import com.system.backoffice.uat.uia.models.PartInfoVO;
import com.system.backoffice.uat.uia.models.UniUtilInfo;
import com.system.backoffice.uat.uia.service.PartInfoManageService;
import com.system.backoffice.uat.uia.service.UniUtilManageService;


@RestController
@RequestMapping("/api/backoffice/uat/uia/part")
public class PartInfoManageController {

	
	private static final Logger LOGGER = LoggerFactory.getLogger(GroupInfoManageController.class);
	 

 
	 @Resource(name="egovMessageSource")
	 protected EgovMessageSource egovMessageSource;
		
	 @Autowired
	 protected EgovPropertyService propertiesService;
	 
	 @Autowired
	 private PartInfoManageService partService;
	 
	 @Autowired
	 private EgovSysLogService sysLogService;
	 
	 @Autowired
	 private UniUtilManageService utilService;
	 
	/** JwtVerification */
	@Autowired
	private JwtVerification jwtVerification;
	 
	@PostMapping("partList.do")
	public ModelAndView selectPartManagerList( @RequestBody Map<String, Object> searchVO 
												 , HttpServletRequest request
												 , BindingResult bindingResult) throws Exception {  
		 
		   ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		   try{
			   			   
	    		// 기존 세션 체크 인증에서 토큰 방식으로 변경
	           if (!jwtVerification.isVerificationAdmin(request)) {
	        		ResultVO resultVO = new ResultVO();
	    			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
	           }
			   
			   
		       searchVO.put("pageUnit", propertiesService.getInt("pageUnit"));
		       searchVO.put("pageSize", propertiesService.getInt("pageSize"));
		       
		       
		       model.addObject(Globals.STATUS_REGINFO, searchVO);
		       
		       //** pageing *//   
		       
		   	   PaginationInfo paginationInfo = new PaginationInfo();
			   paginationInfo.setCurrentPageNo(Integer.parseInt(searchVO.get("pageIndex").toString()));
			   
			   paginationInfo.setRecordCountPerPage(propertiesService.getInt("pageUnit"));
			   paginationInfo.setPageSize(propertiesService.getInt("pageUnit"));
			   
			   searchVO.put("firstIndex", paginationInfo.getFirstRecordIndex());
			   searchVO.put("lastIndex", paginationInfo.getLastRecordIndex());
			   searchVO.put("recordCountPerPage", paginationInfo.getRecordCountPerPage());
			   
			   List<PartInfoVO> partList = partService.selectPartInfoPageInfoManageListByPagination(searchVO);
			   
			   int totCnt = partList.size() > 0 ? partList.get(0).getTotalRecordCount() : 0;  
			   
		       model.addObject(Globals.JSON_RETURN_RESULT_LIST ,  partList );      
		             
			   paginationInfo.setTotalRecordCount(totCnt);
		       model.addObject(Globals.PAGE_INFO, paginationInfo);
		       model.addObject(Globals.PAGE_TOTAL_COUNT, totCnt);
		       model.addObject("selectGroupCombo", partService.selectPartInfoCombo());
		      
		   }catch (Exception e){
			   System.out.println("e:" + e.toString());
		   }
		   return model;
	}
	@GetMapping("partDetail/{partId}.do")
	public ModelAndView partInfoDetail ( @PathVariable String partId
									  , HttpServletRequest request
									  , BindingResult bindingResult) throws Exception {  
		
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW); 
		// 기존 세션 체크 인증에서 토큰 방식으로 변경
		if (!jwtVerification.isVerificationAdmin(request)) {
			ResultVO resultVO = new ResultVO();
			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
		}
		
		
		try{ 
			PartInfoVO info = partService.selectPartInfoDetail(partId);
			model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
    		model.addObject(Globals.STATUS_REGINFO, info);
    		
		 }catch(Exception e){
			LOGGER.error("groupInfoDetail : error" + e.toString());
			model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.request.msg"));	
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
		 }
		 return model;
	}
	@GetMapping("partCombo.do")
	public ModelAndView partComboInfo ( HttpServletRequest request
									  , BindingResult bindingResult) throws Exception {  
		
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW); 
		// 기존 세션 체크 인증에서 토큰 방식으로 변경
		if (!jwtVerification.isVerificationAdmin(request)) {
			ResultVO resultVO = new ResultVO();
			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
		}
		
		try{ 
			model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
    		model.addObject(Globals.JSON_RETURN_RESULT_LIST, partService.selectPartInfoCombo());
    		
		 }catch(Exception e){
			 LOGGER.error("groupInfoDetail : error" + e.toString());
			model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.request.msg"));	
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
		 }
		 return model;
	}
	@GetMapping("parentPartCombo.do")
	public ModelAndView parentPartComboInfo (  HttpServletRequest request) throws Exception {  
		
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW); 
		/*
		if (!jwtVerification.isVerificationAdmin(request)) {
    		ResultVO resultVO = new ResultVO();
			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
        }
		*/
		try{ 
			model.addObject(Globals.JSON_RETURN_RESULT_LIST, partService.selectPartInfoCombo());
			model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
		}catch(Exception e){
				//result = "F";
			LOGGER.error("groupInfoDetail : error" + e.toString());
			model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.request.msg"));	
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
		 }
		 return model;
	}
	@GetMapping("paxExtensionCombo.do")
	public ModelAndView paxExtensionComboComboInfo (  HttpServletRequest request) throws Exception {  
		
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW); 
		
		if (!jwtVerification.isVerificationAdmin(request)) {
    		ResultVO resultVO = new ResultVO();
			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
        }
		
		try{ 
			model.addObject(Globals.JSON_RETURN_RESULT_LIST, partService.selectPartInfoCombo());
			model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
		}catch(Exception e){
				//result = "F";
			LOGGER.error("groupInfoDetail : error" + e.toString());
			model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.request.msg"));	
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
		 }
		 return model;
	}
	@PostMapping("partUpdate.do")
	public ModelAndView partInfoUpdate ( @RequestBody PartInfo partInfo
										, HttpServletRequest request
										, BindingResult bindingResult) throws Exception {  
		
		
	    	// 기존 세션 체크 인증에서 토큰 방식으로 변경
    	if (!jwtVerification.isVerificationAdmin(request)) {
    		ResultVO resultVO = new ResultVO();
			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
    	}else {
    		partInfo.setUserId(jwtVerification.getTokenUserName(request));
    	}
		
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		String meesage = "";
		String status  = "";
		try{
				
			int ret = ret = partService.updatePartInfoManage(partInfo);	
			System.out.println("partUpdate " + ret);
			
			status = ret >0 ? Globals.STATUS_SUCCESS : Globals.STATUS_FAIL;
			meesage = partInfo.getMode().equals("Ins") ? "sucess.common.insert" : "sucess.common.update";
			
			
			model.addObject(Globals.STATUS, status);
			model.addObject(Globals.STATUS_MESSAGE , egovMessageSource.getMessage(meesage));
		}catch(Exception e){
			
		    model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
		    model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.request.msg") + e.toString());	
		}
		return model;
	}
	@DeleteMapping("{partId}.do")
	public ModelAndView partDelete(@PathVariable String partId ) throws Exception {
		
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
        
		UniUtilInfo utilInfo = new UniUtilInfo();
		utilInfo.setInTable("TB_PARTINFO");
		utilInfo.setInCondition("PART_ID=["+partId+"[");
		try{
			
		    int ret = utilService.deleteUniStatement(utilInfo);	
		    model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("success.request.msg"));	
			model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS); 
		    
		}catch (Exception e){
			//result = "F";
			model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.request.msg"));	
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
		}
		return model;
	}
}
