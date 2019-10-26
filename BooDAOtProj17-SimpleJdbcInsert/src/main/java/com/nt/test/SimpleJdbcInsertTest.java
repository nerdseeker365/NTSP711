package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.config.AppConfig;
import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeMgmtService;

@SpringBootApplication
@Import(AppConfig.class)
public class SimpleJdbcInsertTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		EmployeeMgmtService  service=null;
		EmployeeDTO dto=null;
		//get IOC container
		ctx=SpringApplication.run(SimpleJdbcInsertTest.class, args);
		//get Bean
		service=ctx.getBean("empService",EmployeeMgmtService.class);
		//prepare DTO class obj
		dto=new EmployeeDTO();
		 dto.setEname("promod"); dto.setJob("Sweeper");
		dto.setSal(700);
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
