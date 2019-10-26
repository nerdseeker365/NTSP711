package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.AbstractApplicationContext;

import com.nt.config.AppConfig;
import com.nt.service.BankService;

@SpringBootApplication
@Import(AppConfig.class)
public class TxMgmtTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		BankService proxy=null;
		   //create IOC container
		ctx=SpringApplication.run(TxMgmtTest.class,args);
		//get Proxy object
		proxy=ctx.getBean("bankService",BankService.class);
		//invoke methods
		try {
			System.out.println(proxy.transferMoney(1002, 1001,1000));
			System.out.println("Tx Committed");
		}
		catch(Exception e) {
			System.out.println("Tx Rolledback--Money not transffered");
			e.printStackTrace();
		}
		//close container
		((AbstractApplicationContext) ctx).close();

	}//main
}//class
