package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.ProffesitionalCricketer;

public class DependencyLookupTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader  reader=null;
		ProffesitionalCricketer crickter=null;
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get taget class object
		crickter=factory.getBean("crtr1",ProffesitionalCricketer.class);
		//invoke methods
		crickter.bowling();
		crickter.fielding();
		crickter.batting();
	}

}
