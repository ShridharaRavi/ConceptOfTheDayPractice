package com.conceptoftheday;

class D
{
	
	  D()
	  {
		  System.out.println("Default from D");
	  }
	  
	
	
}


class E extends D
{
	
	  
	  E(int i)
	  {   super();
		  System.out.println("Parmeter from E i="+i);
	  }
	
}


public class testsuper {
	
	public static void main(String args[])
	{
		E obj = new E(100);
	}

}
