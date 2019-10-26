package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import com.nt.config.AppConfig;
import com.nt.service.DeptMgmtService;

@SpringBootApplication
@Import(AppConfig.class)
public class JTDirectMethodsTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		DeptMgmtService service=null;
	    //get IOC container
		ctx=SpringApplication.run(JTDirectMethodsTest.class, args);
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
