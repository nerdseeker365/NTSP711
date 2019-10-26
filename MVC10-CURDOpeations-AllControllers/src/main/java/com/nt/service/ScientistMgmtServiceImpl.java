package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.nt.bo.ScientistBO;
import com.nt.dao.ScientistDAO;
import com.nt.dto.ScientistDTO;

public class ScientistMgmtServiceImpl implements ScientistMgmtService {
	
	private  ScientistDAO  dao;

	public ScientistMgmtServiceImpl(ScientistDAO dao) {
		this.dao = dao;
	}

	@Override
	public List<ScientistDTO> fetchAllScientists() {
		List<ScientistBO> listBO=null;
		List<ScientistDTO> listDTO=new ArrayList();
		//use DAO
		listBO=dao.getAllScientists();
		//convert listBO to  listDTO
		listBO.forEach(bo->{
			ScientistDTO dto=new ScientistDTO();
			BeanUtils.copyProperties(bo,dto);
			dto.setSrno(listDTO.size()+1);
			listDTO.add(dto);
		});
		return listDTO;
	}//method
	
	
	@Override
	public ScientistDTO fetchScientistById(int id) {
		ScientistBO bo=null;
		ScientistDTO dto=null;
	//use DAO
		bo=dao.getScientistById(id);
		//convert  bo to DTO
		dto=new ScientistDTO();
		BeanUtils.copyProperties(bo,dto);
		return dto;
	}

	@Override
	public String modifyScientistById(ScientistDTO dto) {
		ScientistBO  bo=null;
		int count=0;
		// convert DTO  to BO
		bo=new ScientistBO();
		BeanUtils.copyProperties(dto, bo);
		//use dao
		count=dao.upateScientistById(bo);
		if(count==0)
		    return "Scientist Details are not updated";
		else
			return "Scientist Details are  updated";
	}//method
	
	@Override
	public String removeScientistById(int id) {
		//use DAO
		String msg=dao.deleteScientistById(id)==1?"Scientist is removed":"Scientist is not Removed";
		return msg;
	}
	
}//class
