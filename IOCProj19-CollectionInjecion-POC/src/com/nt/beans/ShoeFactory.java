package com.nt.beans;

import java.util.Arrays;
import java.util.Date;

public class ShoeFactory {
	private  float[] sizes;
	private  Date[]  dates;
	public void setSizes(float[] sizes) {
		this.sizes = sizes;
	}
	public void setDates(Date[] dates) {
		this.dates = dates;
	}
	@Override
	public String toString() {
		return "ShoeFactory [sizes=" + Arrays.toString(sizes) + ", dates=" + Arrays.toString(dates) + "]";
	}
	
	

}
