package com.stl.encapsulation;

public class Employee {

	private String name;
	private int id;
	private String email;
	private String address;
	private long phone;

	//parameterized constructor
	public Employee(String name, int id, String email, String address, long phone) {
		super();
		this.name = name;
		this.id = id;
		this.email = email;
		this.address = address;
		this.phone = phone;
	}

	
	//non_parameterized constructor
	public Employee() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", email=" + email + ", address=" + address + ", phone="
				+ phone + "]";
	}

}
