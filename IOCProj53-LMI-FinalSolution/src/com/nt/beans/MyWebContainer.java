package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public  abstract class MyWebContainer {
	public MyWebContainer() {
	   System.out.println("MyWebContainer:0- param constructor");
		}
	public abstract RequestHandler  createRequestHandler();
	
	public  void  processRequest(String data) {
		System.out.println("WEbContainer is processing request");
		RequestHandler handler=null;
		//get Dependent  class obj
		handler=createRequestHandler();
		handler.handleRequest(data);
	}

	

}
