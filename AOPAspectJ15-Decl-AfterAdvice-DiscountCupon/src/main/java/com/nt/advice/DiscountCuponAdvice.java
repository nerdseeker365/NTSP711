package com.nt.advice;

import java.io.FileWriter;
import java.io.Writer;

import org.aspectj.lang.JoinPoint;

public class DiscountCuponAdvice {
	
	public  void    cupon(JoinPoint jp,String retVal)throws Throwable{
		float billAmt=0.0f;
		String cuponMsg=null;
		Writer writer=null;
		
		billAmt=Float.parseFloat(retVal.substring(retVal.indexOf("::")+2, retVal.length()));
		if(billAmt>=50000)
			cuponMsg="Avail 30% Discount on next purchase";
		else if(billAmt>=30000)
			cuponMsg="Avail 20% Discount on next purchase";
		else
			cuponMsg="Avail 10% Discount on next purchase";
		//write discount cupon
		try {
			writer=new FileWriter("E:/discount.txt");
			writer.write(cuponMsg);
			writer.flush();
			writer.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
