package com.conceptoftheday;


class C
{
	
	C()
	{
		System.out.println("Default constructor");
	}
	

	C(int i , int j)
	{
		System.out.println("parameter sum="+(i+j));
	}
	

	C(int j)
	{
		System.out.println("parameter constructor="+j);
	}
	
}



public class testconstrutor {
	
	public static void main(String args[])
	{
		C obj = new C();
		
		C obj2 = new C(10,20);
		
		C obj3 = new C(50);
		
		
	}

}
