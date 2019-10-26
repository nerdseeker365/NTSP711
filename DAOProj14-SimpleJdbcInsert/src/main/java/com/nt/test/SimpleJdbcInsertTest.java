package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeMgmtService;

public class SimpleJdbcInsertTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		EmployeeMgmtService  service=null;
		EmployeeDTO dto=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Bean
		service=ctx.getBean("empService",EmployeeMgmtService.class);
		//prepare DTO class obj
		dto=new EmployeeDTO();
		dto.setEmpNo(1001); dto.setEname("raja"); dto.setJob("CLERK");
		dto.setSal(9000);
		//invoke method
		try {
			System.out.println(service.registerEmployee(dto));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		//close container
		((AbstractApplicationContext) ctx).close();

	}//main
}//class
