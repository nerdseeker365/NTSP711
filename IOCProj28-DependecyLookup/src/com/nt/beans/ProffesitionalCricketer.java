package com.nt.beans;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class ProffesitionalCricketer {
	private String name;
	private String beanId;
	
	public void setBeanId(String beanId) {
		this.beanId = beanId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public    void  bowling() {
		System.out.println(name+" crickter is  bowling");
	}
	public    void  fielding() {
		System.out.println(name+" crickter is  fielding");
	}
	
	public  void  batting() {
		DefaultListableBeanFactory factory=null;
		XmlBeanDefinitionReader reader=null;
		CricketBat bat=null;
		//create IOc container
		factory=new DefaultListableBeanFactory();
		reader=new XmlBeanDefinitionReader(factory);
		reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		//get Depedent class obj (Dependency Lookup)
		bat=factory.getBean(beanId,CricketBat.class);
		System.out.println(name+" crickter is batting");
		bat.scoreRuns();
	}
	

}
