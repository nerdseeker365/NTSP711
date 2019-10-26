package com.nt.beans;

public class MyWebContainer {
	private  RequestHandler handler;

	public MyWebContainer(RequestHandler handler) {
	   System.out.println("MyWebContainer:1- param constructor");
		this.handler = handler;
	}
	
	public  void  processRequest(String data) {
		System.out.println("WEbContainer is processing request");
		handler.handleRequest(data);
	}
	

}
