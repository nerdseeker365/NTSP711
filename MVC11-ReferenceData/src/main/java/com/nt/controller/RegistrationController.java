package com.nt.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.nt.command.RegisterCommand;

public class RegistrationController extends SimpleFormController {
	
	@Override
	public Map referenceData(HttpServletRequest request) throws Exception {
		System.out.println("RegistrationController.referenceData(-)");
		List<String> countries=null;
		List<String> hobies=null;
		List<String>  products=null;
		List<String> genders=null;
		Map<String,List<String>>  map=null;
		
		countries=new ArrayList();
		countries.add("india"); countries.add("USA"); countries.add("PAK");
		countries.add("UK"); countries.add("Singapore");
		
		hobies=new ArrayList();
		hobies.add("sleeping"); hobies.add("surfing"); hobies.add("window shopping");
		hobies.add("gosiping");
		
		products=new ArrayList();
		products.add("Bag"); products.add("Shoe");  products.add("books");
		products.add("Pencil"); products.add("water Bottle");  products.add("LunchBox");
		
		genders=new ArrayList();
		genders.add("Male");  genders.add("FeMale");
		
		map=new HashMap<String, List<String>>();
		map.put("countriesList",countries);
		map.put("hobiesList",hobies);
		map.put("productsList",products);
		map.put("gendersList",genders);
		
		return map;
		
	}
	
	@Override
	public ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		
		return  new ModelAndView("result","cmdData",command);
		
	}

}
