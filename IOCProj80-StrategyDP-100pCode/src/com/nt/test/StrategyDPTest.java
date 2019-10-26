package com.nt.test;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nt.beans.Viechle;
import com.nt.config.AppConfig;

public class StrategyDPTest {

	public static void main(String[] args) {
       ApplicationContext ctx=null;
		Viechle viechle=null;
		//create IOC container
		ctx=new  AnnotationConfigApplicationContext(AppConfig.class);
		//get Bean class object
		viechle=ctx.getBean("viechle",Viechle.class);
		//invoke methods
		viechle.journery("hyd", "delhi");
		System.out.println("...............");
		viechle.journery("delhi", "bhubaneswar");
		
	}

}
