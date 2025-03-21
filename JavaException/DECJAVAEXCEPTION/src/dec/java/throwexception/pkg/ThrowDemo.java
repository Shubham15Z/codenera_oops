package dec.java.throwexception.pkg;

public class ThrowDemo
{
//	public static void main(String[] args) 
//	{
//		int n = 56;
//		
//		if(n > 50)
//		{
//			throw new ArithmeticException("Number is greated than 50");
//		}
//		
//		System.out.println(n);
//	}
	public static void main(String[] args) 
	{
		int n = 45;
		int m = 0;
		
		if(m == 0)
		{
			throw new ArithmeticException("value of m is zero");
		}
		
		int c= n/m;
		System.out.println(c);
	}
}
