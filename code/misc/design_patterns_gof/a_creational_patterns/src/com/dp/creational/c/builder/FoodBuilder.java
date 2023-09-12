package com.dp.creational.c.builder;
public class FoodBuilder {
		
		private String name;
		private int unit;
		private int vitC=100;
		private int vitA=100;
		private int vitB12=100;
		private int vitB5=100;
		private int vitD=5000;
		
		public FoodBuilder(String name, int unit) {
			super();
			this.name = name;
			this.unit = unit;
		}
		
		
		public Food build(){
			return new Food(name, unit, vitC, vitA, vitB12, vitB5, vitD);
		}
	
	
		public FoodBuilder setName(String name) {
			this.name = name;
			return this;
		}

	}