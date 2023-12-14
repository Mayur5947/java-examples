package com.stl.loop;

import java.util.Scanner;

//Write a program to print reverse tables
public class Program4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number ");
		int num = scanner.nextInt();
		int i = 10;
		while (i > 0) {
			System.out.println(num * i);
			i--;
		}
	}

}
