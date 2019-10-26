package com.nt.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;

@Service("empService")
public class EmployeeMgmtServiceImpl implements EmployeeMgmtService {
	@Autowired
	private  EmployeeDAO dao;

	public String registerEmployee(EmployeeDTO dto) {
		EmployeeBO bo=null;
		int count=0;
		//convert DTO to BO
		bo=new EmployeeBO();
		BeanUtils.copyProperties(dto, bo);
		//use DAO
		count=dao.insert(bo);
		if(count==0)
			return " Employee Registration failed";
		else
			return  "Employee Registration Succed";
	}

}
