package com.nt.bo;

import java.util.Date;

public abstract class BaseBO {
	private  String name;
	private  String addrs;
	private String email;
	private long mobileNo;
	private  Date doj;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddrs() {
		return addrs;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Date getDoj() {
		return doj;
	}
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "BaseBO [name=" + name + ", addrs=" + addrs + ", email=" + email + ", mobileNo=" + mobileNo + ", doj="
				+ doj + "]";
	}
	

}
