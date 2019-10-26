package com.nt.test;

import java.util.List;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.config.BusinessAppConfig;
import com.nt.config.PresentationAppConfig;
import com.nt.controller.MainController;
import com.nt.vo.EmployeeVO;

public class NestedApplicationTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext pCtx=null,cCtx=null;
		MainController controller=null;
		List<EmployeeVO> listVO=null;
		//create parent IOC container
		pCtx=new AnnotationConfigApplicationContext(BusinessAppConfig.class);
		//create child IOC container
		cCtx=new AnnotationConfigApplicationContext(PresentationAppConfig.class);
		cCtx.setParent(pCtx);
		System.out.println(".......................");
		//get Controller class object
		controller=cCtx.getBean("controller",MainController.class);
		try {
		//invoke the method
		listVO=controller.process("CLERK", "MANAGER","SALESMAN");
		 listVO.forEach(vo->{
			 System.out.println(vo.getSrNo()+"  "+vo.getEname()+"  "+vo.getEno()+"  "+vo.getDesg()+"  "+vo.getSalary());
		 });
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Internal Problem");
		}
	}//main
}//class
