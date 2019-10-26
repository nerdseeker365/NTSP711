package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.object.MappingSqlQuery;
import org.springframework.jdbc.object.SqlUpdate;
import org.springframework.stereotype.Repository;

import com.nt.bo.StudentBO;

@Repository("studDAO")
public class StudentDAOImpl implements StudentDAO {
	private  static final String  GET_STUDS_BY_ADDRS="SELECT SNO,SNAME,SADD FROM STUDENT WHERE SADD=?";
	private  static final String  GET_STUD_BY_SNO="SELECT SNO,SNAME,SADD FROM STUDENT WHERE SNO=?";
	private static final String  UPDATE_STUD_BY_SNO="UPDATE STUDENT SET SADD=? WHERE SNO=?";	
	private StudentSelector  studSelector1;
	private StudentSelector2  studSelector2;
	private StudentUpdator studUpdator;
	
	@Autowired
	public StudentDAOImpl(DataSource ds) {
		studSelector1=new StudentSelector(ds, GET_STUDS_BY_ADDRS);
		studSelector2=new StudentSelector2(ds, GET_STUD_BY_SNO);
		studUpdator=new StudentUpdator(ds, UPDATE_STUD_BY_SNO) ;
		
	}
	
	
	
	

	@Override
	public List<StudentBO> getStudentsByAddrs(String addrs) {
		List<StudentBO> listBO=null;
		listBO=studSelector1.execute(addrs);
		return listBO;
	}
	
	@Override
	public StudentBO getStudentBySno(int sno) {
		StudentBO bo=null;
		bo=studSelector2.findObject(sno);
		return bo;
	}
	
	@Override
	public int updateStudentAddrsBySno(int sno, String newAddrs) {
		int count=0;
		count=studUpdator.update(newAddrs,sno);
		return count;
	}
	
	//inner class  for SQL Query1
	private  static class   StudentSelector extends MappingSqlQuery<StudentBO>{
		
		public StudentSelector(DataSource ds, String query) {
			super(ds,query);
			super.declareParameter(new SqlParameter(Types.VARCHAR));
			super.compile();
		
		}

		@Override
		protected StudentBO mapRow(ResultSet rs, int rowNum) throws SQLException {
			 StudentBO bo=null;
			//  copy each record into  BO class obj
			 bo=new StudentBO();
			 bo.setSno(rs.getInt(1));
			 bo.setSname(rs.getString(2));
			 bo.setSadd(rs.getString(3));
			return bo;
		}
		
	}//inner class1
	
	//inner class  for SQL Query2
	private static  class StudentSelector2 extends MappingSqlQuery<StudentBO>{
		
		public StudentSelector2(DataSource ds, String query) {
			   super(ds,query);
			   super.declareParameter(new  SqlParameter(Types.INTEGER));
			   super.compile();
		}

		@Override
		protected StudentBO mapRow(ResultSet rs, int rowNum) throws SQLException {
			 StudentBO bo=null;
			//  copy each record into  BO class obj
			 bo=new StudentBO();
			 bo.setSno(rs.getInt(1));
			 bo.setSname(rs.getString(2));
			 bo.setSadd(rs.getString(3));
			return bo;
		}
		
	}//inner class2
	//inner class3 for query3
	private static  class   StudentUpdator  extends SqlUpdate{
		
		public StudentUpdator(DataSource ds, String query) {
			super(ds,query);
			super.declareParameter(new SqlParameter(Types.VARCHAR));
			super.declareParameter(new SqlParameter(Types.INTEGER));
			super.compile();
		}
		
	}

	
}//outer calss
