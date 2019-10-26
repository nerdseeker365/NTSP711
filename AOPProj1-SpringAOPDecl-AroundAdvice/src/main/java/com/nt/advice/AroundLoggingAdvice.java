package com.nt.advice;

import java.util.Arrays;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class AroundLoggingAdvice implements MethodInterceptor {

	public Object invoke(MethodInvocation invocation) throws Throwable {
		Object retVal=null;
		Object args[]=null;
		System.out.println("Entering into "+invocation.getMethod().getName()+" with args"+Arrays.toString(invocation.getArguments()));
		args=invocation.getArguments();
		if(((Float)args[0])<=50000)
			args[1]=((Float)args[1])-0.5f;  //modifying target method args
		
		if(((Float)args[0])<=0 || ((Float)args[1])<=0 || ((Float)args[2])<=0)  //controlling target method
			throw  new IllegalArgumentException("provide valid inputs");
		
		retVal=invocation.proceed();
		
		retVal=((Float)retVal)+((Float)retVal)*0.01f;  //modifying return value..
		System.out.println("Exiting from "+invocation.getMethod().getName()+" with args"+Arrays.toString(invocation.getArguments()));
		return retVal;
	}

}
