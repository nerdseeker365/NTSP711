package com.nt.service;

public  class BankService {
	public  float  calcSimpleIntrAmount(float pAmt,float rate,float time) {
		System.out.println("BankService.calcSimpleIntrAmount(-,-,-)");
		return  pAmt*rate*time/100.0f;
	}
}
