package service;

import java.sql.SQLException;
import java.util.Scanner;

import model.Address;
import repository.AddressRepository;

public class AddressService {

	public void insertAddress(int employee_id) throws SQLException {

		Scanner scanner = new Scanner(System.in);
		Address address = new Address();
		AddressRepository repository = new AddressRepository();

		System.err.println("-------------------enter address city of employee");
		String city = scanner.next();
		System.err.println("-------------------enter addresss id");
		int address_id = scanner.nextInt();

		address.setAddress_id(address_id);
		address.setCity(city);

		repository.insertAddress(address, employee_id);

	}

	public void updateAddress() throws SQLException {
		Scanner scanner = new Scanner(System.in);
		Address address = new Address();
		System.out.println("Enter employee id whose u want to update address");
		int employee_id = scanner.nextInt();
		System.out.println("Enter New City");
		String city = scanner.next();
		AddressRepository addressRepository = new AddressRepository();
		addressRepository.updateAddress(city, employee_id);
	}

	public void getAddress() throws SQLException {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter employee id whose u want to get address");
		int employee_id = scanner.nextInt();
		AddressRepository addressRepository = new AddressRepository();
		addressRepository.getAddress(employee_id);
	}

	public void getAllAddress() throws SQLException {
		AddressRepository addressRepository = new AddressRepository();
		addressRepository.getAllAddress();
	}
}
