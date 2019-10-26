package com.nt.beans;

import java.util.Date;

public class CheckVotingElgibility {
	private String name;
	private  String  addrs;
	private   int  age;
	private Date verifiedOn;
	public void setName(String name) {
		System.out.println("CheckVotingElgibility.setName(-)");
		this.name = name;
	}
	public void setAddrs(String addrs) {
		System.out.println("CheckVotingElgibility.setAddrs(-)");
		this.addrs = addrs;
	}
	public void setAge(int age) {
		System.out.println("CheckVotingElgibility.setAge(-)");
		this.age = age;
	}
	
	//custom init method
	public  void myInit1() {
		System.out.println("CheckVotingElgibility.myInit()");
		//initialization of left over properties
		verifiedOn=new Date();
		// check the correctness of the data
		if(name==null || age<=0)
			throw new  IllegalArgumentException("Invalid name,age values");
				
	}
	
	public  String checkElgibility() {
		System.out.println("CheckVotingElgibility.checkElgibility()");
		if(age<18)
			return "Mr/Miss."+ name +" u  r  not elgible for voting.. verified On"+new Date();
		else
			return "Mr/Miss."+ name +" u  r   elgible for voting.. verified On"+new Date();
	}
	
	 public void myDestroy() {
		 System.out.println("CheckVotingElgibility.destroy()");
		 verifiedOn=null;
		 name=null;
		 age=0;
		 addrs=null;
	 }

}
