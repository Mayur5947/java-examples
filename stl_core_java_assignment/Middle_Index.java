package stl_core_java_assignment;

import java.util.Scanner;

public class Middle_Index {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a[] = new int[9];

		for (int i = 0; i < a.length; i++) {
			System.out.println("enter value");
			a[i] = scanner.nextInt();
		}

		for (int i = 1; i < a.length - 1; i++) {
			int SumOfLeft = 0;
			int SumOfRight = 0;
			for (int j = 0; j < i; j++) {
				SumOfLeft = SumOfLeft + a[j];
			}
			for (int k = i + 1; k < a.length; k++) {
				SumOfRight = SumOfRight + a[k];
			}
			if (SumOfLeft == SumOfRight) {
				System.out.println("middle index is   " + i);
			}
		}

	}
}
