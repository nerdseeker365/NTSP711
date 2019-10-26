package com.nt.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBO;

@Repository("empDAO")
public class EmployeeDAOImpl implements EmployeeDAO {
	@Autowired
	private SimpleJdbcInsert sji;
	
	public  int  insert(EmployeeBO bo) {
		Map<String,Object> map=null;
		int count=0;
// prepare col names and values
		map=new HashMap();
		map.put("EMPNO",bo.getEmpNo());
		map.put("ENAME",bo.getEname());
		map.put("JOB", bo.getJob());
		map.put("SAL",bo.getSal());
		//set db table name
		sji.setTableName("EMP");
		//execute the  Query
		count=sji.execute(map);
		return count	;
		
	}

}
