package com.nt.beans;

import org.springframework.stereotype.Component;

@Component("dtdc")
public final class DTDC implements Courier {

	@Override
	public String deliver(int oid) {
		
		return "DTDC:  delivered  "+oid+" order to customer";
	}

}
