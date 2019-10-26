package com.nt.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyWebContainer {
	private String beanId;


	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}

	public MyWebContainer() {
	   System.out.println("MyWebContainer:0- param constructor");
		
	}
	
	public  void  processRequest(String data) {
		System.out.println("WEbContainer is processing request");
		ApplicationContext ctx=null;
		RequestHandler handler=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Dependent  class obj
		handler=ctx.getBean(beanId,RequestHandler.class);
		handler.handleRequest(data);
	}
	

}
