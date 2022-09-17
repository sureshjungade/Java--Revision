package com.masai;

import java.util.ArrayList;

public class Contact {

	private String name;
	private String phoneNumber;
	public Contact(String name, String phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public static Contact 	createContact(String name,String phoneNumber) {
		System.out.println("Contact is Created");
		return new Contact(name, phoneNumber);
	}

	
	
	
}
