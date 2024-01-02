package stl_core_java_assignment;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number");
		int num = scanner.nextInt();
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2)
			System.out.println("yes " + num + " is a prime number");
	}
}
