package com.nt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.dto.ScientistDTO;
import com.nt.service.ScientistMgmtService;

public class DeleteScientistController extends AbstractController {
	private ScientistMgmtService  service;

	public DeleteScientistController(ScientistMgmtService service) {
		this.service = service;
	}

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		int id=0;
		String resultMsg=null;
		List<ScientistDTO>  listDTO=null;
		ModelAndView  mav=null;
		 //read additional req param value
		id=Integer.parseInt(req.getParameter("id"));
		//use service
		resultMsg=service.removeScientistById(id);
		listDTO=service.fetchAllScientists();
		//create and return MAV object
		mav=new ModelAndView();
		mav.addObject("resultMsg",resultMsg);
		mav.addObject("listDTO", listDTO);
		mav.setViewName("report");
		return mav;
	}

}
