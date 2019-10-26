package com.example.demo;

import java.util.Calendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;


@SpringBootApplication()
public class IocProjBoot84BasicApplication {
	
	@Bean
	public  Calendar  createCalendar() {
		return Calendar.getInstance();
	}

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		WishMessageGenerator generator=null;
		//get IOC container
		ctx=SpringApplication.run(IocProjBoot84BasicApplication.class, args);
		// get Bean class obj
		generator=ctx.getBean("wmg",WishMessageGenerator.class);
		//invoke method
		System.out.println(generator.generateWishMessage("raja"));
		//close container
		((ConfigurableApplicationContext) ctx).close();
		
		
	}

}
