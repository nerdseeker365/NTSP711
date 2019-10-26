package com.nt.beans;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WishMessageGenerator {
	@Autowired (required=true)
	private Calendar calendar;

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
