package com.nt.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nt.command.CustomerCommand;

public class CustomerCommandValiator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		System.out.println("CustomerCommandValiator.supports(-)");
		return clazz.isAssignableFrom(CustomerCommand.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		String vstatus=null;
		CustomerCommand cmd=null;
		
		
		
		//type casting of Command class
		cmd=(CustomerCommand)target;
		//get Client form validation status...
		vstatus=cmd.getVflag();
		if(vstatus.equalsIgnoreCase("no")) {
		System.out.println("CustomerCommandValiator.validate(-,-)");
		//server form validations  
		if(cmd.getCname()==null || cmd.getCname().equals("") || cmd.getCname().length()==0)
			errors.rejectValue("cname","custCmd.custName.required");
		
		if(cmd.getAddrs()==null || cmd.getAddrs().equals("") || cmd.getAddrs().length()==0)
			errors.rejectValue("addrs","custCmd.custAddrs.required");
		else if(cmd.getAddrs().length()<5 || cmd.getAddrs().length()>10)
			errors.rejectValue("addrs","custCmd.custAddrs.range");
		
		if(cmd.getMobileNo()==null)
			errors.rejectValue("mobileNo","custCmd.custMobile.required");
		else if(String.valueOf(cmd.getMobileNo()).length()!=10)
			errors.rejectValue("mobileNo","custCmd.custMobile.length");
		
		 if(cmd.getBillAmt()==null)
			 errors.rejectValue("billAmt","custCmd.custBillAmt.required");
		}//if
	}//method
}//class
