package com.nt.beans;

import org.springframework.stereotype.Component;

@Component("courier")
public final class BuleDart implements Courier {

	@Override
	public String deliver(int oid) {
		
		return "Bluedart:  delivered  "+oid+" order to customer";
	}

}
