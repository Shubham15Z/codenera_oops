package dec.java.exception.pkg;

public class Demo2 
{
	public static void main(String[] args) 
	{
		String s1 = "Hello";
		int[] a1 = {2,5,7,3};
		
		System.out.println(10);
		System.out.println(20);
		
		try
		{
//			System.out.println(30/0);
//			System.out.println(s1.charAt(8));
			System.out.println(a1[19]);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Hiii");
			System.out.println(e);
			System.out.println(1000000);
			try
			{
				System.out.println(a1[10]);
			}
			catch(ArrayIndexOutOfBoundsException ex)
			{
				System.out.println(ex);
			}
			System.out.println(20000000);
			
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		System.out.println(40);
		System.out.println(50);
		System.out.println(60);
	}
}
