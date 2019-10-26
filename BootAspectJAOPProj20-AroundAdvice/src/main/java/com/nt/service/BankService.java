package com.nt.service;

import org.springframework.stereotype.Service;

@Service("bankService")
public  class BankService {
	
	public  String withdraw(int acno,float amt) {
		return  "withdrawing amount ::"+amt+" from account number::"+acno;
	}
	
	public  String deposite(int acno,float amt) {
		return  "Depositing amount ::"+amt+" into account number::"+acno;
	}
	
	public  String  transferMoney(int srcAcno,int destAcno,float amt) {
		return  "Transfering  amount ::"+amt+" from source account number::"+srcAcno+" to Dest Account number::"+destAcno;
	}

}
