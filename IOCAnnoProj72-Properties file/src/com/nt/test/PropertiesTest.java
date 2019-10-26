package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.PropsTestBean;

public class PropertiesTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		PropsTestBean bean=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Bean class obj
		bean=ctx.getBean("props",PropsTestBean.class);
		System.out.println(bean);
		
		//close container
		((AbstractApplicationContext) ctx).close();

	}

}
