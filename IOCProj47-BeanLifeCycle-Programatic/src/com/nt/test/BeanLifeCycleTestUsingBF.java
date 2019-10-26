package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.AbstractApplicationContext;

import com.nt.beans.CheckVotingElgibility;

public class BeanLifeCycleTestUsingBF {

	public static void main(String[] args) {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		CheckVotingElgibility voting=null;
		//create IOC container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		
		//get Bean
		voting=factory.getBean("voter",CheckVotingElgibility.class);
		System.out.println(voting.checkElgibility());
		//destroy singletons
		factory.destroySingletons();
		
		

	}

}
