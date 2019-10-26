package com.nt.pointcut;

import java.lang.reflect.Method;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

import com.nt.service.BankService;

public class CommonTransferMoneyPointCut  extends  StaticMethodMatcherPointcut{

	@Override
	public boolean matches(Method method, Class<?> targetClass) {
		System.out.println("CommonTransferMoneyPointCut.matches()");
		if(targetClass==BankService.class && method.getName().equalsIgnoreCase("transferMoney"))
		     return true;
		else
			return false;
	}

	

}
