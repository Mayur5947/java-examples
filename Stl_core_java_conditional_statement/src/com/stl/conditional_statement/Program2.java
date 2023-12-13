package com.stl.conditional_statement;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) {
		// Write a Java program that takes three numbers from the user and prints the
		// greatest number
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter first  number");
		int n1 = scanner.nextInt();
		System.out.println("enter second number");
		int n2 = scanner.nextInt();
		System.out.println("enter  third number");
		int n3 = scanner.nextInt();

		if (n1 > n2 && n1 > n3)
			System.out.println("greater number is " + n1);
		else if (n2 > n1 && n2 > n3)
			System.out.println("greater number is " + n2);
		else
			System.out.println("greater number is " + n3);

	}
}
