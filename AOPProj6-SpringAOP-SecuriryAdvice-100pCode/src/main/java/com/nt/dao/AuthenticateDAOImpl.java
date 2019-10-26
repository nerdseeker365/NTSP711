package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nt.bo.UserDetailsBO;

@Repository("authDAO")
public class AuthenticateDAOImpl implements AuthenticateDAO {
	private static final String  AUTH_QUERY="SELECT  COUNT(*) FROM USERLIST WHERE UNAME=? AND PWD=?";
	@Autowired
	private JdbcTemplate jt;

	

	public int validate(UserDetailsBO bo) {
		int count=0;
		count=jt.queryForObject(AUTH_QUERY, Integer.class, bo.getUsername(),bo.getPassword());
		return count;
	}

}
