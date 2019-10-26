package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Bike;

public class BeanInheritenceTest {

	public static void main(String[] args) {
		System.out.println("start of main(-)");
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Bike b1=null,b2=null,b3=null;
	
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get Bean class object
		b1=factory.getBean("rajaBike",Bike.class);
		System.out.println(b1);
		System.out.println(".......................................");
		b2=factory.getBean("rameshBike",Bike.class);
		System.out.println(b2);
		b3=factory.getBean("baseBike",Bike.class);
		System.out.println(b3);
		
		
	
	}

}
