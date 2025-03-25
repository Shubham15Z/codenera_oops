package dec.java.throwskeyword.pkg;

public class ThrowsDemo 
{
	public static void print() throws ArithmeticException
	{
		System.out.println(5/0);
	}
	
	public void m1()
	{
		try
		{
			print();
		}
		catch(ArithmeticException e)
		{
			System.out.println("print method might throws exception...");
		}
		
	}
	
	public static void main(String[] args) 
	{
		ThrowsDemo t1 = new ThrowsDemo();
		t1.m1();
	}
}
