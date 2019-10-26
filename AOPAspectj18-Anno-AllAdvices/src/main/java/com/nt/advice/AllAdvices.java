package com.nt.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component("allAdvices")
@Aspect
public class AllAdvices {
	
	@Pointcut(value="execution(* com.nt.service.BankService.*(..))")
	public void  myPtc() {
		
	}
	
	@Around(value="myPtc()")
	 public   Object   log(ProceedingJoinPoint pjp)throws Throwable{
		 Object retVal=null;
		 System.out.println("before of AroundAdvice(-)");
		 retVal=pjp.proceed();
		 System.out.println("after of AroundAdvice(-)");
		 return retVal;
	 }
	
	@Before(value="myPtc()")
	public   void  beforeLog(JoinPoint jp) throws Throwable{
		System.out.println("from  Before Advice");
	}
	
	@AfterReturning(value="myPtc()",returning="result")
	public   void  afterLog(JoinPoint jp,String result) throws Throwable{
		System.out.println("from  After Advice");
	}
	
	@AfterThrowing(value="myPtc()",throwing="ex")
	public  void  expLogger(JoinPoint jp,Exception ex) {
		System.out.println("from  Throws Advice"+ex);
	}
	
	

}
