package com.nt.service;

import java.util.Random;

public class ATMPinGenerator {
	
	public  int   generatePin() {
		Random rad=null;
		int pin=0;
		//generate random number as PIN number
		rad=new  Random();
		pin=rad.nextInt(9999);
		return pin;
		
		
	}

}
