package com.stl.loop;

import java.util.Scanner;

//write a program to reverse the given Digits
public class Program15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		int num = scanner.nextInt();
		String s = " ";
		while (num > 0) {
			int rem = num % 10;
			s = s + rem;
			num = num / 10;
		}
		System.out.println("reverse of given digits is" + s);
	}
}
