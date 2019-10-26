package com.nt.handler;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowDateHandler implements Handler {

	@Override
	public String handle(HttpServletRequest req, HttpServletResponse res) throws Exception {
		 Date d=null;
		//Sys Date 
		 d=new Date();
		 req.setAttribute("sysDate",d);
		return "sh_date";
	}

}
