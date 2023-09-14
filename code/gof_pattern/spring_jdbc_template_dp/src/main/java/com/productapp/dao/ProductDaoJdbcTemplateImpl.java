package com.productapp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class ProductDaoJdbcTemplateImpl implements ProductDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public List<Product> getAll() {
		return  jdbcTemplate.query("select * from product", new ProductRowMapper());
	}

	public void addProduct(Product product) {
		jdbcTemplate.update("insert into product(name,price) values (?,?)",
				new Object[] {product.getName(), product.getPrice()});
	}
}










