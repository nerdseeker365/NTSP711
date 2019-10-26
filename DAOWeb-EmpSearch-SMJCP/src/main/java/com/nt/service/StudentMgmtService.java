package com.nt.service;

import java.util.List;
import java.util.Map;

public interface StudentMgmtService {
	
	public  List<Map<String,Object>>  getStudentsByLocations(String ...args);

}
