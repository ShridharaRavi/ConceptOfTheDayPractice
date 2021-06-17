package com.conceptoftheday;



class Super
{ 
	void method()
	{
		System.out.println(" from super class ");
	}
}


class SubClass extends Super
{
	void method()  // inherited super class method is modified in subclass 
	{
		System.out.println(" from Sub class ");
	}
}


// we modify superclass method according to the requirement of subclass 

public class methodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Super obj2=new Super();
		obj2.method();
		
		
		SubClass obj = new SubClass();
		obj.method();
		
		
	}

}
