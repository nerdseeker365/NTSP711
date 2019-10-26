package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.MyWebContainer;

public class LMIFinalSolutionTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		MyWebContainer container=null,container1=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Bean 
		container=ctx.getBean("container",MyWebContainer.class);
		System.out.println(container.getClass()+"   "+container.getClass().getSuperclass());
		//invoke methods
		container.processRequest("hello");
		System.out.println("............................");
		container.processRequest("hai");
		System.out.println("===================");
		//get Bean 
				container1=ctx.getBean("container",MyWebContainer.class);
				//invoke methods
				container1.processRequest("hello");
				System.out.println("............................");
				container1.processRequest("hai");
		
		//close container
		((AbstractApplicationContext) ctx).close();
		

	}

}
