package com.nt.beans;

public class Printer {
	private static Printer instance;
	private Printer() {
		System.out.println("Printter:0-param constructor");
	}
	
	public  static  Printer getInstance() {
		if(instance==null)
			instance=new Printer();
		return instance;
	}

}
