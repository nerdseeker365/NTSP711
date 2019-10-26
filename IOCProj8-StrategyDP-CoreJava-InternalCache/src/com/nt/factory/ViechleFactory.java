package com.nt.factory;

import java.util.HashMap;
import java.util.Map;

import com.nt.comp.CNGEngine;
import com.nt.comp.DieselEngine;
import com.nt.comp.Engine;
import com.nt.comp.PetrolEngine;
import com.nt.comp.Viechle;

public class ViechleFactory {
	private  static Map<String,Object> cacheMap=new HashMap();
	
	public static  Viechle   getInstance(String engineType) {
		 Viechle viechle=null;
		 Engine engg=null;
		 if(!cacheMap.containsKey(engineType)) {
	            if(engineType.equalsIgnoreCase("diesel"))
		           engg=new DieselEngine();
	             else if(engineType.equalsIgnoreCase("petrol"))
		                   engg=new PetrolEngine();
	               else if(engineType.equalsIgnoreCase("cng"))
		               engg=new CNGEngine();
	             else
		               throw new IllegalArgumentException("invalid enginetype");
	             cacheMap.put(engineType, engg);
	             
	             if(!cacheMap.containsKey("viechle")) {
	    		     viechle=new Viechle();	 
	    		     cacheMap.put("viechle", viechle);
	             }
	             else {
	    			 viechle=(Viechle) cacheMap.get("viechle");
	    		 }
       }//if
       else {
		      engg=(Engine) cacheMap.get(engineType);
	       }
		 viechle.setEngg(engg);
		 return viechle;
	 	}
}
