package com.system.backoffice.sym.svr.web;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.Optional;
import java.util.concurrent.ExecutionException;

import org.egovframe.rte.fdl.property.EgovPropertyService;
import org.egovframe.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
import org.snmp4j.CommunityTarget;
import org.snmp4j.PDU;
import org.snmp4j.Snmp;
import org.snmp4j.Target;
import org.snmp4j.fluent.SnmpBuilder;
import org.snmp4j.fluent.SnmpCompletableFuture;
import org.snmp4j.fluent.TargetBuilder;
import org.snmp4j.mp.SnmpConstants;
import org.snmp4j.smi.Address;
import org.snmp4j.smi.GenericAddress;
import org.snmp4j.smi.Integer32;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.OctetString;
import org.snmp4j.smi.VariableBinding;
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
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.system.backoffice.sym.svr.models.dto.ServerInfoRequestDto;
import com.system.backoffice.sym.svr.models.dto.ServiceInfoReqDto;
import com.system.backoffice.sym.svr.models.dto.ServiceOidInfoReqDto;
import com.system.backoffice.sym.svr.models.dto.ServiceOidInfoResDto;
import com.system.backoffice.sym.svr.models.ServerInfo;
import com.system.backoffice.sym.svr.models.ServerStatusInfo;
import com.system.backoffice.sym.svr.service.ServerInfoManageService;
import com.system.backoffice.sym.svr.service.ServiceInfoManageService;
import com.system.backoffice.sym.svr.service.ServiceOidInfoManageService;

import egovframework.com.cmm.EgovMessageSource;
import egovframework.com.cmm.service.Globals;
import egovframework.com.cmm.service.ResultVO;
import egovframework.com.jwt.config.JwtVerification;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

@Api(tags = {"서버/서비스 정보 API"})
@Slf4j
@RestController
@RequestMapping("/api/backoffice/sym/svr/")
public class ServerInfoManageController {
	
	@Value("${page.pageUnit}")
	private int pageUnitSetting ;
	
	@Value("${page.pageSize}")
	private int pageSizeSetting ;

	private Session session;
	private ChannelExec channelExec;
	 
	/** EgovPropertyService */
	@Resource(name = "propertiesService")
	protected EgovPropertyService propertyService;
	
	@Autowired
	private ServerInfoManageService serverMangeServiec;
	
	@Autowired
	private ServiceInfoManageService serviceMangeServiec;
	
	@Autowired
	private ServiceOidInfoManageService oidService;;
	
	/** EgovMessageSource */
	@Resource(name = "egovMessageSource")
	EgovMessageSource egovMessageSource;
	
	/** JwtVerification */
	@Autowired
	private JwtVerification jwtVerification;
	
	@ApiOperation(value="서버 정보 상세 조회", notes="서버 정보 상세 조회")
	@ApiImplicitParam(name = "serverCode", value = "서버 정보 생성시 발급되는 serverCode")
	@GetMapping("{serverCode}")
	public ModelAndView selectServerDetailInfo(@PathVariable String serverCode
											, HttpServletRequest request)throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
			
			if (!jwtVerification.isVerificationAdmin(request)) {
		
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확인
			}
			
			Optional<ServerInfo> info = serverMangeServiec.selectServerInfoDetail(serverCode);
			
			info.orElseThrow(() -> new IllegalArgumentException(egovMessageSource.getMessage("fial.common.info")));
			
			model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
			model.addObject(Globals.STATUS_REGINFO, info);
			
		}catch(Exception e) {
			log.error("selectServerDetailInfo error:" + e.toString());
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, e.toString());
		}
		return model;
	}
	
	
	
	@ApiOperation(value="서버 정보 삭제", notes="서버 정보 삭제 시 시스템 정보 및 OID 정보 삭제")
	@ApiImplicitParam(name = "serverCode", value = "서버 정보 생성시 발급되는 serverCode")
	@DeleteMapping("{serverCode}.do")
	public ModelAndView deleteServerDetailInfo(@PathVariable String serverCode
												, HttpServletRequest request)throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
			
			if (!jwtVerification.isVerificationAdmin(request)) {
	
				ResultVO resultVO = new ResultVO();
			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
			}
		
			int ret = serverMangeServiec.deleteServerInfo(serverCode);
			String status = (ret > 0) ? Globals.STATUS_SUCCESS : Globals.STATUS_FAIL;
			String message = (ret > 0) ? egovMessageSource.getMessage("success.common.delete") : egovMessageSource.getMessage("fail.request.msg");
			model.addObject(Globals.STATUS, status);
			model.addObject(Globals.STATUS_MESSAGE, message);
			 
		}catch(Exception e) {
			log.error("deleteServerDetailInfo error:" + e.toString());
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, e.toString());
		}
		return model;
	}
	@ApiOperation(value="서버 정보 업데이트", notes="서버 정보 업데이트")
	@PostMapping("updateServer.do")
	public ModelAndView updateServerInfo(@Valid @RequestBody ServerInfoRequestDto info
										, HttpServletRequest request)throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
			
			// 기존 세션 체크 인증에서 토큰 방식으로 변경
			if (!jwtVerification.isVerificationAdmin(request)) {
				ResultVO resultVO = new ResultVO();
			return jwtVerification.handleAuthError(resultVO); // 토큰 확인
			}else {
				info.setUserId(jwtVerification.getTokenUserName(request));
			}
			
			int ret = serverMangeServiec.updateServerInfo(info);
			
			String status = (ret > 0) ? Globals.STATUS_SUCCESS : Globals.STATUS_FAIL;
			String message = (ret > 0) ? egovMessageSource.getMessage("success.request.msg") : 
										 egovMessageSource.getMessage("fail.request.msg");
			model.addObject(Globals.STATUS, status);
			model.addObject(Globals.STATUS_MESSAGE, message);
		}catch(Exception e) {
			log.error("updateServerInfo error:" + e.toString());
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, e.toString());
		}
		return model;
	}
	@ApiOperation(value="서버 정보 리스트", notes="서버 정보 리스트")
	@PostMapping("list.do")
	public ModelAndView  selectServerInfoPageList(@RequestBody Map<String, Object> searchMap 
												 , HttpServletRequest request
												 , BindingResult bindingResult) throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
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
		
		List<Map<String, Object>> codeList = (List<Map<String, Object>>) serverMangeServiec.selectServerInfoPageList(searchMap);
		int totCnt = codeList.size() > 0 ?  Integer.valueOf( codeList.get(0).get("totalRecordCount").toString().replace("-", "") ) :0;

		paginationInfo.setTotalRecordCount(totCnt);
		model.addObject(Globals.JSON_RETURN_RESULT_LIST, codeList);
		model.addObject(Globals.JSON_PAGEINFO, paginationInfo);
	}catch(Exception e) {
		log.error("selectServerInfoPageList error:" + e.toString());
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, e.toString());
		}
		return model;
	}
	
	@ApiOperation(value="서버 정보 combo ", notes="서버 정보 combo box")
	@GetMapping("serverCombo.do")
	public ModelAndView systemCombo(@RequestParam Map<String, Object> searchMap,
									HttpServletRequest request) throws Exception {
		ModelAndView model = new ModelAndView (Globals.JSON_VIEW);
		try {
			if (!jwtVerification.isVerificationAdmin(request)) {
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확인
			}
			
			model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
			model.addObject(Globals.JSON_RETURN_RESULT, serverMangeServiec.selectServerInfoComboList(searchMap));
			
		}catch(Exception e){
			log.error("systemCombo error:" + e.toString());
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.common.delete"));
		}
		return model;
	}
	
	@ApiOperation(value="서비스 정보 리스트", notes="서비스 정보 리스트")
	@PostMapping("service/list.do")
	public ModelAndView  selectServiceInfoPageList(@RequestBody Map<String, Object> searchMap 
												 , HttpServletRequest request
												 , BindingResult bindingResult) throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
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
			List<Map<String, Object>> codeList = (List<Map<String, Object>>) serviceMangeServiec.selectServiceInfoPageList(searchMap);
			int totCnt = codeList.size() > 0 ?  Integer.valueOf( codeList.get(0).get("totalRecordCount").toString().replace("-", "") ) :0;
		
			paginationInfo.setTotalRecordCount(totCnt);
			model.addObject(Globals.JSON_RETURN_RESULT_LIST, codeList);
			model.addObject(Globals.JSON_PAGEINFO, paginationInfo);
		}catch(Exception e) {
			log.error("selectServiceInfoPageList error:" + e.toString());
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, e.toString());
		}
		return model;
	}
	@ApiOperation(value="서비스 정보 업데이트", notes="서비스 정보 업데이트")
	@PostMapping("updateService.do")
	public ModelAndView updateServiceInfo(@Valid @RequestBody ServiceInfoReqDto info
										, HttpServletRequest request)throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
			
			// 기존 세션 체크 인증에서 토큰 방식으로 변경
			if (!jwtVerification.isVerificationAdmin(request)) {
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확인
			}else {
				info.setUserId(jwtVerification.getTokenUserName(request));
			}
			
			int ret = serviceMangeServiec.updateServiceInfo(info);// .updateServerInfo();
		
			String status = (ret > 0) ? Globals.STATUS_SUCCESS : Globals.STATUS_FAIL;
			String message = (ret > 0) ? egovMessageSource.getMessage("success.request.msg") : 
									 egovMessageSource.getMessage("fail.request.msg");
			model.addObject(Globals.STATUS, status);
			model.addObject(Globals.STATUS_MESSAGE, message);
		}catch(Exception e) {
			log.error("updateServiceInfo error:" + e.toString());
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
				model.addObject(Globals.STATUS_MESSAGE, e.toString());
		}
		return model;
	}
	@ApiOperation(value="서비스 정보 삭제", notes="서비스 정보 삭제 시 시스템 정보 및 OID 정보 삭제")
	@ApiImplicitParam(name = "serviceSeq", value = "서비스 정보 생성시 발급되는 serverCode")
	@DeleteMapping("service/{serviceSeq}.do")
	public ModelAndView deleteServiceDetailInfo(@PathVariable String serviceSeq
												, HttpServletRequest request)throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
			
			if (!jwtVerification.isVerificationAdmin(request)) {
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확인
			}
		
			int ret = serviceMangeServiec.deleteServiceInfo(serviceSeq);
			String status = (ret > 0) ? Globals.STATUS_SUCCESS : Globals.STATUS_FAIL;
			String message = (ret > 0) ? egovMessageSource.getMessage("success.common.delete") : 
										 egovMessageSource.getMessage("fail.request.msg");
			model.addObject(Globals.STATUS, status);
				model.addObject(Globals.STATUS_MESSAGE, message);
			 
		}catch(Exception e) {
			log.error("deleteServiceDetailInfo error:" + e.toString());
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, e.toString());
		}
		return model;
	}
	@ApiOperation(value="서비스 OID 정보 리스트", notes="서비스 OID 정보 리스트")
	@PostMapping("oid/list.do")
	public ModelAndView  selectServiceOidInfoPageList(@RequestBody Map<String, Object> searchMap 
												 , HttpServletRequest request
												 , BindingResult bindingResult) throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
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
		    
			List<Map<String, Object>> codeList = (List<Map<String, Object>>) oidService.selectServiceOidInfoPageList(searchMap);
			int totCnt = codeList.size() > 0 ?  Integer.valueOf( codeList.get(0).get("totalRecordCount").toString().replace("-", "") ) :0;
			
			paginationInfo.setTotalRecordCount(totCnt);
			model.addObject(Globals.JSON_RETURN_RESULT_LIST, codeList);
			model.addObject(Globals.JSON_PAGEINFO, paginationInfo);
		}catch(Exception e) {
			log.error("selectServiceOidInfoPageList error:" + e.toString());
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, e.toString());
		}
		return model;
	}
	@ApiOperation(value="서비스 OID 정보 업데이트", notes="서비스 OID 정보 업데이트")
	@PostMapping("updateServiceOid.do")
	public ModelAndView updateServiceOidInfo(@Valid @RequestBody ServiceOidInfoReqDto info
										, HttpServletRequest request)throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
			
			// 기존 세션 체크 인증에서 토큰 방식으로 변경
			if (!jwtVerification.isVerificationAdmin(request)) {
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확인
			}else {
				info.setUserId(jwtVerification.getTokenUserName(request));
			}
			
			int ret = oidService.updateServiceOidInfo(info);
		
			String status = (ret > 0) ? Globals.STATUS_SUCCESS : Globals.STATUS_FAIL;
			String message = (ret > 0) ? egovMessageSource.getMessage("success.request.msg") : 
										 egovMessageSource.getMessage("fail.request.msg");
			model.addObject(Globals.STATUS, status);
				model.addObject(Globals.STATUS_MESSAGE, message);
		}catch(Exception e) {
			log.error("updateServiceOidInfo error:" + e.toString());
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, e.toString());
		}
		return model;
	}
	@ApiOperation(value="서비스 OID 정보 삭제", notes="서비스 OID 정보 삭제")
	@ApiImplicitParam(name = "oidSeq", value = "Oid 정보 생성시 발급되는 oidSeq")
	@DeleteMapping("oid/{oidSeq}.do")
	public ModelAndView deleteOidInfo(@PathVariable String oidSeq
												, HttpServletRequest request)throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
			
			if (!jwtVerification.isVerificationAdmin(request)) {
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확인
			}
		
			int ret = oidService.deleteServiceOidInfo(oidSeq);
			String status = (ret > 0) ? Globals.STATUS_SUCCESS : Globals.STATUS_FAIL;
			String message = (ret > 0) ? egovMessageSource.getMessage("success.common.delete") : 
										 egovMessageSource.getMessage("fail.request.msg");
			model.addObject(Globals.STATUS, status);
			model.addObject(Globals.STATUS_MESSAGE, message);
			 
		}catch(Exception e) {
			log.error("deleteOidInfo error:" + e.toString());
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, e.toString());
		}
		return model;
	}
	@ApiOperation(value="서비스 OID 정보 상세", notes="서비스 OID 정보 상세")
	@ApiImplicitParam(name = "oidSeq", value = "Oid 정보 생성시 발급되는 oidSeq")
	@GetMapping("oid/{oidSeq}.do")
	public ModelAndView selectOidOidInfo(@PathVariable String oidSeq
												, HttpServletRequest request)throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
			
			if (!jwtVerification.isVerificationAdmin(request)) {
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확인
			}
		
			Optional<ServiceOidInfoResDto> info = oidService.selectServiceOidInfoDetail(oidSeq);
			
			info.orElseThrow(() -> new IllegalArgumentException(egovMessageSource.getMessage("fial.common.info")));
			
			model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
			model.addObject(Globals.STATUS_REGINFO, info);
		}catch(Exception e) {
			log.error("selectOidOidInfo error:" + e.toString());
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, e.toString());
		}
		return model;
	}
	@ApiOperation(value="서비스 OID 통신 정보 상세", notes="서비스 OID 통신 정보  상세")
	@ApiImplicitParam(name = "oidSeq", value = "Oid 정보 생성시 발급되는 oidSeq")
	@GetMapping("oidView/{oidSeq}.do")
	public ModelAndView selectOidOidView(@PathVariable String oidSeq
												, HttpServletRequest request)throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
			
			if (!jwtVerification.isVerificationAdmin(request)) {
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확인
			}
		
			Optional<ServiceOidInfoResDto> info = oidService.selectServiceOidInfoDetail(oidSeq);
			if (info.isPresent()) {
				SnmpBuilder snmpBuilder = new SnmpBuilder();
				
				
				log.info("getServiceSnmpVersion:"  + info.get().getServiceSnmpVersion());
				
				
				//Snmp snmp = snmpBuilder.udp().v3().usm().threads(2).build();
				if (info.get().getServiceSnmpVersion().equals("SNMP_VERSION_1")) {
					Snmp snmp = snmpBuilder.udp().v1().threads(2).build();
				}else if  (info.get().getServiceSnmpVersion().equals("SNMP_VERSION_2")) {
					Snmp snmp = snmpBuilder.udp().v2c().threads(2).build();
					snmp.listen();
					
					Address targetAddress = GenericAddress.parse("udp:"+info.get().getServerIp()+"/161");
					
					Target<Address> target = new CommunityTarget<>();
					target.setSecurityName(new OctetString(info.get().getServiceSnmpCommunityName()));
					target.setTimeout(500);
					target.setRetries(1);
					target.setAddress(targetAddress);
					target.setVersion(TargetBuilder.SnmpVersion.v2c.getVersion());
	
					List<VariableBinding> list = new ArrayList<>();
					// OID = Object Name, Variable = Object Value
					log.info("getOidNumber:"  + info.get().getOidNumber());
					
					list.add(new VariableBinding(new OID( info.get().getOidNumber()))); 
	
					PDU pdu = new PDU();
					if (info.get().getOidResultType().equals("IPCC_SNMP_VALUE_GUBUN_1")) {
						pdu.setType(PDU.GET);
					}else if (info.get().getOidResultType().equals("IPCC_SNMP_VALUE_GUBUN_3")) {
						pdu.setType(PDU.GETNEXT);
					}else {
						pdu.setType(PDU.GETBULK);
					}
					log.info("getOidResultType:"  + info.get().getOidResultType());
					pdu.setRequestID(new Integer32(1));
					pdu.setVariableBindings(list);
					SnmpCompletableFuture snmpRequestFuture = SnmpCompletableFuture.send(snmp, target, pdu);
					
					log.info("snmpRequestFuture:");
					
					List<VariableBinding> vbs = snmpRequestFuture.get().getAll();
					
					System.out.println("Received: " + snmpRequestFuture.getResponseEvent().getResponse());
					System.out.println("Payload:  " + vbs);
					//
					
					if (snmpRequestFuture.getResponseEvent().getResponse().getErrorIndex() ==0 ) {
						model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
						model.addObject(Globals.STATUS_MESSAGE, vbs );
						
					}else {
						model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
						model.addObject(Globals.STATUS_MESSAGE, vbs );
					}
					snmp.close();
				}else {
					
					Snmp snmp = snmpBuilder.udp().v3().usm().threads(2).build();
					snmp.listen();
					Address targetAddress = GenericAddress.parse("udp:"+info.get().getServerIp()+"/161");
					byte[] targetEngineID = snmp.discoverAuthoritativeEngineID(targetAddress, 1000);
					if (targetEngineID != null) {
						TargetBuilder<?> targetBuilder = snmpBuilder.target(targetAddress);
						
						
						
						Target<?> userTarget = targetBuilder
								.user(info.get().getServiceSnmpId(), targetEngineID)
								.auth(TargetBuilder.AuthProtocol.sha1).authPassphrase(info.get().getServiceSnmpPassword())
								.priv(TargetBuilder.PrivProtocol.aes128).privPassphrase("")
								.done()
								.timeout(500).retries(1)
								.build();
						
						userTarget.setVersion(SnmpConstants.version3);
						
						log.info("===============   " + info.get().getServiceSnmpId());
						log.info("===============   " + info.get().getServiceSnmpPassword());
						log.info("===============   " + info.get().getServiceSnmpPrivacy());
						
						int type = 0;
						if (info.get().getOidResultType().equals("IPCC_SNMP_VALUE_GUBUN_1")) {
							type = PDU.GET;
						}else if (info.get().getOidResultType().equals("IPCC_SNMP_VALUE_GUBUN_3")) {
							type = PDU.GETNEXT;
						}else {
							type = PDU.REPORT;
						}
						
						
						PDU pdu = targetBuilder.pdu().type(type).oids(info.get().getOidNumber()).contextName(info.get().getServiceSnmpCommunityName()).build();
						log.info("===============   2" + type);
						SnmpCompletableFuture snmpRequestFuture = SnmpCompletableFuture.send(snmp, userTarget, pdu);
						log.info("===============   3");
						try {
							List<VariableBinding> vbs = snmpRequestFuture.get().getAll();
							
							System.out.println("Received: " + snmpRequestFuture.getResponseEvent().getResponse());
							System.out.println("Payload:  " + vbs);
							if (snmpRequestFuture.getResponseEvent().getResponse().getErrorIndex() ==0 ) {
								model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
								model.addObject(Globals.STATUS_MESSAGE, vbs );
								
							}else {
								model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
								model.addObject(Globals.STATUS_MESSAGE, vbs );
							}
						} catch (ExecutionException | InterruptedException ex) {
							if (ex.getCause() != null) {
								log.info("===============  ex.getCause()");
								System.err.println(ex.getCause().getMessage());
							} else {
								System.err.println("Request failed: "+ex.getMessage());
							}
						}
					}
				}
				
			}
			
			
			info.orElseThrow(() -> new IllegalArgumentException(egovMessageSource.getMessage("fial.common.info")));
			model.addObject(Globals.STATUS_REGINFO, info);
		}catch(Exception e) {
			log.error("selectOidOidInfo error:" + e.toString());
			log.debug("selectOidOidInfo line:" + e.getStackTrace()[0].getLineNumber());
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, e.toString());
		}
		return model;
	}
	@ApiOperation(value="서비스 healthCheck 상세", notes="서비스 healthCheck 정보 상세")
	@ApiImplicitParam(name = "serverCode", value = "서버 생성 코드")
	@GetMapping("check/{serverCode}.do")
	public ModelAndView selectHealthCheckOidInfo(@PathVariable String serverCode
												, HttpServletRequest request)throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
			
			if (!jwtVerification.isVerificationAdmin(request)) {
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확인
			}
			
			Optional<ServerInfo> info = serverMangeServiec.selectServerInfoDetail(serverCode);
			info.orElseThrow(() -> new IllegalArgumentException(egovMessageSource.getMessage("fial.common.info")));
			
			if (info.isPresent()) {
				
				
				String ping = pingCheck( info.get().getServerIp(), 2000) == true ? "true" : "fail";
				model.addObject(Globals.SSH_PING, ping);
				connSSH(info.get().getServerId(), info.get().getServerPassword(), info.get().getServerIp(), info.get().getServerPort() );
				getSSHResponse("\n");
				
				String cup = getSSHResponse(Globals.SSH_CPU_CMD);
				String memory = getSSHResponse(Globals.SSH_MEMORY_CMD);
				String hdd_info = getSSHResponse(Globals.SSH_HDD_CMD);
				String hdd_total = getSSHResponse(Globals.SSH_HDD_TOTAL_CMD);
				
				ServerStatusInfo status = ServerStatusInfo.builder()
																			.serverCode(serverCode)
																			.hddInfo(hdd_info)
																			.cpu(cup)
																			.ping(ping)
																			.memory(memory)
																			.hddTotalInfo(hdd_total)
																			.build();
				
				serverMangeServiec.insertServiceStatusInfo(status);
				
				model.addObject(Globals.SSH_CPU, cup);
				model.addObject(Globals.SSH_MEMORY, memory);
				model.addObject(Globals.SSH_HDD, hdd_info);
				model.addObject(Globals.SSH_HDD_TOTAL, hdd_total);
				disConnectSSH();
			}
			
			model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
			
		}catch(Exception e) {
			log.error("selectHealthCheckOidInfo error:" + e.toString());
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, e.toString());
		}
		return model;
	}
	private void connSSH(String userId,  String pwd, String host, String port) throws JSchException{
		session = new JSch().getSession(userId, host, Integer.parseInt(port));
		session.setPassword(pwd);
		session.setX11Host(host);
		int xport=0;
		session.setX11Port(xport);
		
	
		session.setConfig("StrictHostKeyChecking", "no");
		log.info("Connect==================");
		session.connect();
		
		log.info("Connected"+session.isConnected());
	}
	private void disConnectSSH() {
		if (session != null) session.disconnect();
		if (channelExec != null) channelExec.disconnect();
	}
	private boolean pingCheck(String ip, int timeout) throws Exception {
		InetAddress target = InetAddress.getByName(ip);
		return target.isReachable(timeout);
	}
	public String getSSHResponse( String command) throws IOException {
		String sshResult = "";
		try {
			
			//connSSH(userId, pwd, host, port);
			channelExec = (ChannelExec) session.openChannel("exec");
			log.info("command:" + command);
			channelExec.setCommand(command);
			
			InputStream inputStream = channelExec.getInputStream();
			channelExec.connect();
			
			byte[] buffer = new byte[8192];
			int decodedLength;
			StringBuilder response = new StringBuilder();
			while ((decodedLength = inputStream.read(buffer, 0, buffer.length)) > 0) {
				response.append(new String(buffer, 0, decodedLength));
			}
			sshResult = 	response.toString();
		
		
		} catch (JSchException e) {
			log.error("JSchException");
		} finally {
			//this.disConnectSSH();
		}
		return sshResult;
	}
}
