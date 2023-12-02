package array_practice_programs;

import java.util.Scanner;

// Write a Java program to test if an array contains a specific value
public class program5 {
 
	public static void main(String[] args) {
		int [] a = {1998 , 1997 , 1995 , 1992 , 2015 , 2013};
		Scanner scanner =  new Scanner(System.in);
		System.out.println("enter number u want to find in array");
		boolean  b = false;
		int num = scanner.nextInt();
		for (int i : a) {
			if(i == num) {
				b = true;
			}
		}
		if(b)
			System.out.println("yes the number u enter is found in the array ----->" + num);
		else {
			System.out.println("no sorry  the number u enter is not 1445 found in the array ----");
		}
	}
}
