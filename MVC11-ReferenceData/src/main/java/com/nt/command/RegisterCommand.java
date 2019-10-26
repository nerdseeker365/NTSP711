package com.nt.command;

import lombok.Data;

@Data
public class RegisterCommand {
	private String custName;
	private String custAddrs;
	private  String country="PAK";
	private String[]  hobies=new String[] {"sleeping"};
	private  String gender= "Male";
	private  String[] products=new String[] {"Bag","books"};

}
