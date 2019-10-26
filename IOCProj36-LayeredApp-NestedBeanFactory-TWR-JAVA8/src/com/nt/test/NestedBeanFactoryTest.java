package com.nt.test;

import java.util.List;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.controller.MainController;
import com.nt.vo.EmployeeVO;

public class NestedBeanFactoryTest {
	public static void main(String[] args) {
		DefaultListableBeanFactory pFactory=null,cFactory=null;
		XmlBeanDefinitionReader reader1=null,reader2=null;
		MainController controller=null;
		List<EmployeeVO> listVO=null;
		//create parent IOC container
		pFactory=new DefaultListableBeanFactory();
		reader1=new XmlBeanDefinitionReader(pFactory);
		reader1.loadBeanDefinitions("com/nt/cfgs/business-beans.xml");
		//create child IOC container
		cFactory=new DefaultListableBeanFactory(pFactory);
		reader2=new XmlBeanDefinitionReader(cFactory);
		reader2.loadBeanDefinitions("com/nt/cfgs/presentation-beans.xml");
		//get Controller class object
		controller=cFactory.getBean("controller",MainController.class);
		try {
		//invoke the method
		listVO=controller.process("CLERK", "MANAGER","SALESMAN");
		 listVO.forEach(vo->{
			 System.out.println(vo.getSrNo()+"  "+vo.getEname()+"  "+vo.getEno()+"  "+vo.getDesg()+"  "+vo.getSalary());
		 });
		}
		catch(Exception e) {
			System.out.println("Internal Problem");
		}
	}//main
}//class
