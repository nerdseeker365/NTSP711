package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.bo.EmployeeBO;

@Repository("empDAO")
public class EmployeeDAOImpl implements EmployeeDAO {
	private static final String  GET_EMPS_BY_DESG="SELECT EMPNO,ENAME,JOB,SAL FROM EMP WHERE JOB IN(?,?,?) ORDER BY JOB";
	
	@Autowired
	private DataSource ds;

	
	@Override
	public List<EmployeeBO> findEmpsByDesg(String desg1, String desg2, String desg3) throws Exception {
		List<EmployeeBO> listBO=null;
		EmployeeBO bo=null;
		
		 //get Pooled Connection obj
			try(Connection con=ds.getConnection()){
	     		//create PreparedStatement object
     			try(PreparedStatement ps=con.prepareStatement(GET_EMPS_BY_DESG)){
     					//set values to Query params
     					ps.setString(1,desg1);
     					ps.setString(2,desg2);
   						ps.setString(3,desg3);
   						//execute the Query
   						try(ResultSet rs=ps.executeQuery()){
   							//copy ResultSet obj records  ListBO obj
   								listBO=new ArrayList();
   								while(rs.next()) {
   									//copy each record  to BO 
   									bo=new EmployeeBO();
   									bo.setEno(rs.getInt(1));
   									bo.setEname(rs.getString(2));
   									bo.setDesg(rs.getString(3));
   									bo.setSalary(rs.getInt(4));
   									//add bo to listBO
   									listBO.add(bo);
   								}
   						}//try3
     			}//try2
			}//try1
   		catch(SQLException se) {
   					throw se;
   			}
		catch(Exception e) {
			throw e;
		}
      return listBO;
	}//method
	
}//class
