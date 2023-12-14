package com.stl.loop;

//Write a program to print reverse alphabets from Z to A
public class Program6 {
	public static void main(String[] args) {
		char ch = 'Z';
		while (ch >= 'A') {
			System.out.println(ch--);
		}
	}
}
