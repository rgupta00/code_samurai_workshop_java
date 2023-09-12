package com.a.basics_oo.b;

//encapsulation = data hiding + business contstrants 
public class Account {
	  int id;
	  String name;
	 double balance;

	public Account(int id, String name, double balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance=balance+amount;
	}
	
	public double intrestCal() {
		return balance*02;
	}
}
