package com.masai.thirdProblem;

public abstract class Publication {
	
	int noOfPages;
	
	int price;
	
	String publisherName;
	
	 void print()
	    {
	        System.out.println("Publication Name : " + publisherName);
	        System.out.println("Price : " + price);
	        System.out.println("No of Pages : " + noOfPages);
	    }
	 
	 public static void main(String[] args) {
		 	Book b1 = new Book("Ankur",212,159);
	        Book b2 = new Book("Ankur",212,159);
	        Book b3 = new Book("Ankur",212,159);

	        Journal j1 = new Journal("Ankur",212,159);
	        Journal j2 = new Journal("Ankur",212,159);

	        Library l = new Library(b1);

	        //l.add(b1);
	        l.add(b2);
	        l.add(b3);
	        l.add(j1);
	        l.add(j2);

	        l.printDetails();
	}
}
