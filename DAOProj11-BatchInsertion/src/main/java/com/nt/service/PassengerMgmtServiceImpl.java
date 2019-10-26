package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.bo.PassengerBO;
import com.nt.dao.PassengerDAO;
import com.nt.dto.PassengerDTO;

@Service("pService")
public class PassengerMgmtServiceImpl implements PassengerMgmtService {
   @Autowired
	private  PassengerDAO dao;
   
   
	public String groupTicketReservation(List<PassengerDTO> listDTO) {
		final List<PassengerBO> listBO=new ArrayList();
		int result[]=null;
		//convert listDTO to listBO
		listDTO.forEach(dto->{
			PassengerBO bo=new PassengerBO();
			BeanUtils.copyProperties(dto, bo);
			listBO.add(bo);
		});
		//use dAO
		result=dao.insertBatch(listBO);
		
		if(result!=null)
			 return "Group resevation is succeded";
		else
			return "Group resevation is no succeded";
		
		
	}

}
