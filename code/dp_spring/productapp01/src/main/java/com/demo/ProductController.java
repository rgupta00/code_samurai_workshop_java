package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

//Back controller -> ser--> dao-->db
@Controller
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping("products")
	public ModelAndView showAll() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("show");
		mv.addObject("products", productService.getAll());
		
		return mv;
		
	}
	
}
