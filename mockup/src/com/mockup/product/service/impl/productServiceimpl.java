package com.mockup.product.service.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mockup.product.pojo.product;
import com.mockup.product.service.productService;

public class productServiceimpl implements productService{
	public List getproductList() {
		List productList = new ArrayList();
		
		Connection conn = null;
		
		Statement stmt = null;
		
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
			
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery("select * from product");
			
			while(rs.next()){
				product product = new product();
				
				product.setProductid(rs.getString("productid"));
				product.setName(rs.getString("name"));
				product.setDescription(rs.getString("description"));
				product.setBasePrice(rs.getString("basePrice"));
				product.setCategoryid(rs.getString("categoryid"));
				product.setAuthor(rs.getString("author"));
				product.setPublish(rs.getString("publish"));
				product.setPages(rs.getString("pages"));
				product.setImages(rs.getString("images"));
				
				productList.add(product);
			}
		} catch (Exception e) {
			e.printStackTrace();
			
			throw new RuntimeException("error when querying products ",e);
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
				
				throw new RuntimeException("error when querying products ",e);
			}
		}

		return productList;
	}
}
