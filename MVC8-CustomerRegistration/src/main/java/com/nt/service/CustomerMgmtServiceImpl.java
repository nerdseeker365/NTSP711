package com.nt.service;

import org.springframework.beans.BeanUtils;

import com.nt.bo.CustomerBO;
import com.nt.dao.CustomerDAO;
import com.nt.dto.CustomerDTO;

public class CustomerMgmtServiceImpl implements CustomerMgmtService {
	
	private CustomerDAO dao;

	public CustomerMgmtServiceImpl(CustomerDAO dao) {
		this.dao = dao;
	}
	

	@Override
	public String register(CustomerDTO dto) {
		CustomerBO bo=null;
		int count=0;
		//convert DTO to BO
		bo=new CustomerBO();
		BeanUtils.copyProperties(dto,bo);
		//use dao
		count=dao.insert(bo);
		if(count==0)
			   return "Registration Failed";
		else
			return "Registration succeded";
	}//method
}//class
