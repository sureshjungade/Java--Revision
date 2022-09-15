package com.masai.firstProblem.Part2;

/*below code will not give any error, we can have a abstract subclass without giving implementation
 * of super abstract class's method.*/
public abstract class AbstractAlgorithm{

	abstract void steps();
	
}

abstract class Algorithm1 extends AbstractAlgorithm{
}