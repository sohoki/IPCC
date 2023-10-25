package egovframework.com.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EgovConfigAppDatasourceCti {

	/**
	 *  @Value 을 어노테이션을 이용하는 방법
	 */
	@Value("${Globals.DbType}")
	private String dbType;
	
	@Value("${Globals.mysql.DriverClassName}")
	private String className;
	
	@Value("${Globals.ctisql.Url}")
	private String url;
	
	@Value("${Globals.ctisql.UserName}")
	private String userName;
	
	@Value("${Globals.ctisql.Password}")
	private String password;
	
	
	
	/**
	 * @return [dataSource 설정] basicDataSource 설정
	 */
	private DataSource basicCtiDataSource() {
		
		BasicDataSource basicDataSource = new BasicDataSource();
		basicDataSource.setDriverClassName(className);
		basicDataSource.setUrl(url);
		basicDataSource.setUsername(userName);
		basicDataSource.setPassword(password);
		basicDataSource.setInitialSize(10);
		basicDataSource.setMaxTotal(10);
		basicDataSource.setMaxWaitMillis(30000);
		basicDataSource.setMaxIdle(100);
		basicDataSource.setMinIdle(10);
		basicDataSource.setValidationQuery("select 1");
		basicDataSource.setTimeBetweenEvictionRunsMillis(5000);
		return basicDataSource;
	}

	/**
	 * @return [DataSource 설정]
	 */
	@Bean(name = {"dataSourceCti"})
	public DataSource dataSourceCti() {
		return basicCtiDataSource();
		
	}
}
