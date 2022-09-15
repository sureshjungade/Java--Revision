package com.masai.secondProblem.Part5;

/*below code will give error because test variable is not initialized, we know that in interface by
 * default all the variables are public static final so, final variable should be initialize on the
 * first line itself, so after that any one cannot change it.*/

public interface Interface3 {

	int test;
}
