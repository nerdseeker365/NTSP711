package com.nt.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class PassengerDTO implements Serializable  {
	private String name;
	private String source;
	private String dest;
	private  int price;

}
