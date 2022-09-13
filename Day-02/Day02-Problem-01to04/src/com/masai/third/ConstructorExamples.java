package com.masai.third;


/*
 * Yes, super class constructor called even when there is no explicit call from a
	sub class constructor
 	in above code first will print the 
 		Animal Constructor then
 		Dog Constructor then
 		Labrador Constructor
 		because whenever we called Labrador constructor it will call it's super class constructor
 		Dog and then Dog will call it's super class constructor then Animal and Animal is not
 		extending any class so it will print the sentence and then sub classes constructors 
 		will print the sentence.*/

class Animal {
	public Animal() {
			System.out.println("Animal Constructor");
	}
}

class Dog extends Animal {
	public Dog() {
			System.out.println("Dog Constructor");
	}
}

class Labrador extends Dog {
	public Labrador() {
			System.out.println("Labrador Constructor");
	}
}

public class ConstructorExamples {
	public static void main(String[] args) {
			Labrador labrador = new Labrador();
	}
}
