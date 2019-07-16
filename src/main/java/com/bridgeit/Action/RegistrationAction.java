package com.bridgeit.Action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.bridgeit.dao.IServiceDao;
import com.bridgeit.dao.ServiceDaoImpl;
import com.bridgeit.pojo.User;
import com.bridgeit.utility.MailSender;

@Action(value = "registration", results = { @Result(name = "SUCCESS", location = "Login.jsp"),

		@Result(name = "ERROR", location = "welcome.jsp") })

public class RegistrationAction {
	private String Name;
	private String doB;
	private String userName;
	private String Phone;
	private String password;
	private String Email;
	private IServiceDao serviceDao = ServiceDaoImpl.getinstance();
	private MailSender mailSender = new MailSender();


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getDoB() {
		return doB;
	}


	public void setDoB(String doB) {
		this.doB = doB;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPhone() {
		return Phone;
	}


	public void setPhone(String phone) {
		Phone = phone;
	}


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
		System.out.println("in for get methoed for forgot ");
		System.out.println(getEmail());
		User user = new User();
		user.setName(getName());
		user.setDoB(getDoB());
		user.setUserName(getUserName());
		user.setEmail(getEmail());
		user.setPassword(getPassword());
		user.setPhone(getPhone());
		if (serviceDao.userReg(user) != null) {
			mailSender.sendMail(user.getEmail(), "wellcome", user.toString());
			System.out.println("execute called");
			return "SUCCESS";
		}
		return "ERROR";

	}

}
