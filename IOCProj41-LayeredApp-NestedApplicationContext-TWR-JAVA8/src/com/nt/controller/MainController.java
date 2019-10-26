package com.nt.controller;

import java.util.ArrayList;
import java.util.List;

import com.nt.dto.EmployeeDTO;
import com.nt.service.EmployeeService;
import com.nt.vo.EmployeeVO;

public class MainController {
	private  EmployeeService service;

	public MainController(EmployeeService service) {
		this.service = service;
	}
	
	public   List<EmployeeVO>  process(String desg1,String desg2,String desg3)throws Exception{
		 List<EmployeeDTO> listDTO=null;
		 List<EmployeeVO>  listVO=new ArrayList();
		
		//use SErvice
		 listDTO=service.searchEmpsByDesgs(desg1, desg2, desg3);
		 //convert  listDTO to listVO
		 listDTO.forEach(dto->{
			 EmployeeVO vo=new EmployeeVO();
			 vo.setEno(String.valueOf(dto.getEno()));
			 vo.setSrNo(String.valueOf(dto.getSrNo()));
			 vo.setEname(dto.getEname());
			 vo.setDesg(dto.getDesg());
			 vo.setSalary(String.valueOf(dto.getSalary()));
			 //add vo  to listVO
			 listVO.add(vo);
		 });
		return listVO;
	}//method
}//class
