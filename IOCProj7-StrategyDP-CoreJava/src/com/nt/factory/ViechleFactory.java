package com.nt.factory;

import com.nt.comp.CNGEngine;
import com.nt.comp.DieselEngine;
import com.nt.comp.Engine;
import com.nt.comp.PetrolEngine;
import com.nt.comp.Viechle;

public class ViechleFactory {
	
	public static  Viechle   getInstance(String engineType) {
		 Viechle viechle=null;
		 Engine engg=null;
		 //create Dependent class object
		 if(engineType.equalsIgnoreCase("diesel")) {
			 engg=new DieselEngine();
		 }
		 else if(engineType.equalsIgnoreCase("petrol")) {
			 engg=new PetrolEngine();
		 }
		 else if(engineType.equalsIgnoreCase("cng")) {
			 engg=new CNGEngine();
		 }
		 else {
			 throw new IllegalArgumentException("Invalid Engine type");
		 }
		 //create Taget class obj
		 viechle=new Viechle();
		 viechle.setEngg(engg);
		 return viechle;
	}

}
