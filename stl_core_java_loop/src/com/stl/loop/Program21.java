package com.stl.loop;

//Write a program to find number and sum of all integer between 100 and 200 which are divisible by 9
public class Program21 {
	public static void main(String[] args) {
		int start = 101;
		int end = 200;
		int sum = 0;
		System.out.println("numbers which are divisible  by 9 between 101 and 200 are");
		while (start <= end) {
			if (start%9 == 0) {
				System.out.println(start);
				sum = sum + start;
			}
			start++;
		}
		System.out.println("and sum of all those number is "+sum);
	}
}
