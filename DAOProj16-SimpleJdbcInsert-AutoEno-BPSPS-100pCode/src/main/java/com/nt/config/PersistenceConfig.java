package com.nt.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages="com.nt.dao")
public class PersistenceConfig {
	
	@Bean(name="hkDs")
	public  DataSource  createDs() {
		HikariDataSource ds=null;
		ds=new HikariDataSource();
		ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		ds.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:xe");
		ds.setUsername("system");
		ds.setPassword("manager");
		return ds;
	}
	
	@Bean(name="sji")
	public   SimpleJdbcInsert createSJI() {
		SimpleJdbcInsert sji=null;
		sji=new SimpleJdbcInsert(createDs());
		return sji;
	}

}
