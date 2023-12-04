package com.stl.operators;

import java.util.Scanner;

public class GraterThanEqualsOperator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number");
		int num = scanner.nextInt();
		if (num > 10)
			System.out.println("number is greater than  10");
		else if (num == 10)
			System.out.println("number is equals to  10");
		else
			System.out.println("number is less  than 10");
	}
}
