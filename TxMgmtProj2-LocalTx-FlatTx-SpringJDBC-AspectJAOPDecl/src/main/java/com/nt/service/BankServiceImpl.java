package com.nt.service;

import com.nt.dao.BankDAO;

public class BankServiceImpl implements BankService {
	private BankDAO  dao;

	public BankServiceImpl(BankDAO dao) {
		this.dao = dao;
	}

	@Override
	public String withdrawMoney(int acno, float amt) {
		int count=0;
	     //use DAO
		count=dao.withdraw(acno, amt);
		if(count==0)
			return "Account not found to withdraw money";
		else
			return "Money withdrawn succesfully";
	}

	@Override
	public String depositeMoney(int acno, float amt) {
		int count=0;
	     //use DAO
		count=dao.deposite(acno, amt);
		if(count==0)
			return "Account not found to deposite money";
		else
			return "Money deposited succesfully";
	}

	@Override
	public String transferMoney(int srcAcno, int destAcno, float amt) {
		int result1=0,result2=0;
	
	/*	try {
			Thread.sleep(20000);
		}
		catch(Exception e) {
			e.printStackTrace();
		} */
		//use dao
		result1=dao.withdraw(srcAcno, amt);
		result2=dao.deposite(destAcno, amt);
	
		
		if(result1==0  || result2==0)
			throw new RuntimeException();
		
		return "Money trasffered successfully";
	}

}
