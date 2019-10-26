package com.nt.service;

public class BillAmountCalculatorImpl implements BillAmountCalculator {
	
	public float  calcBillAmount(float price, float qty) {
		
		if(price==0.0f || qty==0.0f)
			throw new IllegalArgumentException("invalid inputs");
		 return  price*qty;
	}

}
