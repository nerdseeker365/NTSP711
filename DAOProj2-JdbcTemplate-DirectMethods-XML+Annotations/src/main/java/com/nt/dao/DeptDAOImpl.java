package com.nt.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository("deptDAO")
public final class DeptDAOImpl implements DeptDAO {
	private static final String   GET_DEPTS_COUNT="SELECT COUNT(*) FROM DEPT";
	private static  final String   GET_DEPT_BY_NO="SELECT DEPTNO,DNAME,LOC FROM DEPT WHERE DEPTNO=?";
	private static final String  GET_DEPTLOC_BY_NO="SELECT LOC FROM DEPT WHERE DEPTNO=?";
	private  static final String  GET_ALL_DEPTS="SELECT DEPTNO,DNAME,LOC FROM DEPT";
	private  static final String  GET_ALL_DEPTS_BY_LOCs="SELECT DEPTNO,DNAME,LOC FROM DEPT WHERE LOC IN(?,?)";
    private static final String    INSERT_DEPT="INSERT INTO DEPT VALUES(DNO_SEQ.NEXTVAL,?,?)";
    private static final String   UPDATE_DEPT="UPDATE DEPT SET LOC=? WHERE DEPTNO=?";
    private static final  String   DELE_DEPT_BY_NAME="DELETE FROM DEPT WHERE DNAME=?";
	@Autowired
    private JdbcTemplate jt;

	

	public int getDeptsCount() {
	   int count=0;
	   count=jt.queryForObject(GET_DEPTS_COUNT, Integer.class);
		return count;
	}

	public Map<String, Object> getDeptByNo(int no) {
		Map<String,Object> map=null;
		map=jt.queryForMap(GET_DEPT_BY_NO, no);
		return map;
	}
	
	public String getDeptLocationByNo(int no) {
		String loc=null;
		loc=jt.queryForObject(GET_DEPTLOC_BY_NO,String.class,no);
		return loc;
	}
	
	public List<Map<String, Object>> getAllDepts() {
		List<Map<String,Object>> list=null;
		list=jt.queryForList(GET_ALL_DEPTS);
		return list;
	}
	
	public List<Map<String, Object>> getDeptsByLocations(String loc1, String loc2) {
		List<Map<String,Object>> list=null;
		list=jt.queryForList(GET_ALL_DEPTS_BY_LOCs, loc1,loc2);
		return list;
	}

	public int insertDept(String dname, String loc) {
           int count=0;
           count=jt.update(INSERT_DEPT, dname,loc);
		return count;
	}
	
	public int updateDept(int dno, String newLoc) {
		int  count=0;
		count=jt.update(UPDATE_DEPT, newLoc,dno);
		return count;
	}

	public int deleteDeptByName(String dname) {
		int count=0;
		count=jt.update(DELE_DEPT_BY_NAME, dname);
		return count;
	}
  
}
