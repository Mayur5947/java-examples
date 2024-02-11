package com.stl.employee_address_management;

import java.sql.SQLException;
import java.util.Scanner;

import repository.AddressRepository;
import repository.EmployeeRepository;
import service.AddressService;
import service.EmployeeService;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws SQLException {
		System.err.println("--------Employee Management System------------");

		Scanner scanner = new Scanner(System.in);

		EmployeeService employeeService = new EmployeeService();
		AddressService addressService = new AddressService();

		for (;;) {
			System.err.println("--------------------------------------------------");
			System.out.println("1  --- Insert Employee");
			System.out.println("2  --- View Employee");
			System.out.println("3  --- Delete Employee");
			System.out.println("4  --- Update Employee");
			System.out.println("5  --- View All Employees");
			System.out.println("6  --- Update Address");
			System.out.println("7  --- View Address");
			System.out.println("8  --- View All Addresses");
			System.out.println("0  --- Stop");
			System.err.println("------------------------------------------------------");
			int choice = scanner.nextInt();

			switch (choice) {

			case 1:
				employeeService.insertEmployee();
				break;
			case 2:
				employeeService.getEmployee();
				break;
			case 3:
				employeeService.deleteEmployee();
				break;
			case 4:
				employeeService.updateEmployee();
				break;
			case 5:
				employeeService.getAllEmployees();
				break;
			case 6:
				addressService.updateAddress();
				break;
			case 7:
				addressService.getAddress();
				break;
			case 8:
				addressService.getAllAddress();
				break;
			case 0:
				System.exit(0);
				break;

			default:
				break;
			}
		}
	}
}
