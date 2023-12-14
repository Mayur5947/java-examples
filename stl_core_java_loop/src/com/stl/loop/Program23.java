package com.stl.loop;

import java.util.Scanner;

//Write a program to check whether a number is a Strong Number or not
public class Program23 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number");
		int num = scanner.nextInt();
		int temp = num;
		int sum = 0;
		int multi = 1;
		while (num > 0) {
			int rem = num % 10;
			multi = 1;
			while (rem > 0) {
				multi = multi * rem;
				rem--;
			}
			sum = sum + multi;
			num = num / 10;
		}
		if (sum == temp) {
			System.out.println("strong number");
		} else {
			System.out.println("not strong number");
		}
	}
}
