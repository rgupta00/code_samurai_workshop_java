package com.dp.behavioural.e.strategy_dp.ex2;

public class NoDiscount implements Discount{
	@Override
	public Product discount(Product product) {
		return product;
	}

}
