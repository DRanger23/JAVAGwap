package com.mockup.user.service.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mockup.user.pojo.contactinfo;
import com.mockup.user.service.userService;


public class userServiceimpl1 implements userService{
	public List getuserList() {
		List userList = new ArrayList();
		
		Connection conn = null;
		
		Statement stmt = null;
		
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gwap","root","");
			
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery("select * from contactinfo");
			
			while(rs.next()){
				contactinfo user = new contactinfo();
				
				user.setUserid(rs.getString("contactid"));
				user.setUserid(rs.getString("userid"));
				user.setStreet1(rs.getString("street1"));
				user.setStreet2(rs.getString("street2"));
				user.setCity(rs.getString("city"));
				user.setProvince(rs.getString("province"));
				user.setCountry(rs.getString("country"));
				user.setZip(rs.getString("zip"));
				user.setEmail(rs.getString("email"));
				user.setHomephone(rs.getString("homephone"));
				user.setCellphone(rs.getString("cellphone"));
				user.setOfficephone(rs.getString("officephone"));
				
				userList.add(user);
			}
		} catch (Exception e) {
			e.printStackTrace();
			
			throw new RuntimeException("error when querying user ",e);
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
				
				throw new RuntimeException("error when querying user ",e);
			}
		}

		return userList;
	}
}
