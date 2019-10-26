package com.nt.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository("withdrawDAO")
public class WithdrawDAOImpl implements WithdrawDAO {
	private static final String  WITHDRAW_QUERY="UPDATE DTX_BANK_ACCOUNT SET BALANCE=BALANCE-? WHERE ACNO=?"; 
	@Autowired
	@Qualifier("template1")
	private JdbcTemplate oraJt;

	@Override
	public int withdraw(int acno, float amt) {
		int count=0;
		count=oraJt.update(WITHDRAW_QUERY,amt,acno);
		return count;
	}

}
