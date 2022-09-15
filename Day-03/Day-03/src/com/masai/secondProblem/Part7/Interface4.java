package com.masai.secondProblem.Part7;

/*below code will not give any error because after java 8 we can provide implementation of the 
 * default and static methods inside a interface.*/
public interface Interface4 {

	default void print(){
		System.out.println("default");
	}
}
