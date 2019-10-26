package com.nt.config;

import java.util.Calendar;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages="com.nt.beans")
public class AppConfig {
	
	static {
		System.out.println("AppConfig::static block");
	}
	 
	public AppConfig() {
	     System.out.println("AppConfig:0-param constructor()");
	}
	
	
	@Bean
	public  Calendar  calendar() {
		System.out.println("AppConfig.createCalendar()");
		return Calendar.getInstance();
	}
	
	@Bean
	@Primary
	public  Calendar  calendar1() {
		Calendar calendar=null;
		System.out.println("AppConfig.createCalendar()");
		calendar=Calendar.getInstance();
		calendar.setFirstDayOfWeek(0);
		return calendar;
	}
	
	@Bean(name="dt")
	//@Lazy
	@Scope("prototype")
	public  Date  createDate() {
		System.out.println("AppConfig.createDate()");
		return new Date();
	}

}
