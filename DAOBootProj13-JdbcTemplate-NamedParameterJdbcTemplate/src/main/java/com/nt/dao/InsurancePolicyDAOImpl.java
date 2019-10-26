package com.nt.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nt.bo.InsurancePolicyBO;

@Repository("ipDAO")
public class InsurancePolicyDAOImpl implements InsurancePolicyDAO {
	private static final String  GET_POLICY_BY_ID="SELECT POLICYID,POLICYNAME,TENURE,COMPANY,INITIALAMOUNT FROM INSURANCEPOLICY WHERE POLICYID=:pid";
	private static final String  GET_POLICIES_BY_NAMES="SELECT POLICYID,POLICYNAME,TENURE,COMPANY,INITIALAMOUNT FROM INSURANCEPOLICY WHERE POLICYNAME IN(:name1,:name2,:name3)";
   private static final String  INSERT_QUERY="INSERT INTO INSURANCEPOLICY VALUES(:policyId,:policyName,:tenure,:company,:initialAmount)";
    @Autowired
	private NamedParameterJdbcTemplate npjt;	

	@Override
	public InsurancePolicyBO getPolicyDetailsBuyId(int id) {
		Map<String,Object> paramsMap=null;
		InsurancePolicyBO bo=null;
		paramsMap=new HashMap();
		paramsMap.put("pid",id);
		bo=npjt.queryForObject(GET_POLICY_BY_ID, paramsMap,
				                                        (rs,index)->{
				                                        	InsurancePolicyBO bo1=new InsurancePolicyBO();
				                                        	bo1.setPolicyId(rs.getInt(1));
				                                        	bo1.setPolicyName(rs.getString(2));
				                                        	bo1.setTenure(rs.getInt(3));
				                                        	bo1.setCompany(rs.getString(4));
				                                        	bo1.setInitialAmount(rs.getFloat(5));
				                                        	return bo1;
				                                        });
		return bo;
	}//method
	
	@Override
	public List<InsurancePolicyBO> getPolicyDetailsByNames(String name1, String name2, String name3) {
		List<InsurancePolicyBO> listBO=null;
		MapSqlParameterSource  params=null;
		params=new MapSqlParameterSource();
		params.addValue("name1",name1);
		params.addValue("name2",name2);
		params.addValue("name3",name3);
		
		listBO=npjt.query(GET_POLICIES_BY_NAMES,params,
				                             rs->{
				                            	 List<InsurancePolicyBO> listBO1=new ArrayList();
				                            	 while(rs.next()) {
				                            		 InsurancePolicyBO bo=new InsurancePolicyBO();
				                            		 bo.setPolicyId(rs.getInt(1));
				                            		 bo.setPolicyName(rs.getString(2));
				                            		 bo.setTenure(rs.getInt(3));
				                            		 bo.setCompany(rs.getString(4));
				                            		 bo.setInitialAmount(rs.getFloat(5));
				                            		 listBO1.add(bo);
				                            	 }
				                            	 return listBO1;
				                             });
		return listBO;
	}//method
	
	@Override
	public int insert(InsurancePolicyBO bo) {
		BeanPropertySqlParameterSource bpss=null;
		int count=0;
		bpss=new BeanPropertySqlParameterSource(bo);
		count=npjt.update(INSERT_QUERY, bpss);
		return count;
	}
	
}//class
