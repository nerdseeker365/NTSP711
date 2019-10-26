package com.nt.advice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("cacheAdvice")
@Aspect
@Order(1)

public class CacheAdvice {
	private  Map<String,Object> cacheMap=new HashMap();
	
	@Around(value="execution(java.lang.String com.nt.service.BankService.tr*(..))")
	public  Object   caching(ProceedingJoinPoint pjp)throws Throwable{
		String key=null;
		Object retVal=null;
		key=pjp.getSignature()+Arrays.toString(pjp.getArgs());
		if(!cacheMap.containsKey(key)) {
			retVal=pjp.proceed();
			cacheMap.put(key,retVal);
			System.out.println("from target methd");
		}
		else {
			retVal=cacheMap.get(key);
			System.out.println("from cache");
		}
		return retVal;
	}

}
