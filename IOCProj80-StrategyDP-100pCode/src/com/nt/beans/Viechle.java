package com.nt.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("viechle")
public final class Viechle {
	@Autowired
	@Qualifier("pEngine")
	private Engine engg;
	
	public Viechle() {
		System.out.println("Viechle:0-param constructor");
	}

	public void setEngg(Engine engg) {
		System.out.println("Viechle.setEngg(-)");
		this.engg = engg;
	}
	
	public  void  journery(String startPlace,String destPlace) {
		engg.start();
		 System.out.println("Viechle is moving......");
		 engg.stop();
		 System.out.println(startPlace+"  to  "+destPlace +" jounery Completed");
	}
	
	

}
