package com.nt.dao;

import com.nt.bo.EmployeeBO;
import com.nt.bo.StudentBO;

public interface UniversityDAO {
	public     int    insertStudentData(StudentBO bo);
	public int  insertEmployeeData(EmployeeBO  bo);

}
