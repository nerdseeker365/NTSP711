package com.nt.service;

import java.util.List;

import com.nt.dto.InsurancePolicyDTO;

public interface InsurancePolicyMgmtService {
	public  InsurancePolicyDTO   findInsurancePolicyDetailsById(int id);
	public  List<InsurancePolicyDTO>   findInsurancePoliciesDetailsByNames(String name1,String name2,String name3);
    public  String register(InsurancePolicyDTO dto);

}
