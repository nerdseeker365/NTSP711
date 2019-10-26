package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.config.AppConfig;
import com.nt.manager.AuthenticationManager;
import com.nt.service.BankService;

@SpringBootApplication
@Import(AppConfig.class)
public class BeforeAdviceTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		AuthenticationManager manager=null;
		BankService proxy=null;
		//create IOC container
		ctx=SpringApplication.run(BeforeAdviceTest.class, args);
		//get AuthManager class obj
		manager=ctx.getBean("authManager",AuthenticationManager.class);
		//perform singIn In operation
		manager.signIn("rani","didi");
		//get Proxy class obj
		proxy=ctx.getBean("pfb",BankService.class);
		//invoke method
		System.out.println(proxy.depositeMoney(1001,3000));
		System.out.println("............................");
		System.out.println(proxy.withdrawMoney(1002,5000));
		//perform signout operation


		
		//close container
	((AbstractApplicationContext) ctx).close();

		
		
	}

}
