package com.nt.command;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CustomerCommand {
	private String cname;
	private  String addrs;
	private  Long mobileNo;
	private Float billAmt;
	private  String vflag="no";
	
	public CustomerCommand() {
		System.out.println("CustomerCommand:0-param constructor");
	}
	

}
