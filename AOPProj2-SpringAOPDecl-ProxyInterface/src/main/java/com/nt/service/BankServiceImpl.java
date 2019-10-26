package com.nt.service;

public final class BankServiceImpl implements BankService {
	public  float  calcSimpleIntrAmount(float pAmt,float rate,float time) {
		System.out.println("BankService.calcSimpleIntrAmount(-,-,-)");
		return  pAmt*rate*time/100.0f;
	}
}
