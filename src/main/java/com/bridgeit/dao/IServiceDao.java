package com.bridgeit.dao;

import com.bridgeit.pojo.User;

public interface IServiceDao {
	String userReg(User user);
	Boolean loginUser(String email,String passcode);
	public Boolean forgotUser(String email);
	Boolean setPassword(long userId,String password);
}
