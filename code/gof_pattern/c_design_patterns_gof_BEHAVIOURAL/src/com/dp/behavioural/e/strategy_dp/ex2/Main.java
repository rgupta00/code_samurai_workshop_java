package com.dp.behavioural.e.strategy_dp.ex2;

public class Main {
	
	public static void main(String[] args) {
		
		Cart cart=new Cart();
		cart.setDiscount(new BuyXGetYItemDiscount());
		cart.addProduct(new Product(1, "thinkpad", 120000, 2));
		cart.addProduct(new Product(11, "cool pad", 1200, 2));
		
		double totalPrice= cart.getTotalCartValue();
		System.out.println(totalPrice);
		
	}

}
