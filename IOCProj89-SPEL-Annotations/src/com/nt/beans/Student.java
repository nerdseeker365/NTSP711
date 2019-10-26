package com.nt.beans;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("st")
@PropertySource("classpath:com/nt/commons/info.properties")
public class Student {
	@Value("#{T(java.lang.Math).random()*100}")
	private int regNo;
	@Value("#{'${st.name}'}")
	private  String  name;
	@Value("#{T(java.util.Arrays).asList(ci.courses[0],ci.courses[1],ci.courses[2],ci.courses[3])}")
	private  List<String> availedCourses;
	@Value("#{T(java.util.Arrays).asList(ci.faculties[0],ci.faculties[2])}")
	private  String[]  availedFaculties;
	@Value("#{T(java.util.Arrays).asList(ci.durations['CoreJava'],ci.durations['AdvJava'],ci.durations['Spring'],ci.durations['Hibernate'])}")
	private  List<Integer> avaliedCoursesDurations;
	@Value("#{ci.prices['CoreJava']+ci.prices['AdvJava']+ci.prices['Spring']+ci.prices['Hibernate']}")
	private  int coursesFeeTotal;
	@Value("#{ci.durations['CoreJava']+ci.durations['AdvJava']+ci.durations['Spring']+ci.durations['Hibernate']}")
	private  int  coursesDurationTotal;
	
	@Value("#{(ci.prices['CoreJava']+ci.prices['AdvJava']+ci.prices['Spring']+ci.prices['Hibernate'])-((ci.prices['CoreJava']+ci.prices['AdvJava']+ci.prices['Spring']+ci.prices['Hibernate'])*ci.discount/100)}")
	private int  finalFee;
	
	@Value("#{dt}")
	private  Date date;
	

}
