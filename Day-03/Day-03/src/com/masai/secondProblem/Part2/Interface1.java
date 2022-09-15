package com.masai.secondProblem.Part2;

/*below code will give error because one interface cannot implements another interface, interface 
 * can extend other interface, and i think the semicolon is typo error from your end so i've given
 * that.*/

public interface  Interface1 {
	void method1();
}

interface Interface2 extends Interface1{
	void method2();
}

interface Implementation implements Interface2{
	void method2();	
}