package com.nt.test;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.nt.service.DeptMgmtService;

public class JTDirectMethodsTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=null;
		DeptMgmtService service=null;
	    //create IOC container
		ctx=new ClassPathXmlApplicationContext();
		ctx.getEnvironment().setActiveProfiles("uat");
		ctx.setConfigLocation("com/nt/cfgs/applicationContext.xml");
		ctx.refresh();
		//get Bean
		service=ctx.getBean("deptService",DeptMgmtService.class);
		try {
		//invoke method
		System.out.println("Depts count::"+service.findDeptsCount());
		System.out.println(".......................");
		System.out.println("active profile::"+Arrays.toString(ctx.getEnvironment().getActiveProfiles()));
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
			System.out.println("Internal Problem --- Try Again");
		}
		
		//close container
		((AbstractApplicationContext) ctx).close();
		

	}//main
}//class
