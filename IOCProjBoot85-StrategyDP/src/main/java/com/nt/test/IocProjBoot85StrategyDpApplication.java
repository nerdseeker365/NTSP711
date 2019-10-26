package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import com.nt.beans.Flipkart;
import com.nt.config.AppConfig;

@SpringBootApplication
@Import(AppConfig.class)
public class IocProjBoot85StrategyDpApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		Flipkart fpkt=null;
		ctx=SpringApplication.run(IocProjBoot85StrategyDpApplication.class, args);
		//get Flipkart Object
		fpkt=ctx.getBean("fpkt",Flipkart.class);
		System.out.println(fpkt.shopping(new String[]{"cotton shirt ","cotton trouser","cotton shoe "}));
		//close container
		((ConfigurableApplicationContext) ctx).close();
	}

}
