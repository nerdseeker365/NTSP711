package com.nt.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.controller.MainController;
import com.nt.vo.EmployeeVO;

public class NestedBeanFactoryTest1{
	public static void main(String[] args) {
		ClassPathXmlApplicationContext pCtx=null,cCtx=null;
		MainController controller=null;
		List<EmployeeVO>listVO=null;
		//create  IOC container
		pCtx=new ClassPathXmlApplicationContext("com/nt/cfgs/business-beans.xml");
		cCtx=new ClassPathXmlApplicationContext("com/nt/cfgs/presentation-beans.xml");
		cCtx.setParent(pCtx);
		cCtx.refresh();
		//get Controller class object
		System.out.println("1234");
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
		((AbstractApplicationContext) cCtx).close();
		((AbstractApplicationContext) pCtx).close();
	}//main
}//class
