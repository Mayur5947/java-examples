package com.stl.loop;

import java.util.Scanner;

//write a program to sum of its Digits
public class Program16 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the numer");
		int num = scanner.nextInt();
		int sum = 0;
		while (num > 0) {
			int rem = num % 10;
			sum = sum + rem;
			num = num / 10;
		}
		System.out.println("sum of given digits is " + sum);

	}

}
