package com.stl.loop;

//Write a program to find sum of all even numbers between 1 to 100
public class Program10 {
	public static void main(String[] args) {
		int start = 1;
		int end = 100;
		int sum = 0;
		while (start <= end) {
			if (start % 2 == 0) {
				sum = sum + start;
			}
			start++;
		}
		System.out.println(sum);
	}
}
