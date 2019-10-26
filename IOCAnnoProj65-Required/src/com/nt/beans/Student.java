package com.nt.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Required;

public class Student {
	private int sid;
	private String sname;
	private  Date  doj;
	private  Book  book;
	
	
	public void setSid(int sid) {
		this.sid = sid;
	}
	@Required
	public void setSname(String sname) {
		this.sname = sname;
	}
	
	
	public void setDoj(Date doj) {
		this.doj = doj;
	}
	
	@Required
	public void setBook(Book book) {
		this.book = book;
	}
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", doj=" + doj + ", book=" + book + "]";
	}
	
	

}
