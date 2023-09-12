package com.dp.creational.d.simple_factory_imporoved;

public class PostgresConnectionFactory extends ConnectionFactory {

	@Override
	public String getFileName() {
		return "db-postgres.properties";
	}

}
