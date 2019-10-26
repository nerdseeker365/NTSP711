package com.nt.beans;

import org.springframework.beans.factory.BeanFactory;

public class ProffesitionalCricketer {
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public    void  bowling() {
		System.out.println(name+" crickter is  bowling");
	}
	public    void  fielding() {
		System.out.println(name+" crickter is  fielding");
	}
	
	public  void  batting(BeanFactory factory) {
		CricketBat bat=null;
		bat=factory.getBean(CricketBat.class);
		System.out.println(name+" crickter is batting");
		bat.scoreRuns();
	}
	

}
