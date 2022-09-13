package com.masai.fourth.B;

/*
 * in below class we are creating two objects using default and parameterize constructor when
 * we creating object using default constructor in default constructor lion value is assigned to
 * the name so it will give the name lion
 * 
 * using parameterize constructor we get the output what we are passing in constructor.*/
public class Animal{

	String name;

	Animal(){
		this.name = "Lion"; 
	}

	public Animal(String name){
		this.name = name;
	}
	
	public static void main(String[] args) {
		Animal a = new Animal("tiger");
		System.out.println(a.name); 


		Animal b = new Animal(); 
		System.out.println(b.name); 
	}
}


