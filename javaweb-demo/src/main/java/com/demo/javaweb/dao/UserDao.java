package com.demo.javaweb.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.demo.javaweb.model.User;

public class UserDao {

	public User login(String name,String pwd) throws SQLException{
		
		Connection conn = JdbcUtil.getConn();
		ResultSet resultSet = conn.createStatement().executeQuery("select * from t_user where name='"+name+"' and password='"+pwd+"'");
		
		if(resultSet.next()){			
			User u = new User();
			u.setId(resultSet.getInt(1));
			u.setName(resultSet.getString(2));
			u.setPassword(resultSet.getString(3));
			return u;
		}else{
			return null;
		}
		
	}
	
	public static void main(String[] args) throws SQLException {
		User u =new UserDao().login("admin", "123456");
		System.out.println(u);
	}
	
}
