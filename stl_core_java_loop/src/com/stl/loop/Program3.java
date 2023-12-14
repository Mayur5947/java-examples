package com.stl.loop;

import java.util.Scanner;

//Write a program to print tables
public class Program3 {

	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		System.out.println("enter the number ");
		int num =  scanner.nextInt();
		int i = 1;
		while(i<=10) {
			System.out.println(num*i);
			i++;
		}
	}
}
