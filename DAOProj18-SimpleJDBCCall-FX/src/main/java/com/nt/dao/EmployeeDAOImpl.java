package com.nt.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBO;

@Repository("empDAO")
public class EmployeeDAOImpl implements EmployeeDAO {
	@Autowired
	private SimpleJdbcCall sjc;

	public List<EmployeeBO> getEmpsByDesg(String desg) {
		List<EmployeeBO> listBO=null;
		//set function name 
		sjc.withFunctionName("FX_GET_EMPS_BY_DESG");
		sjc.returningResultSet("",new BeanPropertyRowMapper(EmployeeBO.class));
		listBO=sjc.executeFunction(List.class,desg);
		return listBO;
	}

}
