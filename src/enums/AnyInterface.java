package enums;

public interface AnyInterface {

	void method1();
}


enum newenum implements AnyInterface
{
	A,B,C;

	@Override
	public void method1() {
	
		System.out.println(" implementation from newenum for interface");
		
	}
	
}
