package com.nt.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nt.command.RegisterCommand;

public class RegisterCommandValidator  implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.isAssignableFrom(RegisterCommand.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		RegisterCommand cmd=null;
	     //type casting
		cmd=(RegisterCommand)target;
		//server side form validation logic
		if( cmd.getCustName()==null || cmd.getCustName().equals("") || cmd.getCustName().length()==0 )
			errors.rejectValue("custName","regCmd.custName.required");
		
		if(cmd.getCustAddrs()==null||cmd.getCustAddrs().equals("") || cmd.getCustAddrs().length()==0  )
			errors.rejectValue("custAddrs","regCmd.custAddrs.required");
		
	}

}
