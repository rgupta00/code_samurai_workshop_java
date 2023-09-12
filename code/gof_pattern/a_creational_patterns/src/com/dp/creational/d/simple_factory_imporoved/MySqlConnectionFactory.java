package com.dp.creational.d.simple_factory_imporoved;

public class MySqlConnectionFactory extends ConnectionFactory {

	@Override
	public String getFileName() {
		return "db-mysql.properties";
	}

}
