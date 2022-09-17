package com.masai;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		MobilePhone mobile =  new MobilePhone();		
		
		mobile.addNewContact(new Contact("Gaurav", "8800"));
		mobile.addNewContact(new Contact("Suresh", "7700"));
		mobile.addNewContact(new Contact("Vishal", "9900"));
	
		
		//mobile.updateContact(new Contact("Gaurav", "8800"), new Contact("Tommy", "7700"));
		
		//mobile.removeContact(new Contact("Gaurav", "8800"));
		//mobile.queryContact("Vishal");
		
		mobile.printContacts();
		//System.out.println(mb);
		
	}
}
