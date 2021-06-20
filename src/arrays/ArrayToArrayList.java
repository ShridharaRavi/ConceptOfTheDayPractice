package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayToArrayList {

	public static void main(String[] args) {


		
		
		String[] str = new String[] {"JAVA","JEE","HTML","CSS"};
		
		
		ArrayList<String>  strnew = new  ArrayList<String>(Arrays.asList(str));
		
		System.out.println(strnew);
		
		
		Object[] arraynew = strnew.toArray();
		
		for( Object s : arraynew)
		{
			System.out.println(s);
		}
  
		
		Collections.reverse(strnew);
		
		System.out.println(strnew);
		
		
	}

}
