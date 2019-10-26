package com.nt.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.service.StudentMgmtService;

@WebServlet(urlPatterns="/controller",loadOnStartup=1)
public class MainControllerServlet extends HttpServlet {
	ApplicationContext ctx=null;
	@Override
	public void init() throws ServletException {
		//create IOC Container
		ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	}

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String locations[]=null;
		StudentMgmtService service=null;
		List<Map<String,Object>> list=null;
		RequestDispatcher rd=null;
		//read form data
		locations=req.getParameterValues("locations");
		//get Service bean class obj
		service=ctx.getBean("studService",StudentMgmtService.class);
		//use service
		list=service.getStudentsByLocations(locations);
		//put results  in request scope
		req.setAttribute("studList",list);
		//forward request to list_studs.jsp
		rd=req.getRequestDispatcher("/list_studs1.jsp");
		rd.forward(req, res);
	}//doGet(-,-)

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		 doGet(req,res);
	}//doPost(-,-)
	
	@Override
	public void destroy() {
	     ((AbstractApplicationContext) ctx).close();
	}

}
