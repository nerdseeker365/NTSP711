package com.nt.handler;

import java.util.Properties;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowSystemPropertiesHandler implements Handler {

	@Override
	public String handle(HttpServletRequest req, HttpServletResponse res) throws Exception {
		Properties props=null;
		//get system properties
		props=System.getProperties();
		req.setAttribute("sysProps",props);
		return "sh_props";
	}

}
