package com.nt.service;

import java.util.Arrays;

public class OnlineStore {
	public String shopping(String items[],float prices[]) {
		float billAmt=0.0f;
		for(float price:prices) {
			billAmt=billAmt+price;
		}
		return Arrays.toString(items)+" having prices"+Arrays.toString(prices)+" bill Amount is::"+billAmt;
	}
}
