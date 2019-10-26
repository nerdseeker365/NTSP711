package com.nt.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.bpp.DOJBeanPostProcessor;
import com.nt.dto.EmployeeDTO;
import com.nt.dto.StudentDTO;
import com.nt.service.UniversityMgmtService;

public class MainControllerServlet extends HttpServlet {
	DefaultListableBeanFactory factory=null;
	XmlBeanDefinitionReader reader=null;
	UniversityMgmtService  service=null;
	
	 @Override
	public void init()  {
		 System.out.println("MainControllerServlet.init()");
	  //create IOC container
		 factory=new DefaultListableBeanFactory();
		 reader=new XmlBeanDefinitionReader(factory);
		 reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
		 //explicit registration of BeanPostProcessor
		 factory.addBeanPostProcessor(new DOJBeanPostProcessor());
		 //get Service class obj
		 service=factory.getBean("unsrService",UniversityMgmtService.class);
	}
	 
	 @Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		 String  cap=null;
		 String name=null;
		 String addrs=null;
		 String email=null;
		 long mobileNo=0L;
		 String course=null;
		 String desg=null;
		 StudentDTO stDTO=null;
		 String result=null;
		 EmployeeDTO empDTO=null;
		 RequestDispatcher rd=null;
		 //read form data
		 name=req.getParameter("name");
		 addrs=req.getParameter("addrs");
		 email=req.getParameter("email");
		 mobileNo=Long.parseLong(req.getParameter("mobileNo"));
		 cap=req.getParameter("s1");
		 if(cap.equalsIgnoreCase("registerStudent")) {
		           course=req.getParameter("course");
		           //prpeare STudentDTO
		           stDTO=new StudentDTO();
		           stDTO.setName(name);
		           stDTO.setAddrs(addrs);
		           stDTO.setEmail(email);
		           stDTO.setMobileNo(mobileNo);
		           stDTO.setCourse(course);
		           //use service
		           result=service.registerStudent(stDTO);
		 }
		 else {
			 desg=req.getParameter("desg");
	           //prpeare STudentDTO
	           empDTO=new EmployeeDTO();
	           empDTO.setName(name);
	           empDTO.setAddrs(addrs);
	           empDTO.setEmail(email);
	           empDTO.setMobileNo(mobileNo);
	           empDTO.setDesg(desg);
	           //use service
	           result=service.registerEmployee(empDTO);
		 }
		 //keep the results in request scope
		 req.setAttribute("resultMsg",result);
		 //forward request to result page
		 rd=req.getRequestDispatcher("/result.jsp");
		 rd.forward(req,res);
	}
	 
	 @Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
            doGet(req,res);
	}
	 
	 @Override
	public void destroy() {
		 service=null;
		 factory=null;
	}

}
