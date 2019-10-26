package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.BillAmtCalculator;

public class ThrowsAdviceTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		BillAmtCalculator proxy=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Proxy object
		proxy=ctx.getBean("pfb",BillAmtCalculator.class);
		//invoke method
		try {
		  System.out.println("Bill Amount::"+proxy.generateBillAmt(2000, 100));
		}
		catch(IllegalArgumentException iae) {
			iae.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("......................................");
		try {
			  System.out.println("Bill Amount::"+proxy.generateBillAmt(2000, 0));
			}
			catch(IllegalArgumentException iae) {
				iae.printStackTrace();
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		
		//close container
		((AbstractApplicationContext) ctx).close();
		
	}//main
}//class
