package com.nt.dao;

import java.util.List;

import com.nt.bo.InsurancePolicyBO;

public interface InsurancePolicyDAO {
	public   InsurancePolicyBO   getPolicyDetailsBuyId(int id);
	public  List<InsurancePolicyBO>  getPolicyDetailsByNames(String name1,String name2,String name3);
	public  int insert(InsurancePolicyBO bo);
	

}
