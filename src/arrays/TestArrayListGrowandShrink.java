package arrays;

import java.util.ArrayList;
import java.util.List;

public class TestArrayListGrowandShrink {

	public static void main(String[] args) {


		ArrayList<String> list = new ArrayList<String>();
		
		list.add("SHRI");
		list.add("RAVI");
		list.add("IND");
		list.add("TUM");
		
		System.out.println(list.size());
		
		
		list.remove(2);
		
		System.out.println(list.size());
		
		
		
		list.add(2, "THREE");
		
		System.out.println(list);
		
		// ArrayList can hold multiple null elements 
		
		list.add(null);
		list.add(null);
		list.add(null);
		
		System.out.println(list);
		
		//ArrayList can hold duplicate elements 
		
		list.add("JAVA");
		list.add("JAVA");
		list.add("JAVA");
		
		System.out.println(list);	
		
		//Size of list 
		
		System.out.println(list.size());
		
		// find empty or not 
		
		System.out.println(list.isEmpty());
		
		 // check the given element is present or not 
		
		System.out.println(list.contains("JAVA"));
		
		//  get the position 
		
		System.out.println(list.indexOf("JAVA"));
		
		System.out.println(list.lastIndexOf("JAVA"));  
		
		System.out.println("********************************************");
		
		//convert arraylisto to array
		
		
		Object[] arrays = list.toArray();
		
		for( Object s: arrays)
		{
			System.out.println(s);
		}
			
		
		// retrieve element from particular position
		
		System.out.println(list.get(0));
		
		
		// Replace 
		
	  list.set(0, "INDIA");
	  
	  System.out.println(list);
	  
	  System.out.println("********************************************");
	  
	  
	  //retrieve a sublist 
	   
	  List<String>  sublist = list.subList(0, 5);
	  
	  System.out.println(sublist);
	  
	  
	  list.addAll(sublist);
	  
	  
	  System.out.println(list);
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
		

	}

}
