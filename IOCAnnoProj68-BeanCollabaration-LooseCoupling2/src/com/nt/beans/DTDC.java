package com.nt.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dtdc")
//@Primary
public class DTDC implements Courier {
	public DTDC() {
		System.out.println("DTDC:0-param constructor");
	}
	
	public  String deliver(int oid) {
		return oid+" orderno   items  are delivered by DTDC";
	}

}
