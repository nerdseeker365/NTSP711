package com.nt.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBO;

@Repository("empDAO")
public class EmployeeDAOImpl implements EmployeeDAO {
	private static final  String  GET_EMPNO="SELECT EMPNO_SEQ1.NEXTVAL FROM DUAL";
	//@Autowired
	private SimpleJdbcInsert sji;
	
	public EmployeeDAOImpl(DataSource ds) {
		sji=new SimpleJdbcInsert(ds);
	}
	
	private  int  getAutoEmpno() {
		JdbcTemplate jt=null;
		int eno=0;
		jt=sji.getJdbcTemplate();
		eno=jt.queryForObject(GET_EMPNO, Integer.class);
		return eno;
		
	}
	
	public  int  insert(EmployeeBO bo) {
		BeanPropertySqlParameterSource bpsps=null;
		int count=0;
// prepare SqlParameterSource object
		bo.setEmpNo(getAutoEmpno());
		bpsps=new BeanPropertySqlParameterSource(bo);
		//set db table name
		sji.setTableName("EMP");
		//execute the  Query
		count=sji.execute(bpsps);
		return count	;
		
	}

}
