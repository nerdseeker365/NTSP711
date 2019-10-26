package com.nt.test;

import com.nt.comp.Viechle;
import com.nt.factory.ViechleFactory;

public class StrategyDPTest {

	public static void main(String[] args) {
		Viechle viechle=null,viechle1=null;
		//Get Viechle object
		viechle=ViechleFactory.getInstance("diesel");
		viechle.journery("hyderabad", "banguluru");
		System.out.println("=========================");
		viechle1=ViechleFactory.getInstance("petrol");
		viechle1.journery("hebbal","whitefield");

	}

}
