package com.nt.advice;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import org.aspectj.lang.JoinPoint;

public class AuditLogAdvice {
	
	/*public  void    audit(JoinPoint jp)throws Throwable{
		Writer writer=null;
		String auditMsg=null;
		Object args[]=null;
		//get Target method args
		args=jp.getArgs();
		//prepare audit Message
		auditMsg=args[0]+" type loan for the amount "+args[1]+" has come for approval to the manager"+args[2]+" on "+new java.util.Date();
		//write messages to audit log file
		try {
			writer=new FileWriter("E:/auditLog.txt",true);
			writer.write(auditMsg+"\n");
			writer.flush();
			writer.close();
		}//try
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
		
		
	}*/
	
	/*	public  void    audit(String lType,float amount,String manager)throws Throwable{
			Writer writer=null;
			String auditMsg=null;
			Object args[]=null;
			//prepare audit Message
			auditMsg=lType+" type loan for the amount "+amount+" has come for approval to the manager "+ manager+" on "+new java.util.Date();
			//write messages to audit log file
			try {
				writer=new FileWriter("E:/auditLog.txt",true);
				writer.write(auditMsg+"\n");
				writer.flush();
				writer.close();
			}//try
			catch(IOException ioe) {
				ioe.printStackTrace();
			}
		}*/
	
	public  void    audit(JoinPoint jp,String lType,float amount,String manager)throws Throwable{
		Writer writer=null;
		String auditMsg=null;
		Object args[]=null;
		//prepare audit Message
		auditMsg=lType+" type loan for the amount "+amount+" has come for approval to the manager "+ manager+" on "+new java.util.Date();
		//write messages to audit log file
		try {
			writer=new FileWriter("E:/auditLog.txt",true);
			writer.write(auditMsg+"\n");
			writer.flush();
			writer.close();
		}//try
		catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}

	

}
