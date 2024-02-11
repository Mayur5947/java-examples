package service;

import java.sql.SQLException;
import java.util.Scanner;

import model.Employee;
import repository.AddressRepository;
import repository.EmployeeRepository;
import repository.EmployeeRepository;

public class EmployeeService {

	EmployeeRepository repository = new EmployeeRepository();
	AddressService addressService = new AddressService();
	AddressRepository addressRepository = new AddressRepository();

	public void insertEmployee() throws SQLException {

		Employee employee = new Employee();

		Scanner scanner = new Scanner(System.in);

		System.err.println("******enter employee id *******");
		int employee_id = scanner.nextInt();
		System.err.println("******enter employee first  name*******");
		String first_name = scanner.next();
		System.err.println("******enter employee last  name*******");
		String last_name = scanner.next();
		System.err.println("******enter employee email*******");
		String email = scanner.next();
		System.err.println("******enter employee gender*******");
		String gender = scanner.next();

		employee.setEmployee_id(employee_id);
		employee.setFirst_name(first_name);
		employee.setLast_name(last_name);
		employee.setEmail(email);
		employee.setGender(gender);

		repository.insertEmployee(employee);
		addressService.insertAddress(employee_id);
	}

	public void deleteEmployee() throws SQLException {

		Scanner scanner = new Scanner(System.in);
		System.err.println("enter employee id whose data u want to delete");
		int employee_id = scanner.nextInt();
		repository.deleteEmployee(employee_id);

	}

	public void getEmployee() throws SQLException {
		Scanner scanner = new Scanner(System.in);
		System.err.println("enter employee id whose data u want to view");
		int employee_id = scanner.nextInt();
		repository.getEmployee(employee_id);
	}

	public void updateEmployee() throws SQLException {
		Employee employee = new Employee();
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter employee id ");
		int employee_id = scanner.nextInt();
		System.out.println("enter new email");
		String email = scanner.next();
		employee.setEmail(email);
		System.out.println("enter gender");
		employee.setGender(scanner.next());

		repository.updateEmployee(employee, employee_id);
	}

	public void getAllEmployees() throws SQLException {
		repository.getAllEMployees();
	}
}
