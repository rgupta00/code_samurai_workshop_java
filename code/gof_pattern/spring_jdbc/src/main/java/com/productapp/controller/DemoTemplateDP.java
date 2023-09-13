package com.productapp.controller;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.productapp.config.AppConfig;
import com.productapp.dao.Product;
import com.productapp.service.ProductService;

public class DemoTemplateDP {
	
	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		
		ProductService productService=(ProductService) ctx.getBean("ps");
		List<Product> products=productService.getAll();
		products.forEach(p-> System.out.println(p));
	}

}
