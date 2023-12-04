package com.stl.operators;

public class LogicalAndOperator {
	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		
		//if both are true then only condition will get true if any one of them is false then condition will get false
		if (b1 && b2)
			System.out.println("both are true");
		else
			System.out.println("one is false");
	}
}
