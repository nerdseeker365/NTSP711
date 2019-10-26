package com.nt.dao;

import java.util.List;
import java.util.Map;

public interface StudentDAO {
	
	public   List<Map<String,Object>>  findStudentsByLocation(String condData);

}
