package com.demo.javaweb.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import com.demo.javaweb.model.User;
import com.demo.javaweb.service.Userservice;
import com.sun.org.apache.bcel.internal.generic.NEW;

public class UserServlet extends HttpServlet {

	private static Userservice service = new Userservice();
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		String name = req.getParameter("name");
		String pwd = req.getParameter("pwd");
		
		User u = null;
		try {
			u = service.login(name, pwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Map<String, Object> map = new HashMap<String, Object>();
		resp.setCharacterEncoding("UTF-8");
		resp.setHeader("Content-Type", "text/json;charset=utf-8");
		if(u == null){
			map.put("code", 1);
			map.put("msg", "帐号密码错误");
		}else{
			map.put("code", 0);
		}
		String res = JSONObject.fromObject(map).toString();
		resp.getWriter().print(res);
		
	}
	
}
