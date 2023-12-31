package stl_core_java_assignment;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number");
		int num = scanner.nextInt();
		String reverse = " ";
		while (num > 0) {
			int rem = num % 10;
			reverse = reverse + rem;
			num = num / 10;
		}
		System.out.println(reverse);
	}
}
