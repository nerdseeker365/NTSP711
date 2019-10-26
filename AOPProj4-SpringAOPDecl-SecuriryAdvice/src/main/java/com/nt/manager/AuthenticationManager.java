package com.nt.manager;

import org.springframework.beans.BeanUtils;

import com.nt.bo.UserDetailsBO;
import com.nt.dao.AuthenticateDAO;
import com.nt.dto.UserDetailsDTO;


public class AuthenticationManager {
	private AuthenticateDAO  dao;
	private ThreadLocal<UserDetailsDTO>  threadLocal=new ThreadLocal();

	public AuthenticationManager(AuthenticateDAO dao) {
		this.dao = dao;
	} 
	
	public void signIn(String user,String pwd) {
		UserDetailsDTO dto=null;
		//create UserDetails object
		dto=new UserDetailsDTO();
		dto.setUsername(user);
		dto.setPassword(pwd);
		//add login details to ThreadLocal
		threadLocal.set(dto);
	}
	
	public  boolean authenticate() {
		UserDetailsDTO dto=null;
		UserDetailsBO bo=null;
		int count=0;
		//get UserDetails obj from ThreadLocal
		dto=threadLocal.get();
		//convert DTO  to BO
		bo=new UserDetailsBO();
		BeanUtils.copyProperties(dto, bo);
		//use DAO
		count=dao.validate(bo);
		if(count==0)
			return false;
		else
			return true;
	}
	
	public void singnOut() {
		threadLocal.remove();
	}
	
	

}
