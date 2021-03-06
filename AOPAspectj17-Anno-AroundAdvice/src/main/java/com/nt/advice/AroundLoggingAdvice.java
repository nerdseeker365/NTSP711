package com.nt.advice;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("logAdvice")
@Aspect
@Order(2)
public class AroundLoggingAdvice {
	
	@Around(value="execution(java.lang.String com.nt.service.BankService.*(..))")
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
