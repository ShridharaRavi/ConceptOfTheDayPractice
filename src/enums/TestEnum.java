package enums;


enum Directions
{
	SOUTH,NORTH,EAST,WEST
}

public class TestEnum {
	
	public static void main(String args[])
	{  
		Directions d = Directions.EAST;
		System.out.println(d.EAST);
		
		
		System.out.println(Directions.NORTH);
		System.out.println(Directions.SOUTH);
	}

}
