package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.LoanApprover;

public class AuditAdviceTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		LoanApprover proxy=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Proxy object
		proxy=ctx.getBean("loanApprover",LoanApprover.class);
		//invoke the methods
		System.out.println(proxy.approveLoan("agri", 160000, "ramesh"));
		
		//close container
		((AbstractApplicationContext) ctx).close();
	}//main
}//class
