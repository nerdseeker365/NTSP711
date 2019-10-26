package com.nt.beans;

import java.beans.ConstructorProperties;

public class Employee {
	private int eno;
	private String ename;
	private  int deptNo;
	private  String desg;
	private float salary;
	
	//@ConstructorProperties(value={"no","name","dno","desg","sal"})
	public Employee(int eno, String ename, int deptNo, String desg, float salary) {
		System.out.println("Employee: 5-param constructor");
		this.eno = eno;
		this.ename = ename;
		this.deptNo = deptNo;
		this.desg = desg;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", deptNo=" + deptNo + ", desg=" + desg + ", salary="
				+ salary + "]";
	}
	
	

}
