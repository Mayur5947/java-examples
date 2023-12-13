package com.stl.conditional_statement;

import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter decimal value 1");
		double d1 = scanner.nextDouble();
		System.out.println("enter decimal value 2");
		double d2 = scanner.nextDouble();

		d1 = d1 * 1000;
		d2 = d2 * 1000;
		int n1 = (int) d1;
		int n2 = (int) d2;
		if (n1 == n2)
			System.out.println("they are same");
		else
			System.out.println("they are different");
	}
}
