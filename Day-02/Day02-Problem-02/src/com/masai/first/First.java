package com.masai.first;

public class First {
	int x = 10;
	//Can super class reference variable can hold an object of sub class? Give Examples
	//Yes we super class reference variable can hold an object of sub class
	// below is a example
	
	public void method() {
		System.out.println("This is a method");
	}
	
	public static void main(String[] args) {
		First superclass = new Second();
		
		superclass.method();
		/*we have a method in first class and in second class we are override this method
		 * and we know that super class reference varible can hold the child class objects 
		 * so when we call the method then child class method will be call, so this is a example.*/
		
	}
	
}


