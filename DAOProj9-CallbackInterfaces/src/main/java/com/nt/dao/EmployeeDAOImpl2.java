package com.nt.dao;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBO;
@Repository("empDAO")
public class EmployeeDAOImpl2 implements EmployeeDAO {
	private static final String  GET_EMP_BY_NO="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE EMPNO=?";
	@Autowired
	private JdbcTemplate jt;

	public EmployeeBO findEmployeeByEno(int eno) {
		EmployeeBO bo1=jt.queryForObject(GET_EMP_BY_NO, 
				                                                           (rs,rowNum)->{
				                                                        	   EmployeeBO bo=null;
				                                                        	   bo=new EmployeeBO();
				                                                        	   bo.setEno(rs.getInt(1));
				                                                        	   bo.setEname(rs.getString(2));
				                                                        	   bo.setDesg(rs.getString(3));
				                                                        	   bo.setSalary(rs.getInt(4));
				                                                        	   return bo;
				                                                           }
				                                                              ,
				                                                           eno);
		return bo1;
	}
	
	

}
