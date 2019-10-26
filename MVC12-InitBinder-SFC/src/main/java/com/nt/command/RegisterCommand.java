package com.nt.command;

import java.util.Date;

import lombok.Data;

@Data
public class RegisterCommand {
	private  String studName;
	private  String studAddrs;
	private  Date  dob;
	private  Date doj;

}
