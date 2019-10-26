package com.nt.bo;

public class EmployeeBO extends BaseBO {
	private String desg;

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}

	@Override
	public String toString() {
		return "EmployeeBO [desg=" + desg + ", getName()=" + getName() + ", getAddrs()=" + getAddrs() + ", getEmail()="
				+ getEmail() + ", getMobileNo()=" + getMobileNo() + ", getDoj()=" + getDoj() + "]";
	}
	
	

	
}
