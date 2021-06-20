package arrays;


class A
{
	public static void testarray()
	{
		
		int[] arrays = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		for ( int i=0;i<arrays.length;i++)
		{
			System.out.println(arrays[i]);
		}
		
	}

	public static void sumarray()
	{
		int sum=0;
		int[] arrays = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		for ( int i=0;i<arrays.length;i++)
		{
			sum=sum+arrays[i];
		}
		System.out.println("Array sum="+sum);
	}
	
	public static void sortarray()
	{
		
		int temp=0;
		int[] a = new int[] {6,7,8,9,10,1,2,3,4,5};
		
		for ( int i=0;i<a.length;i++)
		{    
			for( int j=i+1; j<a.length;j++)
			{

				   if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				   }
			}
		
		}
		for(int k=0;k<a.length;k++)
		{
		   System.out.print(" "+ a[k]);
		}
	
		
	}
	

}


public class TestArrays {
	
	public static void main(String args[])
	{
		A.testarray();
		A.sumarray();
		A.sortarray();
	}

}
