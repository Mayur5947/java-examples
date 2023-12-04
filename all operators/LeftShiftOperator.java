package com.stl.operators;

import java.util.Scanner;

public class LeftShiftOperator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number ");
		int num = scanner.nextInt();
		System.out.println("result = " + (num << 2));
	}
}
