package com.nt.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nt.handler.Handler;
import com.nt.handler.ShowDateHandler;
import com.nt.handler.ShowSystemPropertiesHandler;

public class NITFrontControllerServlet extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		 Handler handler=null;
		 String lvn=null;
		 String target=null;
		 RequestDispatcher rd=null;
		 try {
		// Perform Navigation Management
		 if(req.getServletPath().equalsIgnoreCase("/date.do")) {
			 handler=new ShowDateHandler();
			 lvn=handler.handle(req, res);
		 }
		 else if(req.getServletPath().equalsIgnoreCase("/props.do")) {
			 handler=new ShowSystemPropertiesHandler();
			 lvn=handler.handle(req, res);
		 }
		 else {
			 target="/error.jsp";
		 }
		 }//try
		 catch(Exception e) {
			 target="/error.jsp";
		 }
		 // Perform view managent
		 if(target==null && lvn!=null) {
			    if(lvn.equalsIgnoreCase("sh_date"))
			    	target="/show_date.jsp";
			    else if(lvn.equalsIgnoreCase("sh_props"))
			    	target="/show_props.jsp";
			    else
			    	target="/error.jsp";
		 }//if
		 //forward to target/result jsp
		 rd=req.getRequestDispatcher(target);
		 rd.forward(req,res);
		
	}
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	     doGet(req,res);	
	}

}
