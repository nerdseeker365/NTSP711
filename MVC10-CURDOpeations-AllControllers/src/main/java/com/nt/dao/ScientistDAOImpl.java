package com.nt.dao;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;

import com.nt.bo.ScientistBO;

public class ScientistDAOImpl implements ScientistDAO {
	private static final String  UPDATE_SCIENTIST="UPDATE INDIA_SCIENTISTS  SET  NAME=?,DOMAIN=?,EXPERIENCE=?,PATENTSCOUNT=? WHERE ID=?";
	private static final String ALL_SCIENTITS="SELECT ID,NAME,DOMAIN,EXPERIENCE,PATENTSCOUNT  FROM INDIA_SCIENTISTS";
	private static final String  SCIENTIST_BY_ID="SELECT ID,NAME,DOMAIN,EXPERIENCE,PATENTSCOUNT  FROM INDIA_SCIENTISTS  WHERE ID=?";
	private static final String  DELETE_SCIENTIST_BY_ID="DELETE  FROM INDIA_SCIENTISTS  WHERE ID=? ";
	private JdbcTemplate jt;
	

	public ScientistDAOImpl(JdbcTemplate jt) {
		this.jt = jt;
	}


	@Override
	public List<ScientistBO> getAllScientists() {
		List<ScientistBO>  listBO=null;
		
		BeanPropertyRowMapper<ScientistBO>  rowMapper=null;
		rowMapper=new BeanPropertyRowMapper(ScientistBO.class);
		listBO=jt.query(ALL_SCIENTITS, new RowMapperResultSetExtractor<ScientistBO>(rowMapper));
		return listBO;
	}


	@Override
	public ScientistBO getScientistById(int id) {
		ScientistBO bo=null;
		bo=jt.queryForObject(SCIENTIST_BY_ID,new BeanPropertyRowMapper<ScientistBO>(ScientistBO.class),id);
		return bo;
	}


	@Override
	public int upateScientistById(ScientistBO bo) {
		int  count=0;
		count=jt.update(UPDATE_SCIENTIST,bo.getName(),bo.getDomain(),bo.getExperience(),bo.getPatentsCount(),bo.getId());
		return count;
	}
	
	@Override
	public int deleteScientistById(int id) {
		int count=0;
		count=jt.update(DELETE_SCIENTIST_BY_ID,id);
		return count;
	}

}
