package com.nt.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages="com.nt.dao")
public class PersistenceConfig {
	
	@Bean(name="hkDs")
	public  DataSource createDataSource() {
		HikariDataSource  ds=null;
		ds=new HikariDataSource();
		ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		ds.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:xe");
		ds.setUsername("system");
		ds.setPassword("manager");
		ds.setMaximumPoolSize(100);
		return ds;
		
	}
	
	@Bean(name="jt")
	public   JdbcTemplate  createJdbcTemplate() {
		JdbcTemplate jt=null;
		jt=new JdbcTemplate(createDataSource());
		return jt;
	}

}
