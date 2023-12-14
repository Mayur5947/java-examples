package com.stl.loop;

import java.util.Scanner;

//Write a program to find the factorial value of any number
public class Program13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		int num = scanner.nextInt();
		int multi = 1;
		while (num > 0) {
			multi = multi * num;
			num--;
		}
		System.out.println("factorial of given number  is  " + multi);
	}
}
