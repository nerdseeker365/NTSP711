package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Printer;
import com.nt.beans.WishMessageGenerator;

public class BeanScopesTest {

	public static void main(String[] args) {
		System.out.println("start of main(-)");
		WishMessageGenerator generator1=null,generator2=null;
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Printer p1=null,p2=null;
		//Locate Spring Bean cfg file
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get Bean class objects
		generator1=factory.getBean("wmg",WishMessageGenerator.class);
		generator2=factory.getBean("wmg",WishMessageGenerator.class);
		System.out.println(generator1.hashCode()+"  "+generator2.hashCode());
		System.out.println("generator1==generator2?"+(generator1==generator2));
		System.out.println("...............................");
		p1=factory.getBean("pntr",Printer.class);
		p2=factory.getBean("pntr",Printer.class);
		System.out.println(p1.hashCode()+"  "+p2.hashCode());
		System.out.println("p1==p2?"+(p1==p2));
		
		

	}

}
