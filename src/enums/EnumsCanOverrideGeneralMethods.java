package enums;


enum enums1 
{
	
	
	FIRST
	{
		void commonmethod()
		{
			System.out.println("implementation from FIRST ");
		}
		
	},
	
	SECOND
	{
		void commonmethod()
		{
			System.out.println("implementation from SECOND ");
		}
	},
	THIRD
	{
		 void commonmethod()
		 {
			 System.out.println("implementation from THIRD");
		 }
	};
	
	void commonmethod() {
		System.out.println("Commod method to all enums ");
	}
}


public class EnumsCanOverrideGeneralMethods {

	public static void main(String[] args) {
		
		
	enums1.FIRST.commonmethod();
	enums1.SECOND.commonmethod();
	enums1.THIRD.commonmethod();

	}

}
