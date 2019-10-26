package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.AadharCardInfo;


public class NullInjectionTest {

	public static void main(String[] args) {
		System.out.println("start of main(-)");
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		AadharCardInfo info=null;
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get Bean class object
		info=factory.getBean("rajaACI",AadharCardInfo.class);
		System.out.println(info);
	}

}
