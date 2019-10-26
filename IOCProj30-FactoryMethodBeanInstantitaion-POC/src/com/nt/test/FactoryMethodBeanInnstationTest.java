package com.nt.test;

import java.util.Calendar;
import java.util.Properties;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class FactoryMethodBeanInnstationTest {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		String s1=null;
		Class c1=null;
		Calendar cal=null;
		Properties props=null;
		String s3=null,s4=null;
		//create IOC Container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get Bean class object
		c1=factory.getBean("c1",Class.class);
		System.out.println("c1 obj class name::"+c1.getClass()+" c1 obj data::"+c1.toString());
		System.out.println("................................");
		s1=factory.getBean("s1",String.class);
		System.out.println("s1 obj class name::"+s1.getClass()+" s1 obj data::"+s1.toString());
		System.out.println(".....................");
		cal=factory.getBean("cal",Calendar.class);
		System.out.println("cal object class name::"+cal.getClass()+" cal obj data::"+cal.toString());
	   System.out.println("............................");
	   props=factory.getBean("props",Properties.class);
	   System.out.println("props object class name::"+props.getClass()+" props obj data::"+props.toString());
	   System.out.println(".....................................");
	   s3=factory.getBean("s3",String.class);
	   System.out.println("s3 object class name::"+s3.getClass()+" s3 obj data::"+s3.toString());
	   System.out.println("...........................................");
	   s4=factory.getBean("s4",String.class);
	   System.out.println("s4 object class name::"+s4.getClass()+" s4 obj data::"+s4.toString());
	}
}
