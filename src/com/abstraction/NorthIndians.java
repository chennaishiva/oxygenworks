package com.abstraction;

public class NorthIndians extends Indians {

	@Override
	public void breakfast() {
		System.out.println("Pohaa");
	}
	
	public static void main(String[] args) {
		NorthIndians n = new NorthIndians();
		n.aadharCard();
		n.panCard();
		n.breakfast();
	}

}
