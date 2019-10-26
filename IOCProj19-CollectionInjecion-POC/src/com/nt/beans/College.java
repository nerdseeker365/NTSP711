package com.nt.beans;

import java.util.Date;
import java.util.List;

public class College {
	private List<String>  studNames;
	private List<Date>  listDates;

	public void setListDates(List<Date> listDates) {
		this.listDates = listDates;
	}

	public void setStudNames(List<String> studNames) {
		this.studNames = studNames;
	}

	@Override
	public String toString() {
		return "College [studNames=" + studNames + ", listDates=" + listDates + "]-->"+studNames.getClass();
	}

	
}
