package com.nt.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Viechle {
	private String beanId;
	
	public Viechle() {
		System.out.println("Viechle:0-param constructor");
	}

	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}
	
	public  void   entertainment() {
		System.out.println("Viechle is equipped with DVC player");
	}
	
	public void  sounHorn() {
		System.out.println("Viechle is equipped with Skoda horn");
	}
	
	public  void jounery(String start,String end) {
		System.out.println("Jounery started from "+start + " to "+end);
		ApplicationContext ctx=null;
		Engine engg=null;
		//ceate IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Engine class object
		engg=ctx.getBean(beanId,Engine.class);
		engg.start();
		System.out.println("Jounery end from "+start + " to "+end);
		engg.stop();
		
		
	}
	
	

}
