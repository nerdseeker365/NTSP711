package com.nt.beans;

public class TravelAgent {
	private  TourPlan tp;
	
	public TravelAgent(TourPlan tp1) {
		System.out.println("TravelAgent:: 1-param constructor");
		this.tp = tp1;
	}

	public TravelAgent() {
		System.out.println("TravelAgent:: 0-param constructor");
	}

	public void setTp(TourPlan tp) {
		System.out.println("TravelAgent :: setTp(-)");
		this.tp = tp;
	}
	
	public   void  holidyTrip() {
		System.out.println( tp+" places  are  visited");
	}

}
