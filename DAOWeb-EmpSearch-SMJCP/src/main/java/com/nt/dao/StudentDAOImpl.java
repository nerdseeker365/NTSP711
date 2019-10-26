package com.nt.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("studDAO")
public class StudentDAOImpl implements StudentDAO {
	
	@Autowired
	private JdbcTemplate jt;

	@Override
	public List<Map<String, Object>> findStudentsByLocation(String condData) {
		List<Map<String,Object>> list=null;
		list=jt.queryForList("SELECT SNO,SNAME,SADD FROM STUDENT WHERE SADD IN"+condData+" ORDER BY SADD ");
		return list;
	}

}
