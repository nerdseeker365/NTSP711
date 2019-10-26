package com.nt.service;

import com.nt.dao.BankDAO;

public class BankServiceImpl implements BankService {
	private  BankDAO dao;

	public BankServiceImpl(BankDAO dao) {

		this.dao = dao;
	}

	public String withdrawMoney(int acno, float amount) {
		int count=0;
		//use DAO
		count=dao.withdraw(acno, amount);
		if(count==0)
			return " Money not withdrawn";
		else
			return " Money  withdrawn";
	}

	public String depositeMoney(int acno, float amount) {
		int count=0;
		//use DAO
		count=dao.deposite(acno, amount);
		if(count==0)
			return " Money Not Deposited";
		else
			return " Money Deposited";
	}

}
