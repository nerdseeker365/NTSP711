package com.nt.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.config.AppConfig;
import com.nt.service.BankService;

public class AroundAdviceTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=null;
		BankService proxy=null;
		//create  IOC container
		ctx=new AnnotationConfigApplicationContext(AppConfig.class);
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
		

	}

}
