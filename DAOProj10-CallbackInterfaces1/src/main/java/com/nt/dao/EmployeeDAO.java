package com.nt.dao;

import java.util.List;

import com.nt.bo.EmployeeBO;

public interface EmployeeDAO {
	public  EmployeeBO  findEmployeeByEno(int eno);
	public  List<EmployeeBO> findEmployeesByDesg(String desg);
	public  List<EmployeeBO> findEmployeesBySalaryRange(int startSal,int endSal);

}
