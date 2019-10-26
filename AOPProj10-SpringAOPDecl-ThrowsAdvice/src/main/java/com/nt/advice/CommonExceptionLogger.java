package com.nt.advice;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

import com.nt.exception.SomeInternalProblemException;

public class CommonExceptionLogger implements ThrowsAdvice {

	

	
	
	public void afterThrowing(IllegalArgumentException iae) { 
		 System.out.println("4--->"+iae.toString() +"    Exception is raised ");
		}
	
	public void afterThrowing(Method method,Object[] args,Object target,IllegalArgumentException iae) { 
		 System.out.println("1--->"+iae.toString() +"    Exception is raised in"+ method.getName()+" in target class"+target.getClass());
		}
	
		
	
	 
	 public void afterThrowing(Method method,Object[] args,Object target,Throwable th) { 
		 System.out.println("3--->"+th.toString() +"    Exception is raised in"+ method.getName()+" in target class"+target.getClass());
	 }
	 
	 public void afterThrowing(Method method,Object[] args,Object target,Exception e) { 
		 System.out.println("2--->"+e.toString() +"    Exception is raised in"+ method.getName()+" in target class"+target.getClass());
	 }
	
	
	 

}
