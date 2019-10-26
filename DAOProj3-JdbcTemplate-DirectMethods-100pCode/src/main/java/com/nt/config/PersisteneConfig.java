package com.nt.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
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
	   public DataSource   createHKDS() {
		   HikariDataSource  hkDs=null;
		   hkDs=new HikariDataSource();
		   hkDs.setDriverClassName(env.getRequiredProperty("jdbc.driver"));
		   hkDs.setJdbcUrl(env.getProperty("jdbc.url"));
		   hkDs.setUsername(env.getProperty("jdbc.username"));
		   hkDs.setPassword(env.getProperty("jdbc.password"));
		   return hkDs;
	   }
	
	@Bean(name="jt")
	public    JdbcTemplate  createJT() {
		return new  JdbcTemplate(createHKDS());
	}

}
