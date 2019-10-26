package com.nt.beans;

import java.util.Date;
import java.util.List;
import java.util.Map;

import lombok.Data;

@Data
public class Student {
	private int regNo;
	private  String  name;
	private  List<String> availedCourses;
	private  String[]  availedFaculties;
	private  Map<String,Integer> avaliedCoursesDurations;
	private  int coursesFeeTotal;
	private  int  coursesDurationTotal;
	private int  finalFee;
	private  Date date;
	

}
