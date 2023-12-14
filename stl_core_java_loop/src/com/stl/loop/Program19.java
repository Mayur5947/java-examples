package com.stl.loop;

import java.awt.Choice;
import java.util.Scanner;

//Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered
public class Program19 {
	public static void main(String[] args) {
		Scanner sc =  new  Scanner(System.in);
		int countOfPositive = 0 ;
		int countOfNegative = 0;
		int countOfZeros = 0;
		char choice =' ';
		do {
			System.out.println("enter the number");
			int  num =  sc.nextInt();
			if (num>0) {
				countOfPositive++;
			}
			else if (num<0) {
				countOfNegative++;
			}
			else {
				countOfZeros++;
			}
			System.out.println("do u want to continue y/n");
			choice = sc.next().charAt(0);
		} while (choice  == 'Y' || choice == 'y');
		System.out.println("count of positive number is "+ countOfPositive);
		System.out.println("count of negative number is "+ countOfNegative);
		System.out.println("count of zeros  is "+ countOfZeros);
	}
}
