package com.nt.beans;

import java.util.Date;

public class AadharCardInfo {
	private int ano;
	private  String name;
	private  Date dob,doj,dom;

	public AadharCardInfo(int ano, String name, Date dob, Date doj, Date dom) {
		this.ano = ano;
		this.name = name;
		this.dob = dob;
		this.doj = doj;
		this.dom = dom;
	}

	@Override
	public String toString() {
		return "AadharCardInfo [ano=" + ano + ", name=" + name + ", dob=" + dob + ", doj=" + doj + ", dom=" + dom + "]";
	}
	
	

}
