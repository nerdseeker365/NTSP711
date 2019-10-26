package com.nt.advice;

import java.io.FileWriter;
import java.io.Writer;
import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class DiscountCuponAdvice implements AfterReturningAdvice {

	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
	    float billAmt=0.0f;
	    Writer writer=null;
	    String cuponMsg=null;
	    
	    //get bill Amount
	    billAmt=Float.parseFloat(((String)returnValue).substring(((String)returnValue).indexOf("::")+2,((String)returnValue).length()));
	    //create FileWriter
	    writer=new FileWriter("E:/cupon.txt");
	    //generate cuponMsg
	    if(billAmt>=50000)
	    	cuponMsg="Avail 40% discount on next purchase";
	    else if(billAmt>=30000)
	    	cuponMsg="Avail 30% discount on next purchase";
	    else
	    	cuponMsg="Avail 10% discount on next purchase";
	    //generate cupon
	    try {
	    	writer.write(cuponMsg);
	    	writer.flush();
	    	writer.close();
	    }
	    catch(Exception e) {
	    	e.printStackTrace();
	    }
	    returnValue=((String)returnValue)+"hello";
	    
	}//method
}//class
