package com.nt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import com.nt.command.EmployeeSearchCommand;
import com.nt.dto.EmployeeDTO;
import com.nt.dto.EmployeeResultDTO;
import com.nt.service.EmployeeService;

public class EmployeeSearchController extends AbstractCommandController {
	private EmployeeService  service;
	
	public EmployeeSearchController(EmployeeService service) {
		System.out.println("EmployeeSearchController:1-param constructor");
		this.service = service;
	}

	@Override
	public ModelAndView handle(HttpServletRequest req, HttpServletResponse res, Object command,
			BindException errors) throws Exception {
		EmployeeSearchCommand cmd=null;
		EmployeeDTO dto=null;
		List<EmployeeResultDTO> listRDTO=null;
		//convert Command class  obj  to DTO class  obj
		cmd=(EmployeeSearchCommand)command;
		dto=new EmployeeDTO();
		BeanUtils.copyProperties(cmd, dto);
		//use Service
		listRDTO=service.find(dto);
		//return MAV object
		return new ModelAndView("report", "searchResults",listRDTO);
	}

}
