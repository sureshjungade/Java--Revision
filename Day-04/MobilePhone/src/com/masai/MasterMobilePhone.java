package com.masai;

public interface MasterMobilePhone {

	public boolean addNewContact(Contact contact);
	
	public int findContact(Contact contact);
	
	public boolean updateContact(Contact oldContact,Contact newContact);
	
	public boolean removeContact(Contact contact);
	
	public int findContact(String mobileNumber);
	
	public Contact queryContact(String name);
	
	public void printContacts();
}
