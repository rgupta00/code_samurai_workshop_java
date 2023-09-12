package com.dp.creational.d.simple_factory_imporoved;
//it is not a factory method it is a simple factory 

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

//both are not same 
//gof talk about "factory method"

import java.sql.*;
import java.util.Properties;


abstract public class ConnectionFactory {
	private static Connection connection = null;

	public abstract String getFileName();
	
	public  Connection getConnection() {
		try {
			Properties prop = new Properties();
			

			FileInputStream in = new FileInputStream(getFileName());
				
			prop.load(in);
			
			String driver = prop.getProperty("driver");
			String url = prop.getProperty("url");
			String user = prop.getProperty("user");
			String password = prop.getProperty("password");
			
			Class.forName(driver);
			
			connection = DriverManager.getConnection(url, user, password);

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return connection;
	}

}
