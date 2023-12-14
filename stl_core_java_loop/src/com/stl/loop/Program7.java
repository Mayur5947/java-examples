package com.stl.loop;

//Write a program to print all even numbers between 1 to 100
public class Program7 {
	public static void main(String[] args) {
		int start = 1;
		int end = 100;
		while (start <= end) {
			if (start % 2 == 0) {
				System.out.println(start);
			}
			start++;
		}
	}
}
