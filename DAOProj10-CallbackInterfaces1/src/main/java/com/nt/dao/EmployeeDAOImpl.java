package com.nt.dao;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBO;
@Repository("empDAO")
public class EmployeeDAOImpl implements EmployeeDAO {
	private static final String  GET_EMP_BY_NO="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE EMPNO=?";
	private static final String  GET_EMPS_BY_DESG="SELECT EMPNO,ENAME,JOB,SAL FROM  EMP WHERE JOB=?";
	private static final String  GET_EMPS_BY_SALRANGE="SELECT EMPNO,ENAME,JOB,SAL FROM  EMP WHERE SAL>=? AND SAL<=?";
		
	@Autowired
	private JdbcTemplate jt;

	public EmployeeBO findEmployeeByEno(int eno) {
		
		EmployeeBO bo= jt.queryForObject(GET_EMP_BY_NO, new BeanPropertyRowMapper<EmployeeBO>(EmployeeBO.class), eno);
		return bo;
	}
	
	
	@Override
	public List<EmployeeBO> findEmployeesByDesg(String desg) {
		BeanPropertyRowMapper<EmployeeBO> rowMapper=null;
		List<EmployeeBO> listBO=null;
		rowMapper=new BeanPropertyRowMapper(EmployeeBO.class);
		listBO=jt.query(GET_EMPS_BY_DESG,rowMapper,desg);
		return listBO;
	}
	
	
	/*@Override
	public List<EmployeeBO> findEmployeesByDesg(String desg) {
		List<EmployeeBO> listBO=null;
		listBO=jt.query(GET_EMPS_BY_DESG, 
				rs->{
					System.out.println("extractData(-)");
			List<EmployeeBO> listBO1=null;
			EmployeeBO bo=null;
			 listBO1=new ArrayList();
			 while(rs.next()) {
				 bo=new EmployeeBO();
				 bo.setEmpNo(rs.getInt(1));
				 bo.setEname(rs.getString(2));
				 bo.setJob(rs.getString(3));
				 bo.setSal(rs.getInt(4));
				 listBO1.add(bo);
			 }
			 return listBO1;
		},
				desg);
	
		return listBO;
	}*/
	
	

/*	@Override
	public List<EmployeeBO> findEmployeesByDesg(String desg) {
		List<EmployeeBO> listBO=null;
		listBO=jt.query(GET_EMPS_BY_DESG,
				                     new EmployeeExtractor(),
				                     desg);
		return listBO;
	} */
	
/*	private  static class  EmployeeExtractor implements ResultSetExtractor<List<EmployeeBO>>{

		@Override
		public List<EmployeeBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
			 List<EmployeeBO> listBO=null;
			 EmployeeBO bo=null;
		     //copy the records of ResultSet obj to List Collection
			 listBO=new ArrayList();
			 while(rs.next()) {
				 bo=new EmployeeBO();
				 bo.setEmpNo(rs.getInt(1));
				 bo.setEname(rs.getString(2));
				 bo.setJob(rs.getString(3));
				 bo.setSal(rs.getInt(4));
				 listBO.add(bo);
			 }
			 
			return listBO;
		}//extractData(-)
	}//inner class */
	
/*	@Override
	public List<EmployeeBO> findEmployeesBySalaryRange(int startSal, int endSal) {
	   List<EmployeeBO> listBO=null;
	   listBO=new ArrayList();
	   jt.query(GET_EMPS_BY_SALRANGE,new EmployeeCallbackHandler(listBO),
			           startSal,endSal);
		return listBO;
	}
	
	private  static class  EmployeeCallbackHandler  implements RowCallbackHandler{
		 private List<EmployeeBO> listBO;
		public EmployeeCallbackHandler(List<EmployeeBO> listBO) {
		    this.listBO=listBO;
		}

		@Override
		public void processRow(ResultSet rs) throws SQLException {
		    System.out.println("EmployeeDAOImpl.EmployeeCallbackHandler.processRow(-)");
		    EmployeeBO bo=null;
		      //copy each record to  BO class obj
			bo=new EmployeeBO();
			bo.setEmpNo(rs.getInt(1));
			bo.setEname(rs.getString(2));
			bo.setJob(rs.getString(3));
			bo.setSal(rs.getInt(4));
			listBO.add(bo);
		}
		
	}*/
	
	@Override
	public List<EmployeeBO> findEmployeesBySalaryRange(int startSal, int endSal) {
		 List<EmployeeBO> listBO=new ArrayList();
		 
		 jt.query(GET_EMPS_BY_SALRANGE,
				                rs->{
				                	System.out.println("1");
				                	EmployeeBO bo=new EmployeeBO();
				                	bo.setEmpNo(rs.getInt(1));
				                	bo.setEname(rs.getString(2));
				                	bo.setJob(rs.getString(3));
				                	bo.setSal(rs.getInt(4));
				                	listBO.add(bo);
				                },
				                startSal,endSal);
		return listBO;
	}//method
	
}//outer class
