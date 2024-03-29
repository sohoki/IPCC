package com.system.backoffice.sym.voc.web;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.commons.io.FilenameUtils;
import org.egovframe.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartRequest;
import org.springframework.web.servlet.ModelAndView;
import com.system.backoffice.sym.voc.models.VocInfo;
import com.system.backoffice.sym.voc.models.dto.VocInfoRequestDto;
import com.system.backoffice.sym.voc.models.dto.VocProcessInfoReqDto;
import com.system.backoffice.sym.voc.models.dto.VocProcessInfoResDto;
import com.system.backoffice.sym.voc.service.VocInfoManageService;
import com.system.backoffice.sym.voc.service.VocProcessInfoManageService;
import com.system.backoffice.util.service.fileService;

import egovframework.com.cmm.EgovMessageSource;
import egovframework.com.cmm.service.Globals;
import egovframework.com.cmm.service.ResultVO;
import egovframework.com.jwt.config.JwtVerification;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;




@Api(tags = {"장애 관리 정보 API"})
@Slf4j
@RestController
@RequestMapping("/api/backoffice/sym/voc/")
public class VocInfoManageController {

	//파일 업로드
    @Autowired
	private fileService uploadFile;
    
	@Value("${page.pageUnit}")
	private int pageUnitSetting ;
	
	@Value("${page.pageSize}")
	private int pageSizeSetting ;
	
	@Value("${Globals.editorPath}")
	private String editorPath ;
	
	
    @Autowired
    private VocInfoManageService vocMangeServiec;
    
    @Autowired
    private VocProcessInfoManageService vocProcessMangeServiec;
    
    
    /** EgovMessageSource */
	@Resource(name = "egovMessageSource")
	EgovMessageSource egovMessageSource;
	
	/** JwtVerification */
	@Autowired
	private JwtVerification jwtVerification;
    
    @GetMapping("{vocSeq}.do")
    public ModelAndView selectVocDetailInfo(@PathVariable String vocSeq,
    										HttpServletRequest request)throws Exception {
    	ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
    	try {
    		
    		if (!jwtVerification.isVerificationAdmin(request)) {

        		ResultVO resultVO = new ResultVO();
    			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
        	}
    		
    		Optional<VocInfo> info = vocMangeServiec.selectVocInfoDetail(vocSeq);
    		
    		info.orElseThrow(() -> new IllegalArgumentException("해당하는 VOC 정보가가 없습니다. 잘못된 입력하셨습니다."));
    		
    		model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
    		model.addObject(Globals.STATUS_REGINFO, info);
    		
    	}catch(Exception e) {
    		log.error("selectVocDetailInfo  error:" + e.toString());
    		model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
	   		model.addObject(Globals.STATUS_MESSAGE, e.toString());
    	}
    	return model;
    }
    @GetMapping("vocHistory/{vocSeq}.do")
    public ModelAndView selectVocDetailHistoryInfo(@PathVariable String vocSeq,
    												HttpServletRequest request)throws Exception {
    	ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
    	try {
    		
    		if (!jwtVerification.isVerificationAdmin(request)) {

        		ResultVO resultVO = new ResultVO();
    			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
        	}
    		Optional<VocInfo> info = vocMangeServiec.selectVocInfoDetail(vocSeq);
    		info.orElseThrow(() -> new IllegalArgumentException("해당하는 VOC 정보가가 없습니다. 잘못된 입력하셨습니다."));
    		
    		model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
    		model.addObject(Globals.STATUS_REGINFO, info);
    		model.addObject(Globals.JSON_RETURN_RESULT_LIST, vocProcessMangeServiec.selectVocProcessTotalList(vocSeq));
    	}catch(Exception e) {
    		model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
	   		model.addObject(Globals.STATUS_MESSAGE, e.toString());
    	}
    	return model;
    }
    @DeleteMapping("{vocSeq}.do")
    public ModelAndView deleteVocInfo(@PathVariable String vocSeq, 
										HttpServletRequest request)throws Exception {
    	ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
    	try {
    		if (!jwtVerification.isVerificationAdmin(request)) {

        		ResultVO resultVO = new ResultVO();
    			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
        	}
    		int ret = vocMangeServiec.deleteVocInfo(vocSeq);
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
    @PostMapping("reqVoc.do")
    public ModelAndView resServerInfo(@Valid @RequestBody VocInfoRequestDto info,
										 HttpServletRequest request)throws Exception {
    	ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
    	try {
    		if (!jwtVerification.isVerificationAdmin(request)) {
        		ResultVO resultVO = new ResultVO();
    			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
        	}else {
        		info.setUserId(jwtVerification.getTokenUserName(request));
        	}
    		int ret = vocMangeServiec.updateVocInfo(info);
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
    @PostMapping("reqUpdateVoc.do")
    public ModelAndView updateVocReqInfo(@Valid @RequestBody VocInfoRequestDto info,
										 HttpServletRequest request)throws Exception {
    	ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
    	try {
    		if (!jwtVerification.isVerificationAdmin(request)) {
        		ResultVO resultVO = new ResultVO();
    			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
        	}else {
        		info.setUserId(jwtVerification.getTokenUserName(request));
        	}
    		
    		int ret = vocMangeServiec.updateServerResponse(info);
    		
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
    @PostMapping("resVoc.do")
    public ModelAndView updateVocResInfo(@Valid @RequestBody VocInfoRequestDto info,
										 HttpServletRequest request)throws Exception {
    	ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
    	try {
    		if (!jwtVerification.isVerificationAdmin(request)) {
        		ResultVO resultVO = new ResultVO();
    			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
        	}else {
        		info.setUserId(jwtVerification.getTokenUserName(request));
        	}
    		int ret = vocMangeServiec.updateServerResponse(info);
    		
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
    @PostMapping("voclist.do")
    public ModelAndView  selectVocInfoPageList(@RequestBody Map<String, Object> searchMap 
												 , HttpServletRequest request
												 , BindingResult bindingResult) throws Exception {
    	ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
    	try {
    		
    		// 기존 세션 체크 인증에서 토큰 방식으로 변경
        	if (!jwtVerification.isVerificationAdmin(request)) {

        		ResultVO resultVO = new ResultVO();
    			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
        	}
        	
        	
            int pageUnit = searchMap.get(Globals.PAGE_UNIT) == null ?   pageUnitSetting : Integer.valueOf((String) searchMap.get(Globals.PAGE_UNIT));
    		int pageSize = searchMap.get(Globals.PAGE_SIZE) == null ?   pageSizeSetting : Integer.valueOf((String) searchMap.get(Globals.PAGE_SIZE));  
    	   
    	    
        	/** pageing */
        	PaginationInfo paginationInfo = new PaginationInfo();
    		paginationInfo.setCurrentPageNo( Integer.valueOf( searchMap.get(Globals.PAGE_INDEX).toString() ));
    		paginationInfo.setRecordCountPerPage(pageUnit);
    		paginationInfo.setPageSize(pageSize);

    		searchMap.put(Globals.PAGE_FIRST_INDEX, paginationInfo.getFirstRecordIndex());
    		searchMap.put(Globals.PAGE_LAST_INDEX, paginationInfo.getLastRecordIndex());
    		searchMap.put(Globals.PAGE_RECORD_PER_PAGE, paginationInfo.getRecordCountPerPage());
    	    
    	    List<Map<String, Object>> codeList = (List<Map<String, Object>>) vocMangeServiec.selectVocInfoPageList(searchMap);
    	    int totCnt = codeList.size() > 0 ?  Integer.valueOf( codeList.get(0).get(Globals.PAGE_TOTAL_RECORD_COUNT).toString().replace("-", "") ) :0;
            

    		paginationInfo.setTotalRecordCount(totCnt);
    		model.addObject(Globals.JSON_RETURN_RESULT_LIST, codeList);
    		model.addObject(Globals.JSON_PAGEINFO, paginationInfo);
    	}catch(Exception e) {
	   		 model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
	   		 model.addObject(Globals.STATUS_MESSAGE, e.toString());
    	}
    	return model;
    }
    @PostMapping("vocProcesslist.do")
    public ModelAndView  selectVocProcessInfoPageList(@RequestBody Map<String, Object> searchMap 
												 	, HttpServletRequest request
												 	, BindingResult bindingResult) throws Exception {
    	ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
    	try {
    		
    		// 기존 세션 체크 인증에서 토큰 방식으로 변경
        	if (!jwtVerification.isVerificationAdmin(request)) {

        		ResultVO resultVO = new ResultVO();
    			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
        	}
        	
        	
            int pageUnit = searchMap.get(Globals.PAGE_UNIT) == null ?   pageUnitSetting : Integer.valueOf((String) searchMap.get(Globals.PAGE_UNIT));
    		int pageSize = searchMap.get(Globals.PAGE_SIZE) == null ?   pageSizeSetting : Integer.valueOf((String) searchMap.get(Globals.PAGE_SIZE));  
    	   
    		
        	/** pageing */
        	PaginationInfo paginationInfo = new PaginationInfo();
    		paginationInfo.setCurrentPageNo( Integer.valueOf( searchMap.get(Globals.PAGE_INDEX).toString() ));
    		paginationInfo.setRecordCountPerPage(pageUnit);
    		paginationInfo.setPageSize(pageSize);

    		searchMap.put( Globals.PAGE_FIRST_INDEX, paginationInfo.getFirstRecordIndex());
    		searchMap.put(Globals.PAGE_LAST_INDEX, paginationInfo.getLastRecordIndex());
    		searchMap.put(Globals.PAGE_RECORD_PER_PAGE, paginationInfo.getRecordCountPerPage());
    	    
    	    List<Map<String, Object>> codeList = (List<Map<String, Object>>) vocProcessMangeServiec.selectVocProcessPageList(searchMap);
    	    int totCnt = codeList.size() > 0 ?  Integer.valueOf( codeList.get(0).get(Globals.PAGE_TOTAL_RECORD_COUNT).toString().replace("-", "") ) :0;
            
    	    
    		paginationInfo.setTotalRecordCount(totCnt);
    		model.addObject(Globals.JSON_RETURN_RESULT_LIST, codeList);
    		model.addObject(Globals.JSON_PAGEINFO, paginationInfo);
    		 model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
    	}catch(Exception e) {
	   		 model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
	   		 model.addObject(Globals.STATUS_MESSAGE, e.toString());
    	}
    	return model;
    }
    
    @PostMapping("VocResUpdate.do")
    public ModelAndView updateVocProcessReqInfo(@Valid @RequestBody VocProcessInfoReqDto info,
										 	    HttpServletRequest request)throws Exception {
    	ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
    	try {
    		if (!jwtVerification.isVerificationAdmin(request)) {
        		ResultVO resultVO = new ResultVO();
    			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
        	}else {
        		info.setUserId(jwtVerification.getTokenUserName(request));
        	}
    		
    		int ret = vocProcessMangeServiec.updateVocProcess(info);
    		
    		String status = (ret > 0) ? Globals.STATUS_SUCCESS : Globals.STATUS_FAIL;
    		String message = (ret > 0) ? egovMessageSource.getMessage("success.request.msg") : egovMessageSource.getMessage("fail.request.msg");
    		model.addObject(Globals.STATUS, status);
	   		model.addObject(Globals.STATUS_MESSAGE, message);
    	}catch(Exception e) {
    		model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
	   		model.addObject(Globals.STATUS_MESSAGE, e.toString());
    	}
    	return model;
    }
    @GetMapping("vocProcess/{vocProcessSeq}.do")
    public ModelAndView selectVocProcessDetailInfo(@PathVariable String vocProcessSeq,
    											HttpServletRequest request)throws Exception {
    	ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
    	try {
    		
    		if (!jwtVerification.isVerificationAdmin(request)) {

        		ResultVO resultVO = new ResultVO();
    			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
        	}
    		
    		Optional<VocProcessInfoResDto> info = vocProcessMangeServiec.selectVocProcessDetail(vocProcessSeq);
    		
    		info.orElseThrow(() -> new IllegalArgumentException("해당하는 VOC 정보가가 없습니다. 잘못된 입력하셨습니다."));
    		
    		model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
    		model.addObject(Globals.STATUS_REGINFO, info);
    		
    	}catch(Exception e) {
    		model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
	   		model.addObject(Globals.STATUS_MESSAGE, e.toString());
    	}
    	return model;
    }
    @DeleteMapping("vocProcess/{vocProcessSeq}.do")
    public ModelAndView deleteVocProcessDetailInfo(@PathVariable String vocProcessSeq,
    											HttpServletRequest request)throws Exception {
    	ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
    	try {
    		
    		if (!jwtVerification.isVerificationAdmin(request)) {

        		ResultVO resultVO = new ResultVO();
    			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
        	}
    		
    		int ret = vocProcessMangeServiec.deleteVocProcess(vocProcessSeq);
    		
    		String status = (ret > 0) ? Globals.STATUS_SUCCESS : Globals.STATUS_FAIL;
    		String message = (ret > 0) ? egovMessageSource.getMessage("success.request.msg") : egovMessageSource.getMessage("fail.request.msg");
    		model.addObject(Globals.STATUS, status);
	   		model.addObject(Globals.STATUS_MESSAGE, message);
    		
    	}catch(Exception e) {
    		model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
	   		model.addObject(Globals.STATUS_MESSAGE, e.toString());
    	}
    	return model;
    }
    
    @ResponseBody
	@PostMapping("image.do")
	public Map<String, Object> uploadImage(@RequestParam Map<String, Object> paramMap, 
											MultipartRequest request) throws Exception {
    	
    	
    	//String fileNm = uploadFile.uploadFileNm(request.getFiles("upload"), editorPath);
		
    	
    	
		MultipartFile uploadFile = request.getFile("upload");
		String uploadDir = editorPath;
		System.out.println("uploadDir:" + uploadDir);
		LocalDate currentDate = LocalDate.now();
		DateTimeFormatter yearMonthFormatter = DateTimeFormatter.ofPattern("yyyy/MM");
		String datePath = currentDate.format(yearMonthFormatter);
		Path filePath = null;
		try {
			String uploadId = UUID.randomUUID().toString() + "." + FilenameUtils.getExtension(uploadFile.getOriginalFilename());
			// 폴더 생성
			Path path = Paths.get(uploadDir+"/"+datePath);
			Files.createDirectories(path);
			// 파일 쓰기
			filePath = Paths.get(path.toString(), uploadId);
			Files.write(filePath, uploadFile.getBytes());
			paramMap.put("url", "/upload/editor/" + datePath +"/"+ uploadId);
			return paramMap;
		} catch (Exception e) {
			if (filePath != null) {
				Files.delete(filePath);
			}
			throw e;
		}
	}
}
