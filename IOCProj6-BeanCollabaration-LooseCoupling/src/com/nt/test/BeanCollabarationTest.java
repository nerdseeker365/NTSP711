package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.DTDC;
import com.nt.beans.Flipkart;

public class BeanCollabarationTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Flipkart fpkt=null;
		//create IOC container
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		//get Target Bean class object
		//fpkt=(Flipkart)factory.getBean("fpkt");
		fpkt=factory.getBean("fpkt",Flipkart.class);

		//invoke methods
		System.out.println(fpkt.shopping(new String[] {"fruits","flowers","sweets","shirt","trousher"},
				                                                      new float[] {1000,1000,1000,2000,2000}));
	}//main
}//class
