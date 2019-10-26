package com.nt.test;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.Engine;
import com.nt.beans.Viechle;

public class StrategyDPTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Viechle viechle=null;
		Engine engg=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Bean class object
		viechle=ctx.getBean("viechle",Viechle.class);
		//invoke methods
		viechle.journery("hyd", "delhi");
		System.out.println("...............");
		viechle.journery("delhi", "bhubaneswar");
		engg=ctx.getBean("dEngg",Engine.class);
		
		
		//close container
		((AbstractApplicationContext) ctx).close();
		
	}

}
