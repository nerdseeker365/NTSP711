package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.InsurancePolicyBO;
import com.nt.dao.InsurancePolicyDAO;
import com.nt.dto.InsurancePolicyDTO;

@Service("ipService")
public class InsurancePolicyMgmtServiceImpl implements InsurancePolicyMgmtService {
	
	@Autowired
	private InsurancePolicyDAO dao;

	@Override
	public InsurancePolicyDTO findInsurancePolicyDetailsById(int id) {
		InsurancePolicyBO bo=null;
		InsurancePolicyDTO dto=null;
	      //use DAO
		bo=dao.getPolicyDetailsBuyId(id);
		//convert BO to DTO
		dto=new InsurancePolicyDTO();
		BeanUtils.copyProperties(bo,dto);
		
		return dto;
	}
	
	@Override
	public List<InsurancePolicyDTO> findInsurancePoliciesDetailsByNames(String name1, String name2, String name3) {
		List<InsurancePolicyBO> listBO=null;
		List<InsurancePolicyDTO> listDTO=new ArrayList();
		//use DAO
		listBO=dao.getPolicyDetailsByNames(name1, name2, name3);
		//convert ListBO to ListDTO;
		listBO.forEach(bo->{
			InsurancePolicyDTO dto=null;
			dto=new InsurancePolicyDTO();
			BeanUtils.copyProperties(bo,dto);
			listDTO.add(dto);
		});
		return listDTO;
	}
	
	@Override
	public String register(InsurancePolicyDTO dto) {
		InsurancePolicyBO bo=null;
		int count=0;
		//Convert DTO to BO
		bo=new InsurancePolicyBO();
		BeanUtils.copyProperties(dto,bo);
		//use DAO
		count=dao.insert(bo);
		if(count==0)
			return "policy Registration failed";
		else
			return "policy Registration succeded";
	}
	

}
