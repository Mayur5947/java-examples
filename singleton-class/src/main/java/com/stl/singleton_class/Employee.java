package com.stl.singleton_class;

public class Employee {

	private String name;
	private long phone;
	private String address;
	private static Employee employee;

	public String getName() {
		return name;
	}

	public long getPhone() {
		return phone;
	}

	public String getAddress() {
		return address;
	}

	private Employee(String name, long phone, String address) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	public static synchronized Employee getEmployee(String name, long phone, String address) {
		if (employee == null) {
			employee = new Employee(name, phone, address);
			return employee;
		} else {
			employee.name = name;
			employee.phone = phone;
			employee.address = address;
			return employee;
		}
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", phone=" + phone + ", address=" + address + "]";
	}
	
	
}
