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
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public void setEngineNo(long engineNo) {
		this.engineNo = engineNo;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public void setEngineCC(String engineCC) {
		this.engineCC = engineCC;
	}
	public void setIdleSpeed(String idleSpeed) {
		this.idleSpeed = idleSpeed;
	}
	public void setIdleMilege(String idleMilege) {
		this.idleMilege = idleMilege;
	}
	public void setFuelTankCapcity(String fuelTankCapcity) {
		this.fuelTankCapcity = fuelTankCapcity;
	}
	
	@Override
	public String toString() {
		return "Bike [regNo=" + regNo + ", ownerName=" + ownerName + ", engineNo=" + engineNo + ", colour=" + colour
				+ ", model=" + model + ", vendor=" + vendor + ", engineCC=" + engineCC + ", idleSpeed=" + idleSpeed
				+ ", idleMilege=" + idleMilege + ", fuelTankCapcity=" + fuelTankCapcity + "]";
	}
	
	

}
