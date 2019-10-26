package com.nt.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.bo.InsurancePolicyBO;
import com.nt.dto.InsurancePolicyDTO;
import com.nt.service.InsurancePolicyMgmtService;

public class NamedParameterJdbcTemplate {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
	     InsurancePolicyMgmtService service=null;
	     InsurancePolicyDTO dto=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		//get Bean
		service=ctx.getBean("ipService",InsurancePolicyMgmtService.class);
		//invoke method
		System.out.println("1001 policy Details ::"+service.findInsurancePolicyDetailsById(1001));
		System.out.println("JS,JA,JSK policies details ::"+service.findInsurancePoliciesDetailsByNames("JS","JA","JSK"));
		//prepare DTO class obj
		dto=new InsurancePolicyDTO();
		dto.setPolicyId(9001); dto.setPolicyName("JSJB");
		dto.setTenure(60); dto.setCompany("HCL"); dto.setInitialAmount(90000);
		System.out.println(service.register(dto));
		//close container
		((AbstractApplicationContext) ctx).close();

	}

}
