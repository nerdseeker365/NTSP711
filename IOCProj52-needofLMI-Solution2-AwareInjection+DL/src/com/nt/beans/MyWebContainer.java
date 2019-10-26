package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyWebContainer implements ApplicationContextAware {
	private String beanId;
	private ApplicationContext ctx;
	
	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		 this.ctx=ctx;
	}
	


	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}

	public MyWebContainer() {
	   System.out.println("MyWebContainer:0- param constructor");
		
	}
	
	public  void  processRequest(String data) {
		System.out.println("WEbContainer is processing request");
		RequestHandler handler=null;
		//get Dependent  class obj
		handler=ctx.getBean(beanId,RequestHandler.class);
		handler.handleRequest(data);
	}

	

}
