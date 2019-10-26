package com.nt.service;

import java.util.List;

import com.nt.dto.EmployeeDTO;

public interface EmployeeMgmtService {
	
	public   EmployeeDTO  searchEmployeeByEno(int no);
	public   List<EmployeeDTO> searchEmployeesByDesg(String desg);
	public   List<EmployeeDTO> searchEmployeesBySalaryRange(int startSal,int endSal);

}
