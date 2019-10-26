package com.nt.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.nt.bo.UserDetailsBO;


public class AuthenticateDAOImpl implements AuthenticateDAO {
	private static final String  AUTH_QUERY="SELECT  COUNT(*) FROM USERLIST WHERE UNAME=? AND PWD=?";
	private JdbcTemplate jt;

	public AuthenticateDAOImpl(JdbcTemplate jt) {
		this.jt = jt;
	}

	public int validate(UserDetailsBO bo) {
		int count=0;
		count=jt.queryForObject(AUTH_QUERY, Integer.class, bo.getUsername(),bo.getPassword());
		return count;
	}

}
