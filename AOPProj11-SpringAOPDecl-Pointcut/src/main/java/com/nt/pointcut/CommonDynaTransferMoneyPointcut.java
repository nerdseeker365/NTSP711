package com.nt.pointcut;

import java.lang.reflect.Method;

import org.springframework.aop.support.DynamicMethodMatcherPointcut;

import com.nt.service.BankService;

public class CommonDynaTransferMoneyPointcut extends DynamicMethodMatcherPointcut {

	@Override
	public boolean matches(Method method, Class<?> targetClass, Object... args) {
		if(method.getName().equalsIgnoreCase("transferMoney") && targetClass==BankService.class && ((Float)args[2])>=100000)
		return true;
		else
			return false;
	}

}
