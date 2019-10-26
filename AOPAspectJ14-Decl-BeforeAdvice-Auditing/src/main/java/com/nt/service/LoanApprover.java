package com.nt.service;

import java.util.Random;

public class LoanApprover {
	
	public  String  approveLoan(String loanType, float amt, String manager) {
		
		if(loanType.equalsIgnoreCase("agri")) {
			if(amt<=100000) {
				return  new Random().nextInt(10000)+" loanid  loan  is  approved for the amount "+amt+" by manager   "+manager;
			}
		}
			return  new Random().nextInt(10000)+" loan id loan is rejected for the amount  "+amt+"  by the manager"+manager;
		
	}

}
