package com.nt.service;

public class BankService {
	
	public  String withdraw(int acno,float amount) {
		return  "withdrawing  amount  rs."+amount +"  from account number "+acno;
	}
	
	public  String deposite(int acno,float amount) {
		return  "depositing  amount  rs."+amount +"  into account number "+acno;
	}
	
	public  String transferMoney(int srcAcno,int destAcno,float amount) {
		return  "tranafering  amount  rs."+amount +"  from "+srcAcno +" to "+destAcno;
	}



}
