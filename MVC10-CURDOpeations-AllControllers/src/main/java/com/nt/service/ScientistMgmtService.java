package com.nt.service;

import java.util.List;

import com.nt.dto.ScientistDTO;

public interface ScientistMgmtService {
   public  List<ScientistDTO>  fetchAllScientists();
   public  ScientistDTO  fetchScientistById(int id);
   public   String    modifyScientistById(ScientistDTO dto);
   public   String  removeScientistById(int id);
	
}
