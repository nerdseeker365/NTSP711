package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.dto.UserDTO;
import com.nt.service.AuthenticationService;

public class SimpleJdbcCallTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		AuthenticationService service=null;
		UserDTO dto=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Service class object
		service=ctx.getBean("authService",AuthenticationService.class);
		//prepare DTO
		dto=new UserDTO();
		dto.setUname("raja"); dto.setPwd("rani1");
		//invoke method
		System.out.println(service.validate(dto));
		//close container
		((AbstractApplicationContext) ctx).close();
	}//main
}//class
