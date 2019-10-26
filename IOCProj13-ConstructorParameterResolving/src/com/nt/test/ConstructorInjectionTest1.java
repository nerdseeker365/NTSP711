package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Employee;
import com.nt.beans.Marks;
import com.nt.beans.Student;

public class ConstructorInjectionTest1 {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		Student stud=null;
		Marks  marks=null;
		Employee emp=null;
	//create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get Bean class object
		stud=factory.getBean("st",Student.class);
		System.out.println(stud);
		System.out.println(".............................");
		marks=factory.getBean("mk",Marks.class);
		System.out.println(marks);
		System.out.println(".................................");
		emp=factory.getBean("emp",Employee.class);
		System.out.println(emp);

	}

}
