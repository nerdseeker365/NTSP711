package com.nt.service;

import org.springframework.beans.BeanUtils;

import com.nt.bo.EmployeeBO;
import com.nt.bo.StudentBO;
import com.nt.dao.UniversityDAO;
import com.nt.dto.EmployeeDTO;
import com.nt.dto.StudentDTO;

public abstract class UniversityMgmtService {
	private UniversityDAO  dao;

	public UniversityMgmtService(UniversityDAO dao) {
		System.out.println("UniversityMgmtService.1-param cosntructor");
		this.dao = dao;
	}
	public abstract StudentBO createStudentBO();
	public abstract EmployeeBO createEmployeeBO();
	
	public   String  registerStudent(StudentDTO dto) {
		StudentBO stBO=null;
		int count=0;
		//get BO class obj
		stBO=createStudentBO();
		//convert DTO to BO
		BeanUtils.copyProperties(dto,stBO);
		//use DAO
		count=dao.insertStudentData(stBO);
		if(count==0)
			return "Student registration failed";
		else
			return "Student registration succeded";
	}
	
	public   String  registerEmployee(EmployeeDTO dto) {
		EmployeeBO empBO=null;
		int count=0;
		//get BO class obj
		empBO=createEmployeeBO();
		//convert DTO to BO
		BeanUtils.copyProperties(dto,empBO);
		//use DAO
		count=dao.insertEmployeeData(empBO);
		if(count==0)
			return "Employee registration failed";
		else
			return "Employee registration succeded";
	}
	

}
