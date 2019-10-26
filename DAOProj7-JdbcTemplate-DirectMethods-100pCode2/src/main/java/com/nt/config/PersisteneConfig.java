package com.nt.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages="com.nt.dao")
@PropertySource("classpath:com/nt/commons/jdbc.properties")
public class PersisteneConfig {
	@Autowired
	private  Environment env;
	
	@Bean(name="hkDs")
	@Profile("prod")
	   public DataSource   createHKDS() {
		   HikariDataSource  hkDs=null;
		   hkDs=new HikariDataSource();
		   hkDs.setDriverClassName(env.getRequiredProperty("oracle.jdbc.driver"));
		   hkDs.setJdbcUrl(env.getProperty("oracle.jdbc.url"));
		   hkDs.setUsername(env.getProperty("oracle.jdbc.username"));
		   hkDs.setPassword(env.getProperty("oracle.jdbc.password"));
		   return hkDs;
	   }
	
	
	@Bean(name="apacheDsDs")
	@Profile("dev")
	   public DataSource   createApacheDS() {
		BasicDataSource  bds=null;
		   bds=new BasicDataSource();
		   bds.setDriverClassName(env.getRequiredProperty("mysql.jdbc.driver"));
		   bds.setUrl(env.getProperty("mysql.jdbc.url"));
		   bds.setUsername(env.getProperty("mysql.jdbc.username"));
		   bds.setPassword(env.getProperty("mysql.jdbc.password"));
		   return bds;
	   }
	
	@Bean(name="jt")
	@Profile("prod")
	public    JdbcTemplate  createJTProd() {
		return new  JdbcTemplate(createHKDS());
	}
	
	@Bean(name="jt")
	@Profile("dev")
	public    JdbcTemplate  createJTDev() {
		return new  JdbcTemplate(createApacheDS());
	}

}
