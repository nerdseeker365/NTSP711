package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.bo.InsurancePolicyBO;
import com.nt.config.AppConfig;
import com.nt.dto.InsurancePolicyDTO;
import com.nt.service.InsurancePolicyMgmtService;

@SpringBootApplication
@Import(AppConfig.class)
public class NamedParameterJdbcTemplateTest {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
	     InsurancePolicyMgmtService service=null;
	     InsurancePolicyDTO dto=null;
		//get IOC container
		ctx=SpringApplication.run(NamedParameterJdbcTemplateTest.class, args);
		//get Bean
		service=ctx.getBean("ipService",InsurancePolicyMgmtService.class);
		//invoke methods
		System.out.println("1001 policy Details ::"+service.findInsurancePolicyDetailsById(1001));
		System.out.println("JS,JA,JSK policies details ::"+service.findInsurancePoliciesDetailsByNames("JS","JA","JSK"));
		//prepare DTO class obj
		dto=new InsurancePolicyDTO();
		dto.setPolicyId(9003); dto.setPolicyName("JSJB");
		dto.setTenure(60); dto.setCompany("HCL"); dto.setInitialAmount(90000);
		System.out.println(service.register(dto));
		//close container
		((AbstractApplicationContext) ctx).close();

	}

}
