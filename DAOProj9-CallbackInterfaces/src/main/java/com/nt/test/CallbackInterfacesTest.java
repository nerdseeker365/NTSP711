package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.EmployeeMgmtService;

public class CallbackInterfacesTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		EmployeeMgmtService service=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Bean
		service=ctx.getBean("empService",EmployeeMgmtService.class);
		//invoke methods
		System.out.println("7499  Employee details are::"+service.searchEmployeeByEno(7499));
		//close container
		((AbstractApplicationContext) ctx).close();

	}

}
