package com.conceptoftheday;



class test
{
	 private int i;
	 
	 private void m1()
	 {
		 System.out.println(i);
		 B obj = new B();
		System.out.println(i);
	 }
	 
	 private class B   // inner class 
	 {
	    int i=10;
	 }
}

public class testprivate {
	
	public static void main(String args[])
	{
		test obj = new test();
		//obj.i;
		//obj.m1();   cannot access out side the class 
	}

}
