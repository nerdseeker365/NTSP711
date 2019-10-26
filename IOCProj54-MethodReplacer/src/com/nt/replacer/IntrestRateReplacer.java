package com.nt.replacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public  class IntrestRateReplacer implements MethodReplacer {
	private  float rate;
	

	public void setRate(float rate) {
		this.rate = rate;
	}


	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("IntrestRateReplacer.reimplement(-,-,-)");
		System.out.println(obj.getClass());
		System.out.println(method.getName());
		float  pAmt=(Float)args[0];
		float  time=(Float)args[1];
		return  (pAmt*time*rate)/100.0f;
	}

}
