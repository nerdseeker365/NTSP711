package com.nt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.nt.command.ScientistCommand;
import com.nt.dto.ScientistDTO;
import com.nt.service.ScientistMgmtService;

public class EditScientistController extends SimpleFormController {
	private ScientistMgmtService service;
	
	
	public EditScientistController(ScientistMgmtService service) {
		this.service = service;
	}


	@Override
	public Object formBackingObject(HttpServletRequest req) throws Exception {
		System.out.println("EditScientistController.formBackingObject()");
		int id=0;
		ScientistDTO  dto=null;
		ScientistCommand cmd=null;
		//read additional req param value
		id=Integer.parseInt(req.getParameter("id"));
		//user Service
	    dto=service.fetchScientistById(id);
	    //create and return Command class obj having  DTO class obj data as the dynamic data
	    cmd=new ScientistCommand();
	    BeanUtils.copyProperties(dto,cmd);
	    return cmd;
	}
	
	@Override
	public ModelAndView onSubmit(HttpServletRequest req, HttpServletResponse res, Object command,
			BindException errors) throws Exception {
		ScientistCommand cmd=null;
		ScientistDTO  dto=null;
		String resultMsg=null;
		List<ScientistDTO>  listDTO=null;
		ModelAndView mav=null;
		//type casting
		cmd=(ScientistCommand)command;
		//convert Command class obj to DTO
		dto=new  ScientistDTO();
		BeanUtils.copyProperties(cmd, dto);
		//use service
		resultMsg=service.modifyScientistById(dto);
		listDTO=service.fetchAllScientists();
		//return MAV object
		mav=new ModelAndView();
		mav.addObject("resultMsg", resultMsg);
		mav.addObject("listDTO",listDTO);
		mav.setViewName(getSuccessView());
		return mav;
	}

}
