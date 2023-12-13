package com.stl.conditional_statement;

import java.util.Scanner;

public class Program6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number of month");
		int month = scanner.nextInt();

		System.out.println("enter year");
		int year = scanner.nextInt();

		if (month == 2 && year % 4 == 0)
			System.out.println(" in the year  of " + year + " days in " + month + "  month are ------29");
		else if (month != 4 && month != 6 && month != 9 && month != 11 && month != 2)
			System.out.println(" in the year  of " + year + " days in " + month + "  month are ------31");
		else if (month == 2)
			System.out.println(" in the year  of " + year + " days in " + month + "  month are ------28");
		else
			System.out.println(" in the year  of " + year + " days in " + month + "  month are ------30");

	}
}
