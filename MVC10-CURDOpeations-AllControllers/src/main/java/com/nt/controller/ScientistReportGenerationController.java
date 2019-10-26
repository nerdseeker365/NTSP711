package com.nt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.dto.ScientistDTO;
import com.nt.service.ScientistMgmtService;

public class ScientistReportGenerationController extends AbstractController {
	private  ScientistMgmtService service;

	public ScientistReportGenerationController(ScientistMgmtService service) {
		this.service = service;
	}

	@Override
	public ModelAndView handleRequestInternal(HttpServletRequest req, HttpServletResponse res)
			throws Exception {
		List<ScientistDTO> listDTO=null;
		ModelAndView mav=null;
		// user Service
		listDTO=service.fetchAllScientists();
		//return MAV object
		return new ModelAndView("report","listDTO",listDTO);
	}

}
