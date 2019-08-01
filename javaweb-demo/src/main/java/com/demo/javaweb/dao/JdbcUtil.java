package com.demo.javaweb.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcUtil {
	private static String url = "jdbc:mysql://127.0.0.1:3306/java_demo?autoReconnect=true&useUnicode=true&characterEncoding=utf8";
	private static String username = "root";
	private static String password = "123456";
	private JdbcUtil(){}
	public static Connection getConn() throws SQLException{
		return DriverManager.getConnection(url,username,password);
	}
	public static void close(Connection conn){
		if (conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) throws SQLException {
		Connection conn = JdbcUtil.getConn();
		Statement statement =  conn.createStatement();
		ResultSet resultSet = statement.executeQuery("select id,name,password from t_user where name='admin' and password='123456'");
		if(resultSet.next()){
			System.out.println("success");
		}else{
			System.out.println("fail");			
		}
	}
}