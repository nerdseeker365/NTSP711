package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.BillAmountCalculator;

public class ThrowsAdviceTest {
	
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		BillAmountCalculator proxy=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Bean class object
		proxy=ctx.getBean("bac",BillAmountCalculator.class);
		System.out.println(proxy.getClass());
		try {
		//invoke method
		System.out.println("Bill amount::"+proxy.calcBillAmount(1000.0f,0.0f ));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		//close container
		((AbstractApplicationContext) ctx).close();
	}//main

}//class
