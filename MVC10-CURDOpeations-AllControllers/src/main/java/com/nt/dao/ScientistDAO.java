package com.nt.dao;

import java.util.List;

import com.nt.bo.ScientistBO;

public interface ScientistDAO {
	
	public  List<ScientistBO>  getAllScientists();
	public  ScientistBO  getScientistById(int id);
	public    int    upateScientistById(ScientistBO bo);
	public  int  deleteScientistById(int id);

}
