package com.stl.operators;

import java.util.Scanner;

public class ArithmaticOperators {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("eneter first number");
		int n1 = scanner.nextInt();
		System.out.println("eneter second  number");
		int n2 = scanner.nextInt();
		add(n1, n2);
		subtraction(n1, n2);
		multiplication(n1, n2);
		division(n1, n2);

	}

	public static void add(int n1, int n2) {
		int sum = n1 + n2;
		System.out.println("the addition of numbes are --->" + sum);
	}

	public static void subtraction(int n1, int n2) {
		int num = n1 - n2;
		System.out.println("the subtraction  of numbes are --->" + num);
	}

	public static void division(int n1, int n2) {
		int div = n1 / n2;
		System.out.println("the division  of numbes are --->" + div);
	}

	public static void multiplication(int n1, int n2) {
		int multi = n1 * n2;
		System.out.println("the multiplication  of numbes are --->" + multi);
	}
}
