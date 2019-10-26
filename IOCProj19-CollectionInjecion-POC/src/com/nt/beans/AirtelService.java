package com.nt.beans;

import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

public class AirtelService {
	private  Set<Long> availableNumbers;
	private Set<Date>  setDates;
	
	public void setAvailableNumbers(Set<Long> availableNumbers) {
		this.availableNumbers = availableNumbers;
	}
	
	public void setSetDates(Set<Date> setDates) {
		this.setDates = setDates;
	}
	
	@Override
	public String toString() {
		return "AirtelService [availableNumbers=" + availableNumbers + ", setDates=" + setDates + "]--->"+availableNumbers.getClass();
	}

}
