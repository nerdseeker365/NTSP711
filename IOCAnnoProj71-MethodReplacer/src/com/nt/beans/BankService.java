package com.nt.beans;

import org.springframework.stereotype.Component;

@Component("bankService")
public class BankService {
	
	public   float   calcSimpleIntrAmount(float pAmt,float time) {
		System.out.println("BankService::calcSimpleIntrAmount(-,-)");
		return  (pAmt*time*2.0f)/100.0f; 
	}

}
