package com.nt.dao;

import java.util.List;
import java.util.Map;

public interface DeptDAO {
	
	public   int    getDeptsCount();
	public   Map<String,Object>  getDeptByNo(int no);
	public   String getDeptLocationByNo(int no);
	public   List<Map<String,Object>>  getAllDepts();
	public List<Map<String,Object>>  getDeptsByLocations(String loc1,String loc2);
    public  int  insertDept(String dname,String loc);
    public   int   updateDept(int dno,String newLoc);
    public   int  deleteDeptByName(String dname);
}
