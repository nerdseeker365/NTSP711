package com.nt.beans;

import java.util.Arrays;

public class TourPlan {
	private String[] places;
	private  boolean isInsured;

	

	public void setInsured(boolean isInsured) {
		this.isInsured = isInsured;
	}

	public void setPlaces(String[] places) {
		this.places = places;
	}

	@Override
	public String toString() {
		return "TourPlan [places=" + Arrays.toString(places) + ", isInsured=" + isInsured + "]";
	}


	

}
