package com.a.basics_oo.b;

public class Main {

	public static void main(String[] args) {
		
		Account account=new Account(1,"raj",8000.00);
//		account.id=555;
//		account.name="rajiv";
		
		account.deposit(200);
	
		account.intrestCal();
		
		
	}
}
