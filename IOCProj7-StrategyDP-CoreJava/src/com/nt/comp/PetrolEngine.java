package com.nt.comp;

public final class PetrolEngine implements Engine {

	@Override
	public void start() {
		System.out.println("PetrolEngine:: Engine started");
		
	}

	@Override
	public void stop() {
		System.out.println("PetrolEngine:: Engine stopped");
		
	}

}
