package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.PayrollService;

public class BeforeAdviceTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		PayrollService proxy=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Proxy object
		proxy=ctx.getBean("pfb",PayrollService.class);
		System.out.println(proxy.generateSalary(1001,20000, true));
		System.out.println(".....................................");
		System.out.println(proxy.generateSalary(1002,20000, false));
		System.out.println("..................................");
		System.out.println(proxy.generateSalary(-2001,15000, true));
		
		//close container
		((AbstractApplicationContext) ctx).close();

	}

}
