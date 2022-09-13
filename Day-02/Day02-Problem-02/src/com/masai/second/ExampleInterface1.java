package com.masai.second;

public interface ExampleInterface1 {
	
	//A.
	int value1 = 10;
	public int value2 = 15;
	
	public static int value3 = 20;
	
	public static final int value4 = 25;
	
	//private int value5 = 10;// this line will give error, because it is a private variable
								//so in implementation class we can't access this variable,
								//so it should be public, so during implementation in any 
								//implementation class we can access this variable.

	
	//B.
	//below code will not give any error.
	void method1();
	
	default void method5() {
		System.out .println("Method5");
	}
	
	
}
