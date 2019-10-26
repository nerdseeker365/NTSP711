package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.AirtelService;
import com.nt.beans.College;
import com.nt.beans.FacultyInfo;
import com.nt.beans.FruitStore;
import com.nt.beans.ShoeFactory;

public class CollectionInjectionTest {

	public static void main(String[] args) {
	  DefaultListableBeanFactory factory=null;
	  XmlBeanDefinitionReader reader=null;
	  ShoeFactory sfactory=null;
	  College college=null;
	  AirtelService airtel=null;
	  FacultyInfo info=null;
	  FruitStore  store=null;
		//create IOC container
	  factory=new DefaultListableBeanFactory();
	  reader=new XmlBeanDefinitionReader(factory);
	  reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
	  //get Bean
	  sfactory=factory.getBean("sFactory",ShoeFactory.class);
	  System.out.println(sfactory);
	  System.out.println("..................................");
	  college=factory.getBean("clg",College.class);
	  System.out.println(college);
	  System.out.println("..................................");
	  airtel=factory.getBean("airtel",AirtelService.class);
	  System.out.println(airtel);
	  System.out.println("...............................................");
	  info=factory.getBean("fi",FacultyInfo.class);
	  System.out.println(info);
	  System.out.println("...................................");
	  store=factory.getBean("fstore",FruitStore.class);
	  System.out.println(store);
	  
	  
	}
}
