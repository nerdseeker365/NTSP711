package com.nt.test;

import org.springframework.beans.PropertyEditorRegistrar;
import org.springframework.beans.PropertyEditorRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.BankLoanDept;
import com.nt.beans.IntrAmtDetails;
import com.nt.editors.IntrAmtDetailsEditor;

public class CustomPropertyEditorTest1 {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		BankLoanDept dept=null;
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//register  CustomPERegistar with  BeanFactory Container
		factory.addPropertyEditorRegistrar(new PropertyEditorRegistrar() {
			@Override
			public void registerCustomEditors(PropertyEditorRegistry registry) {
				registry.registerCustomEditor(IntrAmtDetails.class,
						                                                        new IntrAmtDetailsEditor());
			}//method
		}//inner class
		);//method call
		//get Bean class object
		dept=factory.getBean("loanDept",BankLoanDept.class);
		//invoke method
		System.out.println("Simple Intr Amount::"+dept.calcIntrAmt());
	}
}
