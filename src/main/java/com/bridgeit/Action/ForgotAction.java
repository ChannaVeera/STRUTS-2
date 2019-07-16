package com.bridgeit.Action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;

import com.bridgeit.dao.IServiceDao;
import com.bridgeit.dao.ServiceDaoImpl;
@Namespace("/")
@Action(value = "forgot",results = { @Result(name = "SUCCESS", location = "user.jsp"),
		@Result(name = "ERROR", location = "ForgetPassword.jsp") })
public class ForgotAction {

	private String email;

	private	IServiceDao serviceDao = ServiceDaoImpl.getinstance();
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String execute() {
		System.out.println("in method excute method forgot  ");
		if(serviceDao.forgotUser(getEmail())) {
		System.out.println("in log me");
		return "SUCCESS";
	}
	return "ERROR" ;

	}

}
