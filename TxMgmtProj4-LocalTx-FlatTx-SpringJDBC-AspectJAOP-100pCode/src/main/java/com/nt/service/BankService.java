package com.nt.service;

public interface BankService {
	public   String withdrawMoney(int acno,float amt);
	public   String depositeMoney(int acno,float amt);
	public   String transferMoney(int srcAcno,int destAcno,float amt);
	

}
