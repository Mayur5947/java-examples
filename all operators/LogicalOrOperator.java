package com.stl.operators;

public class LogicalOrOperator {
	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;

		// for OR operator if any one if the boolean value is true then it will execute
		// the if block otherwise it will go for else block
		if (b1 || b2)
			System.out.println("one or both   are true");
		else
			System.out.println("both are  false");
	}
}
