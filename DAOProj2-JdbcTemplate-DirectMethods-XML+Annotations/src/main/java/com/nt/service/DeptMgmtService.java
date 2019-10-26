package com.nt.service;

import java.util.List;
import java.util.Map;

public interface DeptMgmtService {
	
	public   int  findDeptsCount();
	public   Map<String,Object>  findDeptByNo(int no);
	public  String  findDeptLocationByNo(int no);
	public List<Map<String,Object>>  findAllDepts();
	public  List<Map<String,Object>> findAllDeptsByLocations(String loc1,String loc2);
    public   String registerDept(String dname,String loc);
    public  String   modifyDeptLoc(int dno,String newLoc);
    public   String  removeDept(String dname);
}
