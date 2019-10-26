package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.nt.service.DeptMgmtService;

public class JTDirectMethodsTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		DeptMgmtService service=null;
	    //create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Bean
		service=ctx.getBean("deptService",DeptMgmtService.class);
		try {
		//invoke method
		System.out.println("Depts count::"+service.findDeptsCount());
		System.out.println("10 dept details::"+service.findDeptByNo(10));
		System.out.println("Dept Details ::"+service.findDeptLocationByNo(10));
		System.out.println("All details :::"+service.findAllDepts());
		System.out.println("All Depts by Locations::"+service.findAllDeptsByLocations("NEW YORK","CHICAGO"));
		//System.out.println(service.registerDept("ACCOUNTS","NEWYORK"));
		System.out.println(service.modifyDeptLoc(1,"LA"));
		System.out.println(service.removeDept("ACCOUNTS"));
		}
		catch(DataAccessException dae) {
			dae.printStackTrace();
			System.out.println("Internal Problem --- Try Again");
		}
		
		//close container
		((AbstractApplicationContext) ctx).close();
		

	}//main
}//class
