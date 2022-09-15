package com.masai.fifthProblem;

public class Tomato implements Fruit,Vegetable{

	public static void main(String[] args) {
		Tomato t1 =  new Tomato();
		t1.hasAPeel();

		t1.hasARoot();;
	}

	@Override
	public void hasAPeel() {
		System.out.println("hasAPeel Method");
		
	}

	@Override
	public void hasARoot() {
		System.out.println("hasARoot Method");
		
	}

}
