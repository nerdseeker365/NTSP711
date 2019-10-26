package com.nt.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.nt.bo.CustomerBO;

public class CustomerDAOImpl implements CustomerDAO {
	private  static final String  INSERT_QUERY="INSERT INTO MVC_CUSTOMER VALUES(CNO_SEQ.NEXTVAL,?,?,?,?)" ;
   	private JdbcTemplate jt;
   	
   	     
	public CustomerDAOImpl(JdbcTemplate jt) {
		this.jt = jt;
	}


	@Override
	public int insert(CustomerBO bo) {
		int count=0;
		//execute the query
		count=jt.update(INSERT_QUERY,
				                         bo.getCname(),bo.getAddrs(),bo.getMobileNo(),bo.getBillAmt());
		return count;
	}

}
