package com.nt.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.nt.bo.UserBO;

@Repository("authDAO")
public class AuthenticationDAOImpl implements AuthenticationDAO {
	@Autowired
	private  SimpleJdbcCall sjc;

	public Map<String,Object> authenticate(UserBO bo) {
		Map<String,Object> inParams=null;
		Map<String,Object> outParams=null;
		//prepare In Params
		inParams=new HashMap();
		inParams.put("user",bo.getUname());
		inParams.put("pass",bo.getPwd());
		//set ProcedureName
		sjc.setProcedureName("P_AUTHENTICATION");
		//call PL/SQL Procedure
		outParams=sjc.execute(inParams);
		return outParams;
	}//method
}//class
