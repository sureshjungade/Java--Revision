package com.masai.secondProblem.Part8;

/*below code will not give any error test class is implements the interface4 so and print method
 * is a default method of a interface so we can access it from class and call that method.*/

public interface Interface4 {

	default void print(){
		System.out.println("default");
	}
	
	public static void main(String[] args) {
		Test test = new Test();
		test.print();
	}
}

class Test implements Interface4{

}

