package com.demo.javaweb.service;

import java.sql.SQLException;

import com.demo.javaweb.dao.UserDao;
import com.demo.javaweb.model.User;

public class Userservice {

	private static UserDao dao =new UserDao();
	
	public User login(String name,String pwd) throws SQLException{
		//TODO
		return dao.login(name,pwd);
	}
	
}
