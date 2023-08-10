package com.polymorphsim;

public class GreensBank extends AxisBank {

	@Override
	public void savingsAcc() {
		System.out.println("8%");
	}

	@Override
	public void currentAcc() {
		System.out.println("12%");
	}
	
	public void loan(String intrestRate) {
		System.out.println(intrestRate);
	}

	public static void main(String[] args) {
		GreensBank g = new GreensBank();
		g.savingsAcc();
		g.currentAcc();
		g.loan("13%");
	}
}
