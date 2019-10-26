package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.AbstractApplicationContext;

import com.nt.config.AppConfig;
import com.nt.service.BankService;

@SpringBootApplication
@Import(AppConfig.class)
public class AroundAdviceTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		BankService proxy=null;
		//Get IOC container
		ctx=SpringApplication.run(AroundAdviceTest.class, args);
		//get Bean
		proxy=ctx.getBean("bankService",BankService.class);
		System.out.println("proxy obj class name::"+proxy.getClass());
		//invoke methods
		System.out.println(proxy.withdraw(1001,9000));
		System.out.println(".................................");
		System.out.println(proxy.deposite(1002,8000));
		System.out.println(".......................................");
		System.out.println(proxy.transferMoney(1001, 1002,7000));
		System.out.println("_________");
		System.out.println(proxy.transferMoney(1001, 1002,7000));
		System.out.println(".....................................");
		//close container
		((AbstractApplicationContext) ctx).close();
		

	}//main
}//class
