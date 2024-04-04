package com.stl.conditional_statement;

import java.util.Scanner;

//Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.
public class Program3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		;;
		System.out.println("enter float  number ");
		float f = Float.valueOf(scanner.nextLine());
		if (f < 0)
			System.out.println("negative");
		else if (f > 0 && f < 1)
			System.out.println("small");
		else if (f == 0)
			System.out.println("zero");
		else if (f > 0 && f < 100000)
			System.out.println("positive");
		else
			System.out.println("large");
	}
}
