package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {
	private Courier courier;
	
	public Flipkart(Courier courier) {
		System.out.println("Flipkart:1-param constructor");
		this.courier = courier;
	}
	
	public  String  shopping(String items[],float prices[]) {
		float billAmt=0.0f;
		int orderNo=0;
		Random rad=null;
		String deliverStatus=null;
		//calc bill Amount
		for(int i=0;i<prices.length;++i) {
			billAmt=billAmt+prices[i];
		}
		//generate order number...
		rad=new Random();
		orderNo=rad.nextInt(100000);
		//use DTDC obj for delivering products
		deliverStatus=courier.deliver(orderNo);
		return Arrays.toString(items)+" are ordered with prices"+Arrays.toString(prices)+" having Bill Amount::"+billAmt+" and delivery status="+deliverStatus;
		
		
	}
	

}
