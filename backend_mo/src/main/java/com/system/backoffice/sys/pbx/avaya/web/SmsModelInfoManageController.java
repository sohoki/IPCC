package com.system.backoffice.sys.pbx.avaya.web;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.egovframe.rte.fdl.property.EgovPropertyService;
import org.egovframe.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.system.backoffice.sys.pbx.avaya.models.SmsModelInfo;
import com.system.backoffice.sys.pbx.avaya.models.dto.SmsModeReqlInfoDto;
import com.system.backoffice.sys.pbx.avaya.service.SmsModelInfoManageService;
import egovframework.com.cmm.EgovMessageSource;
import egovframework.com.cmm.service.Globals;

@RestController
@RequestMapping("/api/backoffice/sys/pbx/avaya")
public class SmsModelInfoManageController {

	/** EgovPropertyService */
	@Resource(name = "propertiesService")
	protected EgovPropertyService propertyService;
	
    @Autowired
    private SmsModelInfoManageService smsInfoMangeServiec;
    
    /** EgovMessageSource */
	@Resource(name = "egovMessageSource")
	EgovMessageSource egovMessageSource;
    
    @GetMapping("/{notiSeq}.do")
    public ModelAndView selectServerDetailInfo(@PathVariable String notiSeq)throws Exception {
    	ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
    	try {
    		Optional<SmsModelInfo> info = smsInfoMangeServiec.selectSmsInfoDetail(notiSeq);
    		
    		info.orElseThrow(() -> new IllegalArgumentException("해당하는 서버 정보가가 없습니다. 잘못된 입력"));
    		
    		model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
    		model.addObject(Globals.STATUS_REGINFO, info);
    		
    	}catch(Exception e) {
    		model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
	   		model.addObject(Globals.STATUS_MESSAGE, e.toString());
    	}
    	return model;
    }
    @DeleteMapping("/{notiSeq}.do")
    public ModelAndView deleteServerDetailInfo(@PathVariable String notiSeq)throws Exception {
    	ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
    	try {
    		int ret = smsInfoMangeServiec.deleteSmsInfo(notiSeq);
    		String status = (ret > 0) ? Globals.STATUS_SUCCESS : Globals.STATUS_FAIL;
    		String message = (ret > 0) ? egovMessageSource.getMessage("success.common.delete") : egovMessageSource.getMessage("fail.request.msg");
    		model.addObject(Globals.STATUS, status);
	   		model.addObject(Globals.STATUS_MESSAGE, message);
	   		 
    	}catch(Exception e) {
    		model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
	   		model.addObject(Globals.STATUS_MESSAGE, e.toString());
    	}
    	return model;
    }
    @PostMapping("/updateSmsInfo.do")
    public ModelAndView updateServerInfo(@Valid @RequestBody SmsModeReqlInfoDto info)throws Exception {
    	ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
    	try {
    		int ret = smsInfoMangeServiec.updateSmsInfo(info);
    		
    		String status = (ret > 0) ? Globals.STATUS_SUCCESS : Globals.STATUS_FAIL;
    		String message = (ret > 0) ? egovMessageSource.getMessage("success.common.delete") : egovMessageSource.getMessage("fail.request.msg");
    		model.addObject(Globals.STATUS, status);
	   		model.addObject(Globals.STATUS_MESSAGE, message);
    	}catch(Exception e) {
    		model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
	   		model.addObject(Globals.STATUS_MESSAGE, e.toString());
    	}
    	return model;
    }
    @PostMapping("/list.do")
    public ModelAndView  selectServerInfoPageList(@RequestBody Map<String, Object> searchMap) throws Exception {
    	ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
    	try {
    		
            int pageUnit = searchMap.get("pageUnit") == null ?   propertyService.getInt("pageUnit") : Integer.valueOf((String) searchMap.get("pageUnit"));
    		int pageSize = searchMap.get("pageSize") == null ?   propertyService.getInt("pageSize") : Integer.valueOf((String) searchMap.get("pageSize"));  
    	   
    	    
        	/** pageing */
        	PaginationInfo paginationInfo = new PaginationInfo();
    		paginationInfo.setCurrentPageNo( Integer.valueOf( searchMap.get("pageIndex").toString() ));
    		paginationInfo.setRecordCountPerPage(pageUnit);
    		paginationInfo.setPageSize(pageSize);

    		searchMap.put("firstIndex", paginationInfo.getFirstRecordIndex());
    		searchMap.put("lastRecordIndex", paginationInfo.getLastRecordIndex());
    		searchMap.put("recordCountPerPage", paginationInfo.getRecordCountPerPage());
    	    
    	    List<Map<String, Object>> codeList = (List<Map<String, Object>>) smsInfoMangeServiec.selectSmsInfoPageList(searchMap);
    	    int totCnt = codeList.size() > 0 ?  Integer.valueOf( codeList.get(0).get("totalRecordCount").toString().replace("-", "") ) :0;
            

    		paginationInfo.setTotalRecordCount(totCnt);
    		model.addObject("resultList", codeList);
    		model.addObject("paginationInfo", paginationInfo);
    	}catch(Exception e) {
	   		 model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
	   		 model.addObject(Globals.STATUS_MESSAGE, e.toString());
    	}
    	return model;
    }
}
