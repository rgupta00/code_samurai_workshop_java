package com.dp.creational.d.simple_factory_imporoved;

public class OracleConnectionFactory extends ConnectionFactory {

	@Override
	public String getFileName() {
		return "db-oracle.properties";
	}

}
