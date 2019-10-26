package com.nt.beans;

import org.springframework.stereotype.Component;

@Component("fFlight")
public class FirstFlight implements Courier {
 
	public FirstFlight() {
		System.out.println("FirstFlight:0-param constructor");
	}
	@Override
	public String deliver(int oid) {
		return oid+" order items are delivered by FirstFlight";
	}

}
