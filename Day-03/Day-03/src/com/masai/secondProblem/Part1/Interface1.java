package com.masai.secondProblem.Part1;

/*the below code is perfect but in child interface method2 semicolon is missing so, because of
 * that reason compiler will give error otherwise it not necessary to give implementation of
 * methods in child interface which are inherited from parent interface.*/

public interface Interface1 {
	void method1();
}

interface Interface2 extends Interface1{
	void method2()
}