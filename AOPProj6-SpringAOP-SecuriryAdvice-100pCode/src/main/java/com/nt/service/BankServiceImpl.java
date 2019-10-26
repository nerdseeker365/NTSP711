package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.BankDAO;

@Service("bankService")
public class BankServiceImpl implements BankService {
	@Autowired
	private  BankDAO dao;


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
