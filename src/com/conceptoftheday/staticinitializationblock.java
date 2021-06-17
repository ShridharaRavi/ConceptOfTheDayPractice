package com.conceptoftheday;
class A
{
	static int i;
	
	static
	{
		System.out.println("from static block");
	}
	
	static void m1()
	{
		System.out.println("from M1 ");
		System.out.println(i);
	}
}


public class staticinitializationblock {
	
	static 
	{
		System.out.println("main class static block");
	}
	public static void main(String args[])
	{
		
		A.i=100;
		A.m1();
		
	}

}
