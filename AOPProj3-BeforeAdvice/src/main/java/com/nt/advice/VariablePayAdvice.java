package com.nt.advice;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.aop.MethodBeforeAdvice;

import com.nt.service.PayrollService;

public class VariablePayAdvice implements MethodBeforeAdvice {

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println(method.getName()+"---> "+Arrays.toString(args)+"-->"+target.getClass());
		String desg=null;
		
		if(((Integer)args[0])<=0 || ((Float)args[1])<=0)
			throw new IllegalArgumentException("invalud inputs.....");
		
		desg= ((PayrollService)target).getDesg(((Integer)args[0]));
		if(!desg.equalsIgnoreCase("SSE"))
			args[2]=false;

	}

}
