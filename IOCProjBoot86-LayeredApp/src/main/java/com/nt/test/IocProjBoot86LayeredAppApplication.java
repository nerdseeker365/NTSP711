package com.nt.test;

import java.util.Scanner;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import com.nt.config.AppConfig;
import com.nt.controller.MainController;
import com.nt.vo.StudentVO;

//@SpringBootApplication(exclude=DataSourceAutoConfiguration.class)
@SpringBootApplication
@Import(AppConfig.class)
public class IocProjBoot86LayeredAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		StudentVO vo=null;
		Scanner sc=null;
		String name=null,addrs=null;
		String m1=null,m2=null,m3=null;
	    MainController controller=null;
	    String result=null;
	    
		//read inputs
		sc=new Scanner(System.in);
		System.out.println("Enter student name::");
		name=sc.next();
		System.out.println("Enter Student address");
		addrs=sc.next();
	    System.out.println("Enter Student  marks1");
	    m1=sc.next();
	    System.out.println("Enter Student  marks2");
	    m2=sc.next();
	    System.out.println("Enter Student  marks3");
	    m3=sc.next();
	    //prepare VO class obj
	    vo=new StudentVO();
	    vo.setSname(name); vo.setSadd(addrs);
	    vo.setM1(m1); vo.setM2(m2); vo.setM3(m3);
	    
		//get Container
		ctx=SpringApplication.run(IocProjBoot86LayeredAppApplication.class, args);
	    
	    /*SpringApplication app = new SpringApplication(IocProjBoot86LayeredAppApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        ctx=app.run(args); */
	    
		
		//get Target class object
		controller=ctx.getBean("controller",MainController.class);
		//invoke method
		try {
			result=controller.processStudent(vo);
			System.out.println("Result is :::"+result);
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Internal Problem----Try Again");
		}
		
		//close container
		((ConfigurableApplicationContext) ctx).close();
		
	}//main
}//class
