package com.nt.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.DeptDAO;

@Service("deptService")
public class DeptMgmtServiceImpl implements DeptMgmtService {
	@Autowired
	private  DeptDAO dao;

	
	
	public int findDeptsCount() {
		int count=0;
		//use DAO
		count=dao.getDeptsCount();
		return count;
	}


	public Map<String, Object> findDeptByNo(int no) {
		Map<String,Object> map=null;
		//use DAO
		map=dao.getDeptByNo(no);
		return map;
	}
	
	public String findDeptLocationByNo(int no) {
		String loc=null;
		//use DAO
		loc=dao.getDeptLocationByNo(no);
		return loc;
	}
	
	public List<Map<String, Object>> findAllDepts() {
		List<Map<String,Object>> list=null;
		list=dao.getAllDepts();
		return list;
	}
	
	public List<Map<String, Object>> findAllDeptsByLocations(String loc1, String loc2) {
		List<Map<String,Object>> list=null;
		list=dao.getDeptsByLocations(loc1, loc2);
		return list;
	}


	public String registerDept(String dname, String loc) {
		int count=0;
		//use  DAO
		count=dao.insertDept(dname, loc);
		if(count==0)
			return "Dept Registration failed";
		else
			return "Dept Registration Succeded";
	}
	
	public String modifyDeptLoc(int dno, String newLoc) {
		int count=0;
	   //use DAO
		count=dao.updateDept(dno, newLoc);
		if(count==0)
			return "Dept Location is not changed";
		else
			return "Dept Location is  changed";
	}
	
	public String removeDept(String dname) {
		int count=0;
		//use DAO
		count=dao.deleteDeptByName(dname);
		 if(count==0)
		    return "Dept not found to removed";
		 else
			 return "Dept found and removed";
	}
	
	

}
