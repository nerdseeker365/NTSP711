package com.nt.service;

public class BillAmtCalculator {
	
	public  float generateBillAmt(float price,float qty) {
		if(price<=0.0f || qty<=0.0f)
			  throw new  IllegalArgumentException ("In valid Inputs");
		else
			return  price *qty;
	}
}
