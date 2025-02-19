package thiskeyword.pkg;

public class ThisKeyUse2 
{
	
	void m1()
	{
		this.m3();
		this.m2();
		
		System.out.println("method m1");
	}
	
	void m2()
	{
		System.out.println("method m2");
		
	}
	
	void m3()
	{
		System.out.println("method m3");
	}
	public static void main(String[] args)
	{
		System.out.println("Main method");
		ThisKeyUse2 ob = new ThisKeyUse2();
		ob.m1();
//		ob.m2();
//		ob.m3();
	}
}
