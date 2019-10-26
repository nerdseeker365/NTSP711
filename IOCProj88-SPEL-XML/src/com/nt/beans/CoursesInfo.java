package com.nt.beans;

import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class CoursesInfo {
	private String  domain;
	private  String  inistutition;
	private List<String> courses;
	private String[] faculties;
	private  Map<String,Integer> prices;
	private  int  discount;
	private Map<String,Integer> durations;
	
	

}
