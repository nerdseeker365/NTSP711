package com.nt.beans;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component("ci")
@PropertySource("classpath:com/nt/commons/info.properties")
public class CoursesInfo {
	@Value("#{'${crs.domain}'}")
	private String  domain;
	@Value("#{'${crs.inistutition}'}")
	private  String  inistutition;
	@Value("#{'${crs.courses}'.split(',')}")
	private List<String> courses;
	@Value("#{'${crs.faculties}'.split(',')}")
	private String[] faculties;
	@Value("#{${crs.prices}}")
	private  Map<String,Integer> prices;
	@Value("#{'${crs.discount}'}")
	private  int  discount;
	@Value("#{${crs.durations}}")
	private Map<String,Integer> durations;
	
	

}
