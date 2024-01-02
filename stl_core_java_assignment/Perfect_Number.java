package stl_core_java_assignment;

import java.util.Scanner;

public class Perfect_Number {

	public static void main(String[] args) {

		Scanner scanner = new  Scanner(System.in);
		System.out.println("enter value ");
		int number = scanner.nextInt();
		int sum = 0;
		for(int i = 1 ; i <number ;i++) {
			if(number%i == 0) {
				sum = sum + i;
			}
		}
		if (sum==number) {
			System.out.println("yes it is an perfect number");
		}
		else {
			System.out.println("its not perfect number");
		}
	}
}
