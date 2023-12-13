package com.stl.conditional_statement;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		// Write a Java program to get a number from the user and print whether it is
		// positive or negative.

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number");
		int num = scanner.nextInt();
		if (num > 0)
			System.out.println("it is an positive number");
		else {
			System.out.println("it is an negative number");
		}
	}
}
