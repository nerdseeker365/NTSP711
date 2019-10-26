package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.nt.dto.StudentDTO;
import com.nt.service.StudentService;
import com.nt.vo.StudentVO;

@Component("controller")
public  class MainController {

	public MainController() {
		System.out.println("MainController::0-param constructor");
	}
	@Autowired
	private StudentService service;
	
	public  String processStudent(StudentVO vo)throws Exception{
		StudentDTO dto=null;
		String result=null;
		//Convert VO class obj data to DTO class object
		dto=new StudentDTO();
		dto.setSname(vo.getSname());
		dto.setSadd(vo.getSadd());
		dto.setM1(Integer.parseInt(vo.getM1()));
		dto.setM2(Integer.parseInt(vo.getM2()));
		dto.setM3(Integer.parseInt(vo.getM3()));
		//use Service class object
		result=service.generateResult(dto);
		return result;
	}

}
