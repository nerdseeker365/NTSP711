package com.nt.bpp;

import java.util.Date;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import com.nt.bo.BaseBO;

public class DOJBeanPostProcessor implements BeanPostProcessor {
	
	public DOJBeanPostProcessor() {
		System.out.println("DOJBeanPostProcessor:0-param consturctor");
	}
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("DOJBeanPostProcessor.postProcessBeforeInitialization()");		
		if(bean instanceof BaseBO) {
           System.out.println("for BO");
			((BaseBO)bean).setDoj(new Date());
		}
			return bean;
	
	}

}
