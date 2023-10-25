package com.system.backoffice.sym.log.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.egovframe.rte.fdl.idgnr.EgovIdGnrService;
import org.egovframe.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.servlet.ModelAndView;

import com.system.backoffice.sym.log.annotation.NoLogging;
import com.system.backoffice.sym.log.mapper.SysLogManageMapper;
import com.system.backoffice.sym.log.models.SysLog;

import lombok.RequiredArgsConstructor;

@Transactional(readOnly = true)
@RequiredArgsConstructor
@Service
public class EgovSysLogService {

	

		private final SysLogManageMapper syslogMapper;
		
		/** ID Generation */
		@Resource(name="egovSysLogIdGnrService")
		private EgovIdGnrService egovSysLogIdGnrService;
		
		@Transactional(readOnly = false)
		@NoLogging
		public void logInsertSysLog(SysLog sysLog) throws Exception {
			// TODO Auto-generated method stub
			sysLog.setRequstId(egovSysLogIdGnrService.getNextStringId());
			syslogMapper.logInsertSysLog(sysLog);
		}
		//업체별 로그 현황
		@Transactional(readOnly = false)
		@NoLogging
		public void logInsertSysLogSummary() throws Exception {
			// TODO Auto-generated method stub
			
		}
		@NoLogging
		/*
		public Map<String, Object> selectSysLogInfo(@Param("requestId") String requstId) throws Exception {
			// TODO Auto-generated method stub
			return syslogMapper.selectSysLogInfo(requstId);
		}
		*/
		public ModelAndView selectSysLogList(SysLog sysLog)  throws Exception {
			// TODO Auto-generated method stub
			//페이징 처리 다시 한번 생각하기 
			
			ModelAndView mav = new ModelAndView();
			
			PaginationInfo paginationInfo = new PaginationInfo();
		   	paginationInfo.setCurrentPageNo(sysLog.getPageIndex());
			paginationInfo.setRecordCountPerPage(sysLog.getPageUnit());
			paginationInfo.setPageSize(sysLog.getPageSize());
			 
			sysLog.setFirstIndex(paginationInfo.getFirstRecordIndex());
			sysLog.setLastIndex(paginationInfo.getLastRecordIndex());
			sysLog.setRecordCountPerPage(paginationInfo.getRecordCountPerPage());
			//수정 변경
			Map<String, Object> params = new HashMap<String, Object>();
			params.put("firstIndex", paginationInfo.getFirstRecordIndex());
			params.put("recordCountPerPage", paginationInfo.getRecordCountPerPage());
			 		
			List<Map<String, Object>> list = syslogMapper.selectSysLogList(params);
			int totCnt = list.size() > 0 ? Integer.parseInt( list.get(0).get("totalRecordCount").toString() ): 0;
			paginationInfo.setTotalRecordCount(totCnt);
			mav.addObject("regist", sysLog);
	    	mav.addObject("resultList",  list );
	    	mav.addObject("paginationInfo", paginationInfo);
	    	mav.addObject("totalCnt", totCnt);
			return mav;
		}
}
