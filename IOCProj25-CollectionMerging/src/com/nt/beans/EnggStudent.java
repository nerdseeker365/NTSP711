package com.nt.beans;

import java.util.Set;

public class EnggStudent {
	private  Set<String> subjects;

	public void setSubjects(Set<String> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "EnggStudent [subjects=" + subjects + "]";
	}
	
	

}
