package com.system.backoffice.sys.rabbitmq.web;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.egovframe.rte.ptl.mvc.tags.ui.pagination.PaginationInfo;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.rabbitmq.client.AMQP;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.system.backoffice.sym.log.annotation.NoLogging;
import com.system.backoffice.sys.rabbitmq.models.AmqpConfigInfo;
import com.system.backoffice.sys.rabbitmq.models.dto.AmqpConfigInfoDto;
import com.system.backoffice.sys.rabbitmq.models.dto.ExchangeInfoReqDto;
import com.system.backoffice.sys.rabbitmq.models.dto.QueueInfoReqDto;
import com.system.backoffice.sys.rabbitmq.service.AmqpConfigInfoManageService;
import com.system.backoffice.sys.rabbitmq.service.QueueInfoManageService;
import com.system.backoffice.util.service.UtilInfoService;

import egovframework.com.cmm.EgovMessageSource;
import egovframework.com.cmm.service.Globals;
import egovframework.com.cmm.service.ResultVO;
import egovframework.com.jwt.config.JwtVerification;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/backoffice/sys/message/amqp")
public class AmqpConfigInfoManageController {

	@Value("${page.pageUnit}")
	private int pageUnitSetting ;
	
	@Value("${page.pageSize}")
	private int pageSizeSetting ;
	
	@Value("${spring.rabbitmq.host}")
	private String host;
	
	@Value("${spring.rabbitmq.username}")
	private String username;
	
	@Value("${spring.rabbitmq.password}")
	private String password;
	
	@Value("${spring.rabbitmq.port}")
	private int port;
	
	@Autowired
	private AmqpConfigInfoManageService messageAmqpService;
	
	@Autowired
	protected EgovMessageSource egovMessageSource;
	
	@Autowired
	protected QueueInfoManageService queueService;
	
	/** JwtVerification */
	@Autowired
	private JwtVerification jwtVerification;
	
	@Autowired
	private RabbitTemplate rabbitTemplate;

	
	@ApiOperation(value="메세지 서비스 조회", notes = "성공시 메세지 서비스을 조회 합니다.")
	@PostMapping(value="systemAmqpList.do")
	public ModelAndView selectAmqpInfoManageListByPagination(@RequestBody Map<String, Object> searchMap, 
																HttpServletRequest request, 
																BindingResult bindingResult) throws Exception {
		
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
			
			if (!jwtVerification.isVerificationAdmin(request)) {
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확
			}else {
				//여기 부분 수정 
				String[] userInfo = jwtVerification.getTokenUserInfo(request);
				searchMap.put("roleId", userInfo[2]);
				searchMap.put("partId", userInfo[3]);
			}
			
			int pageUnit = searchMap.get(Globals.PAGE_UNIT) == null ?   pageUnitSetting : Integer.valueOf((String) searchMap.get(Globals.PAGE_UNIT));
			int pageSize = searchMap.get(Globals.PAGE_SIZE) == null ?   pageSizeSetting : Integer.valueOf((String) searchMap.get(Globals.PAGE_SIZE));  
		
	
		
			/** pageing */
			PaginationInfo paginationInfo = new PaginationInfo();
			paginationInfo.setCurrentPageNo( Integer.valueOf( searchMap.get(Globals.PAGE_INDEX) == null  ?
															  "1" : searchMap.get(Globals.PAGE_INDEX).toString() ));
			paginationInfo.setRecordCountPerPage(pageUnit);
			paginationInfo.setPageSize(pageSize);
		
			searchMap.put(Globals.PAGE_FIRST_INDEX, paginationInfo.getFirstRecordIndex());
			searchMap.put(Globals.PAGE_LAST_INDEX, paginationInfo.getLastRecordIndex());
			searchMap.put(Globals.PAGE_RECORD_PER_PAGE, paginationInfo.getRecordCountPerPage());
			List<Map<String, Object>> codeList = messageAmqpService.selectAmqpConfigInfoManageListByPagination(searchMap);
			int totCnt = codeList.size() > 0 ?  Integer.valueOf( codeList .get(0).get("totalRecordCount").toString()) :0;
		
			paginationInfo.setTotalRecordCount(totCnt);
			
			model.addObject(Globals.STATUS_REGINFO, searchMap);
			model.addObject(Globals.JSON_RETURN_RESULT_LIST, codeList);
			model.addObject(Globals.PAGE_TOTAL_COUNT, totCnt);
			model.addObject(Globals.JSON_PAGEINFO, paginationInfo);
			model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
			
			
		}catch (NullPointerException e) {
			log.error("ERROR:" + e.toString());
		} catch (Exception e) {
			log.error("ERROR:" + e.toString());
		}
		return model;
	}
	@ApiOperation(value="메세지 서비스 상세 조회", notes = "성공시 메세지 서비스를 상세 조회 합니다.")
	@GetMapping(value="detail.do")
	public ModelAndView selectCenterInfoManageDetail(@RequestParam Map<String, Object> amqp, 
													HttpServletRequest request) throws Exception {
		
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
			if (!jwtVerification.isVerificationAdmin(request)) {
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확
			}
			
			Optional<AmqpConfigInfo> info = messageAmqpService.selectAmqpConfigDetail(amqp.get("systemCode").toString(),
																					amqp.get("messageType").toString(),
																					amqp.get("messageExchangeName").toString());
			if (info.isPresent()){
				model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
				model.addObject(Globals.STATUS_REGINFO, info.get());
			}else {
				model.addObject(Globals.STATUS_MESSAGE, this.egovMessageSource.getMessage("fail.request.msg"));
				model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			}
		}catch(Exception e) {
			model.addObject(Globals.STATUS_MESSAGE, this.egovMessageSource.getMessage("fail.request.msg"));
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
		}
		
		return model;
	}
	// fanoutExchange 설정 
	
	//Queues  삭제 방법
	@ApiOperation(value="메세지 Queues 생성", notes = "성공시 메세지 Queues 생성 합니다.")
	@GetMapping(value="createQueues.do")
	public ModelAndView createQueuesInfo(@RequestParam Map<String, Object> amqp, 
															HttpServletRequest request) throws Exception {
		
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		try {
			if (!jwtVerification.isVerificationAdmin(request)) {
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 생성
			}
			
			String gubun = UtilInfoService.NVL(amqp.get("gubun"),"ipcc.queue");
			String queue = UtilInfoService.NVL(amqp.get("queue"),"ipcc.queue");
			String processNm = UtilInfoService.NVL(amqp.get("processNm"),"ipcc.queue");
			String routingKey = UtilInfoService.NVL(amqp.get("routingKey"),"ipcc.queue");
			String type = UtilInfoService.NVL(amqp.get("type"),"direct");
			
			ConnectionFactory factory = new ConnectionFactory();
			factory.setHost(host);
			factory.setPort(port);
			factory.setUsername(username);
			factory.setPassword(password);
			
			String status = "";
			String message = "";
			try (Connection connection = (Connection) factory.newConnection(); ) {
				
				
				Channel channel = connection.createChannel();
				switch (gubun) {
					case "queue" :
						
						try {
							AMQP.Queue.DeclareOk declareOkExists = channel.queueDeclarePassive(queue);
							message = "Exists";
							status = Globals.STATUS_FAIL;
						}catch (Exception e1) {
							Channel channel1 = connection.createChannel();
							boolean duration = routingKey.equals("Y") ? true: false;
							boolean autoDelete = type.equals("Y") ? true: false;
							AMQP.Queue.DeclareOk declareOk = channel1.queueDeclare(queue, duration, false, autoDelete, null);
							
							QueueInfoReqDto info = QueueInfoReqDto.builder()
																						.queueNm(queue)
																						.queueDuration(routingKey)
																						.queueAutodelete(type)
																						.userId(jwtVerification.getTokenUserName(request))
																						.build();
							
							int ret = queueService.insertQueueInfo(info);
							status = ret >0 ? Globals.STATUS_SUCCESS : Globals.STATUS_FAIL;
							
							channel1.close();
							message =  ret >0 ?  "정상 등록 되었습니다.":  "처리 도중 문제가 발생 하였습니다.";
						}
						break;
					case "exchange" :
						
						try {
							
							AMQP.Exchange.DeclareOk declareOkExists1 = channel.exchangeDeclarePassive(processNm);
							message = "Exists";
						}catch (Exception e1) {
							//exchange 설정
						
							Channel channel1 = connection.createChannel();
							//AMQP.Exchange.DeclareOk ExchangedeclareOk = channel1.exchangeDeclare("ivr-topic", "topic");
							AMQP.Exchange.DeclareOk ExchangedeclareOk = channel1.exchangeDeclare(processNm, type);
							
							
							channel1.queueBind(queue, processNm, routingKey);
							channel1.close();
							ExchangeInfoReqDto info = ExchangeInfoReqDto.builder()
																					.exchangeName(processNm)
																					.queueNm(queue)
																					.exchangeRoutingKey(routingKey)
																					.exchangeType(type)
																					.userId(jwtVerification.getTokenUserName(request))
																					.build();
							int ret = queueService.insertExchangeInfo(info);
							status = ret >0 ? Globals.STATUS_SUCCESS : Globals.STATUS_FAIL;
							message =  ret >0 ?  "정상 등록 되었습니다.":  "처리 도중 문제가 발생 하였습니다.";
						}
						break;
				}
				if (channel.isOpen())
					channel.close();
				
			}
			
			model.addObject(Globals.STATUS, status);
			model.addObject(Globals.STATUS_REGINFO,message);
			
		}catch(Exception e) {
			model.addObject(Globals.STATUS_MESSAGE, this.egovMessageSource.getMessage("fail.request.msg") + e.toString());
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
		}
		
		return model;
	}
	
	@ApiOperation(value="메세지 Queues 삭제", notes = "성공시 메세지 Queues 삭제 합니다.")
	@GetMapping(value="deleteQueues.do")
	public ModelAndView deleteQueuesInfo(@RequestParam Map<String, Object> amqp, 
															HttpServletRequest request) throws Exception {
		
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		String status = "";
		String message = "";
		try {
			if (!jwtVerification.isVerificationAdmin(request)) {
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 생성
			}
			String gubun = UtilInfoService.NVL(amqp.get("gubun"),"ipcc.queue");
			//processNm 
			String processNm = UtilInfoService.NVL(amqp.get("processNm"),"ipcc.queue");
			ConnectionFactory factory = new ConnectionFactory();
			factory.setHost(host);
			factory.setPort(port);
			factory.setUsername(username);
			factory.setPassword(password);
			
			try(Connection connection = (Connection) factory.newConnection(); Channel channel = connection.createChannel() ){
				
				switch (gubun) {
					case "queue" :
						AMQP.Queue.DeclareOk declareOkExists = channel.queueDeclarePassive(processNm);
						if (declareOkExists.toString().contains("ok")) {
							channel.queueDelete(processNm) ;
							int ret = queueService.deleteQueueInfo(processNm);
							status = ret >0 ? Globals.STATUS_SUCCESS : Globals.STATUS_FAIL;
							message =  ret >0 ?  "정상 삭제 되었습니다.":  "처리 도중 문제가 발생 하였습니다.";
						}else {
							status = Globals.STATUS_FAIL;
							message = "존재하지 않은 큐 정보 입니다.";
						}
						break;
					case "exchange" :
						try {
							AMQP.Exchange.DeclareOk declareOkExists1 = channel.exchangeDeclarePassive(processNm);
							if (declareOkExists1.toString().contains("ok")) {
								channel.exchangeDelete(processNm);
								int ret = queueService.deleteExchangeInfo(processNm);
								status = ret >0 ? Globals.STATUS_SUCCESS : Globals.STATUS_FAIL;
								message =  ret >0 ?  "정상 삭제 되었습니다.":  "처리 도중 문제가 발생 하였습니다.";
							}
						}catch(Exception e) {
							status = Globals.STATUS_FAIL;
							message = "존재하지 않은 Exchange 정보 입니다.";
						}
						
						break;
				}
			}
			
			model.addObject(Globals.STATUS, status);
			model.addObject(Globals.STATUS_REGINFO,message);
		}catch(Exception e) {
			model.addObject(Globals.STATUS_MESSAGE, this.egovMessageSource.getMessage("fail.request.msg"));
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
		}
		
		return model;
	}
	
	@ApiOperation(value="메세지 서비스 삭제", notes = "성공시 메세지 서비스를 삭제 합니다.")
	@DeleteMapping(value="delete.do")
	public ModelAndView deleteCenterInfo(@RequestParam Map<String, Object> amqp,
										HttpServletRequest request, 
										BindingResult bindingResult) throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);

		try {
			if (!jwtVerification.isVerificationAdmin(request)) {
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확
			}
			int ret = messageAmqpService.deleteAmqpConfigInfo(amqp.get("systemCode").toString(),
																amqp.get("messageType").toString(),
																amqp.get("messageExchangeName").toString());
			if (ret > 0) {
					model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
				model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("success.common.delete"));
			}
			else {
				model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, egovMessageSource.getMessage("fail.common.delete"));
			}
		} catch (NullPointerException e) {
			model.addObject(Globals.STATUS_MESSAGE, this.egovMessageSource.getMessage("fail.request.msg"));
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
		}catch (Exception e) {
			model.addObject(Globals.STATUS_MESSAGE, this.egovMessageSource.getMessage("fail.request.msg"));
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
		}

		return model;
	}
	@NoLogging
	@ApiOperation(value="메세지 서비스 업데이트", notes = "성공시 메세지 서비스 업데이트 합니다.")
	@PostMapping(value="centerUpdate.do")
	public ModelAndView updateCenterInfoManage(@Valid @RequestBody AmqpConfigInfoDto info,
												HttpServletRequest request) throws Exception {
		ModelAndView model = new ModelAndView(Globals.JSON_VIEW);
		
		try {
			if (!jwtVerification.isVerificationAdmin(request)) {
				ResultVO resultVO = new ResultVO();
				return jwtVerification.handleAuthError(resultVO); // 토큰 확
			}else {
				info.setUserId(jwtVerification.getTokenUserName(request));
			}
			
			
			String meesage = "";
			model.addObject(Globals.STATUS_REGINFO, info);
		
			int ret = this.messageAmqpService.updateAmqpConfigInfo(info);
			if (ret > 0) {
				model.addObject(Globals.STATUS, Globals.STATUS_SUCCESS);
				meesage = info.getMode().equals("Ins") ? "success.common.insert": "success.common.update";
				model.addObject(Globals.STATUS_MESSAGE,	this.egovMessageSource.getMessage(meesage));
			} else {
				throw new Exception();
			}
		}catch (NullPointerException e) {
			log.debug("error:" + e.toString());
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, this.egovMessageSource.getMessage("fail.common.insert"));
		}catch (Exception e) {
			log.debug("error:" + e.toString());
			model.addObject(Globals.STATUS, Globals.STATUS_FAIL);
			model.addObject(Globals.STATUS_MESSAGE, this.egovMessageSource.getMessage("fail.common.insert"));
		} 
		
		
		return model;
	}
}
