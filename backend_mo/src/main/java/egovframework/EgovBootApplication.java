package egovframework;

import java.io.IOException;

import org.snmp4j.smi.UdpAddress;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

import com.system.backoffice.sym.svr.event.TrapReceiver;
import com.system.ipcc.pbx.avaya.models.PbxPropertieinfo;

import egovframework.com.config.EgovWebApplicationInitializer;


@EnableCaching
@ServletComponentScan
@SpringBootApplication
@EnableConfigurationProperties({PbxPropertieinfo.class})
@Import({EgovWebApplicationInitializer.class})
public class EgovBootApplication {
	
	public static void main(String[] args) {
		
		SpringApplication springApplication = new SpringApplication(EgovBootApplication.class);
		springApplication.setBannerMode(Banner.Mode.OFF);
		springApplication.setLogStartupInfo(false); 
		springApplication.run(args);
		System.out.println("##### EgovBootApplication End #####");
		// 여기 부분 어떻게 할지 필요
		TrapReceiver snmp4jTrapReceiver = new TrapReceiver();
		try{
			snmp4jTrapReceiver.listen(new UdpAddress("192.168.22.178/162"));
		}catch (IOException e){
			System.err.println("Error in Listening for Trap");
			System.err.println("Exception Message = " + e.getMessage());
		}
		
	}
}
