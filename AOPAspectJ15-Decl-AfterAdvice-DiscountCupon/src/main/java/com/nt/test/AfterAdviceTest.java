package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.OnlineStore;

public class AfterAdviceTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		OnlineStore proxy=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Proxy object
		proxy=ctx.getBean("store",OnlineStore.class);
		//invoke the methods
		System.out.println(proxy.shopping(new String[] {"AC","Fridge"},new float[] {50000.0f,40000.0f}));
		
		//close container
		((AbstractApplicationContext) ctx).close();
	}//main
}//class
