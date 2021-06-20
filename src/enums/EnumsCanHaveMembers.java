package enums;

enum enums
{
	A,B ,C;
	
	int i=10;
	
	private enums()  // constructor 
	{
		//System.out.println(" from enum constructor");
	}
	
	void methodenum()
	{
		System.out.println(" from method of enum");
	}
}



public class EnumsCanHaveMembers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		enums e = enums.A;
		System.out.println(e.i);
		e.methodenum();
		
		
	}

}
