package com.nt.beans;

public class BankLoanDept {
	private  IntrAmtDetails details;

	public BankLoanDept(IntrAmtDetails details) {
		this.details = details;
	}
	
	public float  calcIntrAmt() {
		return  (details.getPamt()*details.getTime()*details.getRate())/100.0f;
	}

}
