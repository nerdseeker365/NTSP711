package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.CricketBat;
import com.nt.beans.ProffesitionalCricketer;

public class DependencyLookupTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader  reader=null;
		ProffesitionalCricketer crickter=null;
		CricketBat bat=null;
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		//get taget class object
		crickter=factory.getBean("crtr1",ProffesitionalCricketer.class);
		//get Dependent class object
	      bat=factory.getBean("bat",CricketBat.class);
		//invoke methods
		crickter.bowling();
		crickter.fielding();
		crickter.batting(factory,bat);
	}

}
