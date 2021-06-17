package com.conceptoftheday;

class a1 
{
	public int sum ( int i, int j)
	{   int sum=0;
		sum= i+j;
		return sum;
	}

}

class a2 extends a1  
{
	public int abs ( int i, int j)
	{  
		if(i>j)
		{
			return i-j;
		}
		else
			return j-i;
	}
}

public class calculator {
	public static void main(String args[])
	{
		a2 obj = new a2();
		System.out.println(obj.sum(10, 20));
		
		System.out.println(obj.abs(10, 20));
		
	
	
	}
	
	
	

}
