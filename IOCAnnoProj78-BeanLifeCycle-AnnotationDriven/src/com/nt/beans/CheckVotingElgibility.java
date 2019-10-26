package com.nt.beans;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("voter")
//@Named("voter")
@PropertySource(value="classpath:/com/nt/commons/VoterDetails.properties")
public class CheckVotingElgibility {
	@Value("${voter.name}")
	private String name;
	@Value("${voter.addrs}")
	private  String  addrs;
	@Value("${voter.age}")
	private   int  age;
	private Date verifiedOn;
	
	
	// init method
	@PostConstruct
	public  void myInit() {
		System.out.println("CheckVotingElgibility.myInit()");
		//initialization of left over properties
		verifiedOn=new Date();
		// check the correctness of the data
		if(name==null || age<=0)
			throw new  IllegalArgumentException("Invalid name,age values");
				
	}
	
	//b.method
	public  String checkElgibility() {
		System.out.println("CheckVotingElgibility.checkElgibility()");
		if(age<18)
			return "Mr/Miss."+ name +" u  r  not elgible for voting.. verified On"+new Date();
		else
			return "Mr/Miss."+ name +" u  r   elgible for voting.. verified On"+new Date();
	}
	
	@PreDestroy
	 public void myDestroy() {
		 System.out.println("CheckVotingElgibility.destroy()");
		 verifiedOn=null;
		 name=null;
		 age=0;
		 addrs=null;
	 }

}
