package com.nt.dao;

import java.util.List;

import com.nt.bo.StudentBO;

public interface StudentDAO {
	
	public   List<StudentBO>  getStudentsByAddrs(String addrs);
	public  StudentBO   getStudentBySno(int sno);
	public    int   updateStudentAddrsBySno(int sno,String newAddrs);

}
