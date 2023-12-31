package stl_core_java_assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class FindOut_Duplicate_Number {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[] a = new int[5];
		
		ArrayList arrayList = new ArrayList();

		for (int i = 0; i < a.length; i++) {
			System.out.println("enter value");
			a[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 1; j < a.length; j++) {
				if(a[i]==a[j]) {
					arrayList.add(a[i]);
					a[j]=0;
				}
			}
		}
		System.out.println(arrayList.toString());
		
		
	}
}
