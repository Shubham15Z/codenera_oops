package statickeyword.pkg;

class A
{
	static void m2()
	{
		System.out.println("This is m2 method");
		
	}
}

public class StaticMethod 
{
	static void print()
	{
		System.out.println("this is print method");
	}
	static void m1()
	{
		System.out.println("This is m1 method");
		print();
	}
	
	void display()
	{
		System.out.println("This is display method");
		m1();
	}
	public static void main(String[] args) 
	{
		StaticMethod ob = new StaticMethod();
		ob.display();
		A.m2();
	}
}
