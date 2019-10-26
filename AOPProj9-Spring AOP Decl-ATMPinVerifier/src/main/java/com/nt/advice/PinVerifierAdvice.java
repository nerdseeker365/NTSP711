package com.nt.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class PinVerifierAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object retVal, Method method, Object[] args, Object target) throws Throwable {
		// verify the pin
		
		if( ((Integer)retVal)<999)
			throw new IllegalArgumentException("invalid pin");
		
	

	}

}
