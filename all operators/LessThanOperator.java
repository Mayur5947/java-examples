package com.stl.operators;

import java.util.Scanner;

public class LessThanOperator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number");
		int num = scanner.nextInt();
		if (num < 10)
			System.out.println("number is less than  10" );
		else
			System.out.println("number is greater than 10");
	}
}
