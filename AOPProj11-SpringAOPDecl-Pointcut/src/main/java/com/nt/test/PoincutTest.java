package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.BankService;

public class PoincutTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		BankService proxy=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		// get Proxy class object
		proxy=ctx.getBean("pfb",BankService.class);
		//invoke methods
		System.out.println(proxy.withdraw(101,9000));
		System.out.println(".................................");
		System.out.println(proxy.deposite(102,8000));
		System.out.println(".................................");
		System.out.println(proxy.transferMoney(101,102,8000));
		System.out.println(".................................");
		System.out.println(proxy.transferMoney(101,102,800000));
		System.out.println(".................................");
		
		
		//close container
		((AbstractApplicationContext) ctx).close();
	}//main
}//class
