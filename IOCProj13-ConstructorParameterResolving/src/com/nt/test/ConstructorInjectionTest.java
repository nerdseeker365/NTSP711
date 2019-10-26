package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import com.nt.beans.Employee;
import com.nt.beans.Marks;
import com.nt.beans.Student;

public class ConstructorInjectionTest {

	public static void main(String[] args) {
		BeanFactory factory=null;
		Student stud=null;
		Marks  marks=null;
		Employee emp=null;
	//create IOC container
		factory=new XmlBeanFactory(new ClassPathResource("com/nt/cfgs/applicationContext.xml"));
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
