package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.BankService;
import com.nt.config.AppConfig;

public class MethodReplacerTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		BankService service=null;
		//create IOC container
		ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		//get Bean
		service=ctx.getBean("bankService",BankService.class);
		System.out.println("class name ::"+service.getClass()+"  super class::"+service.getClass().getSuperclass());
		//invoke b.method
		System.out.println("Simple Intrest Amount:::"+service.calcSimpleIntrAmount(100000, 12));
		//close container
		((AbstractApplicationContext) ctx).close();

	}//main
}//class
