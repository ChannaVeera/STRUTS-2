package com.bridgeit.Action;

import org.apache.struts2.convention.annotation.Action;

import org.apache.struts2.convention.annotation.Result;

import com.bridgeit.dao.IServiceDao;
import com.bridgeit.dao.ServiceDaoImpl;

@Action(value = "setpassword", results = { @Result(name = "SUCCESS", location = "user.jsp"),
		@Result(name = "ERROR", location = "Login.jsp") })
public class SetPasswordAction {
	private IServiceDao serviceDao = ServiceDaoImpl.getinstance();
	private String userId;
	private String password;
	private String cpassword;



	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCpassword() {
		return cpassword;
	}

	public void setCpassword(String cpassword) {
		this.cpassword = cpassword;
	}

	public String execute() {
		if (getCpassword().equals(getPassword())) {
			System.out.println(getUserId());
			System.out.println(userId+cpassword+password);
			long id= Integer.parseInt(userId);
			System.out.println(id);
			serviceDao.setPassword(id, cpassword);
			System.out.println("in the set paswird");
			return "SUCCESS";
		}
		return "ERROR";

	}

}
