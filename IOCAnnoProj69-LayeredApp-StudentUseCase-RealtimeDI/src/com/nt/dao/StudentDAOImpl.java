package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.nt.bo.StudentBO;

@Repository("studDAO")
@Scope("singleton")
@DependsOn("drds")
public final class StudentDAOImpl implements StudentDAO {
	private static final String  INSERT_STUDENT_QUERY="INSERT INTO LAYERED_STUDENT VALUES(SNO_SEQ1.NEXTVAL,?,?,?,?,?)";
	@Autowired		
	 private DataSource ds;
	
	public StudentDAOImpl() {
		System.out.println("StudentDAOImpl:0-param constructor");
	}

	

	@Override
	public int insert(StudentBO bo) throws Exception {
		Connection con=null;
		PreparedStatement ps=null;
		int count=0;
		//get Pooled JDBC con obj from JDBC Con pool
		con=ds.getConnection();
		//create JDBC PreparedStatement object
		ps=con.prepareStatement(INSERT_STUDENT_QUERY);
		//set values to query params
		ps.setString(1,bo.getSname());
		ps.setInt(2,bo.getTotal());
		ps.setFloat(3,bo.getAvg());
		ps.setString(4,bo.getResult());
		ps.setString(5,bo.getSadd());
		//execute the Query
		count=ps.executeUpdate();
		//close jdbc objs
		ps.close();
		con.close();
		return count;
	}//method
}//class
