package com.nt.beans;

public class Bike {
	private String regNo;
	

	private String ownerName;
	private long engineNo;
	private  String colour;
	private  String model;
	private String vendor;
	private  String  engineCC;
	private  String  idleSpeed;
	private  String idleMilege;
	private   String fuelTankCapcity;
	
	public Bike(String regNo, String ownerName, long engineNo, String colour, String model, String vendor,
			String engineCC, String idleSpeed, String idleMilege, String fuelTankCapcity) {
		this.regNo = regNo;
		this.ownerName = ownerName;
		this.engineNo = engineNo;
		this.colour = colour;
		this.model = model;
		this.vendor = vendor;
		this.engineCC = engineCC;
		this.idleSpeed = idleSpeed;
		this.idleMilege = idleMilege;
		this.fuelTankCapcity = fuelTankCapcity;
	}
		
	@Override
	public String toString() {
		return "Bike [regNo=" + regNo + ", ownerName=" + ownerName + ", engineNo=" + engineNo + ", colour=" + colour
				+ ", model=" + model + ", vendor=" + vendor + ", engineCC=" + engineCC + ", idleSpeed=" + idleSpeed
				+ ", idleMilege=" + idleMilege + ", fuelTankCapcity=" + fuelTankCapcity + "]";
	}
	
	

}
