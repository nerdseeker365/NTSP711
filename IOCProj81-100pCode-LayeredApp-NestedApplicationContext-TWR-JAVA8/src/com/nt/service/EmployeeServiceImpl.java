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
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private  EmployeeDAO dao;
	
	
	@Override
	public List<EmployeeDTO> searchEmpsByDesgs(String desg1, String desg2, String desg3) throws Exception {
		List<EmployeeDTO> listDTO=new ArrayList();
		List<EmployeeBO> listBO=null;
		
	  //use DAO
		listBO=dao.findEmpsByDesg(desg1, desg2, desg3);
		//copy listBO to listDTO
		listBO.forEach(bo->{
			EmployeeDTO dto=new EmployeeDTO();
			BeanUtils.copyProperties(bo,dto);
			dto.setSrNo(listDTO.size()+1);
			listDTO.add(dto);
		});
		
		
		
		return listDTO;
	}//method
}//class
