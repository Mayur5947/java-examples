package model;

import java.util.zip.Inflater;

public class Address {

	private int address_id;
	private String city;

	public int getAddress_id() {
		return address_id;
	}

	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [address_id=" + address_id + ", city=" + city + "]";
	}

}
