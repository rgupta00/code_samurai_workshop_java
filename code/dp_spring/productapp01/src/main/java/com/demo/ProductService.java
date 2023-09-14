package com.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

	public List<Product> getAll(){
		return Arrays.asList(new Product(1, "thinkpad", 120000),new Product(2, "dell", 110000));
	}
}
