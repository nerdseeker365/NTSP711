package com.nt.beans;

import java.util.Calendar;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.beans.factory.annotation.Qualifier;

public class WishMessageGenerator {
	
	/*@Inject
	@Named("cal") */
	private Calendar calendar;

	
	/* @Inject
	 //@Named("cal")
	 //@Named("c1")
	public WishMessageGenerator(@Qualifier("c1") Calendar calendar) {
		this.calendar = calendar;
	}*/
	
	


	
	/*  @Inject
	  @Named("cal1")
	  public void setCalendar(Calendar cal)
	  { 
		  this.calendar = cal;
	  } */
	 

	
	  @Inject
	  //@Named("cal1")
	  public void assign(Calendar calendar) {
	       this.calendar=calendar;
	  }
	 

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
