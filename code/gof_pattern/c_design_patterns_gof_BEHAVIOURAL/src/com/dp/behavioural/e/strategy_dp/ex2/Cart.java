package com.dp.behavioural.e.strategy_dp.ex2;

import java.util.ArrayList;
import java.util.List;

 public class Cart {
	private List<Product> productList = new ArrayList<>();
	private double totalCartValue;

	private Discount discount;
	
	
	public Cart() {
		discount=new NoDiscount();
	}
	
	public void setDiscount(Discount discount) {
		this.discount = discount;
	}



	public void addProduct(Product product) {
		productList.add(product);
	} 
	
	public double getTotalCartValue(){
		if(productList.size()> 0){
			for(Product p: productList){
				discount.discount(p);
				
				totalCartValue=totalCartValue+p.getPrice()*p.getQuantity();
			}
		}
			
		return totalCartValue;
	}
	
}