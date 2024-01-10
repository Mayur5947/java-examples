package com.stl.abstraction;

public class Samsung extends MobileCompany{
	public static void main(String[] args) {
		Samsung samsung = new Samsung();
		samsung.companyName();
	}
	
	@Override
	public void companyName() {
		System.out.println("Company name is Samsung");
	}

}
