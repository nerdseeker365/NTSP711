package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Flipkart;

public class BeanCollabarationTestWithAC {

	public static void main(String[] args) {
     ApplicationContext ctx=null;
		Flipkart fpkt=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		//get Target Bean class object
		/*
		 * fpkt=factory.getBean("fpkt",Flipkart.class);
		 * 
		 * //invoke methods System.out.println(fpkt.shopping(new String[]
		 * {"fruits","flowers","sweets","shirt","trousher"}, new float[]
		 * {1000,1000,1000,2000,2000}));
		 */
	}//main
}//class
