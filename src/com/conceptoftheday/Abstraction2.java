package com.conceptoftheday;



abstract class abstractclass
{
	abstract void method();
}

abstract class abstractclass2 extends abstractclass
{
    abstract void newmethod();
    
	@Override
	void method() {
		System.out.println("i'm implemeting the abstarct method");
		
	}
	
}

class ConcreteClass extends abstractclass2
{

	@Override
	void newmethod() {
		System.out.println("Hello this is concrete class ");
		
	}
	
}


public class Abstraction2 {
	public static void main(String args[])
	{
		ConcreteClass c = new ConcreteClass();
		c.method();
		c.newmethod();
	}

}
