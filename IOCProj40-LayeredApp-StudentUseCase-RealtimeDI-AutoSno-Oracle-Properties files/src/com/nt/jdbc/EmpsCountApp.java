package com.nt.jdbc;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class EmpsCountApp {
   private static final String EMP_COUNT_SQL="SELECT COUNT(*) FROM LAYERED_STUDENT";
	public static void main(String[] args) {
		Properties props=null;
		//locate properties file
		try(InputStream is=new FileInputStream("src/com/nt/commons/jdbc.properties")) {
		  //Load properties file info to java.util.Properties class obj
			props=new Properties();
			props.load(is);
		}
		catch(FileNotFoundException fne) {
			fne.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		//register JDBC drivers/w
		try {
			Class.forName(props.getProperty("jdbc.driver"));
		}
		catch(ClassNotFoundException cnf) {
			cnf.printStackTrace();
		}
		//establish the connection
		try(Connection con=DriverManager.getConnection(props.getProperty("jdbc.url"),props.getProperty("jdbc.user"), props.getProperty("jdbc.pwd"))){
			try(Statement st=con.createStatement()){
				try(ResultSet rs=st.executeQuery(EMP_COUNT_SQL)){
					   rs.next();
					   System.out.println("Emps count::"+rs.getInt(1));
				}//try3
			}//try2
		}//try1
		catch(SQLException se) {
			se.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		

	}//main
}//class
