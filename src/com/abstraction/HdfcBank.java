package com.abstraction;

public class HdfcBank implements RbiBank, Worldbank {

	@Override
	public void fixed() {
		
	}

	@Override
	public void savings() {
		
	}

	@Override
	public void deposit() {
		
	}

	public static void main(String[] args) {
		RbiBank r  = new HdfcBank();
		r.savings();
		r.deposit();
		
		Worldbank w = new HdfcBank();
		w.fixed();
	}

}
