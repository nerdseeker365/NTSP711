package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.nt.config.AppConfig;
import com.nt.service.DeptMgmtService;

public class JTDirectMethodsTest {
	

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=null;
		DeptMgmtService service=null;
	    //create IOC container
		ctx=new AnnotationConfigApplicationContext();
		ctx.getEnvironment().setActiveProfiles("prod");
		ctx.register(AppConfig.class);
		ctx.refresh();
		//get Bean
		service=ctx.getBean("deptService",DeptMgmtService.class);
		try {
		//invoke method
		System.out.println("Depts count::"+service.findDeptsCount());
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
			System.out.println("Internal Problem --- Try Again");
		}
		
		//close container
		((AbstractApplicationContext) ctx).close();
		

	}//main
}//class
