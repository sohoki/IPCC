package com.system.backoffice.sym.log.annotation;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import java.util.function.Predicate;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.egovframe.rte.fdl.cmmn.exception.manager.AbstractExceptionHandleManager;
import org.egovframe.rte.fdl.cmmn.exception.manager.ExceptionHandlerService;
import org.mybatis.spring.MyBatisSystemException;
import org.mybatis.spring.SqlSessionTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import com.system.backoffice.sym.log.service.EgovSysLogService;
import com.system.backoffice.sys.rabbitmq.models.MessageConfigInfo;
import com.system.backoffice.sys.rabbitmq.models.dto.MessageDto;
import com.system.backoffice.sys.rabbitmq.service.MessageConfigInfoService;
import com.system.backoffice.sys.rabbitmq.service.MessageService;
import com.system.backoffice.uat.uia.models.AdminInfoVO;
import com.system.backoffice.uat.uia.models.PartInfo;
import com.system.backoffice.util.service.ParamToJson;
import egovframework.com.cmm.EgovMessageSource;
import egovframework.com.cmm.service.Globals;
import egovframework.com.jwt.config.JwtVerification;
import egovframework.let.utl.sim.service.EgovClntInfo;
import lombok.extern.slf4j.Slf4j;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import org.springframework.util.StopWatch;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.ModelAndView;
// spring security 사용 안함
//import org.springframework.security.web.servletapi.SecurityContextHolderAwareRequestWrapper;

@Slf4j
@Aspect
@Component
public class SysLogAspect extends AbstractExceptionHandleManager implements ExceptionHandlerService{

 	public static final String KEY_ECODE = "ecode";
 	
	@Value("${rabbitmq.topic.name}")
	private String exchangeName;

	@Value("${rabbitmq.topic.key}")
	private String routingKey;
	
	@Autowired
	protected EgovMessageSource egovMessageSource;
	/*
	@Autowired
	private EgovSysLogService sysLogService;
	*/
	@Autowired
	private MessageConfigInfoService messageConfig;
	
	@Autowired
	private MessageService messageService;
	
	/** JwtVerification */
	@Autowired
	private JwtVerification jwtVerification;
	
	private static ObjectMapper objectMapper;
	static {
		objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
	}
	private static <T> Predicate<T> not(Predicate<T> p) { return o -> !p.test(o); }
	
	
	private String fillParameters(String statement, Object[] sqlArgs){
		StringBuilder completedSqlBuilder = new StringBuilder(Math.round(statement.length() * 1.2f));
		int index, prevIndex = 0;
		
		for (Object arg: sqlArgs){
			index = statement.indexOf("?", prevIndex);
			if (index == -1)
				completedSqlBuilder.append(statement.substring(prevIndex, index));
			
			if(arg == null)
				completedSqlBuilder.append("NULL");
			else
				completedSqlBuilder.append(":"+ arg.toString());
			prevIndex = index + 1;
		}
		if (prevIndex != statement.length())
			completedSqlBuilder.append(statement.substring(prevIndex));
		
		return completedSqlBuilder.toString();
	}
	@SuppressWarnings("unused")
	private void mapperSelect(ProceedingJoinPoint joinPoint) throws Throwable {
		log.debug("mapper--------------------------------------------------------------------------------------------------------------");
 		StopWatch stopWatch = new StopWatch();
 		//Object sqlid  = null;
		try {
			stopWatch.start();
			Object[] methodArgs = joinPoint.getArgs(); //, sqlArgs = null;
			log.debug("length:" + methodArgs.length);
			for (Object  methodArg : methodArgs){
				log.debug("methodArg:" + methodArg.toString());
			}
			stopWatch.stop();
			//return retValue;
		} catch (Throwable e) {
			throw e;
		}
	}
	@Around("execution(public * com.system.backoffice..web.*Controller.*Message(..))")	
	public Object logMessageUpdate(ProceedingJoinPoint joinPoint) throws Throwable {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
		Class<?> clazz = joinPoint.getTarget().getClass();
		Object result = null; 
		Object sqlId  = null;
		
		StopWatch stopWatch = new StopWatch();
		try {
			log.info(" [" + clazz.getSimpleName() + "] ---------------------------------------------------------------------------------//");
			
			
			Arrays.stream(joinPoint.getArgs())
				.filter(not(HttpSession.class::isInstance))
				.filter(not(HttpServletRequest.class::isInstance))
				.filter(not(BeanPropertyBindingResult.class::isInstance))
				.forEach(arg -> {
					try {
						log.info(" (" + joinPoint.getSignature().getName() + ") Controller Parameters: mapper " + objectMapper.writeValueAsString(arg));
					
					} catch (Exception e) {
						log.info(" (" + joinPoint.getSignature().getName() + ") Controller Parameters: arg " + arg);
					}
			});
			
			stopWatch.start();
			Object[] methodArgs = joinPoint.getArgs();
			
			if (methodArgs.length > 0){
				
				sqlId = methodArgs[0];
			}
			
			result = joinPoint.proceed();
			return result;
		} catch (Throwable e) {
			throw e;
		} finally {
			stopWatch.stop();
			if (result instanceof ModelAndView  && result != null) {
				ModelAndView mav = ((ModelAndView) result);
				if (!mav.getModel().isEmpty()) {
					log.info(" ["+ clazz.getSimpleName() +"] ---------------------------------------------------------------------------------//\n(" + joinPoint.getSignature().getName() + ") Controller Return: " + mav.getModel());
				}
			}
			
			// List Check
			Object processSqlId = sqlId;  
			if (sqlId instanceof List) { 
				List<?> list = (List<?>) sqlId;
				if (!list.isEmpty()) {
					processSqlId = list.get(0);  
					
				}
			}
			
			
			final String processSeCode = joinPoint.getSignature().getName().contains("delete") ? Globals.SYSLOG_PROCESS_SE_CODE_DELETE : 
					ParamToJson.JsonKeyToString(processSqlId, "mode").equals(Globals.SAVE_MODE_INSERT) 
					? Globals.SYSLOG_PROCESS_SE_CODE_INSERT : Globals.SYSLOG_PROCESS_SE_CODE_UPDATE;
			final String ipAddr = EgovClntInfo.getClntIP(request);
			final String processTime = Long.toString(stopWatch.getTotalTimeMillis());
			
			log.info("HttpStatus.OK.value():"+ HttpStatus.OK.value());
			log.info("processSeCode:"+ processSeCode);
			log.info("getSimpleName:"+ clazz.getSimpleName());
			log.info("getName:"+joinPoint.getSignature().getName());
			log.info("sqlId:"+sqlId);
			
			
			
			Optional<MessageConfigInfo> config = messageConfig.selectMessageConfigInfoDetail(joinPoint.getSignature().getName());
			if (config.isPresent() && HttpStatus.OK.value() == 200) {
				
				String mode ="";
				String ID ="";
				
				if (!processSeCode.equals("D") && joinPoint.getSignature().getName().equals("updateMangerMessage") ) {
					log.info("======================== 관리자:");
					ObjectMapper mapper = new ObjectMapper();
					AdminInfoVO vo = mapper.readValue(ParamToJson.paramToJson(sqlId), AdminInfoVO.class);
					mode = vo.getMode();
					ID = vo.getAdminId();
				}else if (!processSeCode.equals("D") && joinPoint.getSignature().getName().equals("partInfoUpdateMessage") ) {
					log.info("======================== 부서:");
					ObjectMapper mapper = new ObjectMapper();
					PartInfo vo = mapper.readValue(ParamToJson.paramToJson(sqlId), PartInfo.class);
					mode = vo.getMode();
					ID = vo.getPartId();
				}else if (!processSeCode.equals("D") && joinPoint.getSignature().getName().equals("partInfoUpdateMessage") ) {
					log.info("======================== 부서:");
					ObjectMapper mapper = new ObjectMapper();
					PartInfo vo = mapper.readValue(ParamToJson.paramToJson(sqlId), PartInfo.class);
					mode = vo.getMode();
					ID = vo.getPartId();
				}else {
					mode = Globals.URL_METHOD_DELETE_MODE;
					ID = sqlId.toString();
				}	
				log.info("======================== 2:");
				String url = config.get().getMsgUrl().length() > 0 ? config.get().getMsgUrl()+ID+".do" : "";
				MessageDto dto =  MessageDto.builder()
						.id(ID)
						.processGubun(mode)
						.processName(config.get().getMsgGubun())
						.urlMethod(config.get().getMsgSendGubun())
						.url(url)
						.build();
				messageService.sendMessage(dto, 
						config.get().getMsgGubun(), 
						config.get().getExchangeName(),
						config.get().getExchangeRoutingKey());
				
				
				
				
			}
			
			
			
			// 시스템 로그 기록
			/*
			SysLog sysLog = new SysLog();
			sysLog.setErrorCode(HttpStatus.OK.value()+"");
			sysLog.setSrvcNm(clazz.getSimpleName());
			sysLog.setMethodNm(joinPoint.getSignature().getName());
			sysLog.setProcessSeCode(processSeCode);
			sysLog.setProcessTime(processTime);
			sysLog.setRqesterIp(ipAddr);
			sysLog.setRqesterId(userId);
			sysLog.setSqlParam(ParamToJson.paramToJson(sqlId));
			sysLogService.logInsertSysLog(sysLog);
			*/
		}
	}
	/**
	 * 데이터 업데이트 관련 Controller 호출 시
	 * @param joinPoint
	 * @return
	 * @throws Throwable
	 */
	@Around("execution(public * egovframework.let..web.*Controller.update*(..)) || execution(public * com.system.backoffice..web.*Controller.update*(..))"
			+ " &&  !@target(com.system.backoffice.sym.log.annotation.NoLogging)"
            + " &&  !@annotation(com.system.backoffice.sym.log.annotation.NoLogging))")	
	public Object logUpdate(ProceedingJoinPoint joinPoint) throws Throwable {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
		Class<?> clazz = joinPoint.getTarget().getClass();
		Object result = null; 
		Object sqlId  = null;
		
		StopWatch stopWatch = new StopWatch();
		try {
			log.info(" [" + clazz.getSimpleName() + "] ---------------------------------------------------------------------------------//");
			Arrays.stream(joinPoint.getArgs())
				.filter(not(HttpSession.class::isInstance))
				.filter(not(HttpServletRequest.class::isInstance))
				.filter(not(BeanPropertyBindingResult.class::isInstance))
				.forEach(arg -> {
					try {
						log.info(" (" + joinPoint.getSignature().getName() + ") Controller Parameters: mapper " + objectMapper.writeValueAsString(arg));
					} catch (Exception e) {
						log.info(" (" + joinPoint.getSignature().getName() + ") Controller Parameters: arg " + arg);
					}
			});
			
			stopWatch.start();
			Object[] methodArgs = joinPoint.getArgs();
			if (methodArgs.length > 0){
				sqlId = methodArgs[0];
			}
			
			result = joinPoint.proceed();
			return result;
		} catch (Throwable e) {
			throw e;
		} finally {
			stopWatch.stop();
			if (result instanceof ModelAndView  && result != null) {
				ModelAndView mav = ((ModelAndView) result);
				if (!mav.getModel().isEmpty()) {
					log.info(" ["+ clazz.getSimpleName() +"] ---------------------------------------------------------------------------------//\n(" + joinPoint.getSignature().getName() + ") Controller Return: " + mav.getModel());
				}
			}
			
			// List Check
	        Object processSqlId = sqlId;  
	        if (sqlId instanceof List) { 
	            List<?> list = (List<?>) sqlId;
	            if (!list.isEmpty()) {
	            	processSqlId = list.get(0);  
	            }
	        }
			
			final String processSeCode = ParamToJson.JsonKeyToString(processSqlId, "mode").equals(Globals.SAVE_MODE_INSERT) 
					? Globals.SYSLOG_PROCESS_SE_CODE_INSERT : Globals.SYSLOG_PROCESS_SE_CODE_UPDATE;
			final String ipAddr = EgovClntInfo.getClntIP(request);
			final String processTime = Long.toString(stopWatch.getTotalTimeMillis());
			
			final String userId =  jwtVerification.getTokenUserName(request);
			// 시스템 로그 기록
			/*
			SysLog sysLog = new SysLog();
			sysLog.setErrorCode(HttpStatus.OK.value()+"");
			sysLog.setSrvcNm(clazz.getSimpleName());
			sysLog.setMethodNm(joinPoint.getSignature().getName());
			sysLog.setProcessSeCode(processSeCode);
			sysLog.setProcessTime(processTime);
			sysLog.setRqesterIp(ipAddr);
			sysLog.setRqesterId(userId);
			sysLog.setSqlParam(ParamToJson.paramToJson(sqlId));
			sysLogService.logInsertSysLog(sysLog);
			*/
		}
	}
	/**
	 * 데이터 조회 관련 Controller 호출 시
	 * @param joinPoint
	 * @return
	 * @throws Throwable
	 */
	/*
	@Around("execution(public * egovframework.let..web.*Controller.select*(..)) || execution(public * com.system.backoffice..web.*Controller.select*(..))"
			+ " && !@target(com.system.backoffice.sym.log.annotation.NoLogging)"
            + " && !@annotation(com.system.backoffice.sym.log.annotation.NoLogging))")	
	public Object logSelect(ProceedingJoinPoint joinPoint) throws Throwable {
		
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
		Class<?> clazz = joinPoint.getTarget().getClass();
		Object result = null;
		Object sqlId  = null;
		
		StopWatch stopWatch = new StopWatch();
		try {
			log.info(" [" + clazz.getSimpleName() + "] ---------------------------------------------------------------------------------//");
			Arrays.stream(joinPoint.getArgs())
				.filter(not(HttpSession.class::isInstance))
				.filter(not(HttpServletRequest.class::isInstance))
				.filter(not(BeanPropertyBindingResult.class::isInstance))
				.forEach(arg -> {
					try {
						log.info(" (" + joinPoint.getSignature().getName() + ") Controller Parameters: " + objectMapper.writeValueAsString(arg));
					} catch (Exception e) {
						log.info(" (" + joinPoint.getSignature().getName() + ") Controller Parameters: " + arg);
					}
				});
			
			stopWatch.start();
			Object[] methodArgs = joinPoint.getArgs();
			if (methodArgs.length > 0) {
				sqlId = methodArgs[0];
			}
			result = joinPoint.proceed();
			return result;
		} catch (Throwable e) {
		    throw e;
		} finally {
			stopWatch.stop();
			if (result instanceof ModelAndView  && result != null) {
				ModelAndView mav = ((ModelAndView) result);
				if (!mav.getModel().isEmpty()) {
					log.info(" ["+ clazz.getSimpleName() +"] ---------------------------------------------------------------------------------//\n(" + joinPoint.getSignature().getName() + ") Controller Return: " + mav.getModel());
				}
			}
			
			final String processSeCode = Globals.SYSLOG_PROCESS_SE_CODE_SELECT;
			final String ipAddr = EgovClntInfo.getClntIP(request);
			final String processTime = Long.toString(stopWatch.getTotalTimeMillis());
			/*
			if (jwtVerification.isVerificationAdmin(request)) {
				
				final String userId =  jwtVerification.getTokenUserName(request);
				// 시스템 로그 기록
				SysLog sysLog = new SysLog();
				sysLog.setErrorCode(HttpStatus.OK.value()+"");
				sysLog.setSrvcNm(clazz.getSimpleName());
				sysLog.setMethodNm(joinPoint.getSignature().getName());
				sysLog.setProcessSeCode(processSeCode);
				sysLog.setProcessTime(processTime);
				sysLog.setRqesterIp(ipAddr);
				sysLog.setRqesterId(userId);
				sysLog.setMethodResult(ParamToJson.paramToJson(result));
				sysLogService.logInsertSysLog(sysLog);
			}else {
				LOGGER.debug("====================== TOKEN 만료");
			}

		}
		
	}
	*/
	/**
	 * 데이터 삭제 관련 Controller 호출 후 반환 시 
	 * @param joinPoint
	 * @param result
	 * @throws Throwable
	 */
	@Around("execution(public * egovframework.let..web.*Controller.delete*(..)) || execution(public * com.system.backoffice..web.*Controller.delete*(..))"
			 + " && !@target(com.system.backoffice.sym.log.annotation.NoLogging)"
	         + " && !@annotation(com.system.backoffice.sym.log.annotation.NoLogging))")
	public Object logDelete(ProceedingJoinPoint joinPoint) throws Throwable {
		HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
		Class<?> clazz = joinPoint.getTarget().getClass();
		Object result = null;
		Object sqlId  = null;
		
		StopWatch stopWatch = new StopWatch();
		try {
			stopWatch.start();
			Object[] methodArgs = joinPoint.getArgs(); //, sqlArgs = null;
			if (methodArgs.length > 0){
				sqlId = methodArgs[0];
			}
			result = joinPoint.proceed();
			return result;
		} catch (Throwable e) {
			throw e;
		} finally {
			stopWatch.stop();
			/*
			if (result instanceof ModelAndView  && result != null) {
				ModelAndView mav = ((ModelAndView) result);
				if (!mav.getModel().isEmpty()) {
					LOGGER.info(" ["+ clazz.getSimpleName() +"] ---------------------------------------------------------------------------------//\n(" + joinPoint.getSignature().getName() + ") Controller Return: " + mav.getModel());
				}
			}
			
			final String processSeCode = Globals.SYSLOG_PROCESS_SE_CODE_DELETE;
			final String ipAddr = EgovClntInfo.getClntIP(request);
			final String processTime = Long.toString(stopWatch.getTotalTimeMillis());
			final String userId =  jwtVerification.getTokenUserName(request);
			// 시스템 로그 기록
			SysLog sysLog = new SysLog();
			sysLog.setErrorCode(HttpStatus.OK.value()+"");
			sysLog.setSrvcNm(clazz.getSimpleName());
			sysLog.setMethodNm(joinPoint.getSignature().getName());
			sysLog.setProcessSeCode(processSeCode);
			sysLog.setProcessTime(processTime);
			sysLog.setRqesterIp(ipAddr);
			sysLog.setRqesterId(userId);
			sysLogService.logInsertSysLog(sysLog);
			*/
		}
		
	}
	/**
	 * Contoller 호출 후 오류 발생 시 
	 * @param joinPoint
	 * @param error
	 * @throws Exception
	 */
	@AfterThrowing(pointcut = "execution( public * egovframework.let..web.*Controller.*(..)) or execution(* com.system.backoffice..web.*Controller.*(..))"
					+ " and !@target(com.system.backoffice.sym.log.annotation.NoLogging)"
					+ " and !@annotation(com.system.backoffice.sym.log.annotation.NoLogging))", throwing = "error")
	public void logUpdateThrow(JoinPoint joinPoint, Exception error) throws Exception  {
		Class<?> clazz = joinPoint.getTarget().getClass();
		if (error.getClass().equals(MyBatisSystemException.class) || error.getClass().getName().contains("org.springframework.jdbc")) {
			log.error(" ["+ clazz.getSimpleName() +"] ---------------------------------------------------------------------------------//\n(" + joinPoint.getSignature().getName() + ") Implement Throwable: " + error.getMessage());
		} else {
			log.error(" ["+ clazz.getSimpleName() +"] ---------------------------------------------------------------------------------//\n(" + joinPoint.getSignature().getName() + ") Implement Throwable: " + error);
		}
	}
	@SuppressWarnings("unused")
	private Object logSql(ProceedingJoinPoint joinPoint) throws Throwable {
		log.debug("SqlSession----------------------------------------------------------------------------------------------------------");
		Object[] methodArgs = joinPoint.getArgs(), sqlArgs = null;
		Object retValue = joinPoint.proceed();
		String statement = null;
		String sqlid = methodArgs[0].toString();
		
		log.debug("sqlid:" + sqlid);
		log.debug("length:" + methodArgs.length);

		for (int i =1, n = methodArgs.length; i < n; i++){
			Object arg = methodArgs[i];
			
			log.debug("methodArgs:" + methodArgs[i].toString());
			
			if (arg instanceof HashMap){
				@SuppressWarnings("unchecked")
				Map<String, Object> map = (Map<String, Object>)arg;
				
				statement = ((SqlSessionTemplate)joinPoint.getTarget()).getConfiguration().getMappedStatement(sqlid).getBoundSql(map).getSql();
				
				sqlArgs = new Object[map.size()];
				Iterator<String> itr = map.keySet().iterator();
				
				int j = 0;
				while(itr.hasNext()){
					sqlArgs[j++] = map.get(itr.next());
				}
			}
			break;
		}
		String completedStatemane = (sqlArgs == null ? statement:fillParameters(statement, sqlArgs));
		log.debug("completedStatemane:" + completedStatemane);
		return retValue;
	}
}
