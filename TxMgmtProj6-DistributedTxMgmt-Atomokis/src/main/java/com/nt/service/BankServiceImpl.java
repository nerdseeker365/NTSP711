package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.nt.dao.DepositeDAO;
import com.nt.dao.WithdrawDAO;

@Service("bankService")
public class BankServiceImpl implements BankService {
	@Autowired
	private  WithdrawDAO wDao;
	@Autowired
	private  DepositeDAO dDao;
	

	@Override
	@Transactional(propagation=Propagation.REQUIRED,transactionManager="jtaTxMgmr")
	public String transferMoney(int srcAcno, int destAcno, float amount) {
		int count1=0;
		int count2=0;
		count1=wDao.withdraw(srcAcno, amount);
		count2=dDao.deposite(destAcno, amount);
		if(count1==0 || count2==0)
			throw new RuntimeException("Money not transfered");
		return   amount +"  amount  is transffered from "+srcAcno+"  to  dest Account  "+destAcno;
	}

}
