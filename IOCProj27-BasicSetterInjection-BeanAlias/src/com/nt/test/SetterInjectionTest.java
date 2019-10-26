package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessageGenerator;

public class SetterInjectionTest {

	public static void main(String[] args) {
		System.out.println("start of main(-)");
		Resource res=null;
		BeanFactory factory=null;
		WishMessageGenerator o1=null,o2=null,o3=null;
		//Locate Spring Bean cfg file
		res=new FileSystemResource("src/com/nt/cfgs/applicationContext.xml");
		System.out.println("Spring Bean cfg file is name specified");
	   //create IOC container  (BeanFactory)
		factory=new XmlBeanFactory(res);
		System.out.println("IOC container is created");
		//get Target Bean class object
		o1=factory.getBean("wmg",WishMessageGenerator.class);
		System.out.println(".............................");
		o2=factory.getBean("wish",WishMessageGenerator.class);
		System.out.println(".............................");
		o3=factory.getBean("gen1",WishMessageGenerator.class);
		System.out.println(o1.hashCode()+"   "+o2.hashCode()+"   "+o3.hashCode());
		
		

	}

}
