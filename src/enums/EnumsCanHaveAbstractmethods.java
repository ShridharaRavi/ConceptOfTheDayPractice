package enums;

enum enums2
{
	FIRST
	{
		void abstractmethod()
		{
			System.out.println("Implement abstract method in FIRST");
		}
		
	},
	SECOND
	{
		void abstractmethod()
		{
			System.out.println("Implement abstract method in SECOND");
		}
		
	},
	THRIRD
	{
		void abstractmethod()
		{
			System.out.println("Implement abstract method in THIRD");
		}
		
	};
	
	abstract void abstractmethod();
}




public class EnumsCanHaveAbstractmethods {

	public static void main(String args[])
	{
		enums2.FIRST.abstractmethod();
		enums2.SECOND.abstractmethod();
		enums2.THRIRD.abstractmethod();
	}
	
	
}
