package com.nt.dao;

import com.nt.bo.EmployeeBO;
import com.nt.bo.StudentBO;

public class UniversityDAOImpl implements UniversityDAO {
	
	public UniversityDAOImpl() {
		System.out.println("UniversityDAOImpl:0-param constructor");
	}

	@Override
	public int insertStudentData(StudentBO bo) {
		System.out.println("inserting student data:::"+bo);
		return 1;
	}

	@Override
	public int insertEmployeeData(EmployeeBO bo) {
		System.out.println("inserting employee data:::"+bo);
		return 1;
	}

}
