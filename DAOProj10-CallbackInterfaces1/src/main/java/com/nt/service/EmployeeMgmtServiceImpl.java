package com.nt.service;

import java.util.ArrayList;
import java.util.List;

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
	
	@Override
	public List<EmployeeDTO> searchEmployeesByDesg(String desg) {
		List<EmployeeBO> listBO=null;
		List<EmployeeDTO> listDTO=new ArrayList();
		//use DAO
		listBO=dao.findEmployeesByDesg(desg);
		//convert listBO to listDTO
		listBO.forEach(bo->{
			EmployeeDTO dto=new EmployeeDTO();
			BeanUtils.copyProperties(bo,dto);
			listDTO.add(dto);
		});
		
		return listDTO;
	}

	@Override
	public List<EmployeeDTO> searchEmployeesBySalaryRange(int startSal, int endSal) {
		List<EmployeeBO> listBO=null;
		List<EmployeeDTO> listDTO=new ArrayList();
		//use DAO
		listBO=dao.findEmployeesBySalaryRange(startSal, endSal);
		//convert listBO to listDTO
		listBO.forEach(bo->{
			EmployeeDTO dto=new EmployeeDTO();
			BeanUtils.copyProperties(bo,dto);
			listDTO.add(dto);
		});
		
		return listDTO;
	}//method

}
