package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.nt.command.CustomerCommand;
import com.nt.dto.CustomerDTO;
import com.nt.service.CustomerMgmtService;

public class CustomerInsertController extends SimpleFormController {
	
	private CustomerMgmtService service;

	public CustomerInsertController(CustomerMgmtService service) {
		this.service = service;
	}
	
	
	@Override
	public Object formBackingObject(HttpServletRequest request) throws Exception {
	    System.out.println("CustomerInsertController.formBackingObject(-)");
		CustomerCommand cmd=null;
	     cmd=new CustomerCommand();
	     cmd.setAddrs("hyd");
	     return cmd;
	}

	@Override
	public ModelAndView onSubmit(HttpServletRequest req, HttpServletResponse res, Object command,
			BindException errors) throws Exception {
		System.out.println("CustomerInsertController.onSubmit(-,-,-,-)");
		CustomerCommand cmd=null;
		CustomerDTO dto=null;
		String resultMsg=null;
		//type casting
		cmd=(CustomerCommand)command;
		// Application Logic Errors
		if(cmd.getAddrs().equalsIgnoreCase("hyderabad")) {
			errors.rejectValue("addrs","custCmd.custAddrs.restriction");
			return  showForm(req,res,errors);
		}
		//convert  cmd  to DTO
		dto=new CustomerDTO();
		BeanUtils.copyProperties(cmd,dto);
		//use service
		resultMsg=service.register(dto);
		//create and MAV object
		return  new ModelAndView(getSuccessView(),"msg",resultMsg);
	}//method
	
	@Override
	public ModelAndView handleInvalidSubmit(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		System.out.println("CustomerInsertController.handleInvalidSubmit(-,-)");
		return new ModelAndView("dbl_post");
	}
	
}//class
