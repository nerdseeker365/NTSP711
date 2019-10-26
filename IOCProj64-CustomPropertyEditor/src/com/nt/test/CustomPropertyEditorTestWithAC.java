package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.BankLoanDept;
import com.nt.beans.IntrAmtDetails;
import com.nt.editors.IntrAmtDetailsEditor;

public class CustomPropertyEditorTestWithAC {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		BankLoanDept dept=null;
		//create IOC container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		
		//get Bean class object
		dept=ctx.getBean("loanDept",BankLoanDept.class);
		//invoke method
		System.out.println("Simple Intr Amount::"+dept.calcIntrAmt());
	}
}
