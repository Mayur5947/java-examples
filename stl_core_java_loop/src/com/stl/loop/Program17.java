package com.stl.loop;

import java.util.Scanner;

// write a program to Check Whether a Given Number is Prime or Not
public class Program17 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the numer");
		int num = scanner.nextInt();
		int i = 1;
		int count = 0;
		while (i <= num) {
			if (num % i == 0) {
				count++;
			}
			i++;
		}
		if (count == 2) {
			System.out.println("given number is prime number ");
		} else {
			System.out.println("given number is not prime number");
		}
	}
}
