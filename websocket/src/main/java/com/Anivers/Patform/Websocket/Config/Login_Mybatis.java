package com.Anivers.Patform.Websocket.Config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.sql.DataSource;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

@Configuration
@MapperScan(basePackages = "com.Anivers.Patform.Websocket.Mapper.Login", sqlSessionFactoryRef = "LoginSqlSessionFactory")
public class Login_Mybatis {
	
	@Bean
	@ConfigurationProperties(prefix = "spring.datasource.login.hikari")
	public HikariConfig hearthikariConfig() {
		return new HikariConfig();
	}

	@Bean(name ="LoginDataSource")
	public DataSource dataSource() {
		
		return new HikariDataSource(hearthikariConfig());
	}
	

	@Bean(name = "LoginSqlSessionFactory")
	public SqlSessionFactory LoginSqlSessionFactory(@Qualifier("LoginDataSource") DataSource DataSource,
			ApplicationContext applicationContext) throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(DataSource);
		sqlSessionFactoryBean.setMapperLocations(applicationContext.getResources("classpath:/mappers/Login.xml"));
		return sqlSessionFactoryBean.getObject();
	}

    @Bean(name = "LoginSessionTemplate")
    public SqlSessionTemplate LoginSqlSessionTemplate(@Qualifier("LoginSqlSessionFactory") SqlSessionFactory firstSqlSessionFactory) {
        return new SqlSessionTemplate(firstSqlSessionFactory);
    }
	

}
