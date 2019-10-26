package com.nt.command;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CustomerCommand {
	private String cname;
	private  String addrs="hyd";
	private  Long mobileNo=999999999L;
	private Float billAmt;
	
	public CustomerCommand() {
		System.out.println("CustomerCommand:0-param constructor");
	}
	

}
