package egovframework;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

import com.system.ipcc.pbx.avaya.models.PbxPropertieinfo;

import egovframework.com.config.EgovWebApplicationInitializer;


@EnableCaching
@ServletComponentScan
@SpringBootApplication
@EnableConfigurationProperties({PbxPropertieinfo.class})
@Import({EgovWebApplicationInitializer.class})
//@EnableAspectJAutoProxy
public class EgovBootApplication {
	

	public static void main(String[] args) {
		
		SpringApplication springApplication = new SpringApplication(EgovBootApplication.class);
		springApplication.setBannerMode(Banner.Mode.OFF);
		springApplication.setLogStartupInfo(false); 
		springApplication.run(args);
		System.out.println("##### EgovBootApplication End #####");
	}
	
	

}
