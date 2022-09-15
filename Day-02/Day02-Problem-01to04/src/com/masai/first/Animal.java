package com.masai.first;


class Species{
	String type;	

	
	Species(String type){
		this.type = type;
	}
}



public class Animal extends Species {
		String name;

		public Animal() {
				this.name = "Default Name";
		}

		// This is called a one argument constructor.
		public Animal(String name, String type) {
				super(type);
				this.name = name;
		}

		public static void main(String[] args) {
				Animal animal = new Animal("Lion","carnivorous");
				Animal animal1 = new Animal();
		}
}


