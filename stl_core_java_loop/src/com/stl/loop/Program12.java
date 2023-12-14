package com.stl.loop;

import java.util.Scanner;

//Write a program to print the ASCII values
public class Program12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the character");
		char ch = scanner.next().charAt(0);
		int a = (int) ch;
		System.out.println("ASCII value of  " + ch + "  is  " + a);
	}

}
