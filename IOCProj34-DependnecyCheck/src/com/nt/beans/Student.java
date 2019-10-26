package com.nt.beans;

import java.util.Calendar;

public class Student {
	private int id;
	private String name;
	private String addrs;
	private  CourseMaterial meterial;
	private  Calendar cal;
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	public void setMeterial(CourseMaterial meterial) {
		this.meterial = meterial;
	}
	public void setCal(Calendar cal) {
		this.cal = cal;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", addrs=" + addrs + ", meterial=" + meterial + ", cal=" + cal
				+ "]";
	}
	
	
	

}
