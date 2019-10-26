package com.nt.command;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmployeeSearchCommand {
	private int empNo;
	private String ename;
	private  String job;
	private float sal;
	
	public EmployeeSearchCommand() {
		System.out.println("EmployeeSearchCommand:0-param constructor");
	}
	

}
