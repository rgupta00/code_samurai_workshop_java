package com.productapp.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private DataSource dataSource;
	
	
	public List<Product> getAll() {
		List<Product> products=new ArrayList<Product>();
		try {
			Connection connection=dataSource.getConnection();
			Statement stmt = connection.createStatement();
			ResultSet rs = stmt.executeQuery("select * from product");
			while (rs.next()) {
				products.add(new Product(rs.getInt(1), rs.getString(2), rs.getDouble(3)));
			}
		}catch(SQLException ex) {
			ex.printStackTrace();
		}
		return products;
	}

	public void addProduct(Product product) {
	}
}
