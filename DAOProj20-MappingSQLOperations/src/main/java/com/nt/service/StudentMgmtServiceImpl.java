package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDAO;
import com.nt.dto.StudentDTO;

@Service("studService")
public class StudentMgmtServiceImpl implements StudentMgmtService {
	@Autowired
	private StudentDAO dao;

	@Override
	public List<StudentDTO> findStudentsByAddrs(String addrs) {
		List<StudentBO> listBO=null;
		List<StudentDTO> listDTO=new ArrayList();
		//use DAO
		listBO=dao.getStudentsByAddrs(addrs);
		//copy listBO to listDTO
		listBO.forEach(bo->{
			StudentDTO dto=new StudentDTO();
			BeanUtils.copyProperties(bo, dto);
			listDTO.add(dto);
		});
		return listDTO;
	}

	@Override
	public StudentDTO findStudentBySno(int sno) {
		StudentBO bo=null;
		StudentDTO dto=null;
		//use DAO
		bo=dao.getStudentBySno(sno);
		//copy BO to DTO
		dto=new StudentDTO();
		BeanUtils.copyProperties(bo,dto);
		return dto;
	}
	
	@Override
	public String modifyStudentAddrsBySno(int sno, String newAddrs) {
		int count=0;
		//use DAO
		count=dao.updateStudentAddrsBySno(sno, newAddrs);
		if(count!=0)
		    return count+" no.of student details are updated";
		else
			return count+"  student details are not updated";
	}

}
