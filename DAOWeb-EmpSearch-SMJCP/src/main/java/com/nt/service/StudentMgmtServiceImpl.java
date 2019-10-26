package com.nt.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.StudentDAO;

@Service("studService")
public class StudentMgmtServiceImpl implements StudentMgmtService {
	@Autowired
	private  StudentDAO dao;

	@Override
	public List<Map<String, Object>> getStudentsByLocations(String... args) {
		StringBuffer condData=null;
		List<Map<String,Object>> list=null;
		//prepare cond data    // ('HYD','VIZAG','MUMBAI')
		condData=new StringBuffer("(");
		    for(int i=0;i<args.length;++i) {
		    	if(i==args.length-1)
		    		condData.append("'"+args[i]+"'");
		    	else
		    		condData.append("'"+args[i]+"',");
		    }//for
		condData.append(")");
		//use DAO
		list=dao.findStudentsByLocation(condData.toString());
		
		return list;
	}

}
