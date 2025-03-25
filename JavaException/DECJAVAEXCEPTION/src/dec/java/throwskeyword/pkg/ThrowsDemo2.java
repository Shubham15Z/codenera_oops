package dec.java.throwskeyword.pkg;

public class ThrowsDemo2 
{
	public void print() throws ArithmeticException
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
			System.out.println("Arithmetic exception is handled");
		}
	}
	
	public void m2()
	{
		m1();
	}

	private void m3() 
	{
		m2();
	}

	public static void main(String[] args) 
	{
		ThrowsDemo2 t1 = new ThrowsDemo2();
		t1.m3();
	}
}
