package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.BankService;

public class TxMgmtTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		BankService proxy=null;
		   //create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Proxy object
		proxy=ctx.getBean("tpfb",BankService.class);
		//invoke methods
		try {
			System.out.println(proxy.transferMoney(1004, 1002,1000));
			System.out.println("Tx Committed");
		}
		catch(Exception e) {
			System.out.println("Tx Rolledback--Money not transffered");
			e.printStackTrace();
		}
		//close container
		((AbstractApplicationContext) ctx).close();

	}//main
}//class
