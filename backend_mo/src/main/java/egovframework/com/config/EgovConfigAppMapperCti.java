package egovframework.com.config;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.support.lob.DefaultLobHandler;

@Configuration
@PropertySources({
	@PropertySource("classpath:/application.yml")
})
@MapperScan(value="com.system.ipcc.cti.**.mapper", sqlSessionFactoryRef="slave1SqlSessionFactory")
public class EgovConfigAppMapperCti {

	
	
	@Value("${Globals.DbType}")
	private String dbType;
	
	private String mapperConfigerLocation = "classpath:/egovframework/mapper/config/mysql-interface-config.xml";
	
	

	@Bean
	@Lazy
	public DefaultLobHandler lobHandlerCti() {
		return new DefaultLobHandler();
	}

	@Bean(name="slave1SqlSessionFactory")
	public SqlSessionFactory slave1SqlSessionFactory(@Qualifier("dataSourceCti") DataSource dataSourceCti, ApplicationContext applicationContext) throws Exception{
		//세션 생성 시, 빌드된 DataSource를 세팅하고 SQL문을 관리할 mapper.xml의 경로를 알려준다.
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSourceCti);
		PathMatchingResourcePatternResolver pathMatchingResourcePatternResolver = new PathMatchingResourcePatternResolver();
		sqlSessionFactoryBean.setConfigLocation(pathMatchingResourcePatternResolver.getResource(mapperConfigerLocation));
		sqlSessionFactoryBean.setMapperLocations(applicationContext.getResources("classpath:/mapper/"+ dbType + "/inter/**/*.xml"));
		return sqlSessionFactoryBean.getObject();
	}
	
	@Bean(name="slave1SqlSessionTemplate")
	public SqlSessionTemplate slave1SqlSessionTemplate(SqlSessionFactory slave1SqlSessionFactory) throws Exception{
		return new SqlSessionTemplate(slave1SqlSessionFactory);
	}
	
}
