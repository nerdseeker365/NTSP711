package com.nt.service;

import java.util.List;

import com.nt.dto.StudentDTO;

public interface StudentMgmtService {
	public  List<StudentDTO>  findStudentsByAddrs(String addrs);
	public  StudentDTO   findStudentBySno(int sno);
	public   String   modifyStudentAddrsBySno(int sno,String newAddrs);
	

}
