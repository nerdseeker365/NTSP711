package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.Viechle;

public class StrategyDPTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Viechle viechle=null;
		//create IOC container
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
		//get Bean class object
		viechle=factory.getBean("viechle",Viechle.class);
		//invoke methods
		viechle.journery("hyd", "delhi");
		System.out.println("...............");
		viechle.journery("delhi", "bhubaneswar");
		
	}

}
