package com.a.basics_oo.d;

public class PartTimeEmployee extends Employee implements Payable{

	private int noOfHr;
	private int noOfDays;
	
	public PartTimeEmployee(int id, String name, double salary, int noOfHr, int noOfDays) {
		super(id, name, salary);
		this.noOfHr=noOfHr;
		this.noOfDays=noOfDays;
	}
	
	@Override
	public String toString() {
		super.toString();
		StringBuilder builder = new StringBuilder();
		builder.append("PartTimeEmployee [noOfHr=").append(noOfHr).append(", noOfDays=").append(noOfDays).append("]");
		return builder.toString();
	}

	@Override
	public double payment() {
		return 4000000;
	}

	
}
