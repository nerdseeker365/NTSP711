package com.nt.beans;

import java.util.Calendar;

public class ScheduleRemainder {
	private Calendar dob;

	public ScheduleRemainder(Calendar dob) {
		
		this.dob = dob;
	}
	
	public  String  remainderOfTheDay() {
		System.out.println(dob);
		
		Calendar sysDate=null;
		//get  system Date
		sysDate=Calendar.getInstance();
		System.out.println(sysDate);
		if((dob.get(Calendar.MONTH)==sysDate.get(Calendar.MONTH)+1) && (dob.get(Calendar.DATE)==sysDate.get(Calendar.DATE)) )
			 return  "Today is Birth Day..  Keep more Money in Pocket for giving Party to floks";
		else
			 return  "No Appointments... Plan as required";
	}//method
}//class
