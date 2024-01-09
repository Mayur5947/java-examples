package com.stl.encapsulation;

import java.util.Scanner;

public class Employee_Controller {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("enter name of employee");
		String name = scanner.next();

		System.out.println("enter id");
		int id = scanner.nextInt();

		System.out.println("enter email ");
		String email = scanner.next();

		System.out.println("enter address");
		String address = scanner.next();

		System.out.println("enter mobile number");
		long phone = scanner.nextLong();

		Employee employee = new Employee(name, id, email, address, phone);
		System.out.println(employee.toString());
	}
}
