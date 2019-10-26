package com.nt.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan(basePackages={"com.nt.service","com.nt.dao"})
@PropertySource("classpath:com/nt/commons/jdbc.properties")
public class BusinessAppConfig {
	/*@Value("${jdbc.driver}")
	private   String driver;
	@Value("${jdbc.url}")
	private   String url;
	@Value("${jdbc.user}")
	private   String user;
	@Value("${jdbc.pwd}")
	private   String pwd; */
	@Autowired
	private Environment  env;
	
	
	
	
	@Bean(name="bds")
	public  BasicDataSource  createBDS() {
		System.out.println("AppConfig.createBDS()");
		System.out.println(env.getProperty("classpath")+"  "+env.getProperty("os.name"));
		BasicDataSource bds=null;
		bds=new BasicDataSource();
		bds.setDriverClassName(env.getProperty("jdbc.driver"));
		bds.setUrl(env.getProperty("jdbc.url"));
		bds.setUsername(env.getProperty("jdbc.user"));
		bds.setPassword(env.getProperty("jdbc.pwd"));
		return bds;
	}

}
