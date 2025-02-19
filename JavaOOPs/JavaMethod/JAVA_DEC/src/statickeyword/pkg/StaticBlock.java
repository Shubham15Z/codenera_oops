package statickeyword.pkg;

public class StaticBlock 
{
	StaticBlock()
	{
		System.out.println("Constructor");
	}
	
	{
		System.out.println("Instance block");
	}
	
	static
	{
		System.out.println("Static block 1");
//		StaticBlock ob = new StaticBlock();
	}
	
	static
	{
		StaticBlock ob = new StaticBlock();
		System.out.println("Static block 2");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("main method");
//		StaticBlock ob = new StaticBlock();
		
	}
	
	static
	{
		System.out.println("Static block 3");
	}
	
//	{
//		System.out.println("Instance block");
//	}
}
