package com.nt.test;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.BankService;
import com.nt.service.BankServiceImpl;

public class AroundAdviceTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		BankService proxy=null;
		//create IOC container
		ctx=new  ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Proxy class object
		proxy=ctx.getBean("pfb",BankService.class);
		System.out.println("proxy obj class ::"+proxy.getClass()+"  "+proxy.getClass().getSuperclass()+"     "+Arrays.toString(proxy.getClass().getDeclaredMethods())+"... "+Arrays.toString(proxy.getClass().getInterfaces()));
		//invoke the method
		try {
		System.out.println("Simple Intr Amount::"+proxy.calcSimpleIntrAmount(100000, 2, 12));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("......................................................");
		try {
		System.out.println("Simple Intr Amount::"+proxy.calcSimpleIntrAmount(100000, 2, 12));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		//close container
		((AbstractApplicationContext) ctx).close();

	}

}
