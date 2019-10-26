package com.nt.beans;

import java.util.Date;
import java.util.Map;

public class FacultyInfo {
	private  Map<String,String>  facultySubjects;
	private  Map<String,Date>   dairy;
	//private Map<?,?> mapInfo;
	private Map<Object,Object> mapInfo;


	public FacultyInfo(Map<String, String> facultySubjects, Map<String, Date> dairy, Map<Object, Object> mapInfo) {
		this.facultySubjects = facultySubjects;
		this.dairy = dairy;
		this.mapInfo = mapInfo;
	}


	@Override
	public String toString() {
		return "FacultyInfo [facultySubjects=" + facultySubjects + ", dairy=" + dairy + ", mapInfo=" + mapInfo + "]";
	}


	
	
	

}
