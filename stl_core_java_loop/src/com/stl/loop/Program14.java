package com.stl.loop;

import java.util.Scanner;

//Write a program to find the value of one number raised to the power of another
public class Program14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number");
		int num = scanner.nextInt();
		System.out.println("enter the power");
		int power = scanner.nextInt();
		int multi = 1;
		while (power > 0) {
			multi = multi * num;
			power--;
		}
		System.out.println("answer is " + multi);
	}
}
