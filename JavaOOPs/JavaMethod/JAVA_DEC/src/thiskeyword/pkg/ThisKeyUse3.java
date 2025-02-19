package thiskeyword.pkg;

public class ThisKeyUse3
{
	public ThisKeyUse3() 
	{
		this(10);
		System.out.println("Default Constructor");
		
	}
	
	ThisKeyUse3(int a)
	{
		this("a");
		System.out.println("Int constructor");
	}
	
	ThisKeyUse3(String b)
	{
		System.out.println("String constructor");
	}
	public static void main(String[] args)
	{
		ThisKeyUse3 ob = new ThisKeyUse3();
		
	}
}
