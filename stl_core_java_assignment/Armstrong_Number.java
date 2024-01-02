package stl_core_java_assignment;

import java.util.Scanner;

public class Armstrong_Number {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter number");
		int num = scanner.nextInt();
		int temp = num;
		int num2 = num;
		int power = 0;
		while (num > 0) {
			power++;
			num = num / 10;
		}
		int sum = 0;
		while (num2 > 0) {
			int rem = num2 % 10;
			int factorial = rem;
			for (int i = 1; i < power; i++) {
				factorial = factorial * rem;
			}
			sum = sum + factorial;
			num2 = num2 / 10;
			
		}
		if (temp == sum)
			System.out.println(temp + " is a armstrong number");
	}
}
