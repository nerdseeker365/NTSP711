package com.nt.beans;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	@Autowired
	//@Qualifier("createCalendar")
	private  Calendar calendar;
	static {
		System.out.println("WishMessageGenerator.static block");
	}
	public WishMessageGenerator() {
		System.out.println("WishMessageGenerator:0-param constructor");
	}
	
	public   String generateWishMessage(String user) {
		 int hour=0;
		 System.out.println(calendar);
		 //get current hour of the day
		 hour=calendar.get(Calendar.HOUR_OF_DAY);
		 //generate wish message
		 if(hour<12)
			 return "Good Morning:"+user;
		 else if(hour<16)		 
			 return "Good AfterNoon:"+user;
		 else if(hour<20)
			 return "Good Evening:"+user;
		 else
			 return "Good Night:"+user;
	}

}
