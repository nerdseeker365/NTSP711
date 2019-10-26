package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.OnlineStore;

public class AfterAdviceTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		OnlineStore proxy=null;
		
		//create IOC Container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Proxy class object
		proxy=ctx.getBean("pfb", OnlineStore.class);
		//invoke method
		System.out.println(proxy.shopping(new String[] {"umbrella","raincoat","rainshoe"},new float[] {800.0f,90000.0f,10000.0f }));
		//close container
		((AbstractApplicationContext) ctx).close();

	}

}
