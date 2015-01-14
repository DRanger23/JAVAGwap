package com.mockup.user.service.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mockup.user.pojo.user;
import com.mockup.user.service.userService;

public class userServiceimpl2 implements userService{
	public List getuserList() {
		List userList = new ArrayList();
		
		Connection conn = null;
		
		Statement stmt = null;
		
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
			
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery("select * from users");
			
			while(rs.next()){
				user users = new user();
				
				users.setUserid(rs.getString("userid"));
				users.setPassword(rs.getString("password"));
				
				
				userList.add(users);
			}
		} catch (Exception e) {
			e.printStackTrace();
			
			throw new RuntimeException("error when querying users ",e);
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
				
				throw new RuntimeException("error when querying users ",e);
			}
		}

		return userList;
	}
}
