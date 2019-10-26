package com.nt.beans;

import java.util.Date;

public class Department {
	private int deptNo;
	private String deptName;
	private  Date  doo;
	
	public Department(int deptNo, String deptName, Date doo) {
		System.out.println("Department::3-param constructor");
		this.deptNo = deptNo;
		this.deptName = deptName;
		this.doo = doo;
	}

	@Override
	public String toString() {
		return "Department [deptNo=" + deptNo + ", deptName=" + deptName + ", doo=" + doo + "]";
	}

}
