package com.masai.secondProblem.Part9;

/*below code will not give any error and print method of a implementing class will call and 
 * execute test object will first search in a class than it find in interface so, we have method
 * in class , that method will execute.*/

public interface Interface4 {

	default void print(){
		System.out.println("default");
	}
	
	public static void main(String[] args) {
		Test1 test = new Test1();
		test.print();
	}
}

class Test1 implements Interface4{
	public void print(){
		System.out.println("override");
	}
}

