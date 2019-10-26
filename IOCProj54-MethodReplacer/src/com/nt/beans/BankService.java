package com.nt.beans;

public class BankService {
	
	public  static float   calcSimpleIntrAmount(float pAmt,float time) {
		System.out.println("BankService::calcSimpleIntrAmount(-,-)");
		return  (pAmt*time*2.0f)/100.0f; 
	}

}
