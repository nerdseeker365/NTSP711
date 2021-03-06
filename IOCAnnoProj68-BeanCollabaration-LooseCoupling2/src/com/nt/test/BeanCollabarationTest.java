package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Flipkart;

public class BeanCollabarationTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Flipkart fpkt=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
			//get Target Bean class object
		fpkt=ctx.getBean("fpkt",Flipkart.class);

		//invoke methods
		System.out.println(fpkt.shopping(new String[] {"fruits","flowers","sweets","shirt","trousher"},
				                                                      new float[] {1000,1000,1000,2000,2000}));
		//close contianer
		((AbstractApplicationContext) ctx).close();
		
	}//main
}//class
