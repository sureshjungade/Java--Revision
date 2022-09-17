package com.masai;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone implements MasterMobilePhone{

	
	private String myNumber;
	
	private List<Contact> myContacts = new ArrayList<>();

	public MobilePhone() {
		
	}

	public MobilePhone(String myNumber, ArrayList<Contact> myContacts) {
		super();
		this.myNumber = myNumber;
		this.myContacts = myContacts;
	}



	public List<Contact> getMyContacts() {
		return myContacts;
	}

	

	@Override
	public boolean addNewContact(Contact contact) {
		//System.out.println(findContact(contact));
		if(findContact(contact)<0) {
			myContacts.add(contact);
			System.out.println("Contact has been added");
			return true;
		}else {
			System.out.println("Contact is already exist");
			return false;
		}
		
		
	}



	@Override
	public int findContact(Contact contact) {
		int ans = -1;
		
		
			for(int i=0; i<myContacts.size(); i++) {
				if(myContacts.get(i).getName().equals(contact.getName()) || myContacts.get(i).getPhoneNumber().equals(contact.getPhoneNumber())) {
					ans = i;
					System.out.println("Contact is found");
				}
			}
		
		return ans;
	}



	@Override
	public boolean updateContact(Contact oldContact, Contact newContact) {
		int getindex = findContact(oldContact);
		//System.out.println(oldContact.getName());
		if(getindex>=0) {
			//System.out.println(newContact.getName());
			myContacts.get(getindex).setName(newContact.getName());
			myContacts.get(getindex).setPhoneNumber(newContact.getPhoneNumber());
			System.out.println("Contact has been updated");
			return true;
		}else {
			System.out.println("Contact is not exist");
			return false;
		}
		
	}



	@Override
	public boolean removeContact(Contact contact) {

		int getindex = findContact(contact);
		//System.out.println(getindex);
		if(getindex>=0) {
			
			myContacts.remove(getindex);
			System.out.println("Contact has been removed");
			return true;
		}else {
			System.out.println("Contact is not exist");
			return false;
		}
	}



	@Override
	public int findContact(String mobileNumber) {
			int ans = -1;
		
		
			for(int i=0; i<myContacts.size(); i++) {
				if(myContacts.get(i).getPhoneNumber().equals(mobileNumber)) {
					System.out.println("Contact is found");
					ans = i;
				}
			}
		
		return ans;
	}



	@Override
	public Contact queryContact(String name) {
		
		
		for(int i=0; i<myContacts.size(); i++) {
			if(myContacts.get(i).getName().equals(name)) {
				System.out.println(myContacts.get(i).getName()+" "+myContacts.get(i).getPhoneNumber());
				return myContacts.get(i);
			}
		}
		
		return null;
	}



	@Override
	public void printContacts() {
		
		if(myContacts.size()>0) {
			for(int i=0; i<myContacts.size(); i++) {
				System.out.println(myContacts.get(i).getName() + " -> "+ myContacts.get(i).getPhoneNumber());
			}
		}else {
			System.out.println("No contacts in the list");
		}
	}

	
	@Override
	public String toString() {
		return "MobilePhone [myContacts=" + myContacts + "]";
	}



	


	
	
	
}
