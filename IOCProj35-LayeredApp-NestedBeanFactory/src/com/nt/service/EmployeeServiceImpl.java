package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;

public class EmployeeServiceImpl implements EmployeeService {
	private  EmployeeDAO dao;
	
	public EmployeeServiceImpl(EmployeeDAO dao) {
		this.dao = dao;
	}

	@Override
	public List<EmployeeDTO> searchEmpsByDesgs(String desg1, String desg2, String desg3) throws Exception {
		List<EmployeeDTO> listDTO=null;
		List<EmployeeBO> listBO=null;
		EmployeeDTO dto=null;
		int i=1;
	  //use DAO
		listBO=dao.findEmpsByDesg(desg1, desg2, desg3);
		//copy listBO to listDTO
		listDTO=new ArrayList();
		for(EmployeeBO bo:listBO) {
			//copy each BO to each DTO
			dto=new EmployeeDTO();
			/*
			 * dto.setEno(bo.getEno()); dto.setEname(bo.getEname());
			 * dto.setSalary(bo.getSalary()); dto.setDesg(bo.getDesg());
			 */
			BeanUtils.copyProperties(bo, dto);
			dto.setSrNo(i++);
			//add  dtos to listDTO
			listDTO.add(dto);
		}
		
		return listDTO;
	}//method
}//class
