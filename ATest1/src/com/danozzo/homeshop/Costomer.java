package com.danozzo.homeshop;

public class Costomer {
	private String fullname;
	private String address;

	public Costomer(String fullname, String address) {
		this.fullname = fullname;
		this.address = address;

	}

	public String getFullname() {
		return fullname;
	}

	public String getAddress() {
		return address;
	}

}
