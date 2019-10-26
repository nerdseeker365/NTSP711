package com.nt.comp;

public final class Viechle {
	private Engine engg;

	public void setEngg(Engine engg) {
		this.engg = engg;
	}
	
	public  void  journery(String startPlace,String destPlace) {
		engg.start();
		 System.out.println("Viechle is moving......");
		 engg.stop();
		 System.out.println(startPlace+"  to  "+destPlace +" jounery Completed");
	}
	
	

}
