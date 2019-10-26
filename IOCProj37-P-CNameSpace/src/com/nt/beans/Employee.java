package com.nt.beans;

import java.util.Date;

public class Employee {
	private int eno;
	private String ename;
	private  Date doj;
	private Department dept;
	public void setEno(int eno) {
		this.eno = eno;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", doj=" + doj + ", dept=" + dept + "]";
	}
}
