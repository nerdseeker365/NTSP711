package com.nt.beans;

public final class PetrolEngine implements Engine {
	
	public PetrolEngine() {
		System.out.println("PetrolEngine:0-param  constructor");
	}

	@Override
	public void start() {
		System.out.println("PetrolEngine:: Engine started");
		
	}

	@Override
	public void stop() {
		System.out.println("PetrolEngine:: Engine stopped");
		
	}

}
