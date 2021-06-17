package com.conceptoftheday;

class Moverload
{
	
	void m1()
	{
		System.out.println("no arguments");
	}
	void m1(int i )
	{
		System.out.println("int i="+i);
	}
	void m1(int i, int j)
	{
		System.out.println("int i + J = "+(i+j));
	}
	
	void m1(double d)
	{
		System.out.println(" double d="+d);
	}
	void m1(int i , double d)
	{
		System.out.println(" i="+i+" d="+d);
	}
}


public class methodoverload {
	
	public static void main(String args[])
	{
		Moverload obj = new Moverload();
		obj.m1();
		obj.m1(100);
		obj.m1(23.22);
		obj.m1(10, 99.22);
		obj.m1(10,20);
	}
	
}