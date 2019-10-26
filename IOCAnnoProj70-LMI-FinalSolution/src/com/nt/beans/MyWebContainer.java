package com.nt.beans;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component("container")
public  abstract class MyWebContainer {
	public MyWebContainer() {
	   System.out.println("MyWebContainer:0- param constructor");
		}
	
	@Lookup
	public abstract RequestHandler  createRequestHandler();
	
	public  void  processRequest(String data) {
		System.out.println("WEbContainer is processing request");
		RequestHandler handler=null;
		//get Dependent  class obj
		handler=createRequestHandler();
		handler.handleRequest(data);
	}

	

}
