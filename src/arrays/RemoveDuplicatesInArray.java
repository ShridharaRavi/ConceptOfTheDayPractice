package arrays;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicatesInArray {

	public static void main(String[] args) {
	
		
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("SHRI");
		list.add("RAVI");
		list.add("IND");
		list.add("TUM");
		list.add("JAVA");
		list.add("JAVA");
		System.out.println("*******with dup ");
		System.out.println(list);
  
	   HashSet<String>  list2 = new HashSet<String>(list);
	   
	   
	   ArrayList<String> listnodup = new ArrayList<String>(list2);
	   
	   System.out.println("*******without dup ");
	   System.out.println(listnodup);
		

	}

}
