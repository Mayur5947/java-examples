package com.stl.operators;

import java.util.Scanner;

public class ExactEqualsToOperator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number");
		int num = scanner.nextInt();
		if(num==10)
			System.out.println("number is equals to 10"+" number matched");
		else
			System.out.println("number not matched");
	}
}
