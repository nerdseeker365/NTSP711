package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.BankService;

public class DTxMgmtTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		BankService proxy=null;
		
		//create IOC container 
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Proxy Bean obj
		proxy=ctx.getBean("bankService", BankService.class);
		//invoke method
		try {
			System.out.println(proxy.transferMoney(1001, 1006, 1000));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	    
		//close container
		((AbstractApplicationContext) ctx).close();

	}

}
