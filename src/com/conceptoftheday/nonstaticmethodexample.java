package com.conceptoftheday;


class B
{
	int i;
	static int j;
	
	
	static void m1()
	{
		System.out.println(" from static method");
		//System.out.println(i);
		System.out.println(j);
	}
	
	void m2()
	{
		System.out.println(" from non static method");
		System.out.println(i);
		System.out.println(j);
	}
}





public class nonstaticmethodexample {
	
	public static void main(String args[])
	{
		B.m1();
		B.j=100;	
		
		
		B obj = new B();
		obj.i=200;
        obj.m2();		
	}
	
	

}
