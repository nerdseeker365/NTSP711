package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.EnggStudent;

public class CollectionMergingTest {

	public static void main(String[] args) {
		System.out.println("start of main(-)");
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
	    EnggStudent st=null,st1=null;
	
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get Bean class object
		st=factory.getBean("ec1stYear",EnggStudent.class);
		System.out.println(st);
		System.out.println(".....................");
		st1=factory.getBean("rjs",EnggStudent.class);
		System.out.println(st1);
	}
}
