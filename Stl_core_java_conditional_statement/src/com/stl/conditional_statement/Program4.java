package com.stl.conditional_statement;

import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter   number from 1 to 7");
		int n1 = scanner.nextInt();
		switch (n1) {
		case 1: {
			System.err.println("Monday");
		}
			break;
		case 2: {
			System.err.println("Tuesday");
		}
			break;
		case 3: {
			System.err.println("Wednesday");
		}
			break;
		case 4: {
			System.err.println("Thursday");
		}
			break;
		case 5: {
			System.err.println("Friday");
		}
			break;
		case 6: {
			System.err.println("Saturday");
		}
			break;
		case 7: {
			System.err.println("Sunday");
		}
			break;
		}
	}
}
