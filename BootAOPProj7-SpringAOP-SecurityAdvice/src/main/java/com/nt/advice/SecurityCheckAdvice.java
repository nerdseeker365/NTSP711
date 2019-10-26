package com.nt.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.manager.AuthenticationManager;

@Component("securityAdvice")
public class SecurityCheckAdvice implements MethodBeforeAdvice {
	@Autowired
	private  AuthenticationManager manager;

	

	public void before(Method method, Object[] args, Object target) throws Throwable {
		boolean isAuthenticated=false;
		//use Manager
		isAuthenticated=manager.authenticate();
		if(!isAuthenticated)
			 throw new IllegalArgumentException("invalid credentials.....");
	}

}
