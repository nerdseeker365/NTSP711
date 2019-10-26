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
	private  EmployeeDAO  dao;
    
	public EmployeeDTO searchEmployeeByEno(int no) {
		EmployeeDTO dto=null;
		EmployeeBO bo=null;

		//use DAO
		bo=dao.findEmployeeByEno(no);
		//convert bo to DTO
		dto=new EmployeeDTO();
		BeanUtils.copyProperties(bo,dto);
				return dto;
	}

}
