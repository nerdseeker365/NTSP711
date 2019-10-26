package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("fpkt")
public final class Flipkart {
	@Autowired
	private  Courier courier;
	
	public   String shopping(String items[]) {
		float billAmt=0.0f;
		int oid=0;
		String status=null;
		//calc bill Amount
		billAmt=items.length*1000;
		
		//generate Order id
		oid=new Random().nextInt(1000);
		//use courier
		status=courier.deliver(oid);
		return Arrays.toString(items)+" are purcharsed with billAmt :"+billAmt+"--> "+status;
	}

}
