package com.nt.service;

public interface BankService {
	
	public  String   withdrawMoney(int acno,float amount);
	public  String   depositeMoney(int acno,float amount);

}
