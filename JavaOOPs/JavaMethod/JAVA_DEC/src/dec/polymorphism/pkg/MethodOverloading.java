package dec.polymorphism.pkg;

public class MethodOverloading 
{
	void print()
	{
		System.out.println("Non para method");
	}
	
	void print(int a)
	{
		System.out.println("int para method");
	}
	
	void print(String s)
	{
		System.out.println("String para method");
	}
	
	void print(int a, String b)
	{
		System.out.println("int String para method");
	}
	
	void print(String b, int a)
	{
		System.out.println("String int para method");
	}
	public static void main(String[] args)
	{
		MethodOverloading ob = new MethodOverloading();
		ob.print();
		ob.print(10);
		ob.print("abc");
		ob.print(100, "klm");
		ob.print("abc", 80);
	}
}
