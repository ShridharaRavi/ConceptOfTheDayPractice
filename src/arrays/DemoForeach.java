package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DemoForeach {
	
	public static void main(String args[])
	{
		String[] strarray = new String[] {"SHRI","RAVI","KAR","TUM","IND"};
		
		
		ArrayList<String>  list = new ArrayList<String>();
		
		list.addAll(Arrays.asList(strarray));
				
	
		for( String s: list)
		{
			System.out.println(s);
		}
				
		
	}

}
