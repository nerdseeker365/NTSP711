package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.Employee;

public class PAndCNameSpaceTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Employee emp=null;
		//create IOC Container
		//ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		//get Bean class object
		emp=ctx.getBean("emp",Employee.class);
		System.out.println(emp);
		
		//close container
		((AbstractApplicationContext) ctx).close();
	}//main
}//class
