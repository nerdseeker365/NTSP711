package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.StudentMgmtService;

public class MappingSQLOperationsTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		StudentMgmtService service=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get SErvice class obj
		service=ctx.getBean("studService",StudentMgmtService.class);
		//invoke  method
		System.out.println("hyd students are ::"+service.findStudentsByAddrs("hyd"));
		System.out.println("..................................");
		System.out.println("123 student details are ::"+service.findStudentBySno(123));
		System.out.println("................................");
		System.out.println(service.modifyStudentAddrsBySno(123,"vizag"));
		System.out.println("................................");
		System.out.println("123 student details are ::"+service.findStudentBySno(123));
		//close container
		((AbstractApplicationContext) ctx).close();

	}

}
