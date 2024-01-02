package stl_core_java_assignment;

import java.util.Scanner;

public class Sum_Of_Digits {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number");
		int number = scanner.nextInt();
		int sum = 0;
		while (number > 0) {
			sum = sum + lastDigit(number);
			number = number / 10;
		}
		System.out.println(sum);
	}

	public static int lastDigit(int num) {
		int lastDigit = num % 10;
		return lastDigit;
	}
}
