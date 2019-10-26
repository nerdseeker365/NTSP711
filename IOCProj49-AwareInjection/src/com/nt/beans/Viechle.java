package com.nt.beans;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Viechle implements ApplicationContextAware {
	private String beanId;
	private ApplicationContext ctx;
	
	public Viechle() {
		System.out.println("Viechle:0-param constructor");
	}
	
	@Override
	public void setApplicationContext(ApplicationContext ctx) throws BeansException {
		this.ctx=ctx;
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
		Engine engg=null;
		//get Engine class object
		engg=ctx.getBean(beanId,Engine.class);
		engg.start();
		System.out.println("Jounery end from "+start + " to "+end);
		engg.stop();
		
		
	}


	

}
