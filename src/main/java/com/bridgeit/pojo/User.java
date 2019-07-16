package com.bridgeit.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="User")  
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column (name="Id")
	private long userId ;
	 @Column(name = "Name")
	private String Name;
	 @Column(name="DoB")
	private String doB;
	@Column(unique = true,name="userName")
	private String userName;
	@Column(name="phone")
	private String Phone;
	@Column(name="password")
	private String password;
	@Column(unique =true,name = "email" )
	private String email;
	
	public User() {}

	public User(String name, String doB, String userName, String phone, String password, String email) {

		Name = name;
		this.doB = doB;
		this.userName = userName;
		Phone = phone;
		this.password = password;
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [Name=" + Name + ", doB=" + doB + ", userName=" + userName + ", Email=" + email + ", Phone="
				+ Phone + ", password=" + password +  "]";
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

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
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
