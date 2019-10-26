package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.bo.EmployeeBO;
import com.nt.bo.EmployeeResultBO;
import com.nt.dao.EmployeeDAO;
import com.nt.dto.EmployeeDTO;
import com.nt.dto.EmployeeResultDTO;

public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDAO dao;
	
	 public EmployeeServiceImpl(EmployeeDAO dao) {
			this.dao = dao;
		}

	@Override
	public List<EmployeeResultDTO> find(EmployeeDTO dto) {
		List<EmployeeResultDTO> listRDTO=new ArrayList();
		List<EmployeeResultBO> listRBO=null;
		EmployeeBO bo=null;	
		
		//convert dto  to bo
		bo=new EmployeeBO();
		BeanUtils.copyProperties(dto, bo);
		
		//use DAO
		listRBO=dao.search(bo);
		//convert listRBO to listRDTO
		listRBO.forEach(rbo->{
			EmployeeResultDTO rdto=new EmployeeResultDTO();
			BeanUtils.copyProperties(rbo, rdto);
			rdto.setSrNo(listRDTO.size()+1);
			listRDTO.add(rdto);
		});
		return listRDTO;
	}//method
}//class
