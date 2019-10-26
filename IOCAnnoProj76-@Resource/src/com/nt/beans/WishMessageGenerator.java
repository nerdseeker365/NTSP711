package com.nt.beans;

import java.util.Calendar;

import javax.annotation.Resource;
import javax.inject.Named;

//@Named("wmg")
public class WishMessageGenerator {
	
	
	
	//@Resource(name="cal1")
	@Resource
	@Named("cal1")
	private Calendar calendar;
	
	
	
	
	/*public WishMessageGenerator (Calendar calendar) {
		this.calendar = calendar;
	}*/

	/*@Resource(name="cal1")
	public  void setCalendar(Calendar calendar) {
		this.calendar=calendar;
	}*/
	
	/*@Resource(name="cal1")
	public void assign(Calendar calendar) {
		this.calendar=calendar;
	}*/

	
	
	


	
	
	public String generate(String user) {
		int hour = 0;
		System.out.println(calendar);
		// get current hour of the day
		hour = calendar.get(Calendar.HOUR_OF_DAY);
		// generate wish message
		if (hour < 12)
			return "GM::" + user;
		else if (hour < 16)
			return "GA::" + user;
		else if (hour < 20)
			return "GE::" + user;
		else
			return "GN::" + user;

	}

	@Override
	public String toString() {
		return "WishMessageGenerator [calendar=" + calendar + "]";
	}

}
