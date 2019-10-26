package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.AadharCard;

public class BuiltInPropertyEditorsTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		AadharCard card=null;
		// create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Bean
		card=ctx.getBean("aCard",AadharCard.class);
		System.out.println(card);
		//close container
		((AbstractApplicationContext) ctx).close();

	}

}
