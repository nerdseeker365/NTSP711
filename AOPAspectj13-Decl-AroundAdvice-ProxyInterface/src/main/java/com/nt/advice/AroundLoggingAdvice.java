package com.nt.advice;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;

public class AroundLoggingAdvice {
	
	public  Object  logging(ProceedingJoinPoint pjp)throws Throwable{
		Object retVal=null;
		Object args[]=null;
		System.out.println("Entering into "+pjp.getSignature()+" with args"+Arrays.toString(pjp.getArgs()));
		//modifying arg value
		args=pjp.getArgs();
		if(((Integer)args[0])<0)
			args[0]=((Integer)args[0])*-1;
		
		//Control target method execution
		if(pjp.getSignature().getName().equalsIgnoreCase("transferMoney")) {
			if( ((Float)args[2])<=0)
                  throw new IllegalArgumentException("Invalid inputs....");
		}
		   retVal=pjp.proceed(args);
		
		
		retVal=((String)retVal)+" *";
		System.out.println("Exiting from "+pjp.getSignature()+" with args"+Arrays.toString(pjp.getArgs()));
		return retVal;
	}

}
