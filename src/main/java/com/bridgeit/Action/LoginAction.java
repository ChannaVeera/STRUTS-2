package com.bridgeit.Action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.bridgeit.dao.IServiceDao;
import com.bridgeit.dao.ServiceDaoImpl;

@Action(value = "login", results = { @Result(name = "SUCCESS", location = "user.jsp"),

		@Result(name = "ERROR", location = "Login.jsp") })
public class LoginAction {
	private String password;
	private String Email;
	private	IServiceDao serviceDao = ServiceDaoImpl.getinstance();
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String execute() {
		if(serviceDao.loginUser(getEmail(), getPassword())) {
			System.out.println("in log me");
			return "SUCCESS";
		}
		return "ERROR" ;
		
		
	}
}
