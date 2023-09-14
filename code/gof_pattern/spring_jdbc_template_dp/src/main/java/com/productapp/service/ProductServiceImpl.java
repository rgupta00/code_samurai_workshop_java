package com.productapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.productapp.dao.Product;
import com.productapp.dao.ProductDao;
@Service(value = "ps")

@Transactional
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;
	
	public List<Product> getAll() {
		return productDao.getAll();
	}

	public void addProduct(Product product) {	
		productDao.addProduct(product);
	}

}
