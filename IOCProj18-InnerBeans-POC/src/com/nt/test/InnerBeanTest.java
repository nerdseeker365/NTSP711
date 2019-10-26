package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.DecthlonStrore;
import com.nt.beans.KalanjeeShoe;

public class InnerBeanTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		DecthlonStrore store=null;
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new  XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get Taget Bean class object
		store=factory.getBean("dStore",DecthlonStrore.class);
		System.out.println(store);
		
	}
}
