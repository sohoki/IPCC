package egovframework.com.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
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
@MapperScan(value="com.system.ipcc.ivr.**.mapper", sqlSessionFactoryRef="slave2SqlSessionFactory")
public class EgovConfigAppMapperIvr {

	@Value("${Globals.DbType}")
	private String dbType;
	
	private String mapperConfigerLocation = "classpath:/egovframework/mapper/config/mysql-ivr-config.xml";
	
	

	@Bean
	@Lazy
	public DefaultLobHandler lobHandlerIvr() {
		return new DefaultLobHandler();
	}

	@Bean(name="slave2SqlSessionFactory")
	public SqlSessionFactory slave2SqlSessionFactory(@Qualifier("dataSourceIvr") DataSource dataSourceIvr, ApplicationContext applicationContext) throws Exception{
		//세션 생성 시, 빌드된 DataSource를 세팅하고 SQL문을 관리할 mapper.xml의 경로를 알려준다.
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSourceIvr);
		PathMatchingResourcePatternResolver pathMatchingResourcePatternResolver = new PathMatchingResourcePatternResolver();
		sqlSessionFactoryBean.setConfigLocation(pathMatchingResourcePatternResolver.getResource(mapperConfigerLocation));
		sqlSessionFactoryBean.setMapperLocations(applicationContext.getResources("classpath:/mapper/"+ dbType + "/inter/sys/ivr/**/*.xml"));
		return sqlSessionFactoryBean.getObject();
	}
	
	@Bean(name="slave2SqlSessionTemplate")
	public SqlSessionTemplate slave2SqlSessionTemplate(SqlSessionFactory slave2SqlSessionFactory) throws Exception{
		return new SqlSessionTemplate(slave2SqlSessionFactory);
	}
}
